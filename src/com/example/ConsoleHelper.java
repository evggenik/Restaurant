package com.example;

import com.example.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static final BufferedReader READER =
            new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return READER.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> allDishesForOrder = new ArrayList<>();
        String menuDishes = Dish.allDishesToString();
        writeMessage(menuDishes);
        writeMessage("Type in the chosen dish (or 'exit' to finish)");

        while (true) {
            String dishName = readString().trim().toUpperCase();

            if ("EXIT".equals(dishName)) {
                break;
            }
            try {
                Dish dish = Dish.valueOf(dishName);
                allDishesForOrder.add(dish);
                writeMessage(dishName + " has been successfully added to your order");
            } catch (IllegalArgumentException e) {
                writeMessage("No such dish in menu");
            }
        }
        return allDishesForOrder;
    }
}
