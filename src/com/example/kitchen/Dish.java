package com.example.kitchen;

public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

    public static String allDishesToString() {
        StringBuilder sb = new StringBuilder();
        for (Dish dish: Dish.values()) {
            sb.append(dish.name()).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
