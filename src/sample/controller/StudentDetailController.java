package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class StudentDetailController {
    @FXML private AnchorPane studentDetailFrameLayout;
    @FXML
    private TextField studentName;
    public void sayHello(){
        System.out.println("HELLO");
    }
}
