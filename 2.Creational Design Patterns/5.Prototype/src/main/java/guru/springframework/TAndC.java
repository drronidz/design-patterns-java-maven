package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 11:28 PM
*/

public class TAndC extends PrototypeCapableDocument{

    @Override
    public PrototypeCapableDocument cloneDocument() {
        /*
        * Clone with shallow copy
        * */
        TAndC tAndC = null;
        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name -" + getVendorName() + ", Content - " + getContent() + "]";
    }
}
