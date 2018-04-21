package com.example.mati.innovathon2018.models;

import java.util.Date;

public class GroupModel {
    private int actualQuantity, maxQuantity, budget;
    private Date date;
    private String location;

    public GroupModel(int actualQuantity, int maxQuantity, int budget, Date date, String location) {
        this.actualQuantity = actualQuantity;
        this.maxQuantity = maxQuantity;
        this.budget = budget;
        this.date = date;
        this.location = location;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
