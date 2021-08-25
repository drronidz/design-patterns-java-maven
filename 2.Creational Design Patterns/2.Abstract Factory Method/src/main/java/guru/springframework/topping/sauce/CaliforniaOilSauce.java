package guru.springframework.topping.sauce;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/25/2021 10:15 PM
*/

public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing California oil sauce...");
    }
}
