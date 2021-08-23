package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:47 PM
*/

// Strategy : is an interface common to all supported algorithm-specific classes.
public interface EncryptionStrategy {
    void encryptData(String plainText);
}
