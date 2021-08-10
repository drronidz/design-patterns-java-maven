package com.course.one;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/9/2021 3:46 PM
*/

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjectsCreate() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotCategory) throws Exception {
        IRobot IRobot = null;

        if(shapes.containsKey(robotCategory)) {
            IRobot = shapes.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "Small":
                    System.out.println("We do not have Small Robot. So we are creating a Small Robot now ...");
                    IRobot = new Robot("Small");
                    shapes.put("Small", IRobot);
                    break;
                case "Large":
                    System.out.println("We do not have Small Robot. So we are creating a Small Robot now ...");
                    IRobot = new Robot("Large");
                    shapes.put("Large", IRobot);
                    break;
                case "King":
                    System.out.println("We do not have King Robot. So we are creating a King Robot now ...");
                    IRobot = new Robot("King");
                    shapes.put("King", IRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot. So we are creating a Queen Robot now ...");
                    IRobot = new Robot("Queen");
                    shapes.put("Queen", IRobot);
                    break;

                default:
                    throw new Exception(" Robot Factory can create only Small, Large, King and Queen Robots");
            }
        }

        return IRobot;
    }
}
