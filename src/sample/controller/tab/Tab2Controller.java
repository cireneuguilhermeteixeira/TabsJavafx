package sample.controller.tab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Tab2Controller {
    @FXML private Label lb2;
    @FXML private TextField txt2;
    @FXML private Button btn2save;
    @FXML private Button btn2load;

    public void btn2SaveClicked(ActionEvent event){
        System.out.println("btn 2 salvar");

    }

    public void btn2LoadClicked(ActionEvent event){
        System.out.println("btn 2 load");

    }
}
