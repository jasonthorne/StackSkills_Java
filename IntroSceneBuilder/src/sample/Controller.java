package sample;

//+++++++++++++++++++++++++++++++++++++++
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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


    //+++++++++++IMPORTANT: IDs in SceneBuilder MUST be applied in CODE tab!! ++++++++++++++++++++=
    //This links our view (the SceneBuilder GUI) to this controller!

    @FXML
    private Button clickMeBtn; //an ID added in SceneBuilder (under 'code' tab, NOT any other!)

    @FXML
    private Label myLabel;

    @FXML
    private JFXButton materialBtn;

    @FXML
    private JFXTextField textField;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //add an event handler to button's setOnAction:
        materialBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String txtStr = textField.getText().trim(); //+++++trim is important here!!!!

                ///System.out.println("Yo dawg!");
                myLabel.setText(txtStr);
            }
        });
    }



}
