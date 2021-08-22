package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:42 AM
*/

public class Client {
    Controller controller;

    Client (String connection) {
        controller = new Controller();

        // The following trigger should be made by the user
        switch (connection) {
            case "management" -> controller.setManagementConnection();
            case "sales" -> controller.setSalesConnection();
            case "accounting" -> controller.setAccountingConnection();
        }


        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }

    public static void main(String[] args) {
        new Client("sales");
    }
}
