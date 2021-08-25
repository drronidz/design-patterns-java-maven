package guru.springframework.topping.sauce;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:13 PM
*/

public class TomatoSauce implements Sauce{
    public TomatoSauce() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Tomato sauce...");
    }
}
