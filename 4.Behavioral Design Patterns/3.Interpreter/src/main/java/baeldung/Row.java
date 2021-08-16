package baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/16/2021 5:41 PM
*/

public class Row {
    private final String name;
    private final String surname;
    private final int age;

    public Row(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " +age;
    }
}
