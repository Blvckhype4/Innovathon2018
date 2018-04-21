package com.example.mati.innovathon2018;


import java.text.SimpleDateFormat;

public class Group {
    private int actualQuantity, maxQuantity, budget;
    private String location, date;

    public Group() {
    }

    public Group(int actualQuantity, int maxQuantity, int budget,
                 String location, String date) {

        this.actualQuantity = actualQuantity;
        this.maxQuantity = maxQuantity;
        this.budget = budget;
        this.location = location;
        this.date = date;
    }

    public int getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(int actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}