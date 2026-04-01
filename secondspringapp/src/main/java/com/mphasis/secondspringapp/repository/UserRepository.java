package com.mphasis.secondspringapp.repository;

public class UserRepository {

    private DataSource dataSource;

    public UserRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void show() {
        System.out.println(dataSource.getDetails());
    }
}
