package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 11:38 PM
*/

import java.util.HashMap;
import java.util.Map;

public class DocumentPrototypeManager {
    private static final Map<String, PrototypeCapableDocument> prototypes = new HashMap<>();

    static {
        TAndC tAndC = new TAndC();
        tAndC.setVendorName("Vendor Name Placeholder");

        /* Retrieve Terms and Conditions from database/network call/disk I/O here */
        tAndC.setContent("Please read and accept the terms and conditions ...");
        prototypes.put("tandc",tAndC);

        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Andrew Clark");
        authorizedSignatory.setDesignation("Operation Head");

        NDAgreement nda = new NDAgreement();
        nda.setVendorName("Vendor Name placeholder");

        /* Retrieve Non Disclosure Agreement from database/network call/disk I/O here*/
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("nda", nda);

    }

    public static PrototypeCapableDocument getClonedDocument(final String type) {
        PrototypeCapableDocument clonedDoc = null;

        try {
            PrototypeCapableDocument doc = prototypes.get(type);
            clonedDoc = doc.cloneDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedDoc;
    }
}
