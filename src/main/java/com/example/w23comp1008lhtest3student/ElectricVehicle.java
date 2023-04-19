package com.example.w23comp1008lhtest3student;

public class ElectricVehicle extends Car{
    private int range;

    public ElectricVehicle(String make, String model, double price, int year, int range) {
        super(make, model, price, year);
        setRange(range);
    }

    public int getRange() {
        return range;
    }

    public void setRange (int range) throws IllegalArgumentException{
        if(range >= 200 && range <= 600 ){
            this.range = range;
        }
        else{
            throw new IllegalArgumentException("Please enter a valid range between 200-600km");
        }
    }

    public static String toString(Car car) {
        String ad = super.toString(car) + "-Electric";
        return ad;
    }
}
