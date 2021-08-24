package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:04 AM
*/

public class HalflingThief {
    private StealingTemplate template;

    public HalflingThief(StealingTemplate template) {
        this.template = template;
    }

    public void steal() {
        template.steal();
    }

    public void changeTemplate(StealingTemplate template) {
        this.template = template;
    }
}
