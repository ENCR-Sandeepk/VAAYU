/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import javafx.scene.control.TextField;

/**
 *
 * @author sandeepk
 */
public class Variable {

    public static String current_csv_file = "---.csv";

    public static long next_connection_reset_time = 0;

    public static boolean got_reply_1 = false;
    public static boolean got_reply_2 = false;
    public static boolean got_reply_3 = false;
    public static boolean got_reply_4 = false;
    public static boolean got_reply_5 = false;
    public static boolean got_reply_6 = false;
    public static boolean got_reply_7 = false;
    public static boolean got_reply_8 = false;
    public static boolean got_reply_9 = false;
    public static boolean got_reply_10 = false;
    public static boolean got_reply_11 = false;
    public static boolean got_reply_12 = false;
    public static boolean got_reply_13 = false;
    public static boolean got_reply_14 = false;
    public static boolean got_reply_15 = false;
    public static boolean got_reply_16 = false;
    public static boolean got_reply_17 = false;
    public static boolean got_reply_18 = false;
    public static boolean got_reply_19 = false;
    public static boolean got_reply_20 = false;
    public static boolean got_reply_relay = false;

    public static String reply_1 = "";
    public static String reply_2 = "";
    public static String reply_3 = "";
    public static String reply_4 = "";
    public static String reply_5 = "";
    public static String reply_6 = "";
    public static String reply_7 = "";
    public static String reply_8 = "";
    public static String reply_9 = "";
    public static String reply_10 = "";
    public static String reply_11 = "";
    public static String reply_12 = "";
    public static String reply_13 = "";
    public static String reply_14 = "";
    public static String reply_15 = "";
    public static String reply_16 = "";
    public static String reply_17 = "";
    public static String reply_18 = "";
    public static String reply_19 = "";
    public static String reply_20 = "";
    public static String reply_relay = "";

    public static String u = "East";
    public static String v = "North";
    public static String w = "Up";

    public static boolean toggle_wind_speed = false;

    public static long last_upload_attempt = 0;

    public static boolean is_dashboard_selected = true;
    // Progress Bar
    public static boolean progressBarRunning;
    public static float progress = 0.0f;
    public static int counter = 0;
    public static float prograssBarSteps = 0.0f;
    public static String progress_bar_msg = "";

    // Alarm Settings
    public static boolean flash_alarm_enabled = true;
    public static boolean sound_alarm_enabled = true;
    public static boolean control_potential_free_contact_enabled = false;
    public static String realy_ip = "0.0.0.0";
    public static String realy_port = "";
    public static String realy_port_idle_state = "Normally Open(NO)";
    public static int alarm_counter = 0;
    public static int alarmValueAverageCount = 10;
    public static String alarm_log = "";
    public static boolean alarm_blinking = false;
    public static boolean isRelayIsOn = false;
    public static float windSpeedAvgValue[][] = new float[20][600];
    public static int windSpeedAvgValue_index[] = new int[20];
    public static boolean windSpeedAvgCompleted[] = new boolean[20];
    public static boolean isAlarm[] = new boolean[20];
    public static boolean alarm_running = false;
    public static boolean is_alarm = false;
    public static boolean last_alarm_flag = false;
    public static boolean is_battery_voltage_low = false;

    public static int relay_not_reply_counter = 0;

    // Input Dialog
    public static String input_dialog_msg = "";
    public static String input_dialog_ok_btn_text = "";
    public static String input_dialog_no_btn_text = "";
    public static boolean is_input_dialog_confirmed = false;
    public static String input_dialog_input_data = "";

    // Msg Dialog
    public static boolean is_dialog_confirmed = false;
    public static String dialog_message = "";
    public static String dialog_ok_btn_text = "";
    public static String dialog_cancel_btn_text = "";
    public static int dialog_ok_btn_color = 1;

    // Picker
    public static TextField tf;
    // Time picker
    public static String current_time = "";

    // Storage Location 
    public static boolean isConfigFileFolderDone = false;
    public static boolean isModifyStorageLocation = false;
    public static String storage_location = "";

    // FTP Upload
    public static String ftp_url = "0.0.0.0";
    public static String ftp_port = "";
    public static String ftp_user = "";
    public static String ftp_password = "";
    public static boolean ftp_upload_enable = true;
    public static boolean is_uploaded = false;
    public static boolean upload_watch = false;

    // Scan
    public static long scan_started_time = 0;
    public static boolean scan_running = false;
    public static boolean scan_status = false;
    public static String log_interval = "1 minute";
    public static String scan_start_time = "";
    public static String scan_from = "";
    public static String scan_to = "";
    public static boolean is_time_between_enable = false;
    public static long last_file_time_stamp_in_ms = 0;
    public static long scan_time_in_ms = 0;
    public static long scan_interval_in_ms = 0;
    public static String last_data = "";
    public static long last_data_time = 0;
    // Sensor Setup
    public static String sensor_details[][] = new String[Constant.TOTAL_SENSOR][Constant.SENSOR_TAG + 1];
    public static boolean report_u_v_w_component = true;
    public static String file_size = "1 Record per File";

    // System Setup
    public static String system_id = "VAAYU";
    public static boolean auto_start_app = true;
    public static String file_upload_action = "Archive";
    public static String wind_speed_unit = "m/s";
    public static int total_sensor = 0;
    public static int max_sensor_in_bus = 0;

    // sensor_details_sequence
    public static int sensor_details_sequence_1 = 0;
    public static int sensor_details_sequence_2 = 1;
    public static int sensor_details_sequence_3 = 2;
    public static int sensor_details_sequence_4 = 3;
    public static int sensor_details_sequence_5 = 4;
    public static int sensor_details_sequence_6 = 5;
    public static int sensor_details_sequence_7 = 6;
    public static int sensor_details_sequence_8 = 7;
    public static int sensor_details_sequence_9 = 8;
    public static int sensor_details_sequence_10 = 9;
    public static int sensor_details_sequence_11 = 10;
    public static int sensor_details_sequence_12 = 11;
    public static int sensor_details_sequence_13 = 12;
    public static int sensor_details_sequence_14 = 13;
    public static int sensor_details_sequence_15 = 14;
    public static int sensor_details_sequence_16 = 15;
    public static int sensor_details_sequence_17 = 16;
    public static int sensor_details_sequence_18 = 17;
    public static int sensor_details_sequence_19 = 18;
    public static int sensor_details_sequence_20 = 19;
}
