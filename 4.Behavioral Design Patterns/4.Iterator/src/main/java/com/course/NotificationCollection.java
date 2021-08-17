package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:05 PM
*/

public class NotificationCollection implements Collection {

    public static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification [] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);

        if(numberOfItems >= MAX_ITEMS) {
            System.out.println("Full");
        }
        else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
