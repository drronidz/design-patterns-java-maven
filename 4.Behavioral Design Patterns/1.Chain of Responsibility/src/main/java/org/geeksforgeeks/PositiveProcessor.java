package org.geeksforgeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 2:03 AM
*/

public class PositiveProcessor extends Processor{

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() > 0) {
            System.out.println("Positive Processor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
