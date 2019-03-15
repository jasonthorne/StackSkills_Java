package sample;

//+++++++++++++++++++++++++++++++++++++++
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
//+++++++++++++++++++++++++++++++++++++

public class Controller implements Initializable {

    //Model - What were modeling our data to be (eg a person class)
    // View - what users can 'see'
    // Controller - connects the view and the model

    @FXML
    private Button clickMeBtn;

    @FXML
    private Label myLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //add an event handler to button's setOnAction:
        clickMeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Yo dawg!");
            }
        });
    }
}
