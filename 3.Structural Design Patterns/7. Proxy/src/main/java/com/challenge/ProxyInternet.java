package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:07 PM
*/

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private final Internet internet = new RealInternet();

    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
