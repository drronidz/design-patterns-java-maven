package guru.springframework.topping.cheese;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:10 PM
*/

public class GoatCheese implements Cheese{
    public GoatCheese() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing goat cheese...");
    }
}
