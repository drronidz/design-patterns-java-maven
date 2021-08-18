package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 3:35 PM
*/

import com.course.colleauge.User;
import com.course.colleauge.UserImpl;
import com.course.mediator.ChatMediator;
import com.course.mediator.ChatMediatorImpl;

public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user_1 = new UserImpl(mediator, "Jason");
        User user_2 = new UserImpl(mediator, "Jennifer");
        User user_3 = new UserImpl(mediator, "Lucy");
        User user_4 = new UserImpl(mediator, "Drake");

        mediator.addUser(user_1);
        mediator.addUser(user_2);
        mediator.addUser(user_3);
        mediator.addUser(user_4);

        user_1.send("Hi All");
    }
}
