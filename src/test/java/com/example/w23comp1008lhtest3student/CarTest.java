package com.example.w23comp1008lhtest3student;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
public class CarTest {


    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car("Ford","F150",57999.99, 2023);
    }

    @Test
    public void setMakeConstructor() {
        assertEquals("Ford",car.getMake());
    }

    @Test
    public void setMake() {
        car.setMake("GMC");
        assertEquals("GMC",car.getMake());
    }

    @Test
    public void setMakeWithWhiteSpace() {
        car.setMake("    GMC    ");
        assertEquals("GMC",car.getMake());
    }

    @Test
    public void setMakeHonda() {
        car.setMake("Honda");
        assertEquals("Honda",car.getMake());
    }

    @Test
    public void setMakeNissan() {
        car.setMake("Nissan");
        assertEquals("Nissan",car.getMake());
    }

    @Test
    public void setMakeConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Invalid","F150",57999.99,2021);});
    }

    @Test
    public void setModelConstructorInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Ford","a",57999.99,2021);});
    }

    @Test
    public void setPriceConstructorInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Ford","F150",-1,2021);});
    }

    @Test
    public void setPriceConstructorInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Car("Ford","F150",400000.01,2021);});
    }

    @Test
    public void setModel() {
        car.setModel("X3");
        assertEquals("X3",car.getModel());
    }

    @Test
    public void setModelWithWhiteSpaces() {
        car.setModel("   X3   ");
        assertEquals("X3",car.getModel());
    }

    @Test
    public void setModelInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setModel("a");});
    }

    @Test
    public void setPrice() {
        car.setPrice(76292.34);
        assertEquals(76292.34, car.getPrice(),0.001);
    }

    @Test
    public void setPriceInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setPrice(-1);});
    }

    @Test
    public void setPriceInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setPrice(400000.01);});
    }

    @Test
    public void setYear() {
        car.setYear(2022);
        assertEquals(2022, car.getYear());
    }

    @Test
    public void setYearInvalidHigh() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setYear(2024);});
    }

    @Test
    public void setYearInvalidLow() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            car.setYear(1899);});
    }
    @Test
    public void testToString() {
        assertEquals("2023 Ford F150 $57999.99", car.toString());
    }

    @Test
    public void testContainMake(){
        assertTrue(car.contains("For"));
    }

    @Test
    public void testContainMakeAllLowerCase(){
        assertTrue(car.contains("for"));
    }

    @Test
    public void testContainsModel(){
        assertTrue(car.contains("150"));
    }
    @Test
    public void testContainsModelAllLowerCase(){
        assertTrue(car.contains("f15"));
    }

    @Test
    public void testContains(){
        assertFalse(car.contains("Jaret"));
    }

    @Test
    public void testToString2() {
        car = new Car("BMW", "X5", 87232.2234,2021);
        assertEquals("2021 BMW X5 $87232.22", car.toString());
    }

    @Test
    public void testToString3() {
        car = new Car("BMW", "X5", 87232.225,2021);
        assertEquals("2021 BMW X5 $87232.23", car.toString());
    }

    @Test
    public void testToString4() {
        car = new Car("BMW", "X5", 87232,2021);
        assertEquals("2021 BMW X5 $87232.00", car.toString());
    }
}