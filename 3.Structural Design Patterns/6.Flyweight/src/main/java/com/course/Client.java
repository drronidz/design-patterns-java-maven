package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/9/2021 3:59 PM
*/

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {

        System.out.println(" -------------------------- Flyweight Pattern Example --------------------------");

      RobotFactory robotFactory = new RobotFactory();

      Robot shape = null;

      /* Here we are trying to get 3 king type robots */
        for (int i = 0; i < 3; i++) {
            shape = (Robot) robotFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        /* Here we are trying to get 3 queen type robots */
        for (int i = 0; i < 3; i++) {
            shape = (Robot)robotFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int NumOfDistinctRobots = robotFactory.totalObjectsCreate();
        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);

    }

    static String getRandomColor() {
        Random random = new Random();
        /*
         * You can supply any number of your choice in nextInt argument.
         * We are simply checking the random number generated is an even number
         * or an odd number. And based on that we are choosing the color.
         * For simplicity, we'll use only two colors red and green.
         * */

        int randomNumber = random.nextInt(20);
        if(randomNumber%2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
