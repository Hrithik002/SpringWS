package com.mphasis.secondspringapp.repository;

public class DataSource {

    private String url;
    private String username;

    public DataSource(String url, String username) {
        this.url = url;
        this.username = username;
    }

    public String getDetails() {
        return url + " | " + username;
    }
}
