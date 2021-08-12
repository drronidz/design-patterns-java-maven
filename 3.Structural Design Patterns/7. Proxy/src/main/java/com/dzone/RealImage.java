package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:50 PM
*/

public class RealImage implements Image {
    protected String fileNameWithPath;

    public RealImage(String fileNameWithPath) {
        this.fileNameWithPath = fileNameWithPath;
        load();
    }

    @Override
    public void load() {
        System.out.println("RealImage: Loading image: " + fileNameWithPath);
    }

    @Override
    public void show() {
        System.out.println("RealImage: Showing image: " + fileNameWithPath);
    }

    @Override
    public void showSummary() {
        System.out.println("RealImage: Showing Summary image: " + fileNameWithPath);
    }

    @Override
    public void resize() {
        System.out.println("RealImage: Resizing Summary image: " + fileNameWithPath);
    }

    @Override
    public void remove() {
        System.out.println("RealImage: Removing Summary image: " + fileNameWithPath);
    }

    @Override
    public void close() {
        System.out.println("RealImage: Closing Summary image: " + fileNameWithPath);
    }

    public String getFileNameWithPath() {
        return fileNameWithPath;
    }

    public void setFileNameWithPath(String fileNameWithPath) {
        this.fileNameWithPath = fileNameWithPath;
    }
}
