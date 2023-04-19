package com.example.w23comp1008lhtest3student;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> inventory;
    private String dealershipName;

    public Dealership(String dealershipName)
    {
        setDealershipName(dealershipName);
        inventory = new ArrayList<Car>();

    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) throws IllegalArgumentException{
        String check = dealershipName.trim();
        if(check.length() >= 3){
            this.dealershipName = dealershipName;
        }
        else{
            throw new IllegalArgumentException("Please enter a valid name (longer then 2 characters");
        }
    }

    public void addCar(Car car)
    {
        inventory.add(car);
    }

    public void addCarCollection(ArrayList<Car> cars)
    {
        inventory.addAll(cars);
    }


    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public double getInventoryValue()
    {
        double total = 0;
        for(Car each : inventory){
            double value = each.getPrice();
            total += value;
        }
        return total;
    }

    public Car getLeastExpensiveCar()
    {
        Car leastExpensiveCar = null;
        if (inventory != null && !inventory.isEmpty()) {
            leastExpensiveCar = inventory.get(0);
            for (Car car : inventory) {
                if (car.getPrice() < leastExpensiveCar.getPrice()) {
                    leastExpensiveCar = car;
                }
            }
        }
        return leastExpensiveCar;
    }
    public Car getMostExpensiveCar()
    {
        Car mostExpensiveCar = null;
        if (inventory != null && !inventory.isEmpty()) {
            mostExpensiveCar = inventory.get(0);
            for (Car car : inventory) {
                if (car.getPrice() > mostExpensiveCar.getPrice()) {
                    mostExpensiveCar = car;
                }
            }
        }
        return mostExpensiveCar;
    }

    public ArrayList<Car> getElectricVehicles()
    {
        ArrayList<Car> electricVics = new ArrayList<Car>();
        for(Car car : inventory){
            if(car.getClass() == ElectricVehicle.class){
                electricVics.add(car);
            }
        }
        return electricVics;
    }

    public int getNumCarsInInventory()
    {
        int numCars = 0;
        for(Car car : inventory){
            numCars += 1;
        }
        return numCars;
    }

    public String toString()
    {
        String eval = "The Inventory has " + getNumCarsInInventory() + " cars worth $" + getInventoryValue();
        return eval;
    }

    public ArrayList<Car> search(String searchText)
    {
        ArrayList<Car> search = new ArrayList<Car>();
        for(Car each : inventory){
            if(each.contains(searchText, inventory) == true){
                search.add(each);
            }
        }
        return search;
    }


}
