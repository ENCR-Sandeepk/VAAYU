/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import com.jfoenix.controls.JFXButton;
import comm.Client_1;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import tool.Call_Dialog;
import tool.Constant;
import tool.File_Operation;
import tool.Tool;
import tool.Validate_IP_Address;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class System_Coniguration_Controller implements Initializable {

    Call_Dialog objCall_Dialog = new Call_Dialog();
    String reply = "";
    int sns_count = 0;
    int i = 0;

    @FXML
    private TextField tf_ftp_url;
    @FXML
    private TextField tf_ftp_port;
    @FXML
    private TextField tf_ftp_user;
    @FXML
    private PasswordField pf_ftp_password;
    @FXML
    private JFXButton btn_edit_ftp;
    @FXML
    private CheckBox cb_upload_enable;
    @FXML
    private TextField tf_system_id;
    @FXML
    private CheckBox cb_auto_start_app;
    @FXML
    private TextField tf_storage_location;
    @FXML
    private ComboBox cbb_file_upload_action;
    @FXML
    private ComboBox cbb_wind_speed_unit;
    @FXML
    private ComboBox cbb_file_size;
    @FXML
    private CheckBox cb_include_u_v_and_w;
    @FXML
    private TextField tf_w;
    @FXML
    private TextField tf_v;
    @FXML
    private TextField tf_u;
    @FXML
    private JFXButton btn_edit_system_setup;
    @FXML
    private Label lbl_1;
    @FXML
    private Label lbl_2;
    @FXML
    private ComboBox cbb_existing_address;
    @FXML
    private ComboBox cbb_new_address;
    @FXML
    private ComboBox cbb_read_sns_value_address;
    @FXML
    private TextField tf_wind_direction;
    @FXML
    private Label lbl_3;
    @FXML
    private TextField tf_wind_speed;
    @FXML
    private JFXButton btn_cancel_edit_ftp;
    @FXML
    private JFXButton btn_cancel_edit_system_setup;
    @FXML
    private JFXButton btn_edit_alarm_setting;
    @FXML
    private JFXButton btn_cancel_edit_alarm_setting;
    @FXML
    private ImageView iv_browse_storage_location;
    @FXML
    private CheckBox cb_flash_alarm;
    @FXML
    private CheckBox cb_sound_beep;
    @FXML
    private CheckBox cb_control_potential_free_contact;
    @FXML
    private TextField tf_relay_ip;
    @FXML
    private TextField tf_relay_port;
    @FXML
    private TextField tf_as_ip;
    @FXML
    private TextField tf_as_port;
    @FXML
    private Label lbl_relay_ip;
    @FXML
    private Label lbl_relay_port;
    @FXML
    private ComboBox cbb_advanced_setting_model;
    @FXML
    private ComboBox cbb_alarm_value_count;
    @FXML
    private CheckBox cb_toggle_wind_speed;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Ftp Settings
        btn_edit_ftp.setText("Edit");
        btn_cancel_edit_ftp.setVisible(false);
        disable_ftp_settings(true);
        try {
            tf_ftp_url.setText(Variable.ftp_url);
            tf_ftp_port.setText(Variable.ftp_port);
            tf_ftp_user.setText(Variable.ftp_user);
            pf_ftp_password.setText(Variable.ftp_password);
            cb_upload_enable.setSelected(Variable.ftp_upload_enable);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // System Settings
        btn_edit_system_setup.setText("Edit");
        btn_cancel_edit_system_setup.setVisible(false);
        disable_system_setup(true);
        tf_system_id.setText("" + Variable.system_id);
        try {
            cbb_file_upload_action.getItems().add("Archive");
            cbb_file_upload_action.getItems().add("Delete");
            cbb_file_upload_action.setValue("" + Variable.file_upload_action);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cbb_alarm_value_count.getItems().add("2");
            cbb_alarm_value_count.getItems().add("3");
            cbb_alarm_value_count.getItems().add("4");
            cbb_alarm_value_count.getItems().add("5");
            cbb_alarm_value_count.getItems().add("6");
            cbb_alarm_value_count.getItems().add("7");
            cbb_alarm_value_count.getItems().add("8");
            cbb_alarm_value_count.getItems().add("9");
            cbb_alarm_value_count.getItems().add("10");
            cbb_alarm_value_count.getItems().add("15");
            cbb_alarm_value_count.getItems().add("20");
            cbb_alarm_value_count.getItems().add("25");
            cbb_alarm_value_count.getItems().add("30");
            cbb_alarm_value_count.getItems().add("40");
            cbb_alarm_value_count.getItems().add("50");
            cbb_alarm_value_count.getItems().add("60");
            cbb_alarm_value_count.getItems().add("70");
            cbb_alarm_value_count.getItems().add("80");
            cbb_alarm_value_count.getItems().add("90");
            cbb_alarm_value_count.getItems().add("100");
            cbb_alarm_value_count.getItems().add("110");
            cbb_alarm_value_count.getItems().add("120");
            cbb_alarm_value_count.getItems().add("150");
            cbb_alarm_value_count.getItems().add("180");
            cbb_alarm_value_count.getItems().add("210");
            cbb_alarm_value_count.getItems().add("240");
            cbb_alarm_value_count.getItems().add("300");
            cbb_alarm_value_count.getItems().add("360");
            cbb_alarm_value_count.getItems().add("420");
            cbb_alarm_value_count.getItems().add("480");
            cbb_alarm_value_count.getItems().add("540");
            cbb_alarm_value_count.getItems().add("600");
            cbb_alarm_value_count.setValue("" + Variable.alarmValueAverageCount);
        } catch (Exception e) {
        }

        try {
            cbb_wind_speed_unit.getItems().add("m/s");
            cbb_wind_speed_unit.getItems().add("km/hr");
            cbb_wind_speed_unit.setValue(Variable.wind_speed_unit.trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            cbb_file_size.getItems().add("1 Record per File");
            cbb_file_size.getItems().add("5 Minute Record per File");
            cbb_file_size.setValue(Variable.file_size.trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
        tf_storage_location.setText("" + Variable.storage_location);
        cb_include_u_v_and_w.setSelected(Variable.report_u_v_w_component);
        tf_u.setText(Variable.u);
        tf_v.setText(Variable.v);
        tf_w.setText(Variable.w);
        cb_auto_start_app.setSelected(Variable.auto_start_app);
        cb_toggle_wind_speed.setSelected(Variable.toggle_wind_speed);

        // Alarm Settings
        btn_edit_alarm_setting.setText("Edit");
        btn_cancel_edit_alarm_setting.setVisible(false);
        disable_alarm_settings(true);

        cb_flash_alarm.setSelected(Variable.flash_alarm_enabled);
        cb_sound_beep.setSelected(Variable.sound_alarm_enabled);

        if (Variable.control_potential_free_contact_enabled) {
            cb_control_potential_free_contact.setSelected(true);
            lbl_relay_ip.setVisible(true);
            tf_relay_ip.setVisible(true);
            lbl_relay_port.setVisible(true);
            tf_relay_port.setVisible(true);

            tf_relay_ip.setText(Variable.realy_ip);
            tf_relay_port.setText(Variable.realy_port);
        } else {
            cb_control_potential_free_contact.setSelected(false);
            lbl_relay_ip.setVisible(false);
            tf_relay_ip.setVisible(false);
            lbl_relay_port.setVisible(false);
            tf_relay_port.setVisible(false);
        }

        try {
            cbb_advanced_setting_model.getItems().add("FWS");
            cbb_advanced_setting_model.getItems().add("ZWS");
            cbb_advanced_setting_model.setValue("FWS");
        } catch (Exception e) {
            e.printStackTrace();
        }

        setValueInCombobox();
    }

    @FXML
    private void action_edit_ftp(ActionEvent event) {
        if (Variable.scan_status) {
            objCall_Dialog.showDialogWithoutThread("Please stop scan first !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else if (Variable.scan_running) {
            objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else {
            if (btn_edit_ftp.getText().equals("Edit")) {
                btn_edit_ftp.setText("Save");
                btn_cancel_edit_ftp.setVisible(true);
                disable_ftp_settings(false);
            } else {
                if (validate_ftp()) {
                    try {
                        Variable.ftp_url = tf_ftp_url.getText().trim();
                        Variable.ftp_port = tf_ftp_port.getText().trim();
                        Variable.ftp_user = tf_ftp_user.getText().trim();
                        Variable.ftp_password = pf_ftp_password.getText().trim();
                        Variable.ftp_upload_enable = cb_upload_enable.isSelected();
                        File_Operation.create_modify_system_setup();
                        File_Operation.read_system_setup();
                        btn_edit_ftp.setText("Edit");
                        btn_cancel_edit_ftp.setVisible(false);
                        disable_ftp_settings(true);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    @FXML
    private void btn_cancel_edit_ftp(ActionEvent event) {
        btn_edit_ftp.setText("Edit");
        btn_cancel_edit_ftp.setVisible(false);
        disable_ftp_settings(true);
    }

    @FXML
    private void action_btn_edit_system_setup(ActionEvent event) {
        if (Variable.scan_status) {
            objCall_Dialog.showDialogWithoutThread("Please stop scan first !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else if (Variable.scan_running) {
            objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else {
            if (btn_edit_system_setup.getText().equals("Edit")) {
                btn_edit_system_setup.setText("Save");
                btn_cancel_edit_system_setup.setVisible(true);
                disable_system_setup(false);
            } else {

                if (validate_system_setup()) {
                    try {
                        Variable.system_id = tf_system_id.getText().trim();
                        Variable.file_upload_action = cbb_file_upload_action.getValue().toString().trim();
                        Variable.wind_speed_unit = cbb_wind_speed_unit.getValue().toString().trim();
                        Variable.file_size = cbb_file_size.getValue().toString().trim();
                        Variable.storage_location = tf_storage_location.getText().trim();
                        Variable.report_u_v_w_component = cb_include_u_v_and_w.isSelected();
                        if (Variable.report_u_v_w_component) {
                            Variable.u = tf_u.getText().trim();
                            Variable.v = tf_v.getText().trim();
                            Variable.w = tf_w.getText().trim();
                        }
                        Variable.auto_start_app = cb_auto_start_app.isSelected();
                        Variable.toggle_wind_speed = cb_toggle_wind_speed.isSelected();

                        File_Operation.create_modify_system_setup();
                        File_Operation.read_system_setup();
                        btn_edit_system_setup.setText("Edit");
                        btn_cancel_edit_system_setup.setVisible(false);
                        disable_system_setup(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    @FXML
    private void action_btn_cancel_edit_system_setup(ActionEvent event) {
        btn_edit_system_setup.setText("Edit");
        btn_cancel_edit_system_setup.setVisible(false);
        disable_system_setup(true);
        btn_edit_system_setup.requestFocus();
        event.consume();
    }

    @FXML
    private void action_btn_edit_alarm_setting(ActionEvent event) {
        if (Variable.scan_status) {
            objCall_Dialog.showDialogWithoutThread("Please stop scan first !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else if (Variable.scan_running) {
            objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else {
            if (btn_edit_alarm_setting.getText().equals("Edit")) {
                btn_edit_alarm_setting.setText("Save");
                btn_cancel_edit_alarm_setting.setVisible(true);
                disable_alarm_settings(false);
            } else {

                if (validate_alarm_settings()) {
                    try {
                        Variable.flash_alarm_enabled = cb_flash_alarm.isSelected();
                        Variable.sound_alarm_enabled = cb_sound_beep.isSelected();
                        Variable.control_potential_free_contact_enabled = cb_control_potential_free_contact.isSelected();

                        Variable.alarmValueAverageCount = Integer.parseInt(cbb_alarm_value_count.getValue().toString().trim());

                        if (Variable.control_potential_free_contact_enabled) {
                            Variable.realy_ip = tf_relay_ip.getText().trim();
                            Variable.realy_port = tf_relay_port.getText().trim();
                        }

                        File_Operation.create_modify_system_setup();
                        File_Operation.read_system_setup();
                        btn_edit_alarm_setting.setText("Edit");
                        btn_cancel_edit_alarm_setting.setVisible(false);
                        disable_alarm_settings(true);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    @FXML
    private void action_btn_cancel_edit_alarm_setting(ActionEvent event) {
        btn_edit_alarm_setting.setText("Edit");
        btn_cancel_edit_alarm_setting.setVisible(false);
        disable_alarm_settings(true);
        btn_edit_alarm_setting.requestFocus();
        event.consume();
    }

    @FXML
    private void action_iv_browse_storage_location(MouseEvent event) {
        objCall_Dialog.showSelectConfigFilePathDialog();
        Tool.readConfigFile();
        tf_storage_location.setText("" + Variable.storage_location);
    }

    @FXML
    private void action_cb_control_potential_free_contact(ActionEvent event) {

        if (cb_control_potential_free_contact.isSelected()) {
            lbl_relay_ip.setVisible(true);
            tf_relay_ip.setVisible(true);
            lbl_relay_port.setVisible(true);
            tf_relay_port.setVisible(true);
        } else {
            lbl_relay_ip.setVisible(false);
            tf_relay_ip.setVisible(false);
            lbl_relay_port.setVisible(false);
            tf_relay_port.setVisible(false);
        }

    }

    @FXML
    private void action_search_sensor(ActionEvent event) {

        lbl_1.setText("");
        lbl_2.setText("");
        lbl_3.setText("");

        if (validate_ip_port_advance_settings()) {
            reply = "";
            if (Variable.scan_status) {
                objCall_Dialog.showDialogWithoutThread("Please stop scan first !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else if (Variable.scan_running) {
                objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else {
                try {
                    if (make_connection()) {

                        Variable.progressBarRunning = true;
                        Variable.counter = 0;
                        Variable.prograssBarSteps = 100.0f / 5.0f;
                        Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                        Variable.counter++;

                        new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.currentThread().setName("Read Sensor");
                                    Thread.sleep(1500);
                                    Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                                    Variable.counter++;

                                    for (int j = 0; j < 10; j++) {
                                        Client_1.send_command(j + "R0");
                                        Client_1.waitforReply();
                                        try {
                                            Thread.sleep(500);
                                        } catch (Exception e) {
                                        }
                                    }

                                    for (char j = 'A'; j <= 'Z'; j++) {
                                        Client_1.send_command(j + "R0");
                                        Client_1.waitforReply();
                                        try {
                                            Thread.sleep(500);
                                        } catch (Exception e) {
                                        }
                                    }

                                    for (char j = 'a'; j <= 'z'; j++) {
                                        Client_1.send_command(j + "R0");
                                        Client_1.waitforReply();
                                        try {
                                            Thread.sleep(500);
                                        } catch (Exception e) {
                                        }
                                    }

                                    sns_count = 0;
                                    i = 0;
                                    for (; i <= 2;) {
                                        try {
                                            Client_1.send_command(i + "R0");
                                            Client_1.waitforReply();
                                            String sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_1.trim());
                                            try {
                                                Platform.runLater(() -> {
                                                    if (sensor_data.trim().length() > 0) {

                                                        switch (sns_count) {
                                                            case 0:
                                                                lbl_1.setText("" + i);
                                                                break;
                                                            case 1:
                                                                lbl_2.setText("" + i);
                                                                break;
                                                            case 2:
                                                                lbl_3.setText("" + i);
                                                                break;
                                                        }

                                                        sns_count++;
                                                    }
                                                });
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            Thread.sleep(500);
                                        } catch (Exception e) {
                                        }
                                        Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                                        Variable.counter++;
                                        i++;
                                    }

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                Variable.progressBarRunning = false;

                                try {
                                    Thread.interrupted();
                                    Thread.interrupted();
                                } catch (Exception e) {
                                }
                            }
                        }.start();
                        new Call_Dialog().show_progress_bar("Seraching Sensors ...");
                    }

                    disconnect();

                } catch (Exception e) {
                }
            }
        }
    }

    @FXML
    private void action_change_address(ActionEvent event) {
        if (validate_ip_port_advance_settings()) {
            reply = "";
            if (Variable.scan_status) {
                objCall_Dialog.showDialogWithoutThread("Please stop scan first !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else if (Variable.scan_running) {
                objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else {
                try {
                    if (cbb_existing_address.getValue().toString().equals("Address")) {
                        objCall_Dialog.showDialogWithoutThread("Please select Existing Address ", "", "OK", "", Constant.DIALOG_BLUE);
                    } else if (cbb_new_address.getValue().toString().equals("Address")) {
                        objCall_Dialog.showDialogWithoutThread("Please select New Address", "", "OK", "", Constant.DIALOG_BLUE);
                    } else if (cbb_new_address.getValue().toString().equals(cbb_existing_address.getValue().toString())) {
                        objCall_Dialog.showDialogWithoutThread("Existing Address and New Address are same", "", "OK", "", Constant.DIALOG_BLUE);
                    } else {
                        try {
                            if (make_connection()) {

                                Variable.progressBarRunning = true;
                                Variable.counter = 0;
                                Variable.prograssBarSteps = 100.0f / 2.0f;
                                Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                                Variable.counter++;

                                new Thread() {
                                    @Override
                                    public void run() {
                                        try {
                                            Thread.currentThread().setName("Change Address");
                                            Thread.sleep(500);
                                            Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                                            Variable.counter++;
                                            String existing_address = cbb_existing_address.getValue().toString();
                                            String new_address = cbb_new_address.getValue().toString();

                                            Client_1.send_command(existing_address + "XU,A=" + new_address + ",M=P,T=1,C=2,I=0060,B=019200,D=8,P=N,S=1,L=00000");
                                            Thread.sleep(1000);

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        Variable.progressBarRunning = false;

                                        try {
                                            Thread.interrupted();
                                            Thread.interrupted();
                                        } catch (Exception e) {
                                        }
                                    }
                                }.start();
                                new Call_Dialog().show_progress_bar("Changing sensor address ...");

                                Variable.progressBarRunning = false;
                                objCall_Dialog.showDialogWithoutThread("Please power cycle the sensor !! Its mandatory", "", "OK", "", Constant.DIALOG_BLUE);
                                objCall_Dialog.showDialogWithoutThread("To verify the address please read the sensor !!", "", "OK", "", Constant.DIALOG_BLUE);
                            }
                        } catch (Exception e) {
                        }
                        disconnect();
                    }
                } catch (Exception e) {
                }
            }
        }

    }

    @FXML
    private void action_read_sensor(ActionEvent event) {
        if (validate_ip_port_advance_settings()) {
            reply = "";
            if (Variable.scan_status) {
                objCall_Dialog.showDialogWithoutThread("Please stop scan first !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else if (Variable.scan_running) {
                objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
            } else {
                try {
                    if (cbb_read_sns_value_address.getValue().toString().equals("Address")) {
                        objCall_Dialog.showDialogWithoutThread("Please select Sensor Address ", "", "OK", "", Constant.DIALOG_BLUE);
                    } else {
                        try {
                            if (make_connection()) {

                                Variable.progressBarRunning = true;
                                Variable.counter = 0;
                                Variable.prograssBarSteps = 100.0f / 2.0f;
                                Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                                Variable.counter++;

                                new Thread() {
                                    @Override
                                    public void run() {
                                        try {
                                            Thread.currentThread().setName("Read Sensor");
                                            Thread.sleep(1500);
                                            Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
                                            Variable.counter++;
                                            String address = cbb_read_sns_value_address.getValue().toString();

                                            Client_1.send_command(address + "R0");
                                            Client_1.waitforReply();
                                            String sensor_data[] = Tool.extract_wind_speed_and_direction(Variable.reply_1.trim()).split(",");
                                            try {
                                                Platform.runLater(() -> {
                                                    try {
                                                        tf_wind_speed.setText(sensor_data[0]);
                                                        tf_wind_direction.setText(sensor_data[1] + "° N");
                                                    } catch (Exception e) {
                                                    }

                                                });
                                            } catch (Exception e) {

                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        Variable.progressBarRunning = false;

                                        try {
                                            Thread.interrupted();
                                            Thread.interrupted();
                                        } catch (Exception e) {
                                        }
                                    }
                                }.start();
                                new Call_Dialog().show_progress_bar("Reading Sensor value ...");
                            }
                        } catch (Exception e) {
                        }
                        disconnect();
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    private boolean make_connection() {
        try {
            Client_1.start_server(tf_as_ip.getText().trim(),
                    Integer.parseInt(tf_as_port.getText().trim()));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
            objCall_Dialog.showDialogWithoutThread("Unable to connect !! Please recheck", "", "OK", "", Constant.DIALOG_BLUE);
            return false;
        }
        return true;
    }

    private void disconnect() {
        try {
            Client_1.close_connection();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setValueInCombobox() {
        try {
            cbb_existing_address.getItems().add("Address");
            cbb_new_address.getItems().add("Address");
            cbb_read_sns_value_address.getItems().add("Address");

            for (int i = 0; i <= 2; i++) {
                cbb_existing_address.getItems().add("" + i);
                cbb_new_address.getItems().add("" + i);
                cbb_read_sns_value_address.getItems().add("" + i);
            }

            cbb_existing_address.setValue("Address");
            cbb_new_address.setValue("Address");
            cbb_read_sns_value_address.setValue("Address");
        } catch (Exception e) {
        }
    }

    private void disable_ftp_settings(boolean value) {
        try {
            tf_ftp_url.setDisable(value);
            tf_ftp_port.setDisable(value);
            tf_ftp_user.setDisable(value);
            pf_ftp_password.setDisable(value);
            cb_upload_enable.setDisable(value);
        } catch (Exception e) {

        }
    }

    private void disable_system_setup(boolean value) {
        try {
            tf_system_id.setDisable(value);
            cbb_file_upload_action.setDisable(value);
            cbb_wind_speed_unit.setDisable(value);
            cbb_file_size.setDisable(value);
            tf_storage_location.setDisable(value);
            iv_browse_storage_location.setDisable(value);
            cb_include_u_v_and_w.setDisable(value);
            tf_u.setDisable(value);
            tf_v.setDisable(value);
            tf_w.setDisable(value);
            cb_auto_start_app.setDisable(value);
            cb_toggle_wind_speed.setDisable(value);
        } catch (Exception e) {
        }
    }

    private void disable_alarm_settings(boolean value) {
        try {
            cb_flash_alarm.setDisable(value);
            cb_sound_beep.setDisable(value);
            cb_control_potential_free_contact.setDisable(value);
            tf_relay_ip.setDisable(value);
            tf_relay_port.setDisable(value);
            cbb_alarm_value_count.setDisable(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean validate_ip_port_advance_settings() {
        try {
            if (tf_as_ip.getText() == null || tf_as_ip.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("IP Address can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            } else if (Validate_IP_Address.isValid(tf_as_ip.getText().trim()) == 0) {
                objCall_Dialog.showDialogWithoutThread("Please enter a valid IP Address !", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            }
            if (tf_as_port.getText() == null || tf_as_port.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("Port Number can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            } else {
                try {
                    Integer.parseInt(tf_as_port.getText());
                } catch (Exception e) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid Port Number !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean validate_ftp() {
        try {
            if (tf_ftp_url.getText() == null || tf_ftp_url.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("FTP URL can't be empty !!", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            } else if (Validate_IP_Address.isValid(tf_ftp_url.getText().trim()) == 0) {
                objCall_Dialog.showDialogWithoutThread("Please enter a valid FTP URL !", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            }

            if (tf_ftp_port.getText() == null || tf_ftp_port.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("FTP Port can't be empty !!", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            } else {
                try {
                    Integer.parseInt(tf_ftp_port.getText().trim());
                } catch (Exception e) {
                    objCall_Dialog.showDialogWithoutThread("FTP Port should be integer number !!", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
            }
            if (tf_ftp_user.getText() == null || tf_ftp_user.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("FTP User can't be empty !!", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            }
            if (pf_ftp_password.getText() == null || pf_ftp_password.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("FTP Password can't be empty !!", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            objCall_Dialog.showDialogWithoutThread("Exception occurred !!", "", "OK", "", Constant.DIALOG_BLUE);
            return false;
        }
        return true;
    }

    private boolean validate_system_setup() {
        try {
            if (tf_system_id.getText() == null || tf_system_id.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("System ID can't be empty !!", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            }
            if (tf_storage_location.getText() == null || tf_storage_location.getText().trim().isEmpty()) {
                objCall_Dialog.showDialogWithoutThread("Storage Location can't be empty !!", "", "OK", "", Constant.DIALOG_BLUE);
                return false;
            }
            if (cb_include_u_v_and_w.isSelected()) {
                if (tf_u.getText() == null || tf_u.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Direction Tag for \"U\" can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_v.getText() == null || tf_v.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Direction Tag for \"V\" can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_w.getText() == null || tf_w.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Direction Tag for \"W\" can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            objCall_Dialog.showDialogWithoutThread("Exception occurred !!", "", "OK", "", Constant.DIALOG_BLUE);
            return false;
        }
        return true;
    }

    private boolean validate_alarm_settings() {
        try {
            if (cb_control_potential_free_contact.isSelected()) {
                if (tf_relay_ip.getText() == null || tf_relay_ip.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Relay IP Address can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else if (Validate_IP_Address.isValid(tf_relay_ip.getText().trim()) == 0) {
                    objCall_Dialog.showDialogWithoutThread("Please enter a valid Relay IP Address !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                }
                if (tf_relay_port.getText() == null || tf_relay_port.getText().trim().isEmpty()) {
                    objCall_Dialog.showDialogWithoutThread("Port Number can't be empty !", "", "OK", "", Constant.DIALOG_BLUE);
                    return false;
                } else {
                    try {
                        Integer.parseInt(tf_relay_port.getText());
                    } catch (Exception e) {
                        objCall_Dialog.showDialogWithoutThread("Please enter a valid Port Number !", "", "OK", "", Constant.DIALOG_BLUE);
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            objCall_Dialog.showDialogWithoutThread("Exception occurred !!", "", "OK", "", Constant.DIALOG_BLUE);
            return false;
        }
        return true;
    }

}
