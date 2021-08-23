package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:49 PM
*/

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

// Concrete Strategy : implements the algorithm using the Strategy interface
public class AesEncryptionStrategy implements EncryptionStrategy{
    @Override
    public void encryptData(String plainText) {
        System.out.println("-------------Encrypting DATA using AES Algorithm-------------");
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plainTextByteArray = plainText.getBytes(StandardCharsets.UTF_8);

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainTextByteArray);

            System.out.println("Original DATA: " + plainText);
            System.out.print("Encrypted DATA: ");

            for (byte ct : cipherText) {
                System.out.print(ct + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
