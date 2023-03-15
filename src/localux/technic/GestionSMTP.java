/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localux.technic;

/**
 *
 * @author patrick
 */
import java.util.Properties;
import java.util.Date;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import localux.model.Configuration;

public class GestionSMTP {
    
    

    private final String user;
    private final String password;
    protected String mailTo, mailObj, mailMsg;

    private Session session;
    private MimeMessage message;

    public GestionSMTP(String user, String password) {
        this.user = user;
        this.password = password;
        initCon();
    }

    public GestionSMTP() {
        // test lucien.java@st2msi.net/H+r=D~u;~s^1
        this.user = "lucien.java@st2msi.net";
        this.password = "H+r=D~u;~s^1";
        initCon();
    }

    public void SendMail(String mailTo, String mailObj, String mailMsg)  throws Exception { // exception traité par l'appelant{
        this.mailTo = mailTo;
        this.mailObj = mailObj;
        this.mailMsg = mailMsg;
        sendMsg();
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public void setMailObj(String mailObj) {
        this.mailObj = mailObj;
    }

    public void setMailMsg(String mailMsg) {
        this.mailMsg = mailMsg;
    }

    private void initCon() {
        // Paramétrer l'objet "session"  
        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "mail.st2msi.net"); // hébergeur smtp
        props.put("mail.stmp.port", "465"); // port smtp
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        this.session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
    }

    public void sendMsg() throws Exception { // exception traité par l'appelant
            this.message = new MimeMessage(session);
            this.message.setFrom(new InternetAddress(user));
            this.message.addRecipient(Message.RecipientType.TO, new InternetAddress(mailTo.strip()));
            this.message.addHeader("Content-type", "text/HTML; charset=UTF-8");
            this.message.addHeader("format", "flowed");
            this.message.addHeader("Content-Transfer-Encoding", "8bit");
            this.message.setHeader("X-Mailer", "st2msi.net/JavaMail version 1.6.2");
            this.message.setSentDate(new Date());
            this.message.setSubject(mailObj.strip(), "UTF-8");
            message.setText(mailMsg, "UTF-8");

            //send the message 
            session.setDebug(true); // passer à false en production
            Transport.send(message);
    }

    public void closeSMTPCon() {
        this.session = null;
        this.message = null;
    }
}
