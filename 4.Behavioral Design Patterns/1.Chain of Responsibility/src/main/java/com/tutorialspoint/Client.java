package com.tutorialspoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 2:36 PM
*/

public class Client {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        System.out.println("------------------------------------");

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        System.out.println("------------------------------------");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information");

        System.out.println("------------------------------------");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information");
    }

    public static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
