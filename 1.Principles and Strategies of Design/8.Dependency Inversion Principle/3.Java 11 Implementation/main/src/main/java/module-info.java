/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 3:35 PM
*/

module main {
    requires entities;
    requires daos;
    requires daoimplementations;
    requires services;
    exports  com.baeldung.main;
}