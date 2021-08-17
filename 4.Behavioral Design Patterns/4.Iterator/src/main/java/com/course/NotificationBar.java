package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:14 PM
*/

public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications)  {
        this.notifications = notifications;
    }

    public void printNotifications()  {
        Iterator iterator = notifications.createIterator();
        System.out.println("------- NOTIFICATION BAR ------------");
        while (iterator.hasNext())   {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
