package com.example.simplyrecipes.Activities;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public Filter() { }

    public List<String> getMealTypeOptions() {
        List<String> options = new ArrayList<>();
        options.add("Breakfast");
        options.add("Brunch");
        options.add("Lunch");
        options.add("Supper");
        options.add("Dinner");
        return options;
    }

    public List<String> getCookingTimeOptions() {
        List<String> options = new ArrayList<>();
        options.add("Less than 15 minutes");
        options.add("15 minutes - 30 minutes");
        options.add("30 minutes - 1 hour");
        options.add("1 hour - 2 hours ");
        options.add("More than 2 hours");
        return options;
    }

    public List<String> getRatingOptions() {
        List<String> options = new ArrayList<>();
        options.add("4.0 - 5.0");
        options.add("3.0 - 4.0");
        options.add("2.0 - 1.0");
        return options;
    }

    public List<String> getCuisineOptions() {
        List<String> options = new ArrayList<>();
        options.add("Chinese");
        options.add("Mexican");
        options.add("Korean");
        options.add("Vietnamese");
        options.add("Indian");
        options.add("Caribbean");
        options.add("Indian");
        options.add("Thai");
        options.add("Japanese");
        return options;
    }
}