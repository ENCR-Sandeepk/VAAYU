/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tool.Tool;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class Time_Picker_HH_MM_Controller implements Initializable {

    @FXML
    private AnchorPane achor_pane;
    @FXML
    private Button btn_close;
    @FXML
    private Tooltip tt_close;
    @FXML
    private ComboBox cbb_hh;
    @FXML
    private ComboBox cbb_mm;
    @FXML
    private Button btn_ok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {

            for (int i = 0; i <= 24; i++) {
                cbb_hh.getItems().add(Tool.pad("" + i, 2));
            }

            for (int i = 0; i <= 59; i++) {
                cbb_mm.getItems().add(Tool.pad("" + i, 2));
            }

            try {
                String current_time = Variable.tf.getText().trim();
                cbb_hh.setValue("" + current_time.substring(0, 2));
                cbb_mm.setValue("" + current_time.substring(3));
            } catch (Exception e) {
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void close(ActionEvent event) {

        Variable.is_dialog_confirmed = false;
        Stage stage = (Stage) btn_close.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void action_ok(ActionEvent event) {
        Variable.tf.setText(cbb_hh.getValue().toString() + ":" + cbb_mm.getValue().toString());
        Variable.is_dialog_confirmed = true;
        Stage stage = (Stage) btn_ok.getScene().getWindow();
        stage.close();
    }
}
