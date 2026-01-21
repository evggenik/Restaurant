package com.example.kitchen;

public enum Dish {
    FISH(25),
    STEAK(30),
    SOUP(15),
    JUICE(5),
    WATER(3);

    Dish(int duration) {
        this.duration = duration;
    }

    private int duration;

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString() {
        StringBuilder sb = new StringBuilder();
        for (Dish dish: Dish.values()) {
            sb.append(dish.name()).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
