package guru;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 11:37 PM
*/

public interface MailClient {
    void sendMail(String [] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean configureForMac();
    boolean configureForWindows();
}
