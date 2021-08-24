package guru;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 11:41 PM
*/

public class SquirrelMailClient implements MailClient{
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: Receiving mail");
    }

    @Override
    public boolean configureForMac() {
        System.out.println("Configuration of Squirrel mail client for MAC complete");
        return true;
    }

    @Override
    public boolean configureForWindows() {
        System.out.println("Configuration of Squirrel mail client for Windows complete");
        return true;
    }
}
