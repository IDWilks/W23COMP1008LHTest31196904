package com.example.w23comp1008lhtest3student;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DealershipVeiw {

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
    private ListView<?> InventoryList;

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
    void initialize() {}