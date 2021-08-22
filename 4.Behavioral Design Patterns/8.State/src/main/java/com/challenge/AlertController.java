package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:59 AM
*/

public class AlertController {
    private MobileAlert currentAlert;

    public AlertController() {
        // Setting up the default alert state !
        System.out.println("------ Vibration is a default mode ... ------");
        this.currentAlert = new Vibration();
    }

    public void setCurrentAlert(MobileAlert currentAlert) {
        this.currentAlert = currentAlert;
    }

    public void alert() {
        currentAlert.alert();
    }
}
