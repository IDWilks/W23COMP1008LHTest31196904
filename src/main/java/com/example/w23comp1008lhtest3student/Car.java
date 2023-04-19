package com.example.w23comp1008lhtest3student;

import java.util.Arrays;
import java.util.List;

public class Car {

    private String make, model;
    private double price;
    private int year;

    public Car(String make, String model, double price, int year) {
        setMake(make);
        setModel(model);
        setPrice(price);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) throws IllegalArgumentException{
        boolean valid = false;
        String[] makes = {"Audi", "Ford", "GMC", "Honda", "Nissan", "BMW", "lamborghini", "Tesla"};
        for (String value : makes) {
            if(value.equals(make)){
                valid = true;
            }
            if (valid = true){
                this.make = make;
            }
            else{
                throw new IllegalArgumentException("Please enter a valid Make");
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.trim().length() >= 2){
            this.model = model;
        }
        else{
            throw new IllegalArgumentException("Model name must be 2 or more characters");
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0 && price <= 400000){
            this.price = price;
        }
        else{
            throw new IllegalArgumentException("Price range must be between $0 and $400000");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1900 && year <= 2023){
            this.year = year;
        }
        else{
            throw new IllegalArgumentException("Year Must be between 1900 and 2023");
        }

    }

    public boolean contains(String searchText)
    {
        return false;
    }

    public String toString()
    {
        return null;
    }

}
