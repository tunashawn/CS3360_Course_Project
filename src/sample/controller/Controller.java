package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import com.sun.prism.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private BorderPane mainFrameBorderPane;
    @FXML private AnchorPane mainFrameLayout;
    @FXML private JFXButton classesButton;
    @FXML private JFXButton studentsButton;
    @FXML private JFXButton parentsButton;
    @FXML private JFXButton teachersButton;
    @FXML public Button closeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void onClassesButtonClicked(ActionEvent event) throws IOException {
        loadUI("/sample/views/ClassesTab");
    }

    @FXML
    void onStudentsButtonClicked(ActionEvent event) throws IOException {
        loadUI("/sample/views/StudentsTab");
    }


    @FXML
    void onParentsButtonClicked(ActionEvent event) throws IOException {
        loadUI("/sample/views/ParentsTab");
    }

    @FXML
    void onTeachersButtonClicked(ActionEvent event) throws IOException {
        loadUI("/sample/views/TeachersTab");
    }


    private void loadUI(String layout) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(layout + ".fxml"));
       mainFrameBorderPane.setCenter(root);
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

}
