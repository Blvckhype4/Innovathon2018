package com.example.mati.innovathon2018;


public class User {
    private String name, surname, university;

    public User() {
    }

    public User(String name, String surname, String university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}