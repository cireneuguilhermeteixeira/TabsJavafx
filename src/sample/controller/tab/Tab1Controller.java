package sample.controller.tab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Tab1Controller {

    @FXML private Label lb1;
    @FXML private TextField txt1;
    @FXML private Button btn1save;
    @FXML private Button btn1send;

    @FXML private void btn1SaveClicked(ActionEvent event){
        System.out.println("btn 1 salvar");

    }

    @FXML private void btn1SendClicked(ActionEvent event){
        System.out.println("btn 1 semd");

    }
}
