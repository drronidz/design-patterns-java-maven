package org.geeksforgeeks;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 2:04 AM
*/

public class Chain {
    Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeProcessor(
                        new ZeroProcessor(
                                new PositiveProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }
}
