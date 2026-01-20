package com.example;

import com.example.kitchen.Cook;
import com.example.kitchen.Waiter;


public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);

        Cook cook = new Cook("Вася");
        tablet.addObserver(cook);

        Waiter waiter = new Waiter();
        cook.addObserver(waiter);

        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();
    }
}
