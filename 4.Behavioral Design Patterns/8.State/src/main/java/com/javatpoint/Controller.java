package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:36 AM
*/


// We can call it also context
public class Controller {

    public static Accounting accounting;
    public static Sales sales;
    public static Management management;

    private static Connection connection;

    Controller() {
        accounting = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccountingConnection() {
        connection = accounting;
    }

    public void setSalesConnection() {
        connection = sales;
    }

    public void setManagementConnection() {
        connection = management;
    }

    public void open() {
        connection.open();
    }

    public void close() {
        connection.close();
    }

    public void log() {
        connection.log();
    }

    public void update() {
        connection.update();
    }
 }
