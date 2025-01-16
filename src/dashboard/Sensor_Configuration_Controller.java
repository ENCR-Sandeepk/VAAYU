/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import tool.Call_Dialog;
import tool.Constant;
import tool.File_Operation;
import tool.Validate_IP_Address;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class Sensor_Configuration_Controller implements Initializable {

    private static Sensor_Configuration_Controller instance;
    Call_Dialog objCall_Dialog = new Call_Dialog();

    @FXML
    private CheckBox cb_sns_1;
    @FXML
    private RadioButton rb_2d_sns_1;
    @FXML
    private ToggleGroup g1;
    @FXML
    private RadioButton rb_3d_sns_1;
    @FXML
    private ComboBox cbb_addr_v_sns_1;
    @FXML
    private ComboBox cbb_addr_h_sns_1;
    @FXML
    private ComboBox cbb_manufacturer_sns_1;
    @FXML
    private TextField tf_ip_addr_sns_1;
    @FXML
    private TextField tf_port_no_sns_1;
    @FXML
    private TextField tf_sns_tag_1;
    @FXML
    private TextField tf_sns_alarm_cutoff_1;
    @FXML
    private CheckBox cb_sns_2;
    @FXML
    private RadioButton rb_2d_sns_2;
    @FXML
    private ToggleGroup g2;
    @FXML
    private RadioButton rb_3d_sns_2;
    @FXML
    private ComboBox cbb_addr_v_sns_2;
    @FXML
    private ComboBox cbb_addr_h_sns_2;
    @FXML
    private ComboBox cbb_manufacturer_sns_2;
    @FXML
    private TextField tf_ip_addr_sns_2;
    @FXML
    private TextField tf_port_no_sns_2;
    @FXML
    private TextField tf_sns_tag_2;
    @FXML
    private TextField tf_sns_alarm_cutoff_2;
    @FXML
    private CheckBox cb_sns_3;
    @FXML
    private RadioButton rb_2d_sns_3;
    @FXML
    private ToggleGroup g3;
    @FXML
    private RadioButton rb_3d_sns_3;
    @FXML
    private ComboBox cbb_addr_v_sns_3;
    @FXML
    private ComboBox cbb_addr_h_sns_3;
    @FXML
    private ComboBox cbb_manufacturer_sns_3;
    @FXML
    private TextField tf_ip_addr_sns_3;
    @FXML
    private TextField tf_port_no_sns_3;
    @FXML
    private TextField tf_sns_tag_3;
    @FXML
    private TextField tf_sns_alarm_cutoff_3;
    @FXML
    private CheckBox cb_sns_4;
    @FXML
    private RadioButton rb_2d_sns_4;
    @FXML
    private ToggleGroup g4;
    @FXML
    private RadioButton rb_3d_sns_4;
    @FXML
    private ComboBox cbb_addr_v_sns_4;
    @FXML
    private ComboBox cbb_addr_h_sns_4;
    @FXML
    private ComboBox cbb_manufacturer_sns_4;
    @FXML
    private TextField tf_ip_addr_sns_4;
    @FXML
    private TextField tf_port_no_sns_4;
    @FXML
    private TextField tf_sns_tag_4;
    @FXML
    private TextField tf_sns_alarm_cutoff_4;
    @FXML
    private CheckBox cb_sns_5;
    @FXML
    private RadioButton rb_2d_sns_5;
    @FXML
    private ToggleGroup g5;
    @FXML
    private RadioButton rb_3d_sns_5;
    @FXML
    private ComboBox cbb_addr_v_sns_5;
    @FXML
    private ComboBox cbb_addr_h_sns_5;
    @FXML
    private ComboBox cbb_manufacturer_sns_5;
    @FXML
    private TextField tf_ip_addr_sns_5;
    @FXML
    private TextField tf_port_no_sns_5;
    @FXML
    private TextField tf_sns_tag_5;
    @FXML
    private TextField tf_sns_alarm_cutoff_5;
    @FXML
    private CheckBox cb_sns_6;
    @FXML
    private RadioButton rb_2d_sns_6;
    @FXML
    private ToggleGroup g6;
    @FXML
    private RadioButton rb_3d_sns_6;
    @FXML
    private ComboBox cbb_addr_v_sns_6;
    @FXML
    private ComboBox cbb_addr_h_sns_6;
    @FXML
    private ComboBox cbb_manufacturer_sns_6;
    @FXML
    private TextField tf_ip_addr_sns_6;
    @FXML
    private TextField tf_port_no_sns_6;
    @FXML
    private TextField tf_sns_tag_6;
    @FXML
    private TextField tf_sns_alarm_cutoff_6;
    @FXML
    private CheckBox cb_sns_7;
    @FXML
    private RadioButton rb_2d_sns_7;
    @FXML
    private ToggleGroup g7;
    @FXML
    private RadioButton rb_3d_sns_7;
    @FXML
    private ComboBox cbb_addr_v_sns_7;
    @FXML
    private ComboBox cbb_addr_h_sns_7;
    @FXML
    private ComboBox cbb_manufacturer_sns_7;
    @FXML
    private TextField tf_ip_addr_sns_7;
    @FXML
    private TextField tf_port_no_sns_7;
    @FXML
    private TextField tf_sns_tag_7;
    @FXML
    private TextField tf_sns_alarm_cutoff_7;
    @FXML
    private CheckBox cb_sns_8;
    @FXML
    private RadioButton rb_2d_sns_8;
    @FXML
    private ToggleGroup g8;
    @FXML
    private RadioButton rb_3d_sns_8;
    @FXML
    private ComboBox cbb_addr_v_sns_8;
    @FXML
    private ComboBox cbb_addr_h_sns_8;
    @FXML
    private ComboBox cbb_manufacturer_sns_8;
    @FXML
    private TextField tf_ip_addr_sns_8;
    @FXML
    private TextField tf_port_no_sns_8;
    @FXML
    private TextField tf_sns_tag_8;
    @FXML
    private TextField tf_sns_alarm_cutoff_8;
    @FXML
    private CheckBox cb_sns_9;
    @FXML
    private RadioButton rb_2d_sns_9;
    @FXML
    private ToggleGroup g9;
    @FXML
    private RadioButton rb_3d_sns_9;
    @FXML
    private ComboBox cbb_addr_v_sns_9;
    @FXML
    private ComboBox cbb_addr_h_sns_9;
    @FXML
    private ComboBox cbb_manufacturer_sns_9;
    @FXML
    private TextField tf_ip_addr_sns_9;
    @FXML
    private TextField tf_port_no_sns_9;
    @FXML
    private TextField tf_sns_tag_9;
    @FXML
    private TextField tf_sns_alarm_cutoff_9;
    @FXML
    private CheckBox cb_sns_10;
    @FXML
    private RadioButton rb_2d_sns_10;
    @FXML
    private ToggleGroup g10;
    @FXML
    private RadioButton rb_3d_sns_10;
    @FXML
    private ComboBox cbb_addr_v_sns_10;
    @FXML
    private ComboBox cbb_addr_h_sns_10;
    @FXML
    private ComboBox cbb_manufacturer_sns_10;
    @FXML
    private TextField tf_ip_addr_sns_10;
    @FXML
    private TextField tf_port_no_sns_10;
    @FXML
    private TextField tf_sns_tag_10;
    @FXML
    private TextField tf_sns_alarm_cutoff_10;
    @FXML
    private CheckBox cb_sns_11;
    @FXML
    private RadioButton rb_2d_sns_11;
    @FXML
    private ToggleGroup g11;
    @FXML
    private RadioButton rb_3d_sns_11;
    @FXML
    private ComboBox cbb_addr_v_sns_11;
    @FXML
    private ComboBox cbb_addr_h_sns_11;
    @FXML
    private ComboBox cbb_manufacturer_sns_11;
    @FXML
    private TextField tf_ip_addr_sns_11;
    @FXML
    private TextField tf_port_no_sns_11;
    @FXML
    private TextField tf_sns_tag_11;
    @FXML
    private TextField tf_sns_alarm_cutoff_11;
    @FXML
    private CheckBox cb_sns_12;
    @FXML
    private RadioButton rb_2d_sns_12;
    @FXML
    private ToggleGroup g12;
    @FXML
    private RadioButton rb_3d_sns_12;
    @FXML
    private ComboBox cbb_addr_v_sns_12;
    @FXML
    private ComboBox cbb_addr_h_sns_12;
    @FXML
    private ComboBox cbb_manufacturer_sns_12;
    @FXML
    private TextField tf_ip_addr_sns_12;
    @FXML
    private TextField tf_port_no_sns_12;
    @FXML
    private TextField tf_sns_tag_12;
    @FXML
    private TextField tf_sns_alarm_cutoff_12;
    @FXML
    private CheckBox cb_sns_13;
    @FXML
    private RadioButton rb_2d_sns_13;
    @FXML
    private ToggleGroup g13;
    @FXML
    private RadioButton rb_3d_sns_13;
    @FXML
    private ComboBox cbb_addr_v_sns_13;
    @FXML
    private ComboBox cbb_addr_h_sns_13;
    @FXML
    private ComboBox cbb_manufacturer_sns_13;
    @FXML
    private TextField tf_ip_addr_sns_13;
    @FXML
    private TextField tf_port_no_sns_13;
    @FXML
    private TextField tf_sns_tag_13;
    @FXML
    private TextField tf_sns_alarm_cutoff_13;
    @FXML
    private CheckBox cb_sns_14;
    @FXML
    private RadioButton rb_2d_sns_14;
    @FXML
    private ToggleGroup g14;
    @FXML
    private RadioButton rb_3d_sns_14;
    @FXML
    private ComboBox cbb_addr_v_sns_14;
    @FXML
    private ComboBox cbb_addr_h_sns_14;
    @FXML
    private ComboBox cbb_manufacturer_sns_14;
    @FXML
    private TextField tf_ip_addr_sns_14;
    @FXML
    private TextField tf_port_no_sns_14;
    @FXML
    private TextField tf_sns_tag_14;
    @FXML
    private TextField tf_sns_alarm_cutoff_14;
    @FXML
    private CheckBox cb_sns_15;
    @FXML
    private RadioButton rb_2d_sns_15;
    @FXML
    private ToggleGroup g15;
    @FXML
    private RadioButton rb_3d_sns_15;
    @FXML
    private ComboBox cbb_addr_v_sns_15;
    @FXML
    private ComboBox cbb_addr_h_sns_15;
    @FXML
    private ComboBox cbb_manufacturer_sns_15;
    @FXML
    private TextField tf_ip_addr_sns_15;
    @FXML
    private TextField tf_port_no_sns_15;
    @FXML
    private TextField tf_sns_tag_15;
    @FXML
    private TextField tf_sns_alarm_cutoff_15;
    @FXML
    private CheckBox cb_sns_16;
    @FXML
    private RadioButton rb_2d_sns_16;
    @FXML
    private ToggleGroup g16;
    @FXML
    private RadioButton rb_3d_sns_16;
    @FXML
    private ComboBox cbb_addr_v_sns_16;
    @FXML
    private ComboBox cbb_addr_h_sns_16;
    @FXML
    private ComboBox cbb_manufacturer_sns_16;
    @FXML
    private TextField tf_ip_addr_sns_16;
    @FXML
    private TextField tf_port_no_sns_16;
    @FXML
    private TextField tf_sns_tag_16;
    @FXML
    private TextField tf_sns_alarm_cutoff_16;
    @FXML
    private CheckBox cb_sns_17;
    @FXML
    private RadioButton rb_2d_sns_17;
    @FXML
    private ToggleGroup g17;
    @FXML
    private RadioButton rb_3d_sns_17;
    @FXML
    private ComboBox cbb_addr_v_sns_17;
    @FXML
    private ComboBox cbb_addr_h_sns_17;
    @FXML
    private ComboBox cbb_manufacturer_sns_17;
    @FXML
    private TextField tf_ip_addr_sns_17;
    @FXML
    private TextField tf_port_no_sns_17;
    @FXML
    private TextField tf_sns_tag_17;
    @FXML
    private TextField tf_sns_alarm_cutoff_17;
    @FXML
    private CheckBox cb_sns_18;
    @FXML
    private RadioButton rb_2d_sns_18;
    @FXML
    private ToggleGroup g18;
    @FXML
    private RadioButton rb_3d_sns_18;
    @FXML
    private ComboBox cbb_addr_v_sns_18;
    @FXML
    private ComboBox cbb_addr_h_sns_18;
    @FXML
    private ComboBox cbb_manufacturer_sns_18;
    @FXML
    private TextField tf_ip_addr_sns_18;
    @FXML
    private TextField tf_port_no_sns_18;
    @FXML
    private TextField tf_sns_tag_18;
    @FXML
    private TextField tf_sns_alarm_cutoff_18;
    @FXML
    private CheckBox cb_sns_19;
    @FXML
    private RadioButton rb_2d_sns_19;
    @FXML
    private ToggleGroup g19;
    @FXML
    private RadioButton rb_3d_sns_19;
    @FXML
    private ComboBox cbb_addr_v_sns_19;
    @FXML
    private ComboBox cbb_addr_h_sns_19;
    @FXML
    private ComboBox cbb_manufacturer_sns_19;
    @FXML
    private TextField tf_ip_addr_sns_19;
    @FXML
    private TextField tf_port_no_sns_19;
    @FXML
    private TextField tf_sns_tag_19;
    @FXML
    private TextField tf_sns_alarm_cutoff_19;
    @FXML
    private CheckBox cb_sns_20;
    @FXML
    private RadioButton rb_2d_sns_20;
    @FXML
    private ToggleGroup g20;
    @FXML
    private RadioButton rb_3d_sns_20;
    @FXML
    private ComboBox cbb_addr_v_sns_20;
    @FXML
    private ComboBox cbb_addr_h_sns_20;
    @FXML
    private ComboBox cbb_manufacturer_sns_20;
    @FXML
    private TextField tf_ip_addr_sns_20;
    @FXML
    private TextField tf_port_no_sns_20;
    @FXML
    private TextField tf_sns_tag_20;
    @FXML
    private TextField tf_sns_alarm_cutoff_20;
    @FXML
    private JFXButton btn_edit_sensor_setup;
    @FXML
    private JFXButton btn_save_setup;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btn_save_setup.setVisible(false);
        clear_all_field();
        setValueInCombobox();
        set_data();
        disableAll(true);

    }

    private void disableAll(boolean value) {
        cb_sns_1.setDisable(value);
        rb_2d_sns_1.setDisable(value);
        rb_3d_sns_1.setDisable(value);
        cbb_addr_v_sns_1.setDisable(value);
        cbb_addr_h_sns_1.setDisable(value);
        cbb_manufacturer_sns_1.setDisable(value);
        tf_sns_alarm_cutoff_1.setDisable(value);
        tf_ip_addr_sns_1.setDisable(value);
        tf_port_no_sns_1.setDisable(value);
        tf_sns_tag_1.setDisable(value);

        cb_sns_2.setDisable(value);
        rb_2d_sns_2.setDisable(value);
        rb_3d_sns_2.setDisable(value);
        cbb_addr_v_sns_2.setDisable(value);
        cbb_addr_h_sns_2.setDisable(value);
        cbb_manufacturer_sns_2.setDisable(value);
        tf_sns_alarm_cutoff_2.setDisable(value);
        tf_ip_addr_sns_2.setDisable(value);
        tf_port_no_sns_2.setDisable(value);
        tf_sns_tag_2.setDisable(value);

        cb_sns_3.setDisable(value);
        rb_2d_sns_3.setDisable(value);
        rb_3d_sns_3.setDisable(value);
        cbb_addr_v_sns_3.setDisable(value);
        cbb_addr_h_sns_3.setDisable(value);
        cbb_manufacturer_sns_3.setDisable(value);
        tf_sns_alarm_cutoff_3.setDisable(value);
        tf_ip_addr_sns_3.setDisable(value);
        tf_port_no_sns_3.setDisable(value);
        tf_sns_tag_3.setDisable(value);

        cb_sns_4.setDisable(value);
        rb_2d_sns_4.setDisable(value);
        rb_3d_sns_4.setDisable(value);
        cbb_addr_v_sns_4.setDisable(value);
        cbb_addr_h_sns_4.setDisable(value);
        cbb_manufacturer_sns_4.setDisable(value);
        tf_sns_alarm_cutoff_4.setDisable(value);
        tf_ip_addr_sns_4.setDisable(value);
        tf_port_no_sns_4.setDisable(value);
        tf_sns_tag_4.setDisable(value);

        cb_sns_5.setDisable(value);
        rb_2d_sns_5.setDisable(value);
        rb_3d_sns_5.setDisable(value);
        cbb_addr_v_sns_5.setDisable(value);
        cbb_addr_h_sns_5.setDisable(value);
        cbb_manufacturer_sns_5.setDisable(value);
        tf_sns_alarm_cutoff_5.setDisable(value);
        tf_ip_addr_sns_5.setDisable(value);
        tf_port_no_sns_5.setDisable(value);
        tf_sns_tag_5.setDisable(value);

        cb_sns_6.setDisable(value);
        rb_2d_sns_6.setDisable(value);
        rb_3d_sns_6.setDisable(value);
        cbb_addr_v_sns_6.setDisable(value);
        cbb_addr_h_sns_6.setDisable(value);
        cbb_manufacturer_sns_6.setDisable(value);
        tf_sns_alarm_cutoff_6.setDisable(value);
        tf_ip_addr_sns_6.setDisable(value);
        tf_port_no_sns_6.setDisable(value);
        tf_sns_tag_6.setDisable(value);

        cb_sns_7.setDisable(value);
        rb_2d_sns_7.setDisable(value);
        rb_3d_sns_7.setDisable(value);
        cbb_addr_v_sns_7.setDisable(value);
        cbb_addr_h_sns_7.setDisable(value);
        cbb_manufacturer_sns_7.setDisable(value);
        tf_sns_alarm_cutoff_7.setDisable(value);
        tf_ip_addr_sns_7.setDisable(value);
        tf_port_no_sns_7.setDisable(value);
        tf_sns_tag_7.setDisable(value);

        cb_sns_8.setDisable(value);
        rb_2d_sns_8.setDisable(value);
        rb_3d_sns_8.setDisable(value);
        cbb_addr_v_sns_8.setDisable(value);
        cbb_addr_h_sns_8.setDisable(value);
        cbb_manufacturer_sns_8.setDisable(value);
        tf_sns_alarm_cutoff_8.setDisable(value);
        tf_ip_addr_sns_8.setDisable(value);
        tf_port_no_sns_8.setDisable(value);
        tf_sns_tag_8.setDisable(value);

        cb_sns_9.setDisable(value);
        rb_2d_sns_9.setDisable(value);
        rb_3d_sns_9.setDisable(value);
        cbb_addr_v_sns_9.setDisable(value);
        cbb_addr_h_sns_9.setDisable(value);
        cbb_manufacturer_sns_9.setDisable(value);
        tf_sns_alarm_cutoff_9.setDisable(value);
        tf_ip_addr_sns_9.setDisable(value);
        tf_port_no_sns_9.setDisable(value);
        tf_sns_tag_9.setDisable(value);

        cb_sns_10.setDisable(value);
        rb_2d_sns_10.setDisable(value);
        rb_3d_sns_10.setDisable(value);
        cbb_addr_v_sns_10.setDisable(value);
        cbb_addr_h_sns_10.setDisable(value);
        cbb_manufacturer_sns_10.setDisable(value);
        tf_sns_alarm_cutoff_10.setDisable(value);
        tf_ip_addr_sns_10.setDisable(value);
        tf_port_no_sns_10.setDisable(value);
        tf_sns_tag_10.setDisable(value);

        cb_sns_11.setDisable(value);
        rb_2d_sns_11.setDisable(value);
        rb_3d_sns_11.setDisable(value);
        cbb_addr_v_sns_11.setDisable(value);
        cbb_addr_h_sns_11.setDisable(value);
        cbb_manufacturer_sns_11.setDisable(value);
        tf_sns_alarm_cutoff_11.setDisable(value);
        tf_ip_addr_sns_11.setDisable(value);
        tf_port_no_sns_11.setDisable(value);
        tf_sns_tag_11.setDisable(value);

        cb_sns_12.setDisable(value);
        rb_2d_sns_12.setDisable(value);
        rb_3d_sns_12.setDisable(value);
        cbb_addr_v_sns_12.setDisable(value);
        cbb_addr_h_sns_12.setDisable(value);
        cbb_manufacturer_sns_12.setDisable(value);
        tf_sns_alarm_cutoff_12.setDisable(value);
        tf_ip_addr_sns_12.setDisable(value);
        tf_port_no_sns_12.setDisable(value);
        tf_sns_tag_12.setDisable(value);

        cb_sns_13.setDisable(value);
        rb_2d_sns_13.setDisable(value);
        rb_3d_sns_13.setDisable(value);
        cbb_addr_v_sns_13.setDisable(value);
        cbb_addr_h_sns_13.setDisable(value);
        cbb_manufacturer_sns_13.setDisable(value);
        tf_sns_alarm_cutoff_13.setDisable(value);
        tf_ip_addr_sns_13.setDisable(value);
        tf_port_no_sns_13.setDisable(value);
        tf_sns_tag_13.setDisable(value);

        cb_sns_14.setDisable(value);
        rb_2d_sns_14.setDisable(value);
        rb_3d_sns_14.setDisable(value);
        cbb_addr_v_sns_14.setDisable(value);
        cbb_addr_h_sns_14.setDisable(value);
        cbb_manufacturer_sns_14.setDisable(value);
        tf_sns_alarm_cutoff_14.setDisable(value);
        tf_ip_addr_sns_14.setDisable(value);
        tf_port_no_sns_14.setDisable(value);
        tf_sns_tag_14.setDisable(value);

        cb_sns_15.setDisable(value);
        rb_2d_sns_15.setDisable(value);
        rb_3d_sns_15.setDisable(value);
        cbb_addr_v_sns_15.setDisable(value);
        cbb_addr_h_sns_15.setDisable(value);
        cbb_manufacturer_sns_15.setDisable(value);
        tf_sns_alarm_cutoff_15.setDisable(value);
        tf_ip_addr_sns_15.setDisable(value);
        tf_port_no_sns_15.setDisable(value);
        tf_sns_tag_15.setDisable(value);

        cb_sns_16.setDisable(value);
        rb_2d_sns_16.setDisable(value);
        rb_3d_sns_16.setDisable(value);
        cbb_addr_v_sns_16.setDisable(value);
        cbb_addr_h_sns_16.setDisable(value);
        cbb_manufacturer_sns_16.setDisable(value);
        tf_sns_alarm_cutoff_16.setDisable(value);
        tf_ip_addr_sns_16.setDisable(value);
        tf_port_no_sns_16.setDisable(value);
        tf_sns_tag_16.setDisable(value);

        cb_sns_17.setDisable(value);
        rb_2d_sns_17.setDisable(value);
        rb_3d_sns_17.setDisable(value);
        cbb_addr_v_sns_17.setDisable(value);
        cbb_addr_h_sns_17.setDisable(value);
        cbb_manufacturer_sns_17.setDisable(value);
        tf_sns_alarm_cutoff_17.setDisable(value);
        tf_ip_addr_sns_17.setDisable(value);
        tf_port_no_sns_17.setDisable(value);
        tf_sns_tag_17.setDisable(value);

        cb_sns_18.setDisable(value);
        rb_2d_sns_18.setDisable(value);
        rb_3d_sns_18.setDisable(value);
        cbb_addr_v_sns_18.setDisable(value);
        cbb_addr_h_sns_18.setDisable(value);
        cbb_manufacturer_sns_18.setDisable(value);
        tf_sns_alarm_cutoff_18.setDisable(value);
        tf_ip_addr_sns_18.setDisable(value);
        tf_port_no_sns_18.setDisable(value);
        tf_sns_tag_18.setDisable(value);

        cb_sns_19.setDisable(value);
        rb_2d_sns_19.setDisable(value);
        rb_3d_sns_19.setDisable(value);
        cbb_addr_v_sns_19.setDisable(value);
        cbb_addr_h_sns_19.setDisable(value);
        cbb_manufacturer_sns_19.setDisable(value);
        tf_sns_alarm_cutoff_19.setDisable(value);
        tf_ip_addr_sns_19.setDisable(value);
        tf_port_no_sns_19.setDisable(value);
        tf_sns_tag_19.setDisable(value);

        cb_sns_20.setDisable(value);
        rb_2d_sns_20.setDisable(value);
        rb_3d_sns_20.setDisable(value);
        cbb_addr_v_sns_20.setDisable(value);
        cbb_addr_h_sns_20.setDisable(value);
        cbb_manufacturer_sns_20.setDisable(value);
        tf_sns_alarm_cutoff_20.setDisable(value);
        tf_ip_addr_sns_20.setDisable(value);
        tf_port_no_sns_20.setDisable(value);
        tf_sns_tag_20.setDisable(value);
    }

    public Sensor_Configuration_Controller() {
        instance = this;
    }

    public static Sensor_Configuration_Controller get_Controller() {
        return instance;
    }

    @FXML
    private void action_btn_edit_sensor_setup(ActionEvent event) {
        btn_edit_sensor_setup.setVisible(false);
        btn_save_setup.setVisible(true);
        disableAll(false);
        clear_all_field();
        set_data();
    }

    @FXML
    private void action_btn_save_setup(ActionEvent event) {

        if (validate_sensor_data()) {
            if (Variable.total_sensor == 0) {
                objCall_Dialog.showDialogWithoutThread("Please select sensor first !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else {
                save_sensor_data();
                File_Operation.create_sensor_setup_file();
                File_Operation.read_sensor_setup_file();

                clear_all_field();

                set_data();
                disableAll(true);

                btn_edit_sensor_setup.setVisible(true);
                btn_save_setup.setVisible(false);

                objCall_Dialog.showDialogWithoutThread("Sensor Setup saved !!", "", "OK", "", Constant.DIALOG_BLUE);
            }
        }
    }

    @FXML
    private void action_cb_sns_1(ActionEvent event) {
        try {
            if (cb_sns_1.isSelected()) {
                rb_2d_sns_1.setDisable(false);
                rb_3d_sns_1.setDisable(false);
                cbb_manufacturer_sns_1.setDisable(false);
                tf_sns_alarm_cutoff_1.setDisable(false);
                tf_sns_alarm_cutoff_1.setText("");
                tf_ip_addr_sns_1.setDisable(false);
                tf_ip_addr_sns_1.setText("");
                tf_port_no_sns_1.setDisable(false);
                tf_port_no_sns_1.setText("");
                tf_sns_tag_1.setDisable(false);
                tf_sns_tag_1.setText("");
            } else {
                rb_2d_sns_1.setSelected(false);
                rb_2d_sns_1.setDisable(true);
                cbb_manufacturer_sns_1.setDisable(true);
                tf_sns_alarm_cutoff_1.setDisable(true);
                tf_sns_alarm_cutoff_1.setText("");
                rb_3d_sns_1.setSelected(false);
                rb_3d_sns_1.setDisable(true);
                cbb_addr_v_sns_1.setDisable(true);
                cbb_addr_h_sns_1.setDisable(true);
                tf_ip_addr_sns_1.setText("");
                tf_ip_addr_sns_1.setDisable(true);
                tf_port_no_sns_1.setText("");
                tf_port_no_sns_1.setDisable(true);
                tf_sns_tag_1.setText("");
                tf_sns_tag_1.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_2(ActionEvent event) {
        try {
            if (cb_sns_2.isSelected()) {
                rb_2d_sns_2.setDisable(false);
                rb_3d_sns_2.setDisable(false);
                cbb_manufacturer_sns_2.setDisable(false);
                tf_sns_alarm_cutoff_2.setDisable(false);
                tf_sns_alarm_cutoff_2.setText("");
                tf_ip_addr_sns_2.setDisable(false);
                tf_ip_addr_sns_2.setText("");
                tf_port_no_sns_2.setDisable(false);
                tf_port_no_sns_2.setText("");
                tf_sns_tag_2.setDisable(false);
                tf_sns_tag_2.setText("");
            } else {
                rb_2d_sns_2.setSelected(false);
                rb_2d_sns_2.setDisable(true);
                cbb_manufacturer_sns_2.setDisable(true);
                tf_sns_alarm_cutoff_2.setDisable(true);
                tf_sns_alarm_cutoff_2.setText("");
                rb_3d_sns_2.setSelected(false);
                rb_3d_sns_2.setDisable(true);
                cbb_addr_v_sns_2.setDisable(true);
                cbb_addr_h_sns_2.setDisable(true);
                tf_ip_addr_sns_2.setText("");
                tf_ip_addr_sns_2.setDisable(true);
                tf_port_no_sns_2.setText("");
                tf_port_no_sns_2.setDisable(true);
                tf_sns_tag_2.setText("");
                tf_sns_tag_2.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_3(ActionEvent event) {
        try {
            if (cb_sns_3.isSelected()) {
                rb_2d_sns_3.setDisable(false);
                rb_3d_sns_3.setDisable(false);
                cbb_manufacturer_sns_3.setDisable(false);
                tf_sns_alarm_cutoff_3.setDisable(false);
                tf_sns_alarm_cutoff_3.setText("");
                tf_ip_addr_sns_3.setDisable(false);
                tf_ip_addr_sns_3.setText("");
                tf_port_no_sns_3.setDisable(false);
                tf_port_no_sns_3.setText("");
                tf_sns_tag_3.setDisable(false);
                tf_sns_tag_3.setText("");
            } else {
                rb_2d_sns_3.setSelected(false);
                rb_2d_sns_3.setDisable(true);
                cbb_manufacturer_sns_3.setDisable(true);
                tf_sns_alarm_cutoff_3.setDisable(true);
                tf_sns_alarm_cutoff_3.setText("");
                rb_3d_sns_3.setSelected(false);
                rb_3d_sns_3.setDisable(true);
                cbb_addr_v_sns_3.setDisable(true);
                cbb_addr_h_sns_3.setDisable(true);
                tf_ip_addr_sns_3.setText("");
                tf_ip_addr_sns_3.setDisable(true);
                tf_port_no_sns_3.setText("");
                tf_port_no_sns_3.setDisable(true);
                tf_sns_tag_3.setText("");
                tf_sns_tag_3.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_4(ActionEvent event) {
        try {
            if (cb_sns_4.isSelected()) {
                rb_2d_sns_4.setDisable(false);
                rb_3d_sns_4.setDisable(false);
                cbb_manufacturer_sns_4.setDisable(false);
                tf_sns_alarm_cutoff_4.setDisable(false);
                tf_sns_alarm_cutoff_4.setText("");
                tf_ip_addr_sns_4.setDisable(false);
                tf_ip_addr_sns_4.setText("");
                tf_port_no_sns_4.setDisable(false);
                tf_port_no_sns_4.setText("");
                tf_sns_tag_4.setDisable(false);
                tf_sns_tag_4.setText("");
            } else {
                rb_2d_sns_4.setSelected(false);
                rb_2d_sns_4.setDisable(true);
                cbb_manufacturer_sns_4.setDisable(true);
                tf_sns_alarm_cutoff_4.setDisable(true);
                tf_sns_alarm_cutoff_4.setText("");
                rb_3d_sns_4.setSelected(false);
                rb_3d_sns_4.setDisable(true);
                cbb_addr_v_sns_4.setDisable(true);
                cbb_addr_h_sns_4.setDisable(true);
                tf_ip_addr_sns_4.setText("");
                tf_ip_addr_sns_4.setDisable(true);
                tf_port_no_sns_4.setText("");
                tf_port_no_sns_4.setDisable(true);
                tf_sns_tag_4.setText("");
                tf_sns_tag_4.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_5(ActionEvent event) {
        try {
            if (cb_sns_5.isSelected()) {
                rb_2d_sns_5.setDisable(false);
                rb_3d_sns_5.setDisable(false);
                cbb_manufacturer_sns_5.setDisable(false);
                tf_sns_alarm_cutoff_5.setDisable(false);
                tf_sns_alarm_cutoff_5.setText("");
                tf_ip_addr_sns_5.setDisable(false);
                tf_ip_addr_sns_5.setText("");
                tf_port_no_sns_5.setDisable(false);
                tf_port_no_sns_5.setText("");
                tf_sns_tag_5.setDisable(false);
                tf_sns_tag_5.setText("");
            } else {
                rb_2d_sns_5.setSelected(false);
                rb_2d_sns_5.setDisable(true);
                cbb_manufacturer_sns_5.setDisable(true);
                tf_sns_alarm_cutoff_5.setDisable(true);
                tf_sns_alarm_cutoff_5.setText("");
                rb_3d_sns_5.setSelected(false);
                rb_3d_sns_5.setDisable(true);
                cbb_addr_v_sns_5.setDisable(true);
                cbb_addr_h_sns_5.setDisable(true);
                tf_ip_addr_sns_5.setText("");
                tf_ip_addr_sns_5.setDisable(true);
                tf_port_no_sns_5.setText("");
                tf_port_no_sns_5.setDisable(true);
                tf_sns_tag_5.setText("");
                tf_sns_tag_5.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_6(ActionEvent event) {
        try {
            if (cb_sns_6.isSelected()) {
                rb_2d_sns_6.setDisable(false);
                rb_3d_sns_6.setDisable(false);
                cbb_manufacturer_sns_6.setDisable(false);
                tf_sns_alarm_cutoff_6.setDisable(false);
                tf_sns_alarm_cutoff_6.setText("");
                tf_ip_addr_sns_6.setDisable(false);
                tf_ip_addr_sns_6.setText("");
                tf_port_no_sns_6.setDisable(false);
                tf_port_no_sns_6.setText("");
                tf_sns_tag_6.setDisable(false);
                tf_sns_tag_6.setText("");
            } else {
                rb_2d_sns_6.setSelected(false);
                rb_2d_sns_6.setDisable(true);
                cbb_manufacturer_sns_6.setDisable(true);
                tf_sns_alarm_cutoff_6.setDisable(true);
                tf_sns_alarm_cutoff_6.setText("");
                rb_3d_sns_6.setSelected(false);
                rb_3d_sns_6.setDisable(true);
                cbb_addr_v_sns_6.setDisable(true);
                cbb_addr_h_sns_6.setDisable(true);
                tf_ip_addr_sns_6.setText("");
                tf_ip_addr_sns_6.setDisable(true);
                tf_port_no_sns_6.setText("");
                tf_port_no_sns_6.setDisable(true);
                tf_sns_tag_6.setText("");
                tf_sns_tag_6.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_7(ActionEvent event) {
        try {
            if (cb_sns_7.isSelected()) {
                rb_2d_sns_7.setDisable(false);
                rb_3d_sns_7.setDisable(false);
                cbb_manufacturer_sns_7.setDisable(false);
                tf_sns_alarm_cutoff_7.setDisable(false);
                tf_sns_alarm_cutoff_7.setText("");
                tf_ip_addr_sns_7.setDisable(false);
                tf_ip_addr_sns_7.setText("");
                tf_port_no_sns_7.setDisable(false);
                tf_port_no_sns_7.setText("");
                tf_sns_tag_7.setDisable(false);
                tf_sns_tag_7.setText("");
            } else {
                rb_2d_sns_7.setSelected(false);
                rb_2d_sns_7.setDisable(true);
                cbb_manufacturer_sns_7.setDisable(true);
                tf_sns_alarm_cutoff_7.setDisable(true);
                tf_sns_alarm_cutoff_7.setText("");
                rb_3d_sns_7.setSelected(false);
                rb_3d_sns_7.setDisable(true);
                cbb_addr_v_sns_7.setDisable(true);
                cbb_addr_h_sns_7.setDisable(true);
                tf_ip_addr_sns_7.setText("");
                tf_ip_addr_sns_7.setDisable(true);
                tf_port_no_sns_7.setText("");
                tf_port_no_sns_7.setDisable(true);
                tf_sns_tag_7.setText("");
                tf_sns_tag_7.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_8(ActionEvent event) {
        try {
            if (cb_sns_8.isSelected()) {
                rb_2d_sns_8.setDisable(false);
                rb_3d_sns_8.setDisable(false);
                cbb_manufacturer_sns_8.setDisable(false);
                tf_sns_alarm_cutoff_8.setDisable(false);
                tf_sns_alarm_cutoff_8.setText("");
                tf_ip_addr_sns_8.setDisable(false);
                tf_ip_addr_sns_8.setText("");
                tf_port_no_sns_8.setDisable(false);
                tf_port_no_sns_8.setText("");
                tf_sns_tag_8.setDisable(false);
                tf_sns_tag_8.setText("");
            } else {
                rb_2d_sns_8.setSelected(false);
                rb_2d_sns_8.setDisable(true);
                cbb_manufacturer_sns_8.setDisable(true);
                tf_sns_alarm_cutoff_8.setDisable(true);
                tf_sns_alarm_cutoff_8.setText("");
                rb_3d_sns_8.setSelected(false);
                rb_3d_sns_8.setDisable(true);
                cbb_addr_v_sns_8.setDisable(true);
                cbb_addr_h_sns_8.setDisable(true);
                tf_ip_addr_sns_8.setText("");
                tf_ip_addr_sns_8.setDisable(true);
                tf_port_no_sns_8.setText("");
                tf_port_no_sns_8.setDisable(true);
                tf_sns_tag_8.setText("");
                tf_sns_tag_8.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_9(ActionEvent event) {
        try {
            if (cb_sns_9.isSelected()) {
                rb_2d_sns_9.setDisable(false);
                rb_3d_sns_9.setDisable(false);
                cbb_manufacturer_sns_9.setDisable(false);
                tf_sns_alarm_cutoff_9.setDisable(false);
                tf_sns_alarm_cutoff_9.setText("");
                tf_ip_addr_sns_9.setDisable(false);
                tf_ip_addr_sns_9.setText("");
                tf_port_no_sns_9.setDisable(false);
                tf_port_no_sns_9.setText("");
                tf_sns_tag_9.setDisable(false);
                tf_sns_tag_9.setText("");
            } else {
                rb_2d_sns_9.setSelected(false);
                rb_2d_sns_9.setDisable(true);
                cbb_manufacturer_sns_9.setDisable(true);
                tf_sns_alarm_cutoff_9.setDisable(true);
                tf_sns_alarm_cutoff_9.setText("");
                rb_3d_sns_9.setSelected(false);
                rb_3d_sns_9.setDisable(true);
                cbb_addr_v_sns_9.setDisable(true);
                cbb_addr_h_sns_9.setDisable(true);
                tf_ip_addr_sns_9.setText("");
                tf_ip_addr_sns_9.setDisable(true);
                tf_port_no_sns_9.setText("");
                tf_port_no_sns_9.setDisable(true);
                tf_sns_tag_9.setText("");
                tf_sns_tag_9.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_10(ActionEvent event) {
        try {
            if (cb_sns_10.isSelected()) {
                rb_2d_sns_10.setDisable(false);
                rb_3d_sns_10.setDisable(false);
                cbb_manufacturer_sns_10.setDisable(false);
                tf_sns_alarm_cutoff_10.setDisable(false);
                tf_sns_alarm_cutoff_10.setText("");
                tf_ip_addr_sns_10.setDisable(false);
                tf_ip_addr_sns_10.setText("");
                tf_port_no_sns_10.setDisable(false);
                tf_port_no_sns_10.setText("");
                tf_sns_tag_10.setDisable(false);
                tf_sns_tag_10.setText("");
            } else {
                rb_2d_sns_10.setSelected(false);
                rb_2d_sns_10.setDisable(true);
                cbb_manufacturer_sns_10.setDisable(true);
                tf_sns_alarm_cutoff_10.setDisable(true);
                tf_sns_alarm_cutoff_10.setText("");
                rb_3d_sns_10.setSelected(false);
                rb_3d_sns_10.setDisable(true);
                cbb_addr_v_sns_10.setDisable(true);
                cbb_addr_h_sns_10.setDisable(true);
                tf_ip_addr_sns_10.setText("");
                tf_ip_addr_sns_10.setDisable(true);
                tf_port_no_sns_10.setText("");
                tf_port_no_sns_10.setDisable(true);
                tf_sns_tag_10.setText("");
                tf_sns_tag_10.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_11(ActionEvent event) {
        try {
            if (cb_sns_11.isSelected()) {
                rb_2d_sns_11.setDisable(false);
                rb_3d_sns_11.setDisable(false);
                cbb_manufacturer_sns_11.setDisable(false);
                tf_sns_alarm_cutoff_11.setDisable(false);
                tf_sns_alarm_cutoff_11.setText("");
                tf_ip_addr_sns_11.setDisable(false);
                tf_ip_addr_sns_11.setText("");
                tf_port_no_sns_11.setDisable(false);
                tf_port_no_sns_11.setText("");
                tf_sns_tag_11.setDisable(false);
                tf_sns_tag_11.setText("");
            } else {
                rb_2d_sns_11.setSelected(false);
                rb_2d_sns_11.setDisable(true);
                cbb_manufacturer_sns_11.setDisable(true);
                tf_sns_alarm_cutoff_11.setDisable(true);
                tf_sns_alarm_cutoff_11.setText("");
                rb_3d_sns_11.setSelected(false);
                rb_3d_sns_11.setDisable(true);
                cbb_addr_v_sns_11.setDisable(true);
                cbb_addr_h_sns_11.setDisable(true);
                tf_ip_addr_sns_11.setText("");
                tf_ip_addr_sns_11.setDisable(true);
                tf_port_no_sns_11.setText("");
                tf_port_no_sns_11.setDisable(true);
                tf_sns_tag_11.setText("");
                tf_sns_tag_11.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_12(ActionEvent event) {
        try {
            if (cb_sns_12.isSelected()) {
                rb_2d_sns_12.setDisable(false);
                rb_3d_sns_12.setDisable(false);
                cbb_manufacturer_sns_12.setDisable(false);
                tf_sns_alarm_cutoff_12.setDisable(false);
                tf_sns_alarm_cutoff_12.setText("");
                tf_ip_addr_sns_12.setDisable(false);
                tf_ip_addr_sns_12.setText("");
                tf_port_no_sns_12.setDisable(false);
                tf_port_no_sns_12.setText("");
                tf_sns_tag_12.setDisable(false);
                tf_sns_tag_12.setText("");
            } else {
                rb_2d_sns_12.setSelected(false);
                rb_2d_sns_12.setDisable(true);
                cbb_manufacturer_sns_12.setDisable(true);
                tf_sns_alarm_cutoff_12.setDisable(true);
                tf_sns_alarm_cutoff_12.setText("");
                rb_3d_sns_12.setSelected(false);
                rb_3d_sns_12.setDisable(true);
                cbb_addr_v_sns_12.setDisable(true);
                cbb_addr_h_sns_12.setDisable(true);
                tf_ip_addr_sns_12.setText("");
                tf_ip_addr_sns_12.setDisable(true);
                tf_port_no_sns_12.setText("");
                tf_port_no_sns_12.setDisable(true);
                tf_sns_tag_12.setText("");
                tf_sns_tag_12.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_13(ActionEvent event) {
        try {
            if (cb_sns_13.isSelected()) {
                rb_2d_sns_13.setDisable(false);
                rb_3d_sns_13.setDisable(false);
                cbb_manufacturer_sns_13.setDisable(false);
                tf_sns_alarm_cutoff_13.setDisable(false);
                tf_sns_alarm_cutoff_13.setText("");
                tf_ip_addr_sns_13.setDisable(false);
                tf_ip_addr_sns_13.setText("");
                tf_port_no_sns_13.setDisable(false);
                tf_port_no_sns_13.setText("");
                tf_sns_tag_13.setDisable(false);
                tf_sns_tag_13.setText("");
            } else {
                rb_2d_sns_13.setSelected(false);
                rb_2d_sns_13.setDisable(true);
                cbb_manufacturer_sns_13.setDisable(true);
                tf_sns_alarm_cutoff_13.setDisable(true);
                tf_sns_alarm_cutoff_13.setText("");
                rb_3d_sns_13.setSelected(false);
                rb_3d_sns_13.setDisable(true);
                cbb_addr_v_sns_13.setDisable(true);
                cbb_addr_h_sns_13.setDisable(true);
                tf_ip_addr_sns_13.setText("");
                tf_ip_addr_sns_13.setDisable(true);
                tf_port_no_sns_13.setText("");
                tf_port_no_sns_13.setDisable(true);
                tf_sns_tag_13.setText("");
                tf_sns_tag_13.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_14(ActionEvent event) {
        try {
            if (cb_sns_14.isSelected()) {
                rb_2d_sns_14.setDisable(false);
                rb_3d_sns_14.setDisable(false);
                cbb_manufacturer_sns_14.setDisable(false);
                tf_sns_alarm_cutoff_14.setDisable(false);
                tf_sns_alarm_cutoff_14.setText("");
                tf_ip_addr_sns_14.setDisable(false);
                tf_ip_addr_sns_14.setText("");
                tf_port_no_sns_14.setDisable(false);
                tf_port_no_sns_14.setText("");
                tf_sns_tag_14.setDisable(false);
                tf_sns_tag_14.setText("");
            } else {
                rb_2d_sns_14.setSelected(false);
                rb_2d_sns_14.setDisable(true);
                cbb_manufacturer_sns_14.setDisable(true);
                tf_sns_alarm_cutoff_14.setDisable(true);
                tf_sns_alarm_cutoff_14.setText("");
                rb_3d_sns_14.setSelected(false);
                rb_3d_sns_14.setDisable(true);
                cbb_addr_v_sns_14.setDisable(true);
                cbb_addr_h_sns_14.setDisable(true);
                tf_ip_addr_sns_14.setText("");
                tf_ip_addr_sns_14.setDisable(true);
                tf_port_no_sns_14.setText("");
                tf_port_no_sns_14.setDisable(true);
                tf_sns_tag_14.setText("");
                tf_sns_tag_14.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_15(ActionEvent event) {
        try {
            if (cb_sns_15.isSelected()) {
                rb_2d_sns_15.setDisable(false);
                rb_3d_sns_15.setDisable(false);
                cbb_manufacturer_sns_15.setDisable(false);
                tf_sns_alarm_cutoff_15.setDisable(false);
                tf_sns_alarm_cutoff_15.setText("");
                tf_ip_addr_sns_15.setDisable(false);
                tf_ip_addr_sns_15.setText("");
                tf_port_no_sns_15.setDisable(false);
                tf_port_no_sns_15.setText("");
                tf_sns_tag_15.setDisable(false);
                tf_sns_tag_15.setText("");
            } else {
                rb_2d_sns_15.setSelected(false);
                rb_2d_sns_15.setDisable(true);
                cbb_manufacturer_sns_15.setDisable(true);
                tf_sns_alarm_cutoff_15.setDisable(true);
                tf_sns_alarm_cutoff_15.setText("");
                rb_3d_sns_15.setSelected(false);
                rb_3d_sns_15.setDisable(true);
                cbb_addr_v_sns_15.setDisable(true);
                cbb_addr_h_sns_15.setDisable(true);
                tf_ip_addr_sns_15.setText("");
                tf_ip_addr_sns_15.setDisable(true);
                tf_port_no_sns_15.setText("");
                tf_port_no_sns_15.setDisable(true);
                tf_sns_tag_15.setText("");
                tf_sns_tag_15.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_16(ActionEvent event) {
        try {
            if (cb_sns_16.isSelected()) {
                rb_2d_sns_16.setDisable(false);
                rb_3d_sns_16.setDisable(false);
                cbb_manufacturer_sns_16.setDisable(false);
                tf_sns_alarm_cutoff_16.setDisable(false);
                tf_sns_alarm_cutoff_16.setText("");
                tf_ip_addr_sns_16.setDisable(false);
                tf_ip_addr_sns_16.setText("");
                tf_port_no_sns_16.setDisable(false);
                tf_port_no_sns_16.setText("");
                tf_sns_tag_16.setDisable(false);
                tf_sns_tag_16.setText("");
            } else {
                rb_2d_sns_16.setSelected(false);
                rb_2d_sns_16.setDisable(true);
                cbb_manufacturer_sns_16.setDisable(true);
                tf_sns_alarm_cutoff_16.setDisable(true);
                tf_sns_alarm_cutoff_16.setText("");
                rb_3d_sns_16.setSelected(false);
                rb_3d_sns_16.setDisable(true);
                cbb_addr_v_sns_16.setDisable(true);
                cbb_addr_h_sns_16.setDisable(true);
                tf_ip_addr_sns_16.setText("");
                tf_ip_addr_sns_16.setDisable(true);
                tf_port_no_sns_16.setText("");
                tf_port_no_sns_16.setDisable(true);
                tf_sns_tag_16.setText("");
                tf_sns_tag_16.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_17(ActionEvent event) {
        try {
            if (cb_sns_17.isSelected()) {
                rb_2d_sns_17.setDisable(false);
                rb_3d_sns_17.setDisable(false);
                cbb_manufacturer_sns_17.setDisable(false);
                tf_sns_alarm_cutoff_17.setDisable(false);
                tf_sns_alarm_cutoff_17.setText("");
                tf_ip_addr_sns_17.setDisable(false);
                tf_ip_addr_sns_17.setText("");
                tf_port_no_sns_17.setDisable(false);
                tf_port_no_sns_17.setText("");
                tf_sns_tag_17.setDisable(false);
                tf_sns_tag_17.setText("");
            } else {
                rb_2d_sns_17.setSelected(false);
                rb_2d_sns_17.setDisable(true);
                cbb_manufacturer_sns_17.setDisable(true);
                tf_sns_alarm_cutoff_17.setDisable(true);
                tf_sns_alarm_cutoff_17.setText("");
                rb_3d_sns_17.setSelected(false);
                rb_3d_sns_17.setDisable(true);
                cbb_addr_v_sns_17.setDisable(true);
                cbb_addr_h_sns_17.setDisable(true);
                tf_ip_addr_sns_17.setText("");
                tf_ip_addr_sns_17.setDisable(true);
                tf_port_no_sns_17.setText("");
                tf_port_no_sns_17.setDisable(true);
                tf_sns_tag_17.setText("");
                tf_sns_tag_17.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_18(ActionEvent event) {
        try {
            if (cb_sns_18.isSelected()) {
                rb_2d_sns_18.setDisable(false);
                rb_3d_sns_18.setDisable(false);
                cbb_manufacturer_sns_18.setDisable(false);
                tf_sns_alarm_cutoff_18.setDisable(false);
                tf_sns_alarm_cutoff_18.setText("");
                tf_ip_addr_sns_18.setDisable(false);
                tf_ip_addr_sns_18.setText("");
                tf_port_no_sns_18.setDisable(false);
                tf_port_no_sns_18.setText("");
                tf_sns_tag_18.setDisable(false);
                tf_sns_tag_18.setText("");
            } else {
                rb_2d_sns_18.setSelected(false);
                rb_2d_sns_18.setDisable(true);
                cbb_manufacturer_sns_18.setDisable(true);
                tf_sns_alarm_cutoff_18.setDisable(true);
                tf_sns_alarm_cutoff_18.setText("");
                rb_3d_sns_18.setSelected(false);
                rb_3d_sns_18.setDisable(true);
                cbb_addr_v_sns_18.setDisable(true);
                cbb_addr_h_sns_18.setDisable(true);
                tf_ip_addr_sns_18.setText("");
                tf_ip_addr_sns_18.setDisable(true);
                tf_port_no_sns_18.setText("");
                tf_port_no_sns_18.setDisable(true);
                tf_sns_tag_18.setText("");
                tf_sns_tag_18.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_19(ActionEvent event) {
        try {
            if (cb_sns_19.isSelected()) {
                rb_2d_sns_19.setDisable(false);
                rb_3d_sns_19.setDisable(false);
                cbb_manufacturer_sns_19.setDisable(false);
                tf_sns_alarm_cutoff_19.setDisable(false);
                tf_sns_alarm_cutoff_19.setText("");
                tf_ip_addr_sns_19.setDisable(false);
                tf_ip_addr_sns_19.setText("");
                tf_port_no_sns_19.setDisable(false);
                tf_port_no_sns_19.setText("");
                tf_sns_tag_19.setDisable(false);
                tf_sns_tag_19.setText("");
            } else {
                rb_2d_sns_19.setSelected(false);
                rb_2d_sns_19.setDisable(true);
                cbb_manufacturer_sns_19.setDisable(true);
                tf_sns_alarm_cutoff_19.setDisable(true);
                tf_sns_alarm_cutoff_19.setText("");
                rb_3d_sns_19.setSelected(false);
                rb_3d_sns_19.setDisable(true);
                cbb_addr_v_sns_19.setDisable(true);
                cbb_addr_h_sns_19.setDisable(true);
                tf_ip_addr_sns_19.setText("");
                tf_ip_addr_sns_19.setDisable(true);
                tf_port_no_sns_19.setText("");
                tf_port_no_sns_19.setDisable(true);
                tf_sns_tag_19.setText("");
                tf_sns_tag_19.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_cb_sns_20(ActionEvent event) {
        try {
            if (cb_sns_20.isSelected()) {
                rb_2d_sns_20.setDisable(false);
                rb_3d_sns_20.setDisable(false);
                cbb_manufacturer_sns_20.setDisable(false);
                tf_sns_alarm_cutoff_20.setDisable(false);
                tf_sns_alarm_cutoff_20.setText("");
                tf_ip_addr_sns_20.setDisable(false);
                tf_ip_addr_sns_20.setText("");
                tf_port_no_sns_20.setDisable(false);
                tf_port_no_sns_20.setText("");
                tf_sns_tag_20.setDisable(false);
                tf_sns_tag_20.setText("");
            } else {
                rb_2d_sns_20.setSelected(false);
                rb_2d_sns_20.setDisable(true);
                cbb_manufacturer_sns_20.setDisable(true);
                tf_sns_alarm_cutoff_20.setDisable(true);
                tf_sns_alarm_cutoff_20.setText("");
                rb_3d_sns_20.setSelected(false);
                rb_3d_sns_20.setDisable(true);
                cbb_addr_v_sns_20.setDisable(true);
                cbb_addr_h_sns_20.setDisable(true);
                tf_ip_addr_sns_20.setText("");
                tf_ip_addr_sns_20.setDisable(true);
                tf_port_no_sns_20.setText("");
                tf_port_no_sns_20.setDisable(true);
                tf_sns_tag_20.setText("");
                tf_sns_tag_20.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_1(ActionEvent event) {
        try {
            if (cb_sns_1.isSelected()) {
                cbb_addr_v_sns_1.setDisable(false);
                cbb_addr_h_sns_1.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_2(ActionEvent event) {
        try {
            if (cb_sns_2.isSelected()) {
                cbb_addr_v_sns_2.setDisable(false);
                cbb_addr_h_sns_2.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_3(ActionEvent event) {
        try {
            if (cb_sns_3.isSelected()) {
                cbb_addr_v_sns_3.setDisable(false);
                cbb_addr_h_sns_3.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_4(ActionEvent event) {
        try {
            if (cb_sns_4.isSelected()) {
                cbb_addr_v_sns_4.setDisable(false);
                cbb_addr_h_sns_4.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_5(ActionEvent event) {
        try {
            if (cb_sns_5.isSelected()) {
                cbb_addr_v_sns_5.setDisable(false);
                cbb_addr_h_sns_5.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_6(ActionEvent event) {
        try {
            if (cb_sns_6.isSelected()) {
                cbb_addr_v_sns_6.setDisable(false);
                cbb_addr_h_sns_6.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_7(ActionEvent event) {
        try {
            if (cb_sns_7.isSelected()) {
                cbb_addr_v_sns_7.setDisable(false);
                cbb_addr_h_sns_7.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_8(ActionEvent event) {
        try {
            if (cb_sns_8.isSelected()) {
                cbb_addr_v_sns_8.setDisable(false);
                cbb_addr_h_sns_8.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_9(ActionEvent event) {
        try {
            if (cb_sns_9.isSelected()) {
                cbb_addr_v_sns_9.setDisable(false);
                cbb_addr_h_sns_9.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_10(ActionEvent event) {
        try {
            if (cb_sns_10.isSelected()) {
                cbb_addr_v_sns_10.setDisable(false);
                cbb_addr_h_sns_10.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_11(ActionEvent event) {
        try {
            if (cb_sns_11.isSelected()) {
                cbb_addr_v_sns_11.setDisable(false);
                cbb_addr_h_sns_11.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_12(ActionEvent event) {
        try {
            if (cb_sns_12.isSelected()) {
                cbb_addr_v_sns_12.setDisable(false);
                cbb_addr_h_sns_12.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_13(ActionEvent event) {
        try {
            if (cb_sns_13.isSelected()) {
                cbb_addr_v_sns_13.setDisable(false);
                cbb_addr_h_sns_13.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_14(ActionEvent event) {
        try {
            if (cb_sns_14.isSelected()) {
                cbb_addr_v_sns_14.setDisable(false);
                cbb_addr_h_sns_14.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_15(ActionEvent event) {
        try {
            if (cb_sns_15.isSelected()) {
                cbb_addr_v_sns_15.setDisable(false);
                cbb_addr_h_sns_15.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_16(ActionEvent event) {
        try {
            if (cb_sns_16.isSelected()) {
                cbb_addr_v_sns_16.setDisable(false);
                cbb_addr_h_sns_16.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_17(ActionEvent event) {
        try {
            if (cb_sns_17.isSelected()) {
                cbb_addr_v_sns_17.setDisable(false);
                cbb_addr_h_sns_17.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_18(ActionEvent event) {
        try {
            if (cb_sns_18.isSelected()) {
                cbb_addr_v_sns_18.setDisable(false);
                cbb_addr_h_sns_18.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_19(ActionEvent event) {
        try {
            if (cb_sns_19.isSelected()) {
                cbb_addr_v_sns_19.setDisable(false);
                cbb_addr_h_sns_19.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_2d_sns_20(ActionEvent event) {
        try {
            if (cb_sns_20.isSelected()) {
                cbb_addr_v_sns_20.setDisable(false);
                cbb_addr_h_sns_20.setDisable(true);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_1(ActionEvent event) {
        try {
            if (cb_sns_1.isSelected()) {
                cbb_addr_v_sns_1.setDisable(false);
                cbb_addr_h_sns_1.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_2(ActionEvent event) {
        try {
            if (cb_sns_2.isSelected()) {
                cbb_addr_v_sns_2.setDisable(false);
                cbb_addr_h_sns_2.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_3(ActionEvent event) {
        try {
            if (cb_sns_3.isSelected()) {
                cbb_addr_v_sns_3.setDisable(false);
                cbb_addr_h_sns_3.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_4(ActionEvent event) {
        try {
            if (cb_sns_4.isSelected()) {
                cbb_addr_v_sns_4.setDisable(false);
                cbb_addr_h_sns_4.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_5(ActionEvent event) {
        try {
            if (cb_sns_5.isSelected()) {
                cbb_addr_v_sns_5.setDisable(false);
                cbb_addr_h_sns_5.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_6(ActionEvent event) {
        try {
            if (cb_sns_6.isSelected()) {
                cbb_addr_v_sns_6.setDisable(false);
                cbb_addr_h_sns_6.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_7(ActionEvent event) {
        try {
            if (cb_sns_7.isSelected()) {
                cbb_addr_v_sns_7.setDisable(false);
                cbb_addr_h_sns_7.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_8(ActionEvent event) {
        try {
            if (cb_sns_8.isSelected()) {
                cbb_addr_v_sns_8.setDisable(false);
                cbb_addr_h_sns_8.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_9(ActionEvent event) {
        try {
            if (cb_sns_9.isSelected()) {
                cbb_addr_v_sns_9.setDisable(false);
                cbb_addr_h_sns_9.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_10(ActionEvent event) {
        try {
            if (cb_sns_10.isSelected()) {
                cbb_addr_v_sns_10.setDisable(false);
                cbb_addr_h_sns_10.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_11(ActionEvent event) {
        try {
            if (cb_sns_11.isSelected()) {
                cbb_addr_v_sns_11.setDisable(false);
                cbb_addr_h_sns_11.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_12(ActionEvent event) {
        try {
            if (cb_sns_12.isSelected()) {
                cbb_addr_v_sns_12.setDisable(false);
                cbb_addr_h_sns_12.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_13(ActionEvent event) {
        try {
            if (cb_sns_13.isSelected()) {
                cbb_addr_v_sns_13.setDisable(false);
                cbb_addr_h_sns_13.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_14(ActionEvent event) {
        try {
            if (cb_sns_14.isSelected()) {
                cbb_addr_v_sns_14.setDisable(false);
                cbb_addr_h_sns_14.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_15(ActionEvent event) {
        try {
            if (cb_sns_15.isSelected()) {
                cbb_addr_v_sns_15.setDisable(false);
                cbb_addr_h_sns_15.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_16(ActionEvent event) {
        try {
            if (cb_sns_16.isSelected()) {
                cbb_addr_v_sns_16.setDisable(false);
                cbb_addr_h_sns_16.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_17(ActionEvent event) {
        try {
            if (cb_sns_17.isSelected()) {
                cbb_addr_v_sns_17.setDisable(false);
                cbb_addr_h_sns_17.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_18(ActionEvent event) {
        try {
            if (cb_sns_18.isSelected()) {
                cbb_addr_v_sns_18.setDisable(false);
                cbb_addr_h_sns_18.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_19(ActionEvent event) {
        try {
            if (cb_sns_19.isSelected()) {
                cbb_addr_v_sns_19.setDisable(false);
                cbb_addr_h_sns_19.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    @FXML
    private void action_rb_3d_sns_20(ActionEvent event) {
        try {
            if (cb_sns_20.isSelected()) {
                cbb_addr_v_sns_20.setDisable(false);
                cbb_addr_h_sns_20.setDisable(false);
            }
        } catch (Exception e) {
        }
    }

    private void setValueInCombobox() {
        try {

            cbb_manufacturer_sns_1.getItems().add("FWS");
            cbb_manufacturer_sns_1.getItems().add("ZWS");

            cbb_manufacturer_sns_2.getItems().add("FWS");
            cbb_manufacturer_sns_2.getItems().add("ZWS");

            cbb_manufacturer_sns_3.getItems().add("FWS");
            cbb_manufacturer_sns_3.getItems().add("ZWS");

            cbb_manufacturer_sns_4.getItems().add("FWS");
            cbb_manufacturer_sns_4.getItems().add("ZWS");

            cbb_manufacturer_sns_5.getItems().add("FWS");
            cbb_manufacturer_sns_5.getItems().add("ZWS");

            cbb_manufacturer_sns_6.getItems().add("FWS");
            cbb_manufacturer_sns_6.getItems().add("ZWS");

            cbb_manufacturer_sns_7.getItems().add("FWS");
            cbb_manufacturer_sns_7.getItems().add("ZWS");

            cbb_manufacturer_sns_8.getItems().add("FWS");
            cbb_manufacturer_sns_8.getItems().add("ZWS");

            cbb_manufacturer_sns_9.getItems().add("FWS");
            cbb_manufacturer_sns_9.getItems().add("ZWS");

            cbb_manufacturer_sns_10.getItems().add("FWS");
            cbb_manufacturer_sns_10.getItems().add("ZWS");

            cbb_manufacturer_sns_11.getItems().add("FWS");
            cbb_manufacturer_sns_11.getItems().add("ZWS");

            cbb_manufacturer_sns_12.getItems().add("FWS");
            cbb_manufacturer_sns_12.getItems().add("ZWS");

            cbb_manufacturer_sns_13.getItems().add("FWS");
            cbb_manufacturer_sns_13.getItems().add("ZWS");

            cbb_manufacturer_sns_14.getItems().add("FWS");
            cbb_manufacturer_sns_14.getItems().add("ZWS");

            cbb_manufacturer_sns_15.getItems().add("FWS");
            cbb_manufacturer_sns_15.getItems().add("ZWS");

            cbb_manufacturer_sns_16.getItems().add("FWS");
            cbb_manufacturer_sns_16.getItems().add("ZWS");

            cbb_manufacturer_sns_17.getItems().add("FWS");
            cbb_manufacturer_sns_17.getItems().add("ZWS");

            cbb_manufacturer_sns_18.getItems().add("FWS");
            cbb_manufacturer_sns_18.getItems().add("ZWS");

            cbb_manufacturer_sns_19.getItems().add("FWS");
            cbb_manufacturer_sns_19.getItems().add("ZWS");

            cbb_manufacturer_sns_20.getItems().add("FWS");
            cbb_manufacturer_sns_20.getItems().add("ZWS");

            for (int i = 0; i <= 2; i++) {

//                cbb_test.getItems().add("" + i); 
                cbb_addr_v_sns_1.getItems().add("" + i);
                cbb_addr_v_sns_2.getItems().add("" + i);
                cbb_addr_v_sns_3.getItems().add("" + i);
                cbb_addr_v_sns_4.getItems().add("" + i);
                cbb_addr_v_sns_5.getItems().add("" + i);
                cbb_addr_v_sns_6.getItems().add("" + i);
                cbb_addr_v_sns_7.getItems().add("" + i);
                cbb_addr_v_sns_8.getItems().add("" + i);
                cbb_addr_v_sns_9.getItems().add("" + i);
                cbb_addr_v_sns_10.getItems().add("" + i);
                cbb_addr_v_sns_11.getItems().add("" + i);
                cbb_addr_v_sns_12.getItems().add("" + i);
                cbb_addr_v_sns_13.getItems().add("" + i);
                cbb_addr_v_sns_14.getItems().add("" + i);
                cbb_addr_v_sns_15.getItems().add("" + i);
                cbb_addr_v_sns_16.getItems().add("" + i);
                cbb_addr_v_sns_17.getItems().add("" + i);
                cbb_addr_v_sns_18.getItems().add("" + i);
                cbb_addr_v_sns_19.getItems().add("" + i);
                cbb_addr_v_sns_20.getItems().add("" + i);

                cbb_addr_h_sns_1.getItems().add("" + i);
                cbb_addr_h_sns_2.getItems().add("" + i);
                cbb_addr_h_sns_3.getItems().add("" + i);
                cbb_addr_h_sns_4.getItems().add("" + i);
                cbb_addr_h_sns_5.getItems().add("" + i);
                cbb_addr_h_sns_6.getItems().add("" + i);
                cbb_addr_h_sns_7.getItems().add("" + i);
                cbb_addr_h_sns_8.getItems().add("" + i);
                cbb_addr_h_sns_9.getItems().add("" + i);
                cbb_addr_h_sns_10.getItems().add("" + i);
                cbb_addr_h_sns_11.getItems().add("" + i);
                cbb_addr_h_sns_12.getItems().add("" + i);
                cbb_addr_h_sns_13.getItems().add("" + i);
                cbb_addr_h_sns_14.getItems().add("" + i);
                cbb_addr_h_sns_15.getItems().add("" + i);
                cbb_addr_h_sns_16.getItems().add("" + i);
                cbb_addr_h_sns_17.getItems().add("" + i);
                cbb_addr_h_sns_18.getItems().add("" + i);
                cbb_addr_h_sns_19.getItems().add("" + i);
                cbb_addr_h_sns_20.getItems().add("" + i);
            }

        } catch (Exception e) {
        }
    }

    private void clear_all_field() {
        try {
            rb_2d_sns_1.setSelected(false);
            rb_2d_sns_1.setDisable(true);
            cbb_manufacturer_sns_1.setDisable(true);
            tf_sns_alarm_cutoff_1.setDisable(true);
            tf_sns_alarm_cutoff_1.setText("");
            rb_3d_sns_1.setSelected(false);
            rb_3d_sns_1.setDisable(true);
            cbb_addr_v_sns_1.setDisable(true);
            cbb_addr_h_sns_1.setDisable(true);
            tf_ip_addr_sns_1.setText("");
            tf_ip_addr_sns_1.setDisable(true);
            tf_port_no_sns_1.setText("");
            tf_port_no_sns_1.setDisable(true);
            tf_sns_tag_1.setText("");
            tf_sns_tag_1.setDisable(true);

            rb_2d_sns_2.setSelected(false);
            rb_2d_sns_2.setDisable(true);
            cbb_manufacturer_sns_2.setDisable(true);
            tf_sns_alarm_cutoff_2.setDisable(true);
            tf_sns_alarm_cutoff_2.setText("");
            rb_3d_sns_2.setSelected(false);
            rb_3d_sns_2.setDisable(true);
            cbb_addr_v_sns_2.setDisable(true);
            cbb_addr_h_sns_2.setDisable(true);
            tf_ip_addr_sns_2.setText("");
            tf_ip_addr_sns_2.setDisable(true);
            tf_port_no_sns_2.setText("");
            tf_port_no_sns_2.setDisable(true);
            tf_sns_tag_2.setText("");
            tf_sns_tag_2.setDisable(true);

            rb_2d_sns_3.setSelected(false);
            rb_2d_sns_3.setDisable(true);
            cbb_manufacturer_sns_3.setDisable(true);
            tf_sns_alarm_cutoff_3.setDisable(true);
            tf_sns_alarm_cutoff_3.setText("");
            rb_3d_sns_3.setSelected(false);
            rb_3d_sns_3.setDisable(true);
            cbb_addr_v_sns_3.setDisable(true);
            cbb_addr_h_sns_3.setDisable(true);
            tf_ip_addr_sns_3.setText("");
            tf_ip_addr_sns_3.setDisable(true);
            tf_port_no_sns_3.setText("");
            tf_port_no_sns_3.setDisable(true);
            tf_sns_tag_3.setText("");
            tf_sns_tag_3.setDisable(true);

            rb_2d_sns_4.setSelected(false);
            rb_2d_sns_4.setDisable(true);
            cbb_manufacturer_sns_4.setDisable(true);
            tf_sns_alarm_cutoff_4.setDisable(true);
            tf_sns_alarm_cutoff_4.setText("");
            rb_3d_sns_4.setSelected(false);
            rb_3d_sns_4.setDisable(true);
            cbb_addr_v_sns_4.setDisable(true);
            cbb_addr_h_sns_4.setDisable(true);
            tf_ip_addr_sns_4.setText("");
            tf_ip_addr_sns_4.setDisable(true);
            tf_port_no_sns_4.setText("");
            tf_port_no_sns_4.setDisable(true);
            tf_sns_tag_4.setText("");
            tf_sns_tag_4.setDisable(true);

            rb_2d_sns_5.setSelected(false);
            rb_2d_sns_5.setDisable(true);
            cbb_manufacturer_sns_5.setDisable(true);
            tf_sns_alarm_cutoff_5.setDisable(true);
            tf_sns_alarm_cutoff_5.setText("");
            rb_3d_sns_5.setSelected(false);
            rb_3d_sns_5.setDisable(true);
            cbb_addr_v_sns_5.setDisable(true);
            cbb_addr_h_sns_5.setDisable(true);
            tf_ip_addr_sns_5.setText("");
            tf_ip_addr_sns_5.setDisable(true);
            tf_port_no_sns_5.setText("");
            tf_port_no_sns_5.setDisable(true);
            tf_sns_tag_5.setText("");
            tf_sns_tag_5.setDisable(true);

            rb_2d_sns_6.setSelected(false);
            rb_2d_sns_6.setDisable(true);
            cbb_manufacturer_sns_6.setDisable(true);
            tf_sns_alarm_cutoff_6.setDisable(true);
            tf_sns_alarm_cutoff_6.setText("");
            rb_3d_sns_6.setSelected(false);
            rb_3d_sns_6.setDisable(true);
            cbb_addr_v_sns_6.setDisable(true);
            cbb_addr_h_sns_6.setDisable(true);
            tf_ip_addr_sns_6.setText("");
            tf_ip_addr_sns_6.setDisable(true);
            tf_port_no_sns_6.setText("");
            tf_port_no_sns_6.setDisable(true);
            tf_sns_tag_6.setText("");
            tf_sns_tag_6.setDisable(true);

            rb_2d_sns_7.setSelected(false);
            rb_2d_sns_7.setDisable(true);
            cbb_manufacturer_sns_7.setDisable(true);
            tf_sns_alarm_cutoff_7.setDisable(true);
            tf_sns_alarm_cutoff_7.setText("");
            rb_3d_sns_7.setSelected(false);
            rb_3d_sns_7.setDisable(true);
            cbb_addr_v_sns_7.setDisable(true);
            cbb_addr_h_sns_7.setDisable(true);
            tf_ip_addr_sns_7.setText("");
            tf_ip_addr_sns_7.setDisable(true);
            tf_port_no_sns_7.setText("");
            tf_port_no_sns_7.setDisable(true);
            tf_sns_tag_7.setText("");
            tf_sns_tag_7.setDisable(true);

            rb_2d_sns_8.setSelected(false);
            rb_2d_sns_8.setDisable(true);
            cbb_manufacturer_sns_8.setDisable(true);
            tf_sns_alarm_cutoff_8.setDisable(true);
            tf_sns_alarm_cutoff_8.setText("");
            rb_3d_sns_8.setSelected(false);
            rb_3d_sns_8.setDisable(true);
            cbb_addr_v_sns_8.setDisable(true);
            cbb_addr_h_sns_8.setDisable(true);
            tf_ip_addr_sns_8.setText("");
            tf_ip_addr_sns_8.setDisable(true);
            tf_port_no_sns_8.setText("");
            tf_port_no_sns_8.setDisable(true);
            tf_sns_tag_8.setText("");
            tf_sns_tag_8.setDisable(true);

            rb_2d_sns_9.setSelected(false);
            rb_2d_sns_9.setDisable(true);
            cbb_manufacturer_sns_9.setDisable(true);
            tf_sns_alarm_cutoff_9.setDisable(true);
            tf_sns_alarm_cutoff_9.setText("");
            rb_3d_sns_9.setSelected(false);
            rb_3d_sns_9.setDisable(true);
            cbb_addr_v_sns_9.setDisable(true);
            cbb_addr_h_sns_9.setDisable(true);
            tf_ip_addr_sns_9.setText("");
            tf_ip_addr_sns_9.setDisable(true);
            tf_port_no_sns_9.setText("");
            tf_port_no_sns_9.setDisable(true);
            tf_sns_tag_9.setText("");
            tf_sns_tag_9.setDisable(true);

            rb_2d_sns_10.setSelected(false);
            rb_2d_sns_10.setDisable(true);
            cbb_manufacturer_sns_10.setDisable(true);
            tf_sns_alarm_cutoff_10.setDisable(true);
            tf_sns_alarm_cutoff_10.setText("");
            rb_3d_sns_10.setSelected(false);
            rb_3d_sns_10.setDisable(true);
            cbb_addr_v_sns_10.setDisable(true);
            cbb_addr_h_sns_10.setDisable(true);
            tf_ip_addr_sns_10.setText("");
            tf_ip_addr_sns_10.setDisable(true);
            tf_port_no_sns_10.setText("");
            tf_port_no_sns_10.setDisable(true);
            tf_sns_tag_10.setText("");
            tf_sns_tag_10.setDisable(true);

            rb_2d_sns_11.setSelected(false);
            rb_2d_sns_11.setDisable(true);
            cbb_manufacturer_sns_11.setDisable(true);
            tf_sns_alarm_cutoff_11.setDisable(true);
            tf_sns_alarm_cutoff_11.setText("");
            rb_3d_sns_11.setSelected(false);
            rb_3d_sns_11.setDisable(true);
            cbb_addr_v_sns_11.setDisable(true);
            cbb_addr_h_sns_11.setDisable(true);
            tf_ip_addr_sns_11.setText("");
            tf_ip_addr_sns_11.setDisable(true);
            tf_port_no_sns_11.setText("");
            tf_port_no_sns_11.setDisable(true);
            tf_sns_tag_11.setText("");
            tf_sns_tag_11.setDisable(true);

            rb_2d_sns_12.setSelected(false);
            rb_2d_sns_12.setDisable(true);
            cbb_manufacturer_sns_12.setDisable(true);
            tf_sns_alarm_cutoff_12.setDisable(true);
            tf_sns_alarm_cutoff_12.setText("");
            rb_3d_sns_12.setSelected(false);
            rb_3d_sns_12.setDisable(true);
            cbb_addr_v_sns_12.setDisable(true);
            cbb_addr_h_sns_12.setDisable(true);
            tf_ip_addr_sns_12.setText("");
            tf_ip_addr_sns_12.setDisable(true);
            tf_port_no_sns_12.setText("");
            tf_port_no_sns_12.setDisable(true);
            tf_sns_tag_12.setText("");
            tf_sns_tag_12.setDisable(true);

            rb_2d_sns_13.setSelected(false);
            rb_2d_sns_13.setDisable(true);
            cbb_manufacturer_sns_13.setDisable(true);
            tf_sns_alarm_cutoff_13.setDisable(true);
            tf_sns_alarm_cutoff_13.setText("");
            rb_3d_sns_13.setSelected(false);
            rb_3d_sns_13.setDisable(true);
            cbb_addr_v_sns_13.setDisable(true);
            cbb_addr_h_sns_13.setDisable(true);
            tf_ip_addr_sns_13.setText("");
            tf_ip_addr_sns_13.setDisable(true);
            tf_port_no_sns_13.setText("");
            tf_port_no_sns_13.setDisable(true);
            tf_sns_tag_13.setText("");
            tf_sns_tag_13.setDisable(true);

            rb_2d_sns_14.setSelected(false);
            rb_2d_sns_14.setDisable(true);
            cbb_manufacturer_sns_14.setDisable(true);
            tf_sns_alarm_cutoff_14.setDisable(true);
            tf_sns_alarm_cutoff_14.setText("");
            rb_3d_sns_14.setSelected(false);
            rb_3d_sns_14.setDisable(true);
            cbb_addr_v_sns_14.setDisable(true);
            cbb_addr_h_sns_14.setDisable(true);
            tf_ip_addr_sns_14.setText("");
            tf_ip_addr_sns_14.setDisable(true);
            tf_port_no_sns_14.setText("");
            tf_port_no_sns_14.setDisable(true);
            tf_sns_tag_14.setText("");
            tf_sns_tag_14.setDisable(true);

            rb_2d_sns_15.setSelected(false);
            rb_2d_sns_15.setDisable(true);
            cbb_manufacturer_sns_15.setDisable(true);
            tf_sns_alarm_cutoff_15.setDisable(true);
            tf_sns_alarm_cutoff_15.setText("");
            rb_3d_sns_15.setSelected(false);
            rb_3d_sns_15.setDisable(true);
            cbb_addr_v_sns_15.setDisable(true);
            cbb_addr_h_sns_15.setDisable(true);
            tf_ip_addr_sns_15.setText("");
            tf_ip_addr_sns_15.setDisable(true);
            tf_port_no_sns_15.setText("");
            tf_port_no_sns_15.setDisable(true);
            tf_sns_tag_15.setText("");
            tf_sns_tag_15.setDisable(true);

            rb_2d_sns_16.setSelected(false);
            rb_2d_sns_16.setDisable(true);
            cbb_manufacturer_sns_16.setDisable(true);
            tf_sns_alarm_cutoff_16.setDisable(true);
            tf_sns_alarm_cutoff_16.setText("");
            rb_3d_sns_16.setSelected(false);
            rb_3d_sns_16.setDisable(true);
            cbb_addr_v_sns_16.setDisable(true);
            cbb_addr_h_sns_16.setDisable(true);
            tf_ip_addr_sns_16.setText("");
            tf_ip_addr_sns_16.setDisable(true);
            tf_port_no_sns_16.setText("");
            tf_port_no_sns_16.setDisable(true);
            tf_sns_tag_16.setText("");
            tf_sns_tag_16.setDisable(true);

            rb_2d_sns_17.setSelected(false);
            rb_2d_sns_17.setDisable(true);
            cbb_manufacturer_sns_17.setDisable(true);
            tf_sns_alarm_cutoff_17.setDisable(true);
            tf_sns_alarm_cutoff_17.setText("");
            rb_3d_sns_17.setSelected(false);
            rb_3d_sns_17.setDisable(true);
            cbb_addr_v_sns_17.setDisable(true);
            cbb_addr_h_sns_17.setDisable(true);
            tf_ip_addr_sns_17.setText("");
            tf_ip_addr_sns_17.setDisable(true);
            tf_port_no_sns_17.setText("");
            tf_port_no_sns_17.setDisable(true);
            tf_sns_tag_17.setText("");
            tf_sns_tag_17.setDisable(true);

            rb_2d_sns_18.setSelected(false);
            rb_2d_sns_18.setDisable(true);
            cbb_manufacturer_sns_18.setDisable(true);
            tf_sns_alarm_cutoff_18.setDisable(true);
            tf_sns_alarm_cutoff_18.setText("");
            rb_3d_sns_18.setSelected(false);
            rb_3d_sns_18.setDisable(true);
            cbb_addr_v_sns_18.setDisable(true);
            cbb_addr_h_sns_18.setDisable(true);
            tf_ip_addr_sns_18.setText("");
            tf_ip_addr_sns_18.setDisable(true);
            tf_port_no_sns_18.setText("");
            tf_port_no_sns_18.setDisable(true);
            tf_sns_tag_18.setText("");
            tf_sns_tag_18.setDisable(true);

            rb_2d_sns_19.setSelected(false);
            rb_2d_sns_19.setDisable(true);
            cbb_manufacturer_sns_19.setDisable(true);
            tf_sns_alarm_cutoff_19.setDisable(true);
            tf_sns_alarm_cutoff_19.setText("");
            rb_3d_sns_19.setSelected(false);
            rb_3d_sns_19.setDisable(true);
            cbb_addr_v_sns_19.setDisable(true);
            cbb_addr_h_sns_19.setDisable(true);
            tf_ip_addr_sns_19.setText("");
            tf_ip_addr_sns_19.setDisable(true);
            tf_port_no_sns_19.setText("");
            tf_port_no_sns_19.setDisable(true);
            tf_sns_tag_19.setText("");
            tf_sns_tag_19.setDisable(true);

            rb_2d_sns_20.setSelected(false);
            rb_2d_sns_20.setDisable(true);
            cbb_manufacturer_sns_20.setDisable(true);
            tf_sns_alarm_cutoff_20.setDisable(true);
            tf_sns_alarm_cutoff_20.setText("");
            rb_3d_sns_20.setSelected(false);
            rb_3d_sns_20.setDisable(true);
            cbb_addr_v_sns_20.setDisable(true);
            cbb_addr_h_sns_20.setDisable(true);
            tf_ip_addr_sns_20.setText("");
            tf_ip_addr_sns_20.setDisable(true);
            tf_port_no_sns_20.setText("");
            tf_port_no_sns_20.setDisable(true);
            tf_sns_tag_20.setText("");
            tf_sns_tag_20.setDisable(true);

        } catch (Exception e) {
        }
    }

    private void set_data() {
        try {
            int sns = 0;
            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_1.setSelected(true);

                rb_2d_sns_1.setDisable(false);
                rb_3d_sns_1.setDisable(false);

                cbb_manufacturer_sns_1.setDisable(false);
                tf_sns_alarm_cutoff_1.setDisable(false);
                tf_ip_addr_sns_1.setDisable(false);
                tf_port_no_sns_1.setDisable(false);
                tf_sns_tag_1.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_1.setSelected(true);
                    cbb_addr_v_sns_1.setDisable(false);
                    cbb_addr_v_sns_1.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_1.setSelected(true);
                    cbb_addr_v_sns_1.setDisable(false);
                    cbb_addr_h_sns_1.setDisable(false);
                    cbb_addr_v_sns_1.getSelectionModel().select((Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_1.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_1.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_1.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_1.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_1.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_1.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_2.setSelected(true);

                rb_2d_sns_2.setDisable(false);
                rb_3d_sns_2.setDisable(false);

                cbb_manufacturer_sns_2.setDisable(false);
                tf_sns_alarm_cutoff_2.setDisable(false);
                tf_ip_addr_sns_2.setDisable(false);
                tf_port_no_sns_2.setDisable(false);
                tf_sns_tag_2.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_2.setSelected(true);
                    cbb_addr_v_sns_2.setDisable(false);
                    cbb_addr_v_sns_2.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_2.setSelected(true);
                    cbb_addr_v_sns_2.setDisable(false);
                    cbb_addr_h_sns_2.setDisable(false);
                    cbb_addr_v_sns_2.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_2.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_2.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_2.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_2.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_2.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_2.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_3.setSelected(true);

                rb_2d_sns_3.setDisable(false);
                rb_3d_sns_3.setDisable(false);

                cbb_manufacturer_sns_3.setDisable(false);
                tf_sns_alarm_cutoff_3.setDisable(false);
                tf_ip_addr_sns_3.setDisable(false);
                tf_port_no_sns_3.setDisable(false);
                tf_sns_tag_3.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_3.setSelected(true);
                    cbb_addr_v_sns_3.setDisable(false);
                    cbb_addr_v_sns_3.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_3.setSelected(true);
                    cbb_addr_v_sns_3.setDisable(false);
                    cbb_addr_h_sns_3.setDisable(false);
                    cbb_addr_v_sns_3.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_3.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_3.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_3.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_3.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_3.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_3.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_4.setSelected(true);

                rb_2d_sns_4.setDisable(false);
                rb_3d_sns_4.setDisable(false);

                cbb_manufacturer_sns_4.setDisable(false);
                tf_sns_alarm_cutoff_4.setDisable(false);
                tf_ip_addr_sns_4.setDisable(false);
                tf_port_no_sns_4.setDisable(false);
                tf_sns_tag_4.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_4.setSelected(true);
                    cbb_addr_v_sns_4.setDisable(false);
                    cbb_addr_v_sns_4.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_4.setSelected(true);
                    cbb_addr_v_sns_4.setDisable(false);
                    cbb_addr_h_sns_4.setDisable(false);
                    cbb_addr_v_sns_4.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_4.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_4.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_4.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_4.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_4.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_4.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_5.setSelected(true);

                rb_2d_sns_5.setDisable(false);
                rb_3d_sns_5.setDisable(false);

                cbb_manufacturer_sns_5.setDisable(false);
                tf_sns_alarm_cutoff_5.setDisable(false);
                tf_ip_addr_sns_5.setDisable(false);
                tf_port_no_sns_5.setDisable(false);
                tf_sns_tag_5.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_5.setSelected(true);
                    cbb_addr_v_sns_5.setDisable(false);
                    cbb_addr_v_sns_5.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_5.setSelected(true);
                    cbb_addr_v_sns_5.setDisable(false);
                    cbb_addr_h_sns_5.setDisable(false);
                    cbb_addr_v_sns_5.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_5.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_5.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_5.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_5.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_5.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_5.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_6.setSelected(true);

                rb_2d_sns_6.setDisable(false);
                rb_3d_sns_6.setDisable(false);

                cbb_manufacturer_sns_6.setDisable(false);
                tf_sns_alarm_cutoff_6.setDisable(false);
                tf_ip_addr_sns_6.setDisable(false);
                tf_port_no_sns_6.setDisable(false);
                tf_sns_tag_6.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_6.setSelected(true);
                    cbb_addr_v_sns_6.setDisable(false);
                    cbb_addr_v_sns_6.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_6.setSelected(true);
                    cbb_addr_v_sns_6.setDisable(false);
                    cbb_addr_h_sns_6.setDisable(false);
                    cbb_addr_v_sns_6.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_6.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_6.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_6.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_6.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_6.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_6.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_7.setSelected(true);

                rb_2d_sns_7.setDisable(false);
                rb_3d_sns_7.setDisable(false);

                cbb_manufacturer_sns_7.setDisable(false);
                tf_sns_alarm_cutoff_7.setDisable(false);
                tf_ip_addr_sns_7.setDisable(false);
                tf_port_no_sns_7.setDisable(false);
                tf_sns_tag_7.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_7.setSelected(true);
                    cbb_addr_v_sns_7.setDisable(false);
                    cbb_addr_v_sns_7.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_7.setSelected(true);
                    cbb_addr_v_sns_7.setDisable(false);
                    cbb_addr_h_sns_7.setDisable(false);
                    cbb_addr_v_sns_7.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_7.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_7.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_7.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_7.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_7.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_7.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_8.setSelected(true);

                rb_2d_sns_8.setDisable(false);
                rb_3d_sns_8.setDisable(false);

                cbb_manufacturer_sns_8.setDisable(false);
                tf_sns_alarm_cutoff_8.setDisable(false);
                tf_ip_addr_sns_8.setDisable(false);
                tf_port_no_sns_8.setDisable(false);
                tf_sns_tag_8.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_8.setSelected(true);
                    cbb_addr_v_sns_8.setDisable(false);
                    cbb_addr_v_sns_8.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_8.setSelected(true);
                    cbb_addr_v_sns_8.setDisable(false);
                    cbb_addr_h_sns_8.setDisable(false);
                    cbb_addr_v_sns_8.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_8.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_8.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_8.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_8.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_8.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_8.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_9.setSelected(true);

                rb_2d_sns_9.setDisable(false);
                rb_3d_sns_9.setDisable(false);

                cbb_manufacturer_sns_9.setDisable(false);
                tf_sns_alarm_cutoff_9.setDisable(false);
                tf_ip_addr_sns_9.setDisable(false);
                tf_port_no_sns_9.setDisable(false);
                tf_sns_tag_9.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_9.setSelected(true);
                    cbb_addr_v_sns_9.setDisable(false);
                    cbb_addr_v_sns_9.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_9.setSelected(true);
                    cbb_addr_v_sns_9.setDisable(false);
                    cbb_addr_h_sns_9.setDisable(false);
                    cbb_addr_v_sns_9.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_9.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_9.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_9.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_9.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_9.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_9.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_10.setSelected(true);

                rb_2d_sns_10.setDisable(false);
                rb_3d_sns_10.setDisable(false);

                cbb_manufacturer_sns_10.setDisable(false);
                tf_sns_alarm_cutoff_10.setDisable(false);
                tf_ip_addr_sns_10.setDisable(false);
                tf_port_no_sns_10.setDisable(false);
                tf_sns_tag_10.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_10.setSelected(true);
                    cbb_addr_v_sns_10.setDisable(false);
                    cbb_addr_v_sns_10.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_10.setSelected(true);
                    cbb_addr_v_sns_10.setDisable(false);
                    cbb_addr_h_sns_10.setDisable(false);
                    cbb_addr_v_sns_10.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_10.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_10.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_10.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_10.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_10.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_10.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_11.setSelected(true);

                rb_2d_sns_11.setDisable(false);
                rb_3d_sns_11.setDisable(false);

                cbb_manufacturer_sns_11.setDisable(false);
                tf_sns_alarm_cutoff_11.setDisable(false);
                tf_ip_addr_sns_11.setDisable(false);
                tf_port_no_sns_11.setDisable(false);
                tf_sns_tag_11.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_11.setSelected(true);
                    cbb_addr_v_sns_11.setDisable(false);
                    cbb_addr_v_sns_11.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_11.setSelected(true);
                    cbb_addr_v_sns_11.setDisable(false);
                    cbb_addr_h_sns_11.setDisable(false);
                    cbb_addr_v_sns_11.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_11.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_11.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_11.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_11.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_11.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_11.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_12.setSelected(true);

                rb_2d_sns_12.setDisable(false);
                rb_3d_sns_12.setDisable(false);

                cbb_manufacturer_sns_12.setDisable(false);
                tf_sns_alarm_cutoff_12.setDisable(false);
                tf_ip_addr_sns_12.setDisable(false);
                tf_port_no_sns_12.setDisable(false);
                tf_sns_tag_12.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_12.setSelected(true);
                    cbb_addr_v_sns_12.setDisable(false);
                    cbb_addr_v_sns_12.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_12.setSelected(true);
                    cbb_addr_v_sns_12.setDisable(false);
                    cbb_addr_h_sns_12.setDisable(false);
                    cbb_addr_v_sns_12.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_12.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_12.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_12.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_12.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_12.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_12.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_13.setSelected(true);

                rb_2d_sns_13.setDisable(false);
                rb_3d_sns_13.setDisable(false);

                cbb_manufacturer_sns_13.setDisable(false);
                tf_sns_alarm_cutoff_13.setDisable(false);
                tf_ip_addr_sns_13.setDisable(false);
                tf_port_no_sns_13.setDisable(false);
                tf_sns_tag_13.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_13.setSelected(true);
                    cbb_addr_v_sns_13.setDisable(false);
                    cbb_addr_v_sns_13.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_13.setSelected(true);
                    cbb_addr_v_sns_13.setDisable(false);
                    cbb_addr_h_sns_13.setDisable(false);
                    cbb_addr_v_sns_13.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_13.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_13.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_13.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_13.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_13.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_13.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_14.setSelected(true);

                rb_2d_sns_14.setDisable(false);
                rb_3d_sns_14.setDisable(false);

                cbb_manufacturer_sns_14.setDisable(false);
                tf_sns_alarm_cutoff_14.setDisable(false);
                tf_ip_addr_sns_14.setDisable(false);
                tf_port_no_sns_14.setDisable(false);
                tf_sns_tag_14.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_14.setSelected(true);
                    cbb_addr_v_sns_14.setDisable(false);
                    cbb_addr_v_sns_14.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_14.setSelected(true);
                    cbb_addr_v_sns_14.setDisable(false);
                    cbb_addr_h_sns_14.setDisable(false);
                    cbb_addr_v_sns_14.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_14.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_14.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_14.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_14.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_14.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_14.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_15.setSelected(true);

                rb_2d_sns_15.setDisable(false);
                rb_3d_sns_15.setDisable(false);

                cbb_manufacturer_sns_15.setDisable(false);
                tf_sns_alarm_cutoff_15.setDisable(false);
                tf_ip_addr_sns_15.setDisable(false);
                tf_port_no_sns_15.setDisable(false);
                tf_sns_tag_15.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_15.setSelected(true);
                    cbb_addr_v_sns_15.setDisable(false);
                    cbb_addr_v_sns_15.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_15.setSelected(true);
                    cbb_addr_v_sns_15.setDisable(false);
                    cbb_addr_h_sns_15.setDisable(false);
                    cbb_addr_v_sns_15.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_15.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_15.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_15.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_15.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_15.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_15.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_16.setSelected(true);

                rb_2d_sns_16.setDisable(false);
                rb_3d_sns_16.setDisable(false);

                cbb_manufacturer_sns_16.setDisable(false);
                tf_sns_alarm_cutoff_16.setDisable(false);
                tf_ip_addr_sns_16.setDisable(false);
                tf_port_no_sns_16.setDisable(false);
                tf_sns_tag_16.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_16.setSelected(true);
                    cbb_addr_v_sns_16.setDisable(false);
                    cbb_addr_v_sns_16.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_16.setSelected(true);
                    cbb_addr_v_sns_16.setDisable(false);
                    cbb_addr_h_sns_16.setDisable(false);
                    cbb_addr_v_sns_16.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_16.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_16.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_16.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_16.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_16.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_16.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_17.setSelected(true);

                rb_2d_sns_17.setDisable(false);
                rb_3d_sns_17.setDisable(false);

                cbb_manufacturer_sns_17.setDisable(false);
                tf_sns_alarm_cutoff_17.setDisable(false);
                tf_ip_addr_sns_17.setDisable(false);
                tf_port_no_sns_17.setDisable(false);
                tf_sns_tag_17.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_17.setSelected(true);
                    cbb_addr_v_sns_17.setDisable(false);
                    cbb_addr_v_sns_17.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_17.setSelected(true);
                    cbb_addr_v_sns_17.setDisable(false);
                    cbb_addr_h_sns_17.setDisable(false);
                    cbb_addr_v_sns_17.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_17.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_17.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_17.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_17.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_17.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_17.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_18.setSelected(true);

                rb_2d_sns_18.setDisable(false);
                rb_3d_sns_18.setDisable(false);

                cbb_manufacturer_sns_18.setDisable(false);
                tf_sns_alarm_cutoff_18.setDisable(false);
                tf_ip_addr_sns_18.setDisable(false);
                tf_port_no_sns_18.setDisable(false);
                tf_sns_tag_18.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_18.setSelected(true);
                    cbb_addr_v_sns_18.setDisable(false);
                    cbb_addr_v_sns_18.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_18.setSelected(true);
                    cbb_addr_v_sns_18.setDisable(false);
                    cbb_addr_h_sns_18.setDisable(false);
                    cbb_addr_v_sns_18.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_18.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_18.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_18.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_18.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_18.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_18.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_19.setSelected(true);

                rb_2d_sns_19.setDisable(false);
                rb_3d_sns_19.setDisable(false);

                cbb_manufacturer_sns_19.setDisable(false);
                tf_sns_alarm_cutoff_19.setDisable(false);
                tf_ip_addr_sns_19.setDisable(false);
                tf_port_no_sns_19.setDisable(false);
                tf_sns_tag_19.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_19.setSelected(true);
                    cbb_addr_v_sns_19.setDisable(false);
                    cbb_addr_v_sns_19.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_19.setSelected(true);
                    cbb_addr_v_sns_19.setDisable(false);
                    cbb_addr_h_sns_19.setDisable(false);
                    cbb_addr_v_sns_19.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_19.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_19.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_19.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_19.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_19.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_19.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }
            sns++;

            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED] != null && Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                cb_sns_20.setSelected(true);

                rb_2d_sns_20.setDisable(false);
                rb_3d_sns_20.setDisable(false);

                cbb_manufacturer_sns_20.setDisable(false);
                tf_sns_alarm_cutoff_20.setDisable(false);
                tf_ip_addr_sns_20.setDisable(false);
                tf_port_no_sns_20.setDisable(false);
                tf_sns_tag_20.setDisable(false);

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    rb_2d_sns_20.setSelected(true);
                    cbb_addr_v_sns_20.setDisable(false);
                    cbb_addr_v_sns_20.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                } else {
                    rb_3d_sns_20.setSelected(true);
                    cbb_addr_v_sns_20.setDisable(false);
                    cbb_addr_h_sns_20.setDisable(false);
                    cbb_addr_v_sns_20.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V]));
                    cbb_addr_h_sns_20.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H]));
                }
                cbb_manufacturer_sns_20.getSelectionModel().select(Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_MODEL]));
                tf_sns_alarm_cutoff_20.setText(Variable.sensor_details[sns][Constant.SENSOR_ALARM]);
                tf_ip_addr_sns_20.setText(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS]);
                tf_port_no_sns_20.setText(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER]);
                tf_sns_tag_20.setText(Variable.sensor_details[sns][Constant.SENSOR_TAG]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private boolean validate_sensor_data() {
        try {
            Variable.total_sensor = 0;

            if (cb_sns_1.isSelected()) {
                if (!rb_2d_sns_1.isSelected() && !rb_3d_sns_1.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_1.getSelectionModel().getSelectedIndex() == -1) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_1.isSelected() && (cbb_addr_h_sns_1.getSelectionModel().getSelectedIndex() == -1)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_1.isSelected() && cbb_addr_v_sns_1.getValue().toString().equals(cbb_addr_h_sns_1.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_1.getSelectionModel().getSelectedIndex() == -1) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_1.getText() == null || tf_sns_alarm_cutoff_1.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_1.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_1.getText() == null || tf_ip_addr_sns_1.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_1.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_1.getText() == null || tf_port_no_sns_1.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_1.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_1.getText() == null || tf_sns_tag_1.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 1 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_2.isSelected()) {
                if (!rb_2d_sns_2.isSelected() && !rb_3d_sns_2.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_2.getSelectionModel().getSelectedIndex() == -2) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_2.isSelected() && (cbb_addr_h_sns_2.getSelectionModel().getSelectedIndex() == -2)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_2.isSelected() && cbb_addr_v_sns_2.getValue().toString().equals(cbb_addr_h_sns_2.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_2.getSelectionModel().getSelectedIndex() == -2) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_2.getText() == null || tf_sns_alarm_cutoff_2.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_2.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_2.getText() == null || tf_ip_addr_sns_2.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_2.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_2.getText() == null || tf_port_no_sns_2.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_2.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_2.getText() == null || tf_sns_tag_2.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 2 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_3.isSelected()) {
                if (!rb_2d_sns_3.isSelected() && !rb_3d_sns_3.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_3.getSelectionModel().getSelectedIndex() == -3) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_3.isSelected() && (cbb_addr_h_sns_3.getSelectionModel().getSelectedIndex() == -3)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_3.isSelected() && cbb_addr_v_sns_3.getValue().toString().equals(cbb_addr_h_sns_3.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_3.getSelectionModel().getSelectedIndex() == -3) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_3.getText() == null || tf_sns_alarm_cutoff_3.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_3.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_3.getText() == null || tf_ip_addr_sns_3.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_3.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_3.getText() == null || tf_port_no_sns_3.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_3.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_3.getText() == null || tf_sns_tag_3.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 3 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_4.isSelected()) {
                if (!rb_2d_sns_4.isSelected() && !rb_3d_sns_4.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_4.getSelectionModel().getSelectedIndex() == -4) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_4.isSelected() && (cbb_addr_h_sns_4.getSelectionModel().getSelectedIndex() == -4)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_4.isSelected() && cbb_addr_v_sns_4.getValue().toString().equals(cbb_addr_h_sns_4.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_4.getSelectionModel().getSelectedIndex() == -4) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_4.getText() == null || tf_sns_alarm_cutoff_4.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_4.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_4.getText() == null || tf_ip_addr_sns_4.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_4.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_4.getText() == null || tf_port_no_sns_4.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_4.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_4.getText() == null || tf_sns_tag_4.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 4 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_5.isSelected()) {
                if (!rb_2d_sns_5.isSelected() && !rb_3d_sns_5.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_5.getSelectionModel().getSelectedIndex() == -5) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_5.isSelected() && (cbb_addr_h_sns_5.getSelectionModel().getSelectedIndex() == -5)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_5.isSelected() && cbb_addr_v_sns_5.getValue().toString().equals(cbb_addr_h_sns_5.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_5.getSelectionModel().getSelectedIndex() == -5) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_5.getText() == null || tf_sns_alarm_cutoff_5.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_5.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_5.getText() == null || tf_ip_addr_sns_5.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_5.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_5.getText() == null || tf_port_no_sns_5.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_5.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_5.getText() == null || tf_sns_tag_5.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 5 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_6.isSelected()) {
                if (!rb_2d_sns_6.isSelected() && !rb_3d_sns_6.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_6.getSelectionModel().getSelectedIndex() == -6) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_6.isSelected() && (cbb_addr_h_sns_6.getSelectionModel().getSelectedIndex() == -6)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_6.isSelected() && cbb_addr_v_sns_6.getValue().toString().equals(cbb_addr_h_sns_6.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_6.getSelectionModel().getSelectedIndex() == -6) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_6.getText() == null || tf_sns_alarm_cutoff_6.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_6.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_6.getText() == null || tf_ip_addr_sns_6.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_6.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_6.getText() == null || tf_port_no_sns_6.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_6.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_6.getText() == null || tf_sns_tag_6.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 6 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_7.isSelected()) {
                if (!rb_2d_sns_7.isSelected() && !rb_3d_sns_7.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_7.getSelectionModel().getSelectedIndex() == -7) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_7.isSelected() && (cbb_addr_h_sns_7.getSelectionModel().getSelectedIndex() == -7)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_7.isSelected() && cbb_addr_v_sns_7.getValue().toString().equals(cbb_addr_h_sns_7.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_7.getSelectionModel().getSelectedIndex() == -7) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_7.getText() == null || tf_sns_alarm_cutoff_7.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_7.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_7.getText() == null || tf_ip_addr_sns_7.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_7.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_7.getText() == null || tf_port_no_sns_7.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_7.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_7.getText() == null || tf_sns_tag_7.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 7 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_8.isSelected()) {
                if (!rb_2d_sns_8.isSelected() && !rb_3d_sns_8.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_8.getSelectionModel().getSelectedIndex() == -8) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_8.isSelected() && (cbb_addr_h_sns_8.getSelectionModel().getSelectedIndex() == -8)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_8.isSelected() && cbb_addr_v_sns_8.getValue().toString().equals(cbb_addr_h_sns_8.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_8.getSelectionModel().getSelectedIndex() == -8) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_8.getText() == null || tf_sns_alarm_cutoff_8.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_8.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_8.getText() == null || tf_ip_addr_sns_8.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_8.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_8.getText() == null || tf_port_no_sns_8.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_8.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_8.getText() == null || tf_sns_tag_8.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 8 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_9.isSelected()) {
                if (!rb_2d_sns_9.isSelected() && !rb_3d_sns_9.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_9.getSelectionModel().getSelectedIndex() == -9) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_9.isSelected() && (cbb_addr_h_sns_9.getSelectionModel().getSelectedIndex() == -9)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_9.isSelected() && cbb_addr_v_sns_9.getValue().toString().equals(cbb_addr_h_sns_9.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_9.getSelectionModel().getSelectedIndex() == -9) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_9.getText() == null || tf_sns_alarm_cutoff_9.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_9.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_9.getText() == null || tf_ip_addr_sns_9.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_9.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_9.getText() == null || tf_port_no_sns_9.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_9.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_9.getText() == null || tf_sns_tag_9.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 9 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_10.isSelected()) {
                if (!rb_2d_sns_10.isSelected() && !rb_3d_sns_10.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_10.getSelectionModel().getSelectedIndex() == -10) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_10.isSelected() && (cbb_addr_h_sns_10.getSelectionModel().getSelectedIndex() == -10)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_10.isSelected() && cbb_addr_v_sns_10.getValue().toString().equals(cbb_addr_h_sns_10.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_10.getSelectionModel().getSelectedIndex() == -10) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_10.getText() == null || tf_sns_alarm_cutoff_10.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_10.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_10.getText() == null || tf_ip_addr_sns_10.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_10.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_10.getText() == null || tf_port_no_sns_10.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_10.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_10.getText() == null || tf_sns_tag_10.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 10 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_11.isSelected()) {
                if (!rb_2d_sns_11.isSelected() && !rb_3d_sns_11.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_11.getSelectionModel().getSelectedIndex() == -11) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_11.isSelected() && (cbb_addr_h_sns_11.getSelectionModel().getSelectedIndex() == -11)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_11.isSelected() && cbb_addr_v_sns_11.getValue().toString().equals(cbb_addr_h_sns_11.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_11.getSelectionModel().getSelectedIndex() == -11) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_11.getText() == null || tf_sns_alarm_cutoff_11.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_11.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_11.getText() == null || tf_ip_addr_sns_11.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_11.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_11.getText() == null || tf_port_no_sns_11.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_11.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_11.getText() == null || tf_sns_tag_11.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 11 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_12.isSelected()) {
                if (!rb_2d_sns_12.isSelected() && !rb_3d_sns_12.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_12.getSelectionModel().getSelectedIndex() == -12) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_12.isSelected() && (cbb_addr_h_sns_12.getSelectionModel().getSelectedIndex() == -12)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_12.isSelected() && cbb_addr_v_sns_12.getValue().toString().equals(cbb_addr_h_sns_12.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_12.getSelectionModel().getSelectedIndex() == -12) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_12.getText() == null || tf_sns_alarm_cutoff_12.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_12.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_12.getText() == null || tf_ip_addr_sns_12.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_12.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_12.getText() == null || tf_port_no_sns_12.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_12.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_12.getText() == null || tf_sns_tag_12.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 12 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_13.isSelected()) {
                if (!rb_2d_sns_13.isSelected() && !rb_3d_sns_13.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_13.getSelectionModel().getSelectedIndex() == -13) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_13.isSelected() && (cbb_addr_h_sns_13.getSelectionModel().getSelectedIndex() == -13)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_13.isSelected() && cbb_addr_v_sns_13.getValue().toString().equals(cbb_addr_h_sns_13.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_13.getSelectionModel().getSelectedIndex() == -13) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_13.getText() == null || tf_sns_alarm_cutoff_13.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_13.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_13.getText() == null || tf_ip_addr_sns_13.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_13.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_13.getText() == null || tf_port_no_sns_13.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_13.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_13.getText() == null || tf_sns_tag_13.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 13 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_14.isSelected()) {
                if (!rb_2d_sns_14.isSelected() && !rb_3d_sns_14.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_14.getSelectionModel().getSelectedIndex() == -14) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_14.isSelected() && (cbb_addr_h_sns_14.getSelectionModel().getSelectedIndex() == -14)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_14.isSelected() && cbb_addr_v_sns_14.getValue().toString().equals(cbb_addr_h_sns_14.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_14.getSelectionModel().getSelectedIndex() == -14) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_14.getText() == null || tf_sns_alarm_cutoff_14.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_14.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_14.getText() == null || tf_ip_addr_sns_14.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_14.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_14.getText() == null || tf_port_no_sns_14.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_14.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_14.getText() == null || tf_sns_tag_14.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 14 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_15.isSelected()) {
                if (!rb_2d_sns_15.isSelected() && !rb_3d_sns_15.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_15.getSelectionModel().getSelectedIndex() == -15) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_15.isSelected() && (cbb_addr_h_sns_15.getSelectionModel().getSelectedIndex() == -15)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_15.isSelected() && cbb_addr_v_sns_15.getValue().toString().equals(cbb_addr_h_sns_15.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_15.getSelectionModel().getSelectedIndex() == -15) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_15.getText() == null || tf_sns_alarm_cutoff_15.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_15.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_15.getText() == null || tf_ip_addr_sns_15.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_15.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_15.getText() == null || tf_port_no_sns_15.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_15.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_15.getText() == null || tf_sns_tag_15.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 15 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_16.isSelected()) {
                if (!rb_2d_sns_16.isSelected() && !rb_3d_sns_16.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_16.getSelectionModel().getSelectedIndex() == -16) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_16.isSelected() && (cbb_addr_h_sns_16.getSelectionModel().getSelectedIndex() == -16)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_16.isSelected() && cbb_addr_v_sns_16.getValue().toString().equals(cbb_addr_h_sns_16.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_16.getSelectionModel().getSelectedIndex() == -16) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_16.getText() == null || tf_sns_alarm_cutoff_16.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_16.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_16.getText() == null || tf_ip_addr_sns_16.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_16.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_16.getText() == null || tf_port_no_sns_16.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_16.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_16.getText() == null || tf_sns_tag_16.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 16 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_17.isSelected()) {
                if (!rb_2d_sns_17.isSelected() && !rb_3d_sns_17.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_17.getSelectionModel().getSelectedIndex() == -17) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_17.isSelected() && (cbb_addr_h_sns_17.getSelectionModel().getSelectedIndex() == -17)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_17.isSelected() && cbb_addr_v_sns_17.getValue().toString().equals(cbb_addr_h_sns_17.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_17.getSelectionModel().getSelectedIndex() == -17) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_17.getText() == null || tf_sns_alarm_cutoff_17.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_17.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_17.getText() == null || tf_ip_addr_sns_17.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_17.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_17.getText() == null || tf_port_no_sns_17.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_17.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_17.getText() == null || tf_sns_tag_17.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 17 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_18.isSelected()) {
                if (!rb_2d_sns_18.isSelected() && !rb_3d_sns_18.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_18.getSelectionModel().getSelectedIndex() == -18) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_18.isSelected() && (cbb_addr_h_sns_18.getSelectionModel().getSelectedIndex() == -18)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_18.isSelected() && cbb_addr_v_sns_18.getValue().toString().equals(cbb_addr_h_sns_18.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_18.getSelectionModel().getSelectedIndex() == -18) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_18.getText() == null || tf_sns_alarm_cutoff_18.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_18.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_18.getText() == null || tf_ip_addr_sns_18.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_18.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_18.getText() == null || tf_port_no_sns_18.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_18.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_18.getText() == null || tf_sns_tag_18.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 18 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_19.isSelected()) {
                if (!rb_2d_sns_19.isSelected() && !rb_3d_sns_19.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_19.getSelectionModel().getSelectedIndex() == -19) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_19.isSelected() && (cbb_addr_h_sns_19.getSelectionModel().getSelectedIndex() == -19)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_19.isSelected() && cbb_addr_v_sns_19.getValue().toString().equals(cbb_addr_h_sns_19.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_19.getSelectionModel().getSelectedIndex() == -19) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_19.getText() == null || tf_sns_alarm_cutoff_19.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_19.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_19.getText() == null || tf_ip_addr_sns_19.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_19.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_19.getText() == null || tf_port_no_sns_19.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_19.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_19.getText() == null || tf_sns_tag_19.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 19 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

            if (cb_sns_20.isSelected()) {
                if (!rb_2d_sns_20.isSelected() && !rb_3d_sns_20.isSelected()) {
                    objCall_Dialog.showDialogWithoutThread("Please select Type for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_addr_v_sns_20.getSelectionModel().getSelectedIndex() == -20) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address V for Sensor Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_20.isSelected() && (cbb_addr_h_sns_20.getSelectionModel().getSelectedIndex() == -20)) {
                    objCall_Dialog.showDialogWithoutThread("Please select Address H for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (rb_3d_sns_20.isSelected() && cbb_addr_v_sns_20.getValue().toString().equals(cbb_addr_h_sns_20.getValue().toString())) {
                    objCall_Dialog.showDialogWithoutThread(" Address can't be same for V and H for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (cbb_manufacturer_sns_20.getSelectionModel().getSelectedIndex() == -20) {
                    objCall_Dialog.showDialogWithoutThread("Please select Model for Sensor Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_sns_alarm_cutoff_20.getText() == null || tf_sns_alarm_cutoff_20.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Alarm Cutoff can't be empty for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Float.parseFloat(tf_sns_alarm_cutoff_20.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Alarm Cutoff value for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_ip_addr_sns_20.getText() == null || tf_ip_addr_sns_20.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("IP Address can't be empty for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_ip_addr_sns_20.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_port_no_sns_20.getText() == null || tf_port_no_sns_20.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port can't be empty for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_port_no_sns_20.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
                if (tf_sns_tag_20.getText() == null || tf_sns_tag_20.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Sensor Tag can't be empty for Seq No. 20 !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                Variable.total_sensor++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            objCall_Dialog.showDialogWithoutThread("Exception occurred !!", "", "OK", "", Constant.DIALOG_BLUE);
            return false;
        }
        return true;
    }

    private void save_sensor_data() {
        try {
            int sns = 0;

            if (cb_sns_1.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_1.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_1.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_1.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_1.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_1.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_1.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_1.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_1.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_2.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_2.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_2.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_2.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_2.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_2.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_2.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_2.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_2.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_3.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_3.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_3.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_3.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_3.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_3.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_3.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_3.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_3.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_4.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_4.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_4.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_4.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_4.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_4.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_4.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_4.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_4.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_5.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_5.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_5.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_5.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_5.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_5.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_5.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_5.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_5.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_6.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_6.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_6.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_6.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_6.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_6.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_6.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_6.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_6.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_7.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_7.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_7.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_7.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_7.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_7.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_7.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_7.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_7.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_8.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_8.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_8.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_8.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_8.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_8.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_8.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_8.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_8.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_9.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_9.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_9.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_9.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_9.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_9.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_9.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_9.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_9.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_10.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_10.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_10.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_10.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_10.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_10.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_10.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_10.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_10.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_11.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_11.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_11.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_11.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_11.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_11.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_11.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_11.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_11.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_12.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_12.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_12.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_12.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_12.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_12.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_12.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_12.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_12.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_13.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_13.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_13.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_13.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_13.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_13.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_13.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_13.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_13.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_14.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_14.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_14.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_14.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_14.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_14.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_14.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_14.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_14.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_15.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_15.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_15.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_15.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_15.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_15.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_15.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_15.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_15.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_16.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_16.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_16.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_16.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_16.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_16.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_16.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_16.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_16.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_17.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_17.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_17.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_17.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_17.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_17.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_17.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_17.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_17.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_18.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_18.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_18.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_18.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_18.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_18.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_18.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_18.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_18.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_19.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_19.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_19.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_19.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_19.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_19.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_19.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_19.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_19.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;

            if (cb_sns_20.isSelected()) {
                try {
                    Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "1";
                    Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = "" + rb_2d_sns_20.isSelected();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = "" + cbb_addr_v_sns_20.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = "" + cbb_addr_h_sns_20.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_MODEL] = "" + cbb_manufacturer_sns_20.getSelectionModel().getSelectedIndex();
                    Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tf_sns_alarm_cutoff_20.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tf_ip_addr_sns_20.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tf_port_no_sns_20.getText().trim();
                    Variable.sensor_details[sns][Constant.SENSOR_TAG] = tf_sns_tag_20.getText().trim();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = "0";
            }
            sns++;
        } catch (Exception e) {
        }
    }

}
