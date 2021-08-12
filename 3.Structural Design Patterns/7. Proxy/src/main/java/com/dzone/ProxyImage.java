package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:56 PM
*/

public class ProxyImage implements Image {

    protected String remoteHost;
    protected String fileNameWithPath;
    private Image image;
    protected boolean isAdmin;

    public ProxyImage(String fileNameWithPath, boolean isAdmin) {
        super();
        this.fileNameWithPath = fileNameWithPath;
        this.isAdmin = isAdmin;
    }

    public ProxyImage(String remoteHost, String fileNameWithPath, boolean isAdmin) {
        this(fileNameWithPath, isAdmin);
        this.remoteHost = remoteHost;
    }

    @Override
    public void load() {
        if(image == null) {
            if(remoteHost != null) {
                image = new RemoteImage(remoteHost, fileNameWithPath);
            } else {
                image = new RealImage(fileNameWithPath);
            }
        } else {
            System.err.printf("ImageProxy: Already loaded image: '%s'.\n", fileNameWithPath);
        }
    }

    @Override
    public void show() {
        load();
        image.show();
    }

    @Override
    public void showSummary() {
        System.err.printf("ImageProxy: Showing Summary of image: '%s'.\n", fileNameWithPath);
    }

    @Override
    public void resize() {
        if(isAdmin) {
            load();
            image.resize();
        } else {
            System.err.printf("ImageProxy: Only Admin can resize of image: '%s'.\n", fileNameWithPath);
        }
    }

    @Override
    public void remove() {
        if(isAdmin) {
            load();
            image.remove();
        } else {
            System.err.printf("ImageProxy: Only Admin can remove of image: '%s'.\n", fileNameWithPath);
        }
    }

    @Override
    public void close() {
        if(image != null) {
            image.close();
        } else {
            System.err.printf("ImageProxy: Already closed image: '%s'.\n", fileNameWithPath);
        }
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public String getFileNameWithPath() {
        return fileNameWithPath;
    }

    public void setFileNameWithPath(String fileNameWithPath) {
        this.fileNameWithPath = fileNameWithPath;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
