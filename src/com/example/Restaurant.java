package com.example;

import com.example.kitchen.Cook;


public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);

        Cook cook = new Cook("Вася");
        tablet.addObserver(cook);

        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();
    }
}
