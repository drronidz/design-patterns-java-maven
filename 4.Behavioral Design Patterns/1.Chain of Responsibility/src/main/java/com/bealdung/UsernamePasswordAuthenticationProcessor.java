package com.bealdung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 1:37 AM
*/

public class UsernamePasswordAuthenticationProcessor extends AuthenticationProcessor{

    public UsernamePasswordAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
        if(authenticationProvider instanceof UsernamePasswordProvider) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authenticationProvider);
        }else {
            return Boolean.FALSE;
        }
    }
}
