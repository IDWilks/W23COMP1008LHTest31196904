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
        return -1;
    }

    public Car getLeastExpensiveCar()
    {
        return null;
    }
    public Car getMostExpensiveCar()
    {
        return null;
    }

    public ArrayList<Car> getElectricVehicles()
    {
        return null;
    }

    public int getNumCarsInInventory()
    {
        return -1;
    }

    public String toString()
    {
        return null;
    }

    public ArrayList<Car> search(String searchText)
    {
        return null;
    }


}
