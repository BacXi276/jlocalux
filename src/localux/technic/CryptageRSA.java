package localux.technic;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.Date;

/**
 *
 * @author patrick
 */
public class CryptageRSA {

    // instance pour travailler sur les certificats
    private final CertificateFactory certFactory;
    // instance pour travailler sur les clés
    private final KeyFactory keyFactory;
    // instance pour travailler sur le codage
    private final Cipher cipher;

    private PrivateKey privateKey;
    private PublicKey publicKey;
    private PublicKey certKey;
    private X509Certificate certificate;

    public CryptageRSA() throws Exception {
        this.certFactory = CertificateFactory.getInstance("X.509");
        this.keyFactory = KeyFactory.getInstance("RSA");
        this.cipher = Cipher.getInstance("RSA");
    }

    public CryptageRSA(String privKeyRessource, String pubKeyRessource, String certRessource) throws Exception {
        this.certFactory = CertificateFactory.getInstance("X.509");
        this.keyFactory = KeyFactory.getInstance("RSA");
        this.cipher = Cipher.getInstance("RSA");

        loadPrivateKey(privKeyRessource);
        loadPublicKey(pubKeyRessource);
        loadCertificat(certRessource);
    }

    public void loadPrivateKey(String privKeyRessource) throws Exception {

        // lire la clé privée du repertoire ressources
        byte[] privateKeyBytes = getClass().getResourceAsStream(privKeyRessource).readAllBytes();
        privateKeyBytes = cleanKey(privateKeyBytes);
        EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        this.privateKey = this.keyFactory.generatePrivate(privateKeySpec);
    }

    public void loadPublicKey(String pubKeyRessource) throws Exception {

        // lire la clé publique du repertoire ressources
        byte[] publicKeyBytes = getClass().getResourceAsStream(pubKeyRessource).readAllBytes();
        publicKeyBytes = cleanKey(publicKeyBytes);
        EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
        this.publicKey = this.keyFactory.generatePublic(publicKeySpec);

    }

    public void loadCertificat(String certRessource) throws Exception {

        // lire le certificat du repertoire ressources
        byte[] certBytes = getClass().getResourceAsStream(certRessource).readAllBytes();
        certBytes = cleanKey(certBytes);
        this.certificate = (X509Certificate) certFactory.generateCertificate(new ByteArrayInputStream(certBytes));
        this.certKey = this.certificate.getPublicKey();

    }

    public String encode(String toEncode) throws Exception {

        this.cipher.init(Cipher.ENCRYPT_MODE, this.certKey);
        byte[] bytes = this.cipher.doFinal(toEncode.getBytes(StandardCharsets.UTF_8));
        return new String(Base64.getEncoder().encode(bytes));
    }

    public String encode(String toEncode, String avec) throws Exception {
        switch (avec) {
            case "PRIV" ->
                this.cipher.init(Cipher.ENCRYPT_MODE, this.privateKey);
            case "PUB" ->
                this.cipher.init(Cipher.ENCRYPT_MODE, this.publicKey);
            case "CERT" ->
                this.cipher.init(Cipher.ENCRYPT_MODE, this.certKey);
        }
        byte[] bytes = this.cipher.doFinal(toEncode.getBytes(StandardCharsets.UTF_8));
        return new String(Base64.getEncoder().encode(bytes));
    }

    public String decode(String toDecode) throws Exception {
        this.cipher.init(Cipher.DECRYPT_MODE, this.privateKey);
        byte[] bytes = cipher.doFinal(Base64.getDecoder().decode(toDecode));
        return new String(bytes);
    }

    public String decode(String toDecode, String avec) throws Exception {
        switch (avec) {
            case "PRIV" ->
                this.cipher.init(Cipher.DECRYPT_MODE, this.privateKey);
            case "PUB" ->
                this.cipher.init(Cipher.DECRYPT_MODE, this.publicKey);
            case "CERT" ->
                this.cipher.init(Cipher.DECRYPT_MODE, this.certKey);
        }
        byte[] bytes = cipher.doFinal(Base64.getDecoder().decode(toDecode));
        return new String(bytes);
    }

    public String getPubKey() {
        return this.publicKey.toString();
    }

    public String getPrivKey() {
        return this.privateKey.toString();
    }

    public boolean isValidCert() {
        boolean valid = true;
        try {
            this.certificate.checkValidity(new Date());
            this.certificate.verify(this.publicKey);
        } catch (Exception e) {
            valid = false;
        }
        return valid;
    }

    private byte[] cleanKey(byte[] Key) throws Exception {
        String laCle = new String(Key);
        String typeKey = null;
        if (laCle.contains("PRIVATE KEY")) {
            typeKey = "Priv";
        } else if (laCle.contains("PUBLIC KEY")) {
            typeKey = "Pub";
        } else if (laCle.contains("CERTIFICATE")) {
            typeKey = "Cert";
        }
        if ("Priv".equals(typeKey)) {

            laCle = laCle.replaceAll("-----BEGIN PRIVATE KEY-----", "");
            laCle = laCle.replaceAll("-----END PRIVATE KEY-----", "");
        }
        if ("Pub".equals(typeKey)) {

            laCle = laCle.replaceAll("-----BEGIN PUBLIC KEY-----", "");
            laCle = laCle.replaceAll("-----END PUBLIC KEY-----", "");
        }
        if ("Cert".equals(typeKey)) {

            laCle = laCle.replaceAll("-----BEGIN CERTIFICATE-----", "");
            laCle = laCle.replaceAll("-----END CERTIFICATE-----", "");
        }
        laCle = laCle.replaceAll("\\n", "");
        laCle = laCle.trim();

        return Base64.getDecoder().decode(laCle);

    }

    /*
    public abstract boolean[] getKeyUsage()
    KeyUsage ::= BIT STRING {
     digitalSignature        (0),
     nonRepudiation          (1),
     keyEncipherment         (2),
     dataEncipherment        (3),
     keyAgreement            (4),
     keyCertSign             (5),
     cRLSign                 (6),
     encipherOnly            (7),
     decipherOnly            (8) }
     */
    public void getInfoCert() {
        //System.out.println(this.certificate.getKeyUsage().length);

        System.out.println(this.certificate.getNotBefore());
        System.out.println(this.certificate.getNotAfter());
        System.out.println(this.certificate.getIssuerX500Principal().toString());

        //return this.certificate.getIssuerX500Principal().toString();
    }
}
