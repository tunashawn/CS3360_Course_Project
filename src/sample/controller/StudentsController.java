package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.model.Students;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentsController implements Initializable {
    @FXML private TableView<Students> tableView;
    @FXML private AnchorPane studentFrameLayout;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    public void onCreateNewStudentClicked(ActionEvent event) throws IOException {
        loadCreateUpdateStudentUI();
    }
    @FXML
    public void onDeleteSelectedStudentClicked(ActionEvent event){

    }


    private void loadCreateUpdateStudentUI() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/views/StudentDetail.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
