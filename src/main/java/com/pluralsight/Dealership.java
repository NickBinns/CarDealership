package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String name, address, phone;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {

        this.name = name;
        this.address = address;
        this.phone = phone;

        vehicles = new ArrayList<Vehicle>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Vehicle getVehiclesByPrice(double price) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPrice() == price) {
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle getVehicleByMakeModel(String make, String model) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                return vehicle;
            }

        }
        return null;
    }

    public Vehicle getVehicleByYear ()
}
