package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:02 PM
*/

public class Client {
    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();
    }
}
