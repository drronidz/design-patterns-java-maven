package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:05 AM
*/

public interface Subject {

    // Methods to register nd unregister observers
    public void register (Observer observer);
    public void unregister (Observer observer);

    // Method to notify observers of changes
    public void notifyObservers();

    // Method to get Updates from subject, not required,
    // but added so observers can query to see if there is an update
    public Object getUpdate(Observer observer);
}
