package localux.model;

public class Configuration {

    private String mailProtocol, mailHost, mailPort, mailUser, mailPass;

    private String sgbdSys, sgbdHost, sgbdPort, sgbdDb, sgbdUser, sgbdPass;
    
    public void affiche() {
        System.out.println("mailProtocol: "+this.mailProtocol);
        System.out.println("mailHost: "+this.mailHost);
        System.out.println("mailPort: "+this.mailPort);
        System.out.println("mailUser: "+this.mailUser);
        System.out.println("mailPass: "+this.mailPass);
        System.out.println("P2: SGBD");
        System.out.println("sgbdSys: "+this.sgbdSys);
        System.out.println("sgbdHost: "+this.sgbdHost);
        System.out.println("sgbdPort: "+this.sgbdPort);
        System.out.println("sgbdDb: "+this.sgbdDb);
        System.out.println("sgbdUser: "+this.sgbdUser);
        System.out.println("sgbdPass: "+this.sgbdPass);

    }
    
    public void setMailProtocol(String mailProtocol) {
        this.mailProtocol = mailProtocol;
    }

    public void setMailHost(String mailHost) {
        this.mailHost = mailHost;
    }

    public void setMailPort(String mailPort) {
        this.mailPort = mailPort;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public void setMailPass(String mailPass) {
        this.mailPass = mailPass;
    }

    public String getSgbdSys() {
        return sgbdSys;
    }

    public void setSgbdSys(String sgbdSys) {
        this.sgbdSys = sgbdSys;
    }

    public void setSgbdHost(String sgbdHost) {
        this.sgbdHost = sgbdHost;
    }

    public void setSgbdPort(String sgbdPort) {
        this.sgbdPort = sgbdPort;
    }

    public void setSgbdDb(String sgbdDb) {
        this.sgbdDb = sgbdDb;
    }

    public void setSgbdUser(String sgbdUser) {
        this.sgbdUser = sgbdUser;
    }

    public void setSgbdPass(String sgbdPass) {
        this.sgbdPass = sgbdPass;
    }

    public String getMailProtocol() {
        return mailProtocol;
    }

    public String getMailHost() {
        return mailHost;
    }

    public String getMailPort() {
        return mailPort;
    }

    public String getMailUser() {
        return mailUser;
    }

    public String getMailPass() {
        return mailPass;
    }

    public String getSgbdHost() {
        return sgbdHost;
    }

    public String getSgbdPort() {
        return sgbdPort;
    }

    public String getSgbdDb() {
        return sgbdDb;
    }

    public String getSgbdUser() {
        return sgbdUser;
    }

    public String getSgbdPass() {
        return sgbdPass;
    }
    
}
