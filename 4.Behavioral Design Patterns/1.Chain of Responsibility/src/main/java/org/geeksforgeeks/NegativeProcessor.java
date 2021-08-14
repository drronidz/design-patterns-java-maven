package org.geeksforgeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 2:00 AM
*/

public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() < 0) {
            System.out.println("Negative Processor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
