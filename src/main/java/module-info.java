module com.example.w23comp1008lhtest3student {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23comp1008lhtest3student to javafx.fxml;
    exports com.example.w23comp1008lhtest3student;
}