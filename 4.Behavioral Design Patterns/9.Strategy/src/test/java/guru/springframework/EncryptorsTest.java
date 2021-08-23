package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 3:10 PM
*/

class EncryptorsTest {
    @Test
    void testEncrypt() {
        EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is a plain (normal) text");
        aesEncryptor.encrypt();

        EncryptionStrategy blowFishStrategy = new BlowfishEncryptionStrategy();
        Encryptor blowFishEncryptor = new Encryptor(blowFishStrategy);
        blowFishEncryptor.setPlainText("This is a plain (normal) text");
        blowFishEncryptor.encrypt();
    }
}