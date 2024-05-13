package com.pluralsight;

public class Vehicle {

private int vin, year, odometer;
private String make, model, color, vehicleType;
private double price;

    public Vehicle (int vin, int year, String make, String model, String vehicleType, int odometer, double price) {

        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.odometer = odometer;
        this.price = price;

    }

    public int getVin() {
        return this.vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return this.odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
