package com.course.mediator;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 4:22 PM
*/

import com.course.colleauge.User;

public interface ChatMediator {
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}
