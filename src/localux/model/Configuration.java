package localux.model;

public class Configuration {

    private String mailProtocol, mailHost, mailPort, mailUser, mailPass;

    private String sgbdSys, sgbdHost, sgbdPort, sgbdDb, sgbdUser, sgbdPass;
    
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
