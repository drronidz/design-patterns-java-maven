package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 2:01 AM
*/

public class Client {
    public static void main(String[] args) {
        AlertController alertController = new AlertController();

        alertController.alert();
        alertController.alert();

        System.out.println("------ Switching to Silent Mode ... ------");
        alertController.setCurrentAlert(new Silent());

        alertController.alert();
        alertController.alert();
        alertController.alert();
    }
}
