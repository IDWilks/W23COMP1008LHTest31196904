package com.example.w23comp1008lhtest3student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarCreator {
    public static ArrayList<Car> getCars()
    {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi","A6",23995,2016));
        cars.add(new Car("Audi","SQ5",79010.99,2023));
        cars.add(new Car("Ford","Mustang",29888.01,2015));
        cars.add(new Car("Nissan","Armada",34799.10,2015));
        cars.add(new Car("Ford","Focus",6994.19,2014));
        cars.add(new Car("Ford","Escape",8750.23,2015));
        cars.add(new Car("BMW","X5",26800,2014));
        cars.add(new Car("BMW","4-Series",28888.10,2016));
        cars.add(new Car("GMC","Terrain",36888.99,2022));
        cars.add(new Car("GMC","Sierra 3500",40900,2015));
        cars.add(new Car("GMC","Yukon",13900.99,2012));
        cars.add(new Car("GMC","Sierra 1500",63135.75,2022));
        cars.add(new Car("Nissan","Frontier",44995.10,2022));
        cars.add(new Car("Nissan","Armada",44988,2017));
//        cars.add(new ElectricVehicle("Audi","RS 4 E-tron",158500,2022,500));
//        cars.add(new ElectricVehicle("Tesla","Model S Plaid",149500.99,2022,550));
        cars.add(new Car("Lamborghini","Huracan",330000,2017));

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getMake().compareTo(o2.getMake())==0)
                {
                    if (o1.getModel().compareTo(o2.getModel())==0)
                        return Double.compare(o1.getPrice(), o2.getPrice());
                    else
                        return o1.getModel().compareTo(o2.getModel());
                } else
                    return o1.getMake().compareTo(o2.getMake());
            }
        });

        return cars;
    }
}
