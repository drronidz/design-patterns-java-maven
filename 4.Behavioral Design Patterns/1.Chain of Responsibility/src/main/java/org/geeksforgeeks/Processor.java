package org.geeksforgeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 1:41 AM
*/

public class Processor {
    private final Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(Number request) {
        if(processor != null) {
            processor.process(request);
        }
    }
}
