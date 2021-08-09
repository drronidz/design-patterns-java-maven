package com.javatpoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:51 PM
*/

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
        this.blackberry = new Blackberry();
    }

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

    public void blackberrySale() {
        blackberry.modelNo();
        blackberry.price();
    }
}
