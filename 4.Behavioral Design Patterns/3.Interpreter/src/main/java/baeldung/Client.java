package baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 6:04 PM
*/

import java.util.List;

public class Client {
    public static void main(String[] args) {

        Expression query =
                new Select("name",
                        new From("people"));
        Context context = new Context();
        List<String> result = query.interpret(context);
        System.out.println(result);



        Expression query2 =
                new Select("*",
                        new From("people"));
        List<String> result2 = query2.interpret(context);
        System.out.println(result2);

        Expression query3 =
                new Select("name",
                        new From("people",
                                new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(context);
        System.out.println(result3);


        Expression query4 =
                new Select("age",
                        new From("people"));
        List<String> result4 = query4.interpret(context);
        System.out.println(result4);
    }
}
