package com.example.w23comp1008lhtest3student;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DealershipController {
    public void displayLabels(){
        InventoryValue.setText(String.valueOf(Dealership.getInventoryValue()));
        CarsInventory.setText(String.valueOf(Dealership.getNumCarsInInventory()));
    }
    public void displayCars(ArrayList<Car> inventory) {
        ObservableList<String> carStrings = FXCollections.observableArrayList();
        for (Car car : inventory) {
            carStrings.add(Car.toString(car));
        }
        InventoryList.setItems(carStrings);

    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label CarsInventory;

    @FXML
    private Label CarsShowing;

    @FXML
    private Button Electric;

    @FXML
    private ListView<String> InventoryList;

    @FXML
    private Label InventoryValue;

    @FXML
    private Button LeastExpensive;

    @FXML
    private Button MostExpensive;

    @FXML
    private Button ShowAll;

    @FXML
    private Label dealerName;

    @FXML
    private TextField searchFeild;

    @FXML
    void initialize() {
        displayCars(CarCreator.getCars());
        displayLabels();

        Electric.setOnAction(event -> {
            InventoryList.getItems().clear();

        }



    }

}
}