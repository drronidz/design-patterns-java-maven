package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/26/2021 12:39 AM
*/

class DocumentPrototypeManagerTest {
    PrototypeCapableDocument clonedTAndC;
    PrototypeCapableDocument clonedNDA;

    @BeforeEach
    void setUp() {
        clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
    }

    @Test
    void getClonedDocumentTest() {
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);

        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }
}