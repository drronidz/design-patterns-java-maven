package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/6/2021 3:55 PM
*/

public class AbstractDecorator extends Component {
    protected Component component;

    @Override
    public void doJob() {
        if(component != null) {
            component.doJob();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
