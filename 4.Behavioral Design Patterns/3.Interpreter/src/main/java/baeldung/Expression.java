package baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 5:39 PM
*/



import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
