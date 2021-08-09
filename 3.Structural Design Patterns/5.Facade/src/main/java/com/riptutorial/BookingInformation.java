package com.riptutorial;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 12:36 AM
*/

import java.util.Date;
import java.util.List;

public class BookingInformation {
    String source;
    String destination;
    Date from;
    Date to;
    List<PersonalInformation> list;


    @Override
    public String toString() {
        return "BookingInformation{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", list=" + list +
                '}';
    }
}
