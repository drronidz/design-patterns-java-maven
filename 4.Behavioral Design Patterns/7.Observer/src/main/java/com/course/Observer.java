package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:14 AM
*/

public interface Observer {

    // method to update the observer,used by subject
    public void update();

    // attach with subject to observe, not required, but, added so that
    // the observer can query the subject to see if an update has occurred
    public void setSubject(Subject subject);
}
