package guru.springframework.topping.cheese;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:12 PM
*/

public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Mozzarella cheese...");
    }
}
