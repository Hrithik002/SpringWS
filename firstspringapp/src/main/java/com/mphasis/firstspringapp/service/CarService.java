package com.mphasis.firstspringapp.service;

public class CarService {

    private String model;
    private EngineService engineService;
    private int year;

    // ✅ Constructor injection (REQUIRED)
    public CarService(String model, EngineService engineService, int year) {
        this.model = model;
        this.engineService = engineService;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("Car Model : " + model);
        System.out.println("Year      : " + year);
        System.out.println("Engine    : " + engineService.getType());
        System.out.println("Horsepower: " + engineService.getHorsepower());
    }
}