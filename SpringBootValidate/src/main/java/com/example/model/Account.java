package com.example.model;

import javax.validation.constraints.NotNull;

/**
 * Created by Ali on 18.11.2017.
 */
public class Account {

    @NotNull
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

