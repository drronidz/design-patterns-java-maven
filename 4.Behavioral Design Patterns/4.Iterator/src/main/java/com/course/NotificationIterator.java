package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:09 PM
*/

public class NotificationIterator implements Iterator{
    Notification[] notificationList;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of notifiactionList are going to iterate over
    public  NotificationIterator (Notification[] notificationList)  {
        this.notificationList = notificationList;
    }

    public Object next() {
        // return next element in the array and increment pos
        Notification notification = notificationList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext()  {
        return pos < notificationList.length && notificationList[pos] != null;
    }
}
