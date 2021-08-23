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

public class BlowfishEncryptionStrategy implements EncryptionStrategy{
    @Override
    public void encryptData(String plainText) {
        System.out.println("\n----------Encrypting DATA using Blowfish Algorithm----------");
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plainTextByteArray = plainText.getBytes(StandardCharsets.UTF_8);

            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainTextByteArray);

            System.out.println("Original DATA: " + plainText);
            System.out.println("Encrypted DATA: ");
            for (byte b : cipherText) {
                System.out.print(b + " ");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
