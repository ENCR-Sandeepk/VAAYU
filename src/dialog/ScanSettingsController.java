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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import tool.Call_Dialog;
import tool.File_Operation;
import tool.Tool;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class ScanSettingsController implements Initializable {
    
    Call_Dialog objCall_Dialog = new Call_Dialog();
    
    @FXML
    private Label lbl_ok;
    @FXML
    private Label lbl_cancel;
    @FXML
    private ComboBox cbb_scan_interval;
    @FXML
    private CheckBox cb_scan_for_specific_time;
    @FXML
    private TextField tf_from;
    @FXML
    private Button btn_from;
    @FXML
    private TextField tf_to;
    @FXML
    private Button btn_to;
    @FXML
    private TextField tf_start_Time;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Variable.is_dialog_confirmed = false;
        try {
            cbb_scan_interval.getItems().add("1 second");
            cbb_scan_interval.getItems().add("2 second");
            cbb_scan_interval.getItems().add("5 second");
            cbb_scan_interval.getItems().add("10 second");
            cbb_scan_interval.getItems().add("15 second");
            cbb_scan_interval.getItems().add("30 second");
            
            cbb_scan_interval.getItems().add("1 minute");
            cbb_scan_interval.getItems().add("2 minute");
            cbb_scan_interval.getItems().add("5 minute");
            cbb_scan_interval.getItems().add("10 minute");
            cbb_scan_interval.getItems().add("15 minute");
            cbb_scan_interval.getItems().add("20 minute");
            cbb_scan_interval.getItems().add("30 minute");
            
            cbb_scan_interval.getItems().add("1 hour");
            cbb_scan_interval.getItems().add("2 hour");
            cbb_scan_interval.getItems().add("3 hour");
            cbb_scan_interval.getItems().add("4 hour");
            cbb_scan_interval.getItems().add("6 hour");
            cbb_scan_interval.getItems().add("8 hour");
            cbb_scan_interval.getItems().add("12 hour");
            cbb_scan_interval.getItems().add("24 hour");
            
            cbb_scan_interval.setValue(Variable.log_interval.trim());
        } catch (Exception e) {
        }
        
        try {
            tf_start_Time.setText(Variable.scan_start_time.substring(8));
        } catch (Exception e) {
        }
        try {
            cb_scan_for_specific_time.setSelected(Variable.is_time_between_enable);
            tf_from.setText(Variable.scan_from);
            tf_to.setText(Variable.scan_to);
        } catch (Exception e) {
        }
    }
    
    @FXML
    private void ok(MouseEvent event) {
        Variable.is_dialog_confirmed = true;
        
        Variable.log_interval = cbb_scan_interval.getValue().toString();
        
        Variable.scan_start_time = Tool.get_date_time_stamp("yyyyMMdd") + tf_start_Time.getText().trim();
        
        Variable.scan_from = tf_from.getText().trim();
        Variable.scan_to = tf_to.getText().trim();
        Variable.is_time_between_enable = cb_scan_for_specific_time.isSelected();
        
        File_Operation.create_modify_system_setup();
        File_Operation.read_system_setup();
        
        Label btn = (Label) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void cancel(MouseEvent event) {
        Variable.is_dialog_confirmed = false;
        Label btn = (Label) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void action_cb_scan_for_specific_time(ActionEvent event) {
    }
    
    @FXML
    private void action_btn_from(ActionEvent event) {
        try {
            if (cb_scan_for_specific_time.isSelected()) {
                objCall_Dialog.show_Time_Picker_HH_MM("From", tf_from);
            }
            
        } catch (Exception e) {
        }
    }
    
    @FXML
    private void action_btn_to(ActionEvent event) {
        try {
            if (cb_scan_for_specific_time.isSelected()) {
                objCall_Dialog.show_Time_Picker_HH_MM("To", tf_to);
            }
            
        } catch (Exception e) {
        }
    }
    
    @FXML
    private void btn_start_time(ActionEvent event) {
        try {
            objCall_Dialog.show_Time_Picker_HH_MM("Start Time", tf_start_Time);
        } catch (Exception e) {
        }
    }
}
