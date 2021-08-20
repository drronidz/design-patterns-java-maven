package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/20/2021 2:53 PM
*/

public class Client {
    public static void main(String[] args) {
        // Create subject
        Topic topic = new Topic();


        // create observers
        Observer observer_1 = new TopicSubscriber("observer one");
        Observer observer_2 = new TopicSubscriber("observer two");
        Observer observer_3 = new TopicSubscriber("observer three");


        /*
        * register observers to the subject, could have added the registration
         * as part of constructor (passing in the subject)
        * */

        topic.register(observer_1);
        topic.register(observer_2);
        topic.register(observer_3);

        // attach observer to subject (not required, could have passed in subject state to update method of observer)
        observer_1.setSubject(topic);
        observer_2.setSubject(topic);
        observer_3.setSubject(topic);

        // check if any update is available, not required
        observer_1.update();

        // now send message to subject, trigger notifyAll
        topic.postMessage("New Message");


    }
}
