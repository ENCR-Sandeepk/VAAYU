/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pdf.Pdf;
import sensors.Sns_10Controller;
import sensors.Sns_11Controller;
import sensors.Sns_12Controller;
import sensors.Sns_13Controller;
import sensors.Sns_14Controller;
import sensors.Sns_15Controller;
import sensors.Sns_16Controller;
import sensors.Sns_17Controller;
import sensors.Sns_18Controller;
import sensors.Sns_19Controller;
import sensors.Sns_1Controller;
import sensors.Sns_20Controller;
import sensors.Sns_2Controller;
import sensors.Sns_3Controller;
import sensors.Sns_4Controller;
import sensors.Sns_5Controller;
import sensors.Sns_6Controller;
import sensors.Sns_7Controller;
import sensors.Sns_8Controller;
import sensors.Sns_9Controller;
import tool.AlarmPlayer;
import tool.Call_Dialog;
import tool.Constant;
import tool.FTP_Tool;
import tool.File_Operation;
import tool.Scan;
import tool.Tool;
import tool.Variable;

/**
 *
 * @author Sandeepk
 */
public class HomeController implements Initializable {

    private static HomeController instance;

    Call_Dialog objCall_Dialog = new Call_Dialog();

    String data_array[];
    String time;

    @FXML
    private VBox pnl_scroll;
    @FXML
    private JFXButton btn_dashboard;
    @FXML
    private Label lbl_selected_option;
    @FXML
    private ImageView img_selected_option;
    @FXML
    private JFXButton btn_sensor_setup;
    @FXML
    private Label lbl_version;

    Sns_1Controller sns_1Controller;
    Sns_2Controller sns_2Controller;
    Sns_3Controller sns_3Controller;
    Sns_4Controller sns_4Controller;
    Sns_5Controller sns_5Controller;
    Sns_6Controller sns_6Controller;
    Sns_7Controller sns_7Controller;
    Sns_8Controller sns_8Controller;
    Sns_9Controller sns_9Controller;
    Sns_10Controller sns_10Controller;
    Sns_11Controller sns_11Controller;
    Sns_12Controller sns_12Controller;
    Sns_13Controller sns_13Controller;
    Sns_14Controller sns_14Controller;
    Sns_15Controller sns_15Controller;
    Sns_16Controller sns_16Controller;
    Sns_17Controller sns_17Controller;
    Sns_18Controller sns_18Controller;
    Sns_19Controller sns_19Controller;
    Sns_20Controller sns_20Controller;

    @FXML
    private JFXButton btn_tool;
    @FXML
    private JFXButton alarm;
    @FXML
    private Label lbl_clock;
    @FXML
    private Label lbl_copy_right;
    @FXML
    private JFXButton btn_edit_scan;
    @FXML
    private Label lbl_scan_start_time;
    @FXML
    private Label lbl_next_scan_time;
    @FXML
    private Label lbl_scan_interval;
    @FXML
    private Button btn_start_stop_scan;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            sns_1Controller = new Sns_1Controller();
            sns_2Controller = new Sns_2Controller();
            sns_3Controller = new Sns_3Controller();
            sns_4Controller = new Sns_4Controller();
            sns_5Controller = new Sns_5Controller();
            sns_6Controller = new Sns_6Controller();
            sns_7Controller = new Sns_7Controller();
            sns_8Controller = new Sns_8Controller();
            sns_9Controller = new Sns_9Controller();
            sns_10Controller = new Sns_10Controller();
            sns_11Controller = new Sns_11Controller();
            sns_12Controller = new Sns_12Controller();
            sns_13Controller = new Sns_13Controller();
            sns_14Controller = new Sns_14Controller();
            sns_15Controller = new Sns_15Controller();
            sns_16Controller = new Sns_16Controller();
            sns_17Controller = new Sns_17Controller();
            sns_18Controller = new Sns_18Controller();
            sns_19Controller = new Sns_19Controller();
            sns_20Controller = new Sns_20Controller();
        } catch (Exception e) {
        }

        Variable.isConfigFileFolderDone = true;
        if (!Tool.checkConfigFile()) {
            Variable.isConfigFileFolderDone = false;
            objCall_Dialog.showSelectConfigFilePathDialog();
        }
        if (!Variable.isConfigFileFolderDone) {
            System.exit(0);
        }

        try {
            lbl_version.setText(Constant.VERSION);
            lbl_copy_right.setText(Constant.COPYRIGHT);
        } catch (Exception e) {
            e.printStackTrace();
        }

        MainUtility.start_clock(lbl_clock);

        Tool.readConfigFile();
        Tool.create_data_folder(Variable.storage_location);

        File_Operation.read_system_setup();
        File_Operation.read_sensor_setup_file();

        refreshNodes();

        auto_connect();

        try {
            FTP_Tool.start_upload();
        } catch (Exception e) {
        }

    }

    public HomeController() {
        instance = this;
    }

    public static HomeController get_Controller() {
        return instance;
    }

    @FXML
    private void action_dashboard(ActionEvent event) {

        Variable.is_dashboard_selected = true;

        refreshNodes();
        img_selected_option.setImage(new Image("/img/dashboard_1.png"));
        lbl_selected_option.setText("Dashboard");
        clear_button_selected();
        btn_dashboard.setStyle("-fx-background-color: #689DFFCC; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #ffffff;");
    }

    @FXML
    private void action_sensor_setup(ActionEvent event) {
        if (Variable.scan_status) {
            objCall_Dialog.showDialogWithoutThread("Scan Running !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else {
            Variable.is_dashboard_selected = false;
            lbl_selected_option.setText("Sensor Setup");
            img_selected_option.setImage(new Image("/img/tools_2.png"));
            clear_button_selected();
            btn_sensor_setup.setStyle("-fx-background-color: #689DFFCC; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #ffffff;");
            pnl_scroll.getChildren().clear();
            try {
                Node nodes = (Node) FXMLLoader.load(getClass().getResource("/dashboard/Sensor_Configuration.fxml"));
                pnl_scroll.getChildren().add(nodes);
                nodes.getRotate();

            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void action_btn_tool(ActionEvent event) {
        if (Variable.scan_status) {
            objCall_Dialog.showDialogWithoutThread("Scan Running !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else {
            Variable.is_dashboard_selected = false;
            lbl_selected_option.setText("System Setup");
            img_selected_option.setImage(new Image("/img/sensor_setup_2.png"));
            pnl_scroll.getChildren().clear();
            try {
                Node nodes = (Node) FXMLLoader.load(getClass().getResource("/dashboard/System_Coniguration.fxml"));
                clear_button_selected();
                btn_tool.setStyle("-fx-background-color: #689DFFCC; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #ffffff;");
                pnl_scroll.getChildren().add(nodes);
                nodes.getRotate();

            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @FXML
    private void alarm(ActionEvent event) {
        try {
            AlarmPlayer.pauseAlarm();
        } catch (Exception e) {
        }
        try {
            Variable.alarm_counter = 0;
            Variable.alarm_running = false;
            Variable.alarm_blinking = false;
            HomeController.get_Controller().update_style("-fx-background-color: #FFFFFF; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #000000;");
            HomeController.get_Controller().update_alarm("No Alarm !!");
        } catch (Exception e) {
        }

        try {
            objCall_Dialog.showAlarmDialogDialog();
        } catch (Exception e) {
        }

    }

    private void clear_button_selected() {
        try {
            btn_dashboard.setStyle("");
            btn_tool.setStyle("");
            btn_sensor_setup.setStyle("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void close(ActionEvent event) {

        if (Variable.scan_status) {
            objCall_Dialog.showDialogWithoutThread("To close application you have to stop scan !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else if (Variable.scan_running) {
            objCall_Dialog.showDialogWithoutThread("Please wait for scan stop !!", "", "OK", "", Constant.DIALOG_BLUE);
        } else {
            objCall_Dialog.showDialogWithoutThread("Do you really want to Exit the application ?", "", "Exit", "Cancel", Constant.DIALOG_RED);
            if (Variable.is_dialog_confirmed) {
                Platform.exit();
                System.exit(0);
            }
        }
    }

    @FXML
    private void minimise(ActionEvent event) {
        ((Stage) ((Button) event.getSource()).getScene().getWindow()).setIconified(true);
    }

    public void refreshNodes() {
        try {

            Platform.runLater(() -> {
                pnl_scroll.getChildren().clear();

                if (Variable.scan_status) {
                    if (Variable.last_data_time != 0) {
                        time = Tool.convert_ms_into_date(Variable.last_data_time, "dd-MMM-yyyy HH:mm:ss");
                        data_array = Variable.last_data.split(",");
                    }
                    int index = 0;
                    int node_seq = 0;

                    boolean first_sns = true;

                    for (int sns = 0; sns < Constant.TOTAL_SENSOR; sns++) {

                        try {
                            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equals("1")) {

                                set_sensor_details_sequence(node_seq, sns);
                                add_nodes(node_seq + 1);
                                try {
                                    if (Variable.last_data_time == 0) {
                                        update_sns_data(node_seq + 2, "-----", "-----", "-----", "-----", "-----", "--");
                                    } else {

                                        if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                            if (Variable.report_u_v_w_component) {
                                                update_sns_data(node_seq + 2, data_array[index + 2], data_array[index + 3], data_array[index + 4], data_array[index + 5], "-----", time);
                                                if (first_sns) {
                                                    index = index + 6;
                                                } else {
                                                    index = index + 4;
                                                }
                                            } else {
                                                update_sns_data(node_seq + 2, data_array[index + 2], data_array[index + 3], "-----", "-----", "-----", time);
                                                if (first_sns) {
                                                    index = index + 4;
                                                } else {
                                                    index = index + 2;
                                                }
                                            }
                                        } else {
                                            if (Variable.report_u_v_w_component) {
                                                update_sns_data(node_seq + 2, data_array[index + 2], data_array[index + 3], data_array[index + 4], data_array[index + 5], data_array[index + 6], time);
                                                if (first_sns) {
                                                    index = index + 7;
                                                } else {
                                                    index = index + 5;
                                                }
                                            } else {
                                                update_sns_data(node_seq + 2, data_array[index + 2], data_array[index + 3], "-----", "-----", "-----", time);
                                                if (first_sns) {
                                                    index = index + 4;
                                                } else {
                                                    index = index + 2;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                node_seq++;
                                first_sns = false;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void set_sensor_details_sequence(int node_seq, int sequence) {
        try {

            switch (node_seq) {
                case 0:
                    Variable.sensor_details_sequence_1 = sequence;
                    break;
                case 1:
                    Variable.sensor_details_sequence_2 = sequence;
                    break;
                case 2:
                    Variable.sensor_details_sequence_3 = sequence;
                    break;
                case 3:
                    Variable.sensor_details_sequence_4 = sequence;
                    break;
                case 4:
                    Variable.sensor_details_sequence_5 = sequence;
                    break;
                case 5:
                    Variable.sensor_details_sequence_6 = sequence;
                    break;
                case 6:
                    Variable.sensor_details_sequence_7 = sequence;
                    break;
                case 7:
                    Variable.sensor_details_sequence_8 = sequence;
                    break;
                case 8:
                    Variable.sensor_details_sequence_9 = sequence;
                    break;
                case 9:
                    Variable.sensor_details_sequence_10 = sequence;
                    break;
                case 10:
                    Variable.sensor_details_sequence_11 = sequence;
                    break;
                case 11:
                    Variable.sensor_details_sequence_12 = sequence;
                    break;
                case 12:
                    Variable.sensor_details_sequence_13 = sequence;
                    break;
                case 13:
                    Variable.sensor_details_sequence_14 = sequence;
                    break;
                case 14:
                    Variable.sensor_details_sequence_15 = sequence;
                    break;
                case 15:
                    Variable.sensor_details_sequence_16 = sequence;
                    break;
                case 16:
                    Variable.sensor_details_sequence_17 = sequence;
                    break;
                case 17:
                    Variable.sensor_details_sequence_18 = sequence;
                    break;
                case 18:
                    Variable.sensor_details_sequence_19 = sequence;
                    break;
                case 19:
                    Variable.sensor_details_sequence_20 = sequence;
                    break;
            }
        } catch (Exception e) {
        }
    }

    private void auto_connect() {

        if (Variable.auto_start_app) {
            try {
                if (Variable.scan_status) {
                    new Scan().start_scan(true);
                    update_scan_button_text_to_start_stop("Stop Scan");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void add_nodes(int index) {
        try {
            Node nodes = null;
            switch (index) {
                case 1:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_1.fxml"));
                    break;

                case 2:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_2.fxml"));
                    break;

                case 3:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_3.fxml"));
                    break;

                case 4:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_4.fxml"));
                    break;

                case 5:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_5.fxml"));
                    break;

                case 6:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_6.fxml"));
                    break;

                case 7:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_7.fxml"));
                    break;

                case 8:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_8.fxml"));
                    break;

                case 9:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_9.fxml"));
                    break;

                case 10:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_10.fxml"));
                    break;

                case 11:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_11.fxml"));
                    break;

                case 12:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_12.fxml"));
                    break;

                case 13:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_13.fxml"));
                    break;

                case 14:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_14.fxml"));
                    break;

                case 15:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_15.fxml"));
                    break;

                case 16:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_16.fxml"));
                    break;

                case 17:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_17.fxml"));
                    break;

                case 18:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_18.fxml"));
                    break;

                case 19:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_19.fxml"));
                    break;

                case 20:
                    nodes = (Node) FXMLLoader.load(getClass().getResource("/sensors/sns_20.fxml"));
                    break;

            }

            pnl_scroll.getChildren().add(nodes);
            nodes.getRotate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update_sns_data(int index, String wind_speed, String wind_direction, String u, String v, String w, String date) {
        try {
            switch (index) {
                case 2:
                    sns_1Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 3:
                    sns_2Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 4:
                    sns_3Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 5:
                    sns_4Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 6:
                    sns_5Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 7:
                    sns_6Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 8:
                    sns_7Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 9:
                    sns_8Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 10:
                    sns_9Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 11:
                    sns_10Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 12:
                    sns_11Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 13:
                    sns_12Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 14:
                    sns_13Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 15:
                    sns_14Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 16:
                    sns_15Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 17:
                    sns_16Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 18:
                    sns_17Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 19:
                    sns_18Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 20:
                    sns_19Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

                case 21:
                    sns_20Controller.get_Controller().update_sns_data(wind_speed, wind_direction, u, v, w, date);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void action_btn_edit_scan(ActionEvent event) {
        objCall_Dialog.show_ScanSettings();
    }

    @FXML
    private void action_btn_start_stop_scan(ActionEvent event) {

        try {
            if (btn_start_stop_scan.getText().equalsIgnoreCase("Stop Scan")) {
                objCall_Dialog.showDialogWithoutThread("Do you really want to Stop Scan ?", "", "Yes", "No", Constant.DIALOG_BLUE);
                if (Variable.is_dialog_confirmed) {
                    Variable.scan_status = false;
                    File_Operation.create_modify_system_setup();
                    File_Operation.read_system_setup();
                    Variable.isRelayIsOn = false;
                    btn_start_stop_scan.setText("Stopping");
                }
            } else if (btn_start_stop_scan.getText().equalsIgnoreCase("Start Scan")) {
                objCall_Dialog.showDialogWithoutThread("Do you really want to Start Scan ?", "", "Yes", "No", Constant.DIALOG_BLUE);
                if (Variable.is_dialog_confirmed) {

                    if (validate_sensor_data() == 0) {
                        objCall_Dialog.showDialogWithoutThread("No sensor selected to scan !!", "", "OK", "", Constant.DIALOG_BLUE);
                    } else {

                        Variable.windSpeedAvgValue = new float[20][600];
                        Variable.windSpeedAvgValue_index = new int[20];
                        Variable.windSpeedAvgCompleted = new boolean[20];
                        Variable.isAlarm = new boolean[20];

                        refreshNodes();

                        File_Operation.create_sensor_setup_file();
                        File_Operation.read_sensor_setup_file();

                        update_scan_button_text_to_start_stop("Stop Scan");
                        Variable.scan_status = true;

                        new Scan().start_scan(false);

                        try {
                            Pdf.createPDF();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int validate_sensor_data() {
        int total = 0;
        try {
            for (int sns = 0; sns < 20; sns++) {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                    total++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    public void update_scan_start_time_and_scan_interval(String start_time, String scan_interval) {
        try {
            Platform.runLater(() -> {
                lbl_scan_start_time.setText(start_time);
                lbl_scan_interval.setText(scan_interval);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update_scan_button_text_to_start_stop(String text) {

        try {
            Platform.runLater(() -> {
                if (text.equals("Start Scan")) {
                    btn_start_stop_scan.setText("Start Scan");
                    btn_start_stop_scan.setStyle("-fx-background-color: #1D38BF; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #FFFFFF;");
                    lbl_scan_start_time.setText("-------");
                    lbl_next_scan_time.setText("-------");
                    lbl_scan_interval.setText("-------");
                } else {
                    btn_start_stop_scan.setText("Stop Scan");
                    btn_start_stop_scan.setStyle("-fx-background-color: transparent; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #ce0000; -fx-border-color: #CE0000;");
                }
            });

        } catch (Exception e) {
        }
    }

    public void update_alarm(String alarms) {

        try {
            Platform.runLater(() -> {
                alarm.setText(alarms);
            });
        } catch (Exception e) {
        }
    }

    public void update_style(String style) {
        try {
            Platform.runLater(() -> {
                alarm.setStyle(style);
            });
        } catch (Exception e) {
        }

    }

    public void update_next_scan_time(String next_scan_time) {
        try {
            Platform.runLater(() -> {
                lbl_next_scan_time.setText(next_scan_time);
            });
        } catch (Exception e) {
        }
    }
}
