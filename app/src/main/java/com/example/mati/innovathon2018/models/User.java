package com.example.mati.innovathon2018.models;

/**
 * Created by Mati on 2018-04-21.
 */

public class User {

    private String uid;
    private String displayName;
    private String email;
    private String university;
    private String departament;
    private Boolean graduated;

    public User() {
    }

    public User(String uid, String displayName, String email, String university, String departament, Boolean graduated) {
        this.uid = uid;
        this.displayName = displayName;
        this.email = email;
        this.university = university;
        this.departament = departament;
        this.graduated = graduated;
    }

    public String getUid() {
        return uid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartament() {
        return departament;
    }

    public Boolean getGraduated() {
        return graduated;
    }
}
