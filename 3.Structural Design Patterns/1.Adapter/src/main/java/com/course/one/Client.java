package com.course.one;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 1:14 AM
*/

import com.tools.ConsoleColors;

public class Client {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter =  new TurkeyAdapter(turkey);

        System.out.println(ConsoleColors.ANSI_PURPLE + "------------------ The turkey says ... ------------------");
        turkey.gobble();
        turkey.fly();

        System.out.println(ConsoleColors.ANSI_PURPLE + "\n ------------------ The com.example.Duck says ... ------------------ ");
        testDuck(duck);

        System.out.println(ConsoleColors.ANSI_PURPLE + "\n ------------------ The com.example.TurkeyAdapter says ... ------------------ ");
        testDuck(turkeyAdapter);

    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
