package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 12:55 AM
*/

abstract class StealingTemplate {
    protected abstract String pickTarget();
    protected abstract void confuseTarget(String target);
    protected abstract void stealItem(String target);

    public void steal() {
        var target = pickTarget();
        System.out.println("The target has been chosen as " + target + ".");
        confuseTarget(target);
        stealItem(target);
    }
}

class SubtleMethod extends StealingTemplate {

    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + pickTarget() + " with tears running and hug him !");
    }

    @Override
    protected void stealItem(String target) {
        System.out.println("While in close contact grab the " + pickTarget() + "'s wallet.");
    }
}

class HitAndRunMethod extends StealingTemplate {

    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + pickTarget() + " from behind.");
    }

    @Override
    protected void stealItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }
}
