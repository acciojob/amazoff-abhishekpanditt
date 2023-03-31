package com.driver;

public class Order {

    private String id;
    private int deliveryTime;

    public Order(String id, String deliveryTime) {

        this.id=id;
        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM

        Integer hr = Integer.valueOf(deliveryTime.substring(0,2));
        Integer min = Integer.valueOf(deliveryTime.substring(3));
        Integer currTime = hr*60+min;
        this.deliveryTime = currTime;
    }

    public Order(){

    }

    public String getId() {

        return id;
    }

    public int getDeliveryTime() {
        return deliveryTime;}
}
