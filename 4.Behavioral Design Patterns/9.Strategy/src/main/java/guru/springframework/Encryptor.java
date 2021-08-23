package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 3:06 PM
*/

/* Provides the interface to client for encrypting data. The Context
maintains a reference to a Strategy object and is instantiated and initialized by clients
*/

public class Encryptor {
    private final EncryptionStrategy strategy;
    private String plainText;

    public Encryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        strategy.encryptData(plainText);
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
}
