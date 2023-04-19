package com.example.w23comp1008lhtest3student;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DealershipTest {

    private Dealership dealership;
    private Car car1, car2, car3;
    private ElectricVehicle ev1;

    private ArrayList<Car> cars;

//    @Before
//    public void setUp() throws Exception {
//        cars = new ArrayList<>();
//        dealership = new Dealership("Java Dealer");
//        car1 = new Car("Ford","F150",87987.33, 2022);
//        car2 = new Car("Ford","Escape",38923.99,2021);
//        car3 = new Car("BMW","X3",92345.99, 2023);
//        ev1 = new ElectricVehicle("Ford","Mustang Mach-e",65873.33,2023,500);
//        dealership.addCar(car1);
//        dealership.addCar(car2);
//        dealership.addCar(car3);
//        dealership.addCar(ev1);
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(ev1);
//    }
//
//    @Test
//    public void noCars()
//    {
//        dealership = new Dealership("Frank's");
//        assertNull(dealership.getMostExpensiveCar());
//    }
//
//    @Test
//    public void addCollection()
//    {
//        dealership = new Dealership("Fred");
//        dealership.addCarCollection(cars);
//        assertEquals(cars, dealership.getInventory());
//    }
//
//    @Test
//    public void numCars()
//    {
//        assertEquals(4, dealership.getNumCarsInInventory());
//    }
//
//
//    @Test
//    public void numCarsEmpty()
//    {
//        dealership = new Dealership("Frank's");
//        assertEquals(0, dealership.getNumCarsInInventory());
//    }
//
//
//
//    @Test
//    public void dealerName() {
//        assertEquals("Java Dealer",dealership.getDealershipName());
//    }
//
//    @Test
//    public void setNameInvalid() {
//        Assertions.assertThrows(IllegalArgumentException.class, ()->{
//            dealership.setDealershipName("ab");});
//    }
//
//    @Test
//    public void setNameInvalidWhiteSpaces() {
//        Assertions.assertThrows(IllegalArgumentException.class, ()->{
//            dealership.setDealershipName("  ab   ");});
//    }
//
//    @Test
//    public void setNameInvalidConstructor() {
//        Assertions.assertThrows(IllegalArgumentException.class, ()->{
//            new Dealership("ab");});
//    }
//
//    @Test
//    public void setNameInvalidWhiteSpacesConstructor() {
//        Assertions.assertThrows(IllegalArgumentException.class, ()->{
//            new Dealership("  ab   ");});
//    }
//
//    @Test
//    public void addCar() {
//        Car newCar = new Car("BMW","X5",98723.22,2023);
//        dealership.addCar(newCar);
//        assertTrue(dealership.getInventory().contains(newCar));
//    }
//
//
//    //car1 = new Car(2022,"Ford","F150",87987.33);
//    //        car2 = new Car(2021, "Ford","Escape",38923.99);
//    //        car3 = new Car(2023,"BMW","X3",92345.99);
//    //        ev1 = new ElectricVehicle(2023,"Ford","Mustang Mach-e",65873.33,500);
//    //87987.33+38923.99+92345.99+65873.33=
//    @Test
//    public void getInventoryValue() {
//        assertEquals(285130.64,dealership.getInventoryValue(),0.001);
//    }
//
//    @Test
//    public void getInventoryValueEmpty() {
//        dealership = new Dealership("Fred");
//        assertEquals(0,dealership.getInventoryValue(),0.001);
//    }
//
//    @Test
//    public void getMostExpensiveCar() {
//        assertEquals(car3, dealership.getMostExpensiveCar());
//    }
//
//    @Test
//    public void getMostExpensiveCar2() {
//        Car car = new Car("BMW","X5",140000,2023);
//        dealership.addCar(car);
//        assertEquals(car, dealership.getMostExpensiveCar());
//    }
//
//    @Test
//    public void testToString() {
//        assertEquals("The inventory has 4 cars worth $285130.64",dealership.toString());
//    }
//
//    @Test
//    public void testToString2() {
//        dealership = new Dealership("Fred");
//        assertEquals("The inventory has 0 cars worth $0.00",dealership.toString());
//    }
//
//    @Test
//    public void getElectricVehicles() {
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(ev1);
//        assertEquals(cars,dealership.getElectricVehicles());
//    }
//
//    @Test
//    public void getElectricVehicles2() {
//        ElectricVehicle ev = new ElectricVehicle("Audi","RS 4 E-tron",158500,2022,500);
//
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(ev1);
//        cars.add(ev);
//        dealership.addCar(ev);
//        assertEquals(cars,dealership.getElectricVehicles());
//    }
//
//    @Test
//    public void getElectricVehiclesNoCars() {
//        dealership = new Dealership("Fred");
//        ArrayList<Car> cars = new ArrayList<>();
//        assertEquals(cars,dealership.getElectricVehicles());
//    }
//
//    @Test
//    public void getCheapestCarNoCars() {
//        dealership = new Dealership("Fred");
//        assertEquals(null,dealership.getLeastExpensiveCar());
//    }
//
//    @Test
//    public void getCheapestCar() {
//        assertEquals(car2,dealership.getLeastExpensiveCar());
//    }
//
//    @Test
//    public void searchNoText()
//    {
//        assertEquals(cars, dealership.search(""));
//    }
//
//    @Test
//    public void searchFor()
//    {
//        cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(ev1);
//        assertEquals(cars, dealership.search("For"));
//    }
//
//    @Test
//    public void searchForLowerCase()
//    {
//        cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(ev1);
//        assertEquals(cars, dealership.search("for"));
//    }
}