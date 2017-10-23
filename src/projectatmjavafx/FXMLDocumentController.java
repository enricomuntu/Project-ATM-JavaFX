/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import java.awt.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author Enrico Ursidae
 */
public abstract class FXMLDocumentController implements Initializable {
    
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXPasswordField editPin;
    
    @FXML
    private JFXButton button1;
    
    @FXML
    private JFXButton button2;
    
    @FXML
    private JFXButton button3;

    @FXML
    private JFXButton button4;

    @FXML
    private JFXButton button5;

    @FXML
    private JFXButton button6;

    @FXML
    private JFXButton button7;

    @FXML
    private JFXButton button8;

    @FXML
    private JFXButton button9;

    @FXML
    private JFXButton buttonC;

    @FXML
    private JFXButton button0;

    @FXML
    private JFXButton buttonOk;

    @FXML
    void tekan0(ActionEvent event) {
        pin += "0";
        editPin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
        pin += "1";
        editPin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
        pin += "2";
        editPin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
        pin += "3";
        editPin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
        pin += "4";
        editPin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
        pin += "5";
        editPin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
        pin += "6";
        editPin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
        pin += "7";
        editPin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
        pin += "8";
        editPin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
        pin += "9";
        editPin.setText(pin);
    }

    @FXML
    void tekanC(ActionEvent event) {
        pin += "";
        editPin.setText(pin);
    }

    @FXML
    void tekanOk(ActionEvent event){
        if (pin.equals(PIN)){
            try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } 
            catch (IOException e) 
            {
                System.out.println("Failed to create new Window." + e);    
            }
        } else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa " + kesempatan + " kesempatan lagi!");
            editPin.setText("");
            pin = "";
            if (kesempatan == 0){
                System.exit(0);
        }    
    }
}

    /**
     * Initializes the controller class.
     */
   //@Override
   // public void initialize(URL url, ResourceBundle rb) {
       // TODO
    }    
    
//}
