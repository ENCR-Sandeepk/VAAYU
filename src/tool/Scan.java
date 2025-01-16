/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import comm.Client_1;
import comm.Client_2;
import comm.Client_3;
import comm.Client_4;
import comm.Client_5;
import comm.Client_6;
import comm.Client_7;
import comm.Client_8;
import comm.Client_9;
import comm.Client_10;
import comm.Client_11;
import comm.Client_12;
import comm.Client_13;
import comm.Client_14;
import comm.Client_15;
import comm.Client_16;
import comm.Client_17;
import comm.Client_18;
import comm.Client_19;
import comm.Client_20;
import comm.Client_Relay;
import main.HomeController;
import sensors.Sns_1Controller;
import sensors.Sns_2Controller;
import sensors.Sns_3Controller;
import sensors.Sns_4Controller;
import sensors.Sns_5Controller;
import sensors.Sns_6Controller;
import sensors.Sns_7Controller;
import sensors.Sns_8Controller;
import sensors.Sns_9Controller;
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
import sensors.Sns_20Controller;

/**
 *
 * @author sandeepk
 */
public class Scan {

    static boolean toggle = true;
    static float battv = 0.0f;

    int connection_reset_counter_1 = 0;
    int connection_reset_counter_2 = 0;
    int connection_reset_counter_3 = 0;
    int connection_reset_counter_4 = 0;
    int connection_reset_counter_5 = 0;
    int connection_reset_counter_6 = 0;
    int connection_reset_counter_7 = 0;
    int connection_reset_counter_8 = 0;
    int connection_reset_counter_9 = 0;
    int connection_reset_counter_10 = 0;
    int connection_reset_counter_11 = 0;
    int connection_reset_counter_12 = 0;
    int connection_reset_counter_13 = 0;
    int connection_reset_counter_14 = 0;
    int connection_reset_counter_15 = 0;
    int connection_reset_counter_16 = 0;
    int connection_reset_counter_17 = 0;
    int connection_reset_counter_18 = 0;
    int connection_reset_counter_19 = 0;
    int connection_reset_counter_20 = 0;

    int total_count_1 = 0;
    int v_fail_count_1 = 0;
    int h_fail_count_1 = 0;

    int total_count_2 = 0;
    int v_fail_count_2 = 0;
    int h_fail_count_2 = 0;

    int total_count_3 = 0;
    int v_fail_count_3 = 0;
    int h_fail_count_3 = 0;

    int total_count_4 = 0;
    int v_fail_count_4 = 0;
    int h_fail_count_4 = 0;

    int total_count_5 = 0;
    int v_fail_count_5 = 0;
    int h_fail_count_5 = 0;

    int total_count_6 = 0;
    int v_fail_count_6 = 0;
    int h_fail_count_6 = 0;

    int total_count_7 = 0;
    int v_fail_count_7 = 0;
    int h_fail_count_7 = 0;

    int total_count_8 = 0;
    int v_fail_count_8 = 0;
    int h_fail_count_8 = 0;

    int total_count_9 = 0;
    int v_fail_count_9 = 0;
    int h_fail_count_9 = 0;

    int total_count_10 = 0;
    int v_fail_count_10 = 0;
    int h_fail_count_10 = 0;

    int total_count_11 = 0;
    int v_fail_count_11 = 0;
    int h_fail_count_11 = 0;

    int total_count_12 = 0;
    int v_fail_count_12 = 0;
    int h_fail_count_12 = 0;

    int total_count_13 = 0;
    int v_fail_count_13 = 0;
    int h_fail_count_13 = 0;

    int total_count_14 = 0;
    int v_fail_count_14 = 0;
    int h_fail_count_14 = 0;

    int total_count_15 = 0;
    int v_fail_count_15 = 0;
    int h_fail_count_15 = 0;

    int total_count_16 = 0;
    int v_fail_count_16 = 0;
    int h_fail_count_16 = 0;

    int total_count_17 = 0;
    int v_fail_count_17 = 0;
    int h_fail_count_17 = 0;

    int total_count_18 = 0;
    int v_fail_count_18 = 0;
    int h_fail_count_18 = 0;

    int total_count_19 = 0;
    int v_fail_count_19 = 0;
    int h_fail_count_19 = 0;

    int total_count_20 = 0;
    int v_fail_count_20 = 0;
    int h_fail_count_20 = 0;

    String error_msg = "";
    String record = "";

    boolean scanning_sns_1 = false;
    boolean scanning_sns_2 = false;
    boolean scanning_sns_3 = false;
    boolean scanning_sns_4 = false;
    boolean scanning_sns_5 = false;
    boolean scanning_sns_6 = false;
    boolean scanning_sns_7 = false;
    boolean scanning_sns_8 = false;
    boolean scanning_sns_9 = false;
    boolean scanning_sns_10 = false;
    boolean scanning_sns_11 = false;
    boolean scanning_sns_12 = false;
    boolean scanning_sns_13 = false;
    boolean scanning_sns_14 = false;
    boolean scanning_sns_15 = false;
    boolean scanning_sns_16 = false;
    boolean scanning_sns_17 = false;
    boolean scanning_sns_18 = false;
    boolean scanning_sns_19 = false;
    boolean scanning_sns_20 = false;

    boolean s1 = false;
    boolean s2 = false;
    boolean s3 = false;
    boolean s4 = false;
    boolean s5 = false;
    boolean s6 = false;
    boolean s7 = false;
    boolean s8 = false;
    boolean s9 = false;
    boolean s10 = false;
    boolean s11 = false;
    boolean s12 = false;
    boolean s13 = false;
    boolean s14 = false;
    boolean s15 = false;
    boolean s16 = false;
    boolean s17 = false;
    boolean s18 = false;
    boolean s19 = false;
    boolean s20 = false;

    String sns_data_1 = "";
    String sns_data_2 = "";
    String sns_data_3 = "";
    String sns_data_4 = "";
    String sns_data_5 = "";
    String sns_data_6 = "";
    String sns_data_7 = "";
    String sns_data_8 = "";
    String sns_data_9 = "";
    String sns_data_10 = "";
    String sns_data_11 = "";
    String sns_data_12 = "";
    String sns_data_13 = "";
    String sns_data_14 = "";
    String sns_data_15 = "";
    String sns_data_16 = "";
    String sns_data_17 = "";
    String sns_data_18 = "";
    String sns_data_19 = "";
    String sns_data_20 = "";

    String header = "";

    long from_time = 0;
    long to_time = 0;
    long current_time = 0;

    String data_array[];
    String time_stamp;

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

    public void start_scan(boolean auto) {
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
            e.printStackTrace();
        }

        try {
            if (Variable.control_potential_free_contact_enabled) {
                if (!Variable.isRelayIsOn) {
                    Variable.isRelayIsOn = true;
                    turnOnRelay();
                }
            }
        } catch (Exception e) {
        }

        try {
            String today = Tool.getCurrentTime("dd/MM/yyyy") + " 00:00:00";
            Variable.next_connection_reset_time = Tool.get_time_into_ms(today, "dd/MM/yyyy HH:mm:ss") + 86400000;
        } catch (Exception e) {
            e.printStackTrace();
        }

        header = get_header();

        Variable.scan_interval_in_ms = get_log_interval_in_ms(Variable.log_interval);

        set_scan_time(auto);

        connect_all_serial_port();

        total_count_1 = 0;
        v_fail_count_1 = 0;
        h_fail_count_1 = 0;

        total_count_2 = 0;
        v_fail_count_2 = 0;
        h_fail_count_2 = 0;

        total_count_3 = 0;
        v_fail_count_3 = 0;
        h_fail_count_3 = 0;

        total_count_4 = 0;
        v_fail_count_4 = 0;
        h_fail_count_4 = 0;

        total_count_5 = 0;
        v_fail_count_5 = 0;
        h_fail_count_5 = 0;

        total_count_6 = 0;
        v_fail_count_6 = 0;
        h_fail_count_6 = 0;

        total_count_7 = 0;
        v_fail_count_7 = 0;
        h_fail_count_7 = 0;

        total_count_8 = 0;
        v_fail_count_8 = 0;
        h_fail_count_8 = 0;

        total_count_9 = 0;
        v_fail_count_9 = 0;
        h_fail_count_9 = 0;

        total_count_10 = 0;
        v_fail_count_10 = 0;
        h_fail_count_10 = 0;

        total_count_11 = 0;
        v_fail_count_11 = 0;
        h_fail_count_11 = 0;

        total_count_12 = 0;
        v_fail_count_12 = 0;
        h_fail_count_12 = 0;

        total_count_13 = 0;
        v_fail_count_13 = 0;
        h_fail_count_13 = 0;

        total_count_14 = 0;
        v_fail_count_14 = 0;
        h_fail_count_14 = 0;

        total_count_15 = 0;
        v_fail_count_15 = 0;
        h_fail_count_15 = 0;

        total_count_16 = 0;
        v_fail_count_16 = 0;
        h_fail_count_16 = 0;

        total_count_17 = 0;
        v_fail_count_17 = 0;
        h_fail_count_17 = 0;

        total_count_18 = 0;
        v_fail_count_18 = 0;
        h_fail_count_18 = 0;

        total_count_19 = 0;
        v_fail_count_19 = 0;
        h_fail_count_19 = 0;

        total_count_20 = 0;
        v_fail_count_20 = 0;
        h_fail_count_20 = 0;
        try {
            new Thread() {

                @Override
                public void run() {
                    Thread.currentThread().setName("Scan");
                    while (Variable.scan_status) {

                        if ((Variable.scan_time_in_ms <= (System.currentTimeMillis())) && time_between()) {
                            Variable.scan_running = true;

                            try {
                                record = "\"" + Variable.system_id + "\",\"" + Tool.convert_ms_into_date(Variable.scan_time_in_ms, "yyyy/MM/dd HH:mm:ss") + "\"";

                                sns_data_1 = "";
                                sns_data_2 = "";
                                sns_data_3 = "";
                                sns_data_4 = "";
                                sns_data_5 = "";
                                sns_data_6 = "";
                                sns_data_7 = "";
                                sns_data_8 = "";
                                sns_data_9 = "";
                                sns_data_10 = "";
                                sns_data_11 = "";
                                sns_data_12 = "";
                                sns_data_13 = "";
                                sns_data_14 = "";
                                sns_data_15 = "";
                                sns_data_16 = "";
                                sns_data_17 = "";
                                sns_data_18 = "";
                                sns_data_19 = "";
                                sns_data_20 = "";

                                int sns = 0;
                                try {
                                    s1 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s1 = false;
                                }
                                sns++;

                                try {
                                    s2 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s2 = false;
                                }
                                sns++;

                                try {
                                    s3 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s3 = false;
                                }
                                sns++;

                                try {
                                    s4 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s4 = false;
                                }
                                sns++;

                                try {
                                    s5 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s5 = false;
                                }
                                sns++;

                                try {
                                    s6 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s6 = false;
                                }
                                sns++;

                                try {
                                    s7 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s7 = false;
                                }
                                sns++;

                                try {
                                    s8 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s8 = false;
                                }
                                sns++;

                                try {
                                    s9 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s9 = false;
                                }
                                sns++;

                                try {
                                    s10 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s10 = false;
                                }
                                sns++;

                                try {
                                    s11 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s11 = false;
                                }
                                sns++;

                                try {
                                    s12 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s12 = false;
                                }
                                sns++;

                                try {
                                    s13 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s13 = false;
                                }
                                sns++;

                                try {
                                    s14 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s14 = false;
                                }
                                sns++;

                                try {
                                    s15 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s15 = false;
                                }
                                sns++;

                                try {
                                    s16 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s16 = false;
                                }
                                sns++;

                                try {
                                    s17 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s17 = false;
                                }
                                sns++;

                                try {
                                    s18 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s18 = false;
                                }
                                sns++;

                                try {
                                    s19 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s19 = false;
                                }
                                sns++;

                                try {
                                    s20 = Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1");
                                } catch (Exception e) {
                                    s20 = false;
                                }

                                scanning_sns_1 = true;
                                scanning_sns_2 = true;
                                scanning_sns_3 = true;
                                scanning_sns_4 = true;
                                scanning_sns_5 = true;
                                scanning_sns_6 = true;
                                scanning_sns_7 = true;
                                scanning_sns_8 = true;
                                scanning_sns_9 = true;
                                scanning_sns_10 = true;
                                scanning_sns_11 = true;
                                scanning_sns_12 = true;
                                scanning_sns_13 = true;
                                scanning_sns_14 = true;
                                scanning_sns_15 = true;
                                scanning_sns_16 = true;
                                scanning_sns_17 = true;
                                scanning_sns_18 = true;
                                scanning_sns_19 = true;
                                scanning_sns_20 = true;

                                while (s1 || s2 || s3 || s4 || s5 || s6 || s7 || s8 || s9 || s10 || s11 || s12 || s13 || s14 || s15 || s16 || s17 || s18 || s19 || s20) {
                                    try {
                                        Thread.sleep(1);
                                    } catch (Exception e) {
                                    }
                                }

                                if (Constant.DEBUG) {
//                                System.out.println("\n==============================================================\n");
                                }

                                record = record + sns_data_1 + sns_data_2 + sns_data_3 + sns_data_4 + sns_data_5 + sns_data_6 + sns_data_7 + sns_data_8 + sns_data_9 + sns_data_10
                                        + sns_data_11 + sns_data_12 + sns_data_13 + sns_data_14 + sns_data_15 + sns_data_16 + sns_data_17 + sns_data_18 + sns_data_19 + sns_data_20;

                                try {
                                    Variable.current_csv_file = Variable.system_id + "_" + Tool.get_file_name() + ".csv";
                                    Tool.save_records(Variable.storage_location + Constant.COMPANY_FOLDER + "/" + Constant.ROOT_FOLDER + "/" + Constant.CSV_FOLDER + "/" + Variable.current_csv_file,
                                            header, record);

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
//                            try {
//                                if ((System.currentTimeMillis() - Variable.next_connection_reset_time) > 0) {
//                                    System.out.println("Connection Reset  " + Tool.getCurrentTime("dd/MM/yyyy HH:mm:ss"));
//                                    Variable.next_connection_reset_time = Variable.next_connection_reset_time + 86400000;
//                                    reset_connection();
//
//                                }
//                            } catch (Exception e) {
//                            }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            // update sensor data at dashboard
                            update_sns_data(record, Variable.scan_time_in_ms);
                            Variable.last_data = record;
                            Variable.last_data_time = Variable.scan_time_in_ms;

                            // set next scan time
                            try {
                                while (Variable.scan_time_in_ms <= (System.currentTimeMillis())) {
                                    Variable.scan_time_in_ms = Variable.scan_time_in_ms + Variable.scan_interval_in_ms;
                                }
                                HomeController.get_Controller().update_next_scan_time(Tool.convert_ms_into_date(Variable.scan_time_in_ms, "dd-MM-yyyy HH:mm:ss"));
                            } catch (Exception e) {
                            }
                            Variable.scan_running = false;

                        } else {
                            try {
                                Thread.sleep(1);
                            } catch (Exception e) {
                            }
                        }
                    }

                    disconnect_all_serial_port();

                    HomeController.get_Controller().update_scan_button_text_to_start_stop("Start Scan");

                    HomeController.get_Controller().update_scan_start_time_and_scan_interval("-------", "-------");
                    HomeController.get_Controller().update_next_scan_time("-------");

                    if (Variable.is_dashboard_selected) {
                        HomeController.get_Controller().refreshNodes();
                    }
                }
            }.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void scan_sns_1() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 1");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_1) {
                            scanning_sns_1 = false;
                            try {
                                total_count_1++;
                                if (Variable.sensor_details[0][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_1.send_command(Variable.sensor_details[0][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_1.send_command(Variable.sensor_details[0][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_1.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_1.trim());

                                if (Variable.sensor_details[0][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[0][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_1.send_command(Variable.sensor_details[0][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_1.send_command(Variable.sensor_details[0][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_1.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_1.trim());
                                }

                                if (Variable.sensor_details[0][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_1 = 0;
                                        sns_data_1 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_1++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_1 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_1 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_1++;
                                            System.out.println("total_count_1 = " + total_count_1 + ",       v_fail_count_1 = " + v_fail_count_1 + ",     h_fail_count_1 = " + h_fail_count_1);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_1++;
                                            System.out.println("total_count_1 = " + total_count_1 + ",       v_fail_count_1 = " + v_fail_count_1 + ",     h_fail_count_1 = " + h_fail_count_1);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_1 = 0;
                                        sns_data_1 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_1++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_1 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_1 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s1 = false;
                        }

//                        if (connection_reset_counter_1 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_1 = 0;
//                            reset_connection_1();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_2() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 2");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_2) {
                            scanning_sns_2 = false;
                            try {
                                total_count_2++;
                                if (Variable.sensor_details[1][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_2.send_command(Variable.sensor_details[1][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_2.send_command(Variable.sensor_details[1][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_2.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_2.trim());

                                if (Variable.sensor_details[1][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[1][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_2.send_command(Variable.sensor_details[1][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_2.send_command(Variable.sensor_details[1][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_2.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_2.trim());
                                }

                                if (Variable.sensor_details[1][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_2 = 0;
                                        sns_data_2 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_2++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_2 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_2 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_2++;
                                            System.out.println("total_count_2 = " + total_count_2 + ",       v_fail_count_2 = " + v_fail_count_2 + ",     h_fail_count_2 = " + h_fail_count_2);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_2++;
                                            System.out.println("total_count_2 = " + total_count_2 + ",       v_fail_count_2 = " + v_fail_count_2 + ",     h_fail_count_2 = " + h_fail_count_2);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_2 = 0;
                                        sns_data_2 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_2++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_2 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_2 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s2 = false;
                        }

//                        if (connection_reset_counter_2 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_2 = 0;
//                            reset_connection_2();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_3() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 3");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_3) {
                            scanning_sns_3 = false;
                            try {
                                total_count_3++;
                                if (Variable.sensor_details[2][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_3.send_command(Variable.sensor_details[2][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_3.send_command(Variable.sensor_details[2][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_3.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_3.trim());

                                if (Variable.sensor_details[2][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[2][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_3.send_command(Variable.sensor_details[2][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_3.send_command(Variable.sensor_details[2][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_3.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_3.trim());
                                }

                                if (Variable.sensor_details[2][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_3 = 0;
                                        sns_data_3 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_3++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_3 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_3 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_3++;
                                            System.out.println("total_count_3 = " + total_count_3 + ",       v_fail_count_3 = " + v_fail_count_3 + ",     h_fail_count_3 = " + h_fail_count_3);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_3++;
                                            System.out.println("total_count_3 = " + total_count_3 + ",       v_fail_count_3 = " + v_fail_count_3 + ",     h_fail_count_3 = " + h_fail_count_3);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_3 = 0;
                                        sns_data_3 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_3++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_3 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_3 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s3 = false;
                        }

//                        if (connection_reset_counter_3 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_3 = 0;
//                            reset_connection_3();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_4() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 4");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_4) {
                            scanning_sns_4 = false;
                            try {
                                total_count_4++;
                                if (Variable.sensor_details[3][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_4.send_command(Variable.sensor_details[3][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_4.send_command(Variable.sensor_details[3][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_4.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_4.trim());

                                if (Variable.sensor_details[3][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[3][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_4.send_command(Variable.sensor_details[3][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_4.send_command(Variable.sensor_details[3][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_4.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_4.trim());
                                }

                                if (Variable.sensor_details[3][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_4 = 0;
                                        sns_data_4 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_4++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_4 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_4 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_4++;
                                            System.out.println("total_count_4 = " + total_count_4 + ",       v_fail_count_4 = " + v_fail_count_4 + ",     h_fail_count_4 = " + h_fail_count_4);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_4++;
                                            System.out.println("total_count_4 = " + total_count_4 + ",       v_fail_count_4 = " + v_fail_count_4 + ",     h_fail_count_4 = " + h_fail_count_4);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_4 = 0;
                                        sns_data_4 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_4++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_4 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_4 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s4 = false;
                        }

//                        if (connection_reset_counter_4 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_4 = 0;
//                            reset_connection_4();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_5() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 5");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_5) {
                            scanning_sns_5 = false;
                            try {
                                total_count_5++;
                                if (Variable.sensor_details[4][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_5.send_command(Variable.sensor_details[4][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_5.send_command(Variable.sensor_details[4][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_5.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_5.trim());

                                if (Variable.sensor_details[4][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[4][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_5.send_command(Variable.sensor_details[4][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_5.send_command(Variable.sensor_details[4][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_5.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_5.trim());
                                }

                                if (Variable.sensor_details[4][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_5 = 0;
                                        sns_data_5 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_5++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_5 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_5 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_5++;
                                            System.out.println("total_count_5 = " + total_count_5 + ",       v_fail_count_5 = " + v_fail_count_5 + ",     h_fail_count_5 = " + h_fail_count_5);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_5++;
                                            System.out.println("total_count_5 = " + total_count_5 + ",       v_fail_count_5 = " + v_fail_count_5 + ",     h_fail_count_5 = " + h_fail_count_5);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_5 = 0;
                                        sns_data_5 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_5++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_5 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_5 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s5 = false;
                        }

//                        if (connection_reset_counter_5 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_5 = 0;
//                            reset_connection_5();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_6() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 6");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_6) {
                            scanning_sns_6 = false;
                            try {
                                total_count_6++;
                                if (Variable.sensor_details[5][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_6.send_command(Variable.sensor_details[5][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_6.send_command(Variable.sensor_details[5][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_6.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_6.trim());

                                if (Variable.sensor_details[5][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[5][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_6.send_command(Variable.sensor_details[5][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_6.send_command(Variable.sensor_details[5][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_6.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_6.trim());
                                }

                                if (Variable.sensor_details[5][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_6 = 0;
                                        sns_data_6 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_6++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_6 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_6 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_6++;
                                            System.out.println("total_count_6 = " + total_count_6 + ",       v_fail_count_6 = " + v_fail_count_6 + ",     h_fail_count_6 = " + h_fail_count_6);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_6++;
                                            System.out.println("total_count_6 = " + total_count_6 + ",       v_fail_count_6 = " + v_fail_count_6 + ",     h_fail_count_6 = " + h_fail_count_6);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_6 = 0;
                                        sns_data_6 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_6++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_6 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_6 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s6 = false;
                        }

//                        if (connection_reset_counter_6 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_6 = 0;
//                            reset_connection_6();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_7() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 7");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_7) {
                            scanning_sns_7 = false;
                            try {
                                total_count_7++;
                                if (Variable.sensor_details[6][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_7.send_command(Variable.sensor_details[6][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_7.send_command(Variable.sensor_details[6][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_7.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_7.trim());

                                if (Variable.sensor_details[6][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[6][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_7.send_command(Variable.sensor_details[6][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_7.send_command(Variable.sensor_details[6][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_7.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_7.trim());
                                }

                                if (Variable.sensor_details[6][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_7 = 0;
                                        sns_data_7 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_7++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_7 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_7 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_7++;
                                            System.out.println("total_count_7 = " + total_count_7 + ",       v_fail_count_7 = " + v_fail_count_7 + ",     h_fail_count_7 = " + h_fail_count_7);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_7++;
                                            System.out.println("total_count_7 = " + total_count_7 + ",       v_fail_count_7 = " + v_fail_count_7 + ",     h_fail_count_7 = " + h_fail_count_7);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_7 = 0;
                                        sns_data_7 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_7++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_7 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_7 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s7 = false;
                        }

//                        if (connection_reset_counter_7 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_7 = 0;
//                            reset_connection_7();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_8() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 8");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_8) {
                            scanning_sns_8 = false;
                            try {
                                total_count_8++;
                                if (Variable.sensor_details[7][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_8.send_command(Variable.sensor_details[7][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_8.send_command(Variable.sensor_details[7][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_8.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_8.trim());

                                if (Variable.sensor_details[7][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[7][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_8.send_command(Variable.sensor_details[7][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_8.send_command(Variable.sensor_details[7][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_8.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_8.trim());
                                }

                                if (Variable.sensor_details[7][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_8 = 0;
                                        sns_data_8 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_8++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_8 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_8 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_8++;
                                            System.out.println("total_count_8 = " + total_count_8 + ",       v_fail_count_8 = " + v_fail_count_8 + ",     h_fail_count_8 = " + h_fail_count_8);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_8++;
                                            System.out.println("total_count_8 = " + total_count_8 + ",       v_fail_count_8 = " + v_fail_count_8 + ",     h_fail_count_8 = " + h_fail_count_8);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_8 = 0;
                                        sns_data_8 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_8++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_8 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_8 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s8 = false;
                        }

//                        if (connection_reset_counter_8 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_8 = 0;
//                            reset_connection_8();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_9() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 9");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_9) {
                            scanning_sns_9 = false;
                            try {
                                total_count_9++;
                                if (Variable.sensor_details[8][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_9.send_command(Variable.sensor_details[8][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_9.send_command(Variable.sensor_details[8][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_9.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_9.trim());

                                if (Variable.sensor_details[8][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[8][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_9.send_command(Variable.sensor_details[8][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_9.send_command(Variable.sensor_details[8][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_9.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_9.trim());
                                }

                                if (Variable.sensor_details[8][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_9 = 0;
                                        sns_data_9 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_9++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_9 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_9 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_9++;
                                            System.out.println("total_count_9 = " + total_count_9 + ",       v_fail_count_9 = " + v_fail_count_9 + ",     h_fail_count_9 = " + h_fail_count_9);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_9++;
                                            System.out.println("total_count_9 = " + total_count_9 + ",       v_fail_count_9 = " + v_fail_count_9 + ",     h_fail_count_9 = " + h_fail_count_9);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_9 = 0;
                                        sns_data_9 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_9++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_9 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_9 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s9 = false;
                        }

//                        if (connection_reset_counter_9 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_9 = 0;
//                            reset_connection_9();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_10() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 10");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_10) {
                            scanning_sns_10 = false;
                            try {
                                total_count_10++;
                                if (Variable.sensor_details[9][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_10.send_command(Variable.sensor_details[9][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_10.send_command(Variable.sensor_details[9][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_10.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_10.trim());

                                if (Variable.sensor_details[9][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[9][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_10.send_command(Variable.sensor_details[9][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_10.send_command(Variable.sensor_details[9][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_10.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_10.trim());
                                }

                                if (Variable.sensor_details[9][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_10 = 0;
                                        sns_data_10 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_10++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_10 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_10 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_10++;
                                            System.out.println("total_count_10 = " + total_count_10 + ",       v_fail_count_10 = " + v_fail_count_10 + ",     h_fail_count_10 = " + h_fail_count_10);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_10++;
                                            System.out.println("total_count_10 = " + total_count_10 + ",       v_fail_count_10 = " + v_fail_count_10 + ",     h_fail_count_10 = " + h_fail_count_10);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_10 = 0;
                                        sns_data_10 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_10++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_10 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_10 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s10 = false;
                        }

//                        if (connection_reset_counter_10 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_10 = 0;
//                            reset_connection_10();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_11() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 11");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_11) {
                            scanning_sns_11 = false;
                            try {
                                total_count_11++;
                                if (Variable.sensor_details[10][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_11.send_command(Variable.sensor_details[10][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_11.send_command(Variable.sensor_details[10][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_11.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_11.trim());

                                if (Variable.sensor_details[10][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[10][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_11.send_command(Variable.sensor_details[10][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_11.send_command(Variable.sensor_details[10][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_11.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_11.trim());
                                }

                                if (Variable.sensor_details[10][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_11 = 0;
                                        sns_data_11 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_11++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_11 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_11 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_11++;
                                            System.out.println("total_count_11 = " + total_count_11 + ",       v_fail_count_11 = " + v_fail_count_11 + ",     h_fail_count_11 = " + h_fail_count_11);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_11++;
                                            System.out.println("total_count_11 = " + total_count_11 + ",       v_fail_count_11 = " + v_fail_count_11 + ",     h_fail_count_11 = " + h_fail_count_11);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_11 = 0;
                                        sns_data_11 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_11++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_11 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_11 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s11 = false;
                        }

//                        if (connection_reset_counter_11 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_11 = 0;
//                            reset_connection_11();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_12() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 12");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_12) {
                            scanning_sns_12 = false;
                            try {
                                total_count_12++;
                                if (Variable.sensor_details[11][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_12.send_command(Variable.sensor_details[11][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_12.send_command(Variable.sensor_details[11][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_12.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_12.trim());

                                if (Variable.sensor_details[11][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[11][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_12.send_command(Variable.sensor_details[11][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_12.send_command(Variable.sensor_details[11][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_12.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_12.trim());
                                }

                                if (Variable.sensor_details[11][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_12 = 0;
                                        sns_data_12 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_12++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_12 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_12 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_12++;
                                            System.out.println("total_count_12 = " + total_count_12 + ",       v_fail_count_12 = " + v_fail_count_12 + ",     h_fail_count_12 = " + h_fail_count_12);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_12++;
                                            System.out.println("total_count_12 = " + total_count_12 + ",       v_fail_count_12 = " + v_fail_count_12 + ",     h_fail_count_12 = " + h_fail_count_12);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_12 = 0;
                                        sns_data_12 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_12++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_12 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_12 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s12 = false;
                        }

//                        if (connection_reset_counter_12 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_12 = 0;
//                            reset_connection_12();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_13() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 13");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_13) {
                            scanning_sns_13 = false;
                            try {
                                total_count_13++;
                                if (Variable.sensor_details[12][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_13.send_command(Variable.sensor_details[12][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_13.send_command(Variable.sensor_details[12][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_13.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_13.trim());

                                if (Variable.sensor_details[12][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[12][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_13.send_command(Variable.sensor_details[12][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_13.send_command(Variable.sensor_details[12][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_13.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_13.trim());
                                }

                                if (Variable.sensor_details[12][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_13 = 0;
                                        sns_data_13 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_13++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_13 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_13 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_13++;
                                            System.out.println("total_count_13 = " + total_count_13 + ",       v_fail_count_13 = " + v_fail_count_13 + ",     h_fail_count_13 = " + h_fail_count_13);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_13++;
                                            System.out.println("total_count_13 = " + total_count_13 + ",       v_fail_count_13 = " + v_fail_count_13 + ",     h_fail_count_13 = " + h_fail_count_13);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_13 = 0;
                                        sns_data_13 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_13++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_13 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_13 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s13 = false;
                        }

//                        if (connection_reset_counter_13 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_13 = 0;
//                            reset_connection_13();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_14() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 14");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_14) {
                            scanning_sns_14 = false;
                            try {
                                total_count_14++;
                                if (Variable.sensor_details[13][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_14.send_command(Variable.sensor_details[13][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_14.send_command(Variable.sensor_details[13][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_14.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_14.trim());

                                if (Variable.sensor_details[13][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[13][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_14.send_command(Variable.sensor_details[13][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_14.send_command(Variable.sensor_details[13][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_14.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_14.trim());
                                }

                                if (Variable.sensor_details[13][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_14 = 0;
                                        sns_data_14 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_14++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_14 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_14 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_14++;
                                            System.out.println("total_count_14 = " + total_count_14 + ",       v_fail_count_14 = " + v_fail_count_14 + ",     h_fail_count_14 = " + h_fail_count_14);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_14++;
                                            System.out.println("total_count_14 = " + total_count_14 + ",       v_fail_count_14 = " + v_fail_count_14 + ",     h_fail_count_14 = " + h_fail_count_14);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_14 = 0;
                                        sns_data_14 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_14++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_14 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_14 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s14 = false;
                        }

//                        if (connection_reset_counter_14 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_14 = 0;
//                            reset_connection_14();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_15() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 15");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_15) {
                            scanning_sns_15 = false;
                            try {
                                total_count_15++;
                                if (Variable.sensor_details[14][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_15.send_command(Variable.sensor_details[14][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_15.send_command(Variable.sensor_details[14][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_15.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_15.trim());

                                if (Variable.sensor_details[14][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[14][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_15.send_command(Variable.sensor_details[14][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_15.send_command(Variable.sensor_details[14][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_15.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_15.trim());
                                }

                                if (Variable.sensor_details[14][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_15 = 0;
                                        sns_data_15 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_15++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_15 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_15 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_15++;
                                            System.out.println("total_count_15 = " + total_count_15 + ",       v_fail_count_15 = " + v_fail_count_15 + ",     h_fail_count_15 = " + h_fail_count_15);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_15++;
                                            System.out.println("total_count_15 = " + total_count_15 + ",       v_fail_count_15 = " + v_fail_count_15 + ",     h_fail_count_15 = " + h_fail_count_15);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_15 = 0;
                                        sns_data_15 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_15++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_15 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_15 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s15 = false;
                        }

//                        if (connection_reset_counter_15 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_15 = 0;
//                            reset_connection_15();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_16() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 16");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_16) {
                            scanning_sns_16 = false;
                            try {
                                total_count_16++;
                                if (Variable.sensor_details[15][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_16.send_command(Variable.sensor_details[15][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_16.send_command(Variable.sensor_details[15][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_16.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_16.trim());

                                if (Variable.sensor_details[15][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[15][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_16.send_command(Variable.sensor_details[15][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_16.send_command(Variable.sensor_details[15][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_16.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_16.trim());
                                }

                                if (Variable.sensor_details[15][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_16 = 0;
                                        sns_data_16 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_16++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_16 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_16 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_16++;
                                            System.out.println("total_count_16 = " + total_count_16 + ",       v_fail_count_16 = " + v_fail_count_16 + ",     h_fail_count_16 = " + h_fail_count_16);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_16++;
                                            System.out.println("total_count_16 = " + total_count_16 + ",       v_fail_count_16 = " + v_fail_count_16 + ",     h_fail_count_16 = " + h_fail_count_16);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_16 = 0;
                                        sns_data_16 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_16++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_16 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_16 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s16 = false;
                        }

//                        if (connection_reset_counter_16 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_16 = 0;
//                            reset_connection_16();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_17() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 17");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_17) {
                            scanning_sns_17 = false;
                            try {
                                total_count_17++;
                                if (Variable.sensor_details[16][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_17.send_command(Variable.sensor_details[16][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_17.send_command(Variable.sensor_details[16][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_17.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_17.trim());

                                if (Variable.sensor_details[16][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[16][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_17.send_command(Variable.sensor_details[16][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_17.send_command(Variable.sensor_details[16][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_17.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_17.trim());
                                }

                                if (Variable.sensor_details[16][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_17 = 0;
                                        sns_data_17 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_17++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_17 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_17 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_17++;
                                            System.out.println("total_count_17 = " + total_count_17 + ",       v_fail_count_17 = " + v_fail_count_17 + ",     h_fail_count_17 = " + h_fail_count_17);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_17++;
                                            System.out.println("total_count_17 = " + total_count_17 + ",       v_fail_count_17 = " + v_fail_count_17 + ",     h_fail_count_17 = " + h_fail_count_17);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_17 = 0;
                                        sns_data_17 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_17++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_17 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_17 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s17 = false;
                        }

//                        if (connection_reset_counter_17 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_17 = 0;
//                            reset_connection_17();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_18() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 18");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_18) {
                            scanning_sns_18 = false;
                            try {
                                total_count_18++;
                                if (Variable.sensor_details[17][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_18.send_command(Variable.sensor_details[17][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_18.send_command(Variable.sensor_details[17][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_18.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_18.trim());

                                if (Variable.sensor_details[17][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[17][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_18.send_command(Variable.sensor_details[17][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_18.send_command(Variable.sensor_details[17][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_18.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_18.trim());
                                }

                                if (Variable.sensor_details[17][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_18 = 0;
                                        sns_data_18 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_18++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_18 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_18 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_18++;
                                            System.out.println("total_count_18 = " + total_count_18 + ",       v_fail_count_18 = " + v_fail_count_18 + ",     h_fail_count_18 = " + h_fail_count_18);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_18++;
                                            System.out.println("total_count_18 = " + total_count_18 + ",       v_fail_count_18 = " + v_fail_count_18 + ",     h_fail_count_18 = " + h_fail_count_18);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_18 = 0;
                                        sns_data_18 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_18++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_18 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_18 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s18 = false;
                        }

//                        if (connection_reset_counter_18 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_18 = 0;
//                            reset_connection_18();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_19() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 19");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_19) {
                            scanning_sns_19 = false;
                            try {
                                total_count_19++;
                                if (Variable.sensor_details[18][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_19.send_command(Variable.sensor_details[18][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_19.send_command(Variable.sensor_details[18][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_19.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_19.trim());

                                if (Variable.sensor_details[18][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[18][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_19.send_command(Variable.sensor_details[18][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_19.send_command(Variable.sensor_details[18][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_19.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_19.trim());
                                }

                                if (Variable.sensor_details[18][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_19 = 0;
                                        sns_data_19 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_19++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_19 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_19 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_19++;
                                            System.out.println("total_count_19 = " + total_count_19 + ",       v_fail_count_19 = " + v_fail_count_19 + ",     h_fail_count_19 = " + h_fail_count_19);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_19++;
                                            System.out.println("total_count_19 = " + total_count_19 + ",       v_fail_count_19 = " + v_fail_count_19 + ",     h_fail_count_19 = " + h_fail_count_19);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_19 = 0;
                                        sns_data_19 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_19++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_19 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_19 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s19 = false;
                        }

//                        if (connection_reset_counter_19 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_19 = 0;
//                            reset_connection_19();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private void scan_sns_20() {
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("SNS - 20");
                String vertical_sensor_data = "";
                String horizontal_sensor_data = "";
                while (Variable.scan_status) {
                    try {
                        if (scanning_sns_20) {
                            scanning_sns_20 = false;
                            try {
                                total_count_20++;
                                if (Variable.sensor_details[19][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                    Client_20.send_command(Variable.sensor_details[19][Constant.SENSOR_ADDRESS_V].trim() + "R1");
                                } else {
                                    Client_20.send_command(Variable.sensor_details[19][Constant.SENSOR_ADDRESS_V].trim() + "R0");
                                }

                                Client_20.waitforReply();
                                vertical_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_20.trim());

                                if (Variable.sensor_details[19][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("false")) {
                                    Thread.sleep(140);
                                    if (Variable.sensor_details[19][Constant.SENSOR_MODEL].trim().equals("FWS")) {
                                        Client_20.send_command(Variable.sensor_details[19][Constant.SENSOR_ADDRESS_H].trim() + "R1");
                                    } else {
                                        Client_20.send_command(Variable.sensor_details[19][Constant.SENSOR_ADDRESS_H].trim() + "R0");
                                    }

                                    Client_20.waitforReply();
                                    horizontal_sensor_data = Tool.extract_wind_speed_and_direction(Variable.reply_20.trim());
                                }

                                if (Variable.sensor_details[19][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {

                                    if (vertical_sensor_data.length() > 0) {
                                        connection_reset_counter_20 = 0;
                                        sns_data_20 = "," + Tool.calculate_u_v_and_direction(vertical_sensor_data);
                                    } else {
                                        connection_reset_counter_20++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_20 = ",NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_20 = ",NaN,NaN";
                                        }
                                    }
                                } else {

                                    if (Constant.DEBUG) {
                                        if ((vertical_sensor_data.length() > 0)) {
                                        } else {
                                            v_fail_count_20++;
                                            System.out.println("total_count_20 = " + total_count_20 + ",       v_fail_count_20 = " + v_fail_count_20 + ",     h_fail_count_20 = " + h_fail_count_20);
                                        }
                                        if ((horizontal_sensor_data.length() > 0)) {
                                        } else {
                                            h_fail_count_20++;
                                            System.out.println("total_count_20 = " + total_count_20 + ",       v_fail_count_20 = " + v_fail_count_20 + ",     h_fail_count_20 = " + h_fail_count_20);
                                        }
                                    }

                                    if ((vertical_sensor_data.length() > 0) && (horizontal_sensor_data.length() > 0)) {
                                        connection_reset_counter_20 = 0;
                                        sns_data_20 = "," + Tool.calculate_u_v_w_and_direction(vertical_sensor_data, horizontal_sensor_data);
                                    } else {
                                        connection_reset_counter_20++;
                                        if (Variable.report_u_v_w_component) {
                                            sns_data_20 = ",NaN,NaN,NaN,NaN,NaN";
                                        } else {
                                            sns_data_20 = ",NaN,NaN";
                                        }
                                    }
                                }

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            s20 = false;
                        }

//                        if (connection_reset_counter_20 >= Constant.CONNECTION_RESET_COUNT) {
//                            connection_reset_counter_20 = 0;
//                            reset_connection_20();
//                        }
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    private boolean time_between() {
        try {
            if (Variable.is_time_between_enable) {

                current_time = Tool.convert_date_time_into_ms(Tool.get_date_time_stamp("HH:mm"), "HH:mm");
                from_time = Tool.convert_date_time_into_ms(Variable.scan_from, "HH:mm");
                to_time = Tool.convert_date_time_into_ms(Variable.scan_to, "HH:mm");

                return ((current_time >= from_time) && (current_time <= to_time));
            } else {
                return true;
            }
        } catch (Exception e) {
            return true;
        }

    }

    private String get_header() {
        String header = "\"DLID\",\"DATE/TIME\"";
        for (int sns = 0; sns < Constant.TOTAL_SENSOR; sns++) {
            if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equals("1")) {

                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].trim().equalsIgnoreCase("true")) {
                    if (Variable.report_u_v_w_component) {
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED_U\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED_v\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_DIRECTION\"";
                    } else {
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_DIRECTION\"";
                    }
                } else {
                    if (Variable.report_u_v_w_component) {
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED_U\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED_v\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED_W\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_DIRECTION\"";
                    } else {
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_SPEED\"";
                        header = header + ",\"" + Variable.sensor_details[sns][Constant.SENSOR_TAG] + "_WIND_DIRECTION\"";
                    }
                }
            }
        }
        return header;
    }

    public static long get_log_interval_in_ms(String log_interval) {

        long log_interval_in_ms = 1000 * 60; // i minute

        try {

            switch (log_interval) {
                case "500 milli second":
                    log_interval_in_ms = 500;
                    break;
                case "1 second":
                    log_interval_in_ms = 1000;
                    break;
                case "2 second":
                    log_interval_in_ms = 2000;
                    break;
                case "5 second":
                    log_interval_in_ms = 5000;
                    break;
                case "10 second":
                    log_interval_in_ms = 10000;
                    break;
                case "15 second":
                    log_interval_in_ms = 15000;
                    break;
                case "30 second":
                    log_interval_in_ms = 30000;
                    break;
                case "1 minute":
                    log_interval_in_ms = 60000;
                    break;
                case "2 minute":
                    log_interval_in_ms = 60000 * 2;
                    break;
                case "5 minute":
                    log_interval_in_ms = 60000 * 5;
                    break;
                case "10 minute":
                    log_interval_in_ms = 60000 * 10;
                    break;
                case "15 minute":
                    log_interval_in_ms = 60000 * 15;
                    break;
                case "20 minute":
                    log_interval_in_ms = 60000 * 20;
                    break;
                case "30 minute":
                    log_interval_in_ms = 60000 * 30;
                    break;
                case "1 hour":
                    log_interval_in_ms = 60000 * 60;
                    break;
                case "2 hour":
                    log_interval_in_ms = 60000 * 60 * 2;
                    break;
                case "3 hour":
                    log_interval_in_ms = 60000 * 60 * 3;
                    break;
                case "4 hour":
                    log_interval_in_ms = 60000 * 60 * 4;
                    break;
                case "6 hour":
                    log_interval_in_ms = 60000 * 60 * 6;
                    break;
                case "8 hour":
                    log_interval_in_ms = 60000 * 60 * 8;
                    break;
                case "12 hour":
                    log_interval_in_ms = 60000 * 60 * 12;
                    break;
                case "24 hour":
                    log_interval_in_ms = 60000 * 60 * 24;
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return log_interval_in_ms;
    }

    private void set_scan_time(boolean auto) {
        try {

            long curr_time = System.currentTimeMillis();
            long scan_time = Tool.convert_date_time_into_ms(Variable.scan_start_time, "yyyyMMddHH:mm");

            if (auto) {

                Variable.scan_time_in_ms = scan_time;
                Variable.scan_started_time = Variable.scan_time_in_ms;

                while (Variable.scan_time_in_ms <= (System.currentTimeMillis())) {
                    Variable.scan_time_in_ms = Variable.scan_time_in_ms + Variable.scan_interval_in_ms;
                }

            } else {
                if (curr_time < scan_time) {
                    Variable.scan_time_in_ms = scan_time;
                } else {
                    Variable.scan_time_in_ms = scan_time + 86400000;

                    Variable.scan_start_time = Tool.convert_ms_into_date(Variable.scan_time_in_ms, "yyyyMMddHH:mm");
                    File_Operation.create_modify_system_setup();
                    File_Operation.read_system_setup();

                }

                Variable.scan_started_time = Variable.scan_time_in_ms;
            }

            Variable.last_file_time_stamp_in_ms = Variable.scan_time_in_ms;

            HomeController.get_Controller().update_scan_start_time_and_scan_interval(Tool.convert_ms_into_date(Variable.scan_started_time, "dd-MM-yyyy HH:mm"), Variable.log_interval);
            HomeController.get_Controller().update_next_scan_time(Tool.convert_ms_into_date(Variable.scan_time_in_ms, "dd-MM-yyyy HH:mm:ss"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update_sns_data(String data, long time) {
        try {

            time_stamp = Tool.convert_ms_into_date(time, "dd-MMM-yyyy HH:mm:ss");
            data_array = data.split(",");
            int sns = 0;

            int index = 0;
            for (int i = 0; i < Constant.TOTAL_SENSOR; i++) {
                if (Variable.sensor_details[i][Constant.SENSOR_SELECTED].equalsIgnoreCase("1")) {
                    try {

                        switch (sns) {
                            case 0:

                                CheckAlarm.check(sns, data_array[index + 2]);

                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_1Controller.get_Controller().update_sns_data(data_array[index + 2], data_array[index + 5], data_array[index + 3], data_array[index + 4], "-----", time_stamp);
                                        index = index + 6;
                                    } else {
                                        sns_1Controller.get_Controller().update_sns_data(data_array[index + 2], data_array[index + 3], "-----", "-----", "-----", time_stamp);
                                        index = index + 4;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_1Controller.get_Controller().update_sns_data(data_array[index + 2], data_array[index + 6], data_array[index + 3], data_array[index + 4], data_array[index + 5], time_stamp);
                                        index = index + 7;
                                    } else {
                                        sns_1Controller.get_Controller().update_sns_data(data_array[index + 2], data_array[index + 3], "-----", "-----", "-----", time_stamp);
                                        index = index + 4;
                                    }
                                }
                                break;

                            case 1:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_2Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_2Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_2Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_2Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 2:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_3Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_3Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_3Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_3Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 3:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_4Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_4Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_4Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_4Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 4:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_5Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_5Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_5Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_5Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 5:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_6Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_6Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_6Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_6Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 6:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_7Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_7Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_7Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_7Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 7:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_8Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_8Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_8Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_8Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 8:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_9Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_9Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_9Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_9Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 9:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_10Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_10Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_10Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_10Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 10:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_11Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_11Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_11Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_11Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 11:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_12Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_12Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_12Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_12Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 12:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_13Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_13Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_13Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_13Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 13:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_14Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_14Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_14Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_14Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 14:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_15Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_15Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_15Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_15Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 15:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_16Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_16Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_16Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_16Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 16:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_17Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_17Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_17Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_17Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 17:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_18Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_18Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_18Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_18Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 18:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_19Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_19Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_19Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_19Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                            case 19:
                                CheckAlarm.check(sns, data_array[index + 2]);
                                if (Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                                    if (Variable.report_u_v_w_component) {
                                        sns_20Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 3], data_array[index + 1], data_array[index + 2], "-----", time_stamp);
                                        index = index + 4;
                                    } else {
                                        sns_20Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                } else {
                                    if (Variable.report_u_v_w_component) {
                                        sns_20Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 4], data_array[index + 1], data_array[index + 2], data_array[index + 3], time_stamp);
                                        index = index + 5;
                                    } else {
                                        sns_20Controller.get_Controller().update_sns_data(data_array[index], data_array[index + 1], "-----", "-----", "-----", time_stamp);
                                        index = index + 2;
                                    }
                                }
                                break;

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    sns++;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void disconnect_all_serial_port() {
        try {
            Client_1.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_2.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_3.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_4.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_5.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_6.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_7.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_8.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_9.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_10.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_11.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_12.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_13.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_14.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_15.close_connection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Client_16.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_17.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_18.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_19.close_connection();
        } catch (Exception e) {
        }

        try {
            Client_20.close_connection();
        } catch (Exception e) {
        }
    }

    private static void turnOnRelay() {

        toggle = true;
        new Thread() {
            @Override
            public void run() {
                try {
                    Client_Relay.start_server(Variable.realy_ip.trim(), Integer.parseInt(Variable.realy_port.trim()));

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        // wakeup command
                        Client_Relay.send_command("\0\0\0\0\0");
                        Thread.sleep(100);
                        // turn on realy
                        Client_Relay.send_command("$SELCH,1");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    long curr = System.currentTimeMillis();
                    while (Variable.isRelayIsOn) {
                        if (((System.currentTimeMillis() - curr) > 30000)
                                || (Variable.is_alarm != Variable.last_alarm_flag)) {
                            curr = System.currentTimeMillis();
                            try {
                                // wakeup command
                                Client_Relay.send_command("\0\0\0\0\0");
                                Thread.sleep(100);
                                // turn on realy

                                if (Variable.is_alarm || Variable.is_battery_voltage_low) {
                                    Variable.last_alarm_flag = Variable.is_alarm;
                                    // wakeup command
                                    Client_Relay.send_command("\0\0\0\0\0");
                                    Thread.sleep(100);
                                    Client_Relay.send_command("$SELCH,0");
                                    Client_Relay.waitforReply();
                                    Thread.sleep(50);
                                    if (Variable.is_battery_voltage_low) {
                                        try {
                                            Client_Relay.send_command("$BATTV,\"?\"");
                                            Client_Relay.waitforReply();
                                            if (Variable.got_reply_relay) {
                                                battv = Float.parseFloat(Tool.removeDoubleQuotes(Variable.reply_relay.substring(6).trim()));
                                                if (Constant.BATTV_LIMIT > battv) {
                                                    Variable.is_battery_voltage_low = true;
                                                    CheckAlarm.setAlarm(Tool.get_date_time_stamp("yyyy/MM/dd HH:mm:ss") + ", Relay Battery Low detected !! Required Voltage is :11.00, Battery voltage is : " + Tool.setDecimalDigitsWithoutE("" + battv, 2) + "\r\n");
                                                } else {
                                                    Variable.is_battery_voltage_low = false;
                                                }
                                            } else {
                                                Variable.relay_not_reply_counter++;
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    toggle = false;
                                } else {
                                    if (toggle) {
                                        try {
                                            Client_Relay.send_command("$BATTV,\"?\"");
                                            Client_Relay.waitforReply();

                                            if (Variable.got_reply_relay) {

                                                battv = Float.parseFloat(Tool.removeDoubleQuotes(Variable.reply_relay.substring(6).trim()));

                                                if (Constant.BATTV_LIMIT > battv) {
                                                    Variable.is_battery_voltage_low = true;
                                                    CheckAlarm.setAlarm(Tool.get_date_time_stamp("yyyy/MM/dd HH:mm:ss") + ", Relay Battery Low detected !! Required Voltage is :11.00, Battery voltage is : " + Tool.setDecimalDigitsWithoutE("" + battv, 2) + "\r\n");
                                                } else {
                                                    Variable.is_battery_voltage_low = false;
                                                }

                                            } else {
                                                Variable.relay_not_reply_counter++;
                                            }

                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        Client_Relay.send_command("$SELCH,1");
                                        Client_Relay.waitforReply();
                                        if (Variable.got_reply_relay) {
                                            Variable.relay_not_reply_counter = 0;
                                        } else {
                                            CheckAlarm.setAlarm(Tool.get_date_time_stamp("yyyy/MM/dd HH:mm:ss") + ", Relay Connection Break !!" + "\r\n");
                                            Variable.relay_not_reply_counter++;

                                            if (Variable.relay_not_reply_counter >= 3) {

                                                System.out.println("Reconnection =========================");
                                                try {
                                                    try {
                                                        Client_Relay.close_connection();
                                                    } catch (Exception e) {
                                                    }

                                                    try {
                                                        Thread.sleep(1000);
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }

                                                    Client_Relay.start_server(Variable.realy_ip.trim(), Integer.parseInt(Variable.realy_port.trim()));

                                                    try {
                                                        Thread.sleep(1000);
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                    try {
                                                        // wakeup command
                                                        Client_Relay.send_command("\0\0\0\0\0");
                                                        Thread.sleep(100);
                                                        // turn on realy
                                                        Client_Relay.send_command("$SELCH,1");
                                                        Client_Relay.waitforReply();
                                                        if (Variable.got_reply_relay) {
                                                            Variable.relay_not_reply_counter = 0;
                                                        }
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                } catch (Exception e) {
                                                }
                                            }
                                        }
                                    }
                                    toggle = !toggle;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                        }
                    }
                    try {// wakeup command
                        Client_Relay.send_command("\0\0\0\0\0");
                        Thread.sleep(100);
                        // turn on realy
                        Client_Relay.send_command("$SELCH,0");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        Client_Relay.close_connection();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

    private boolean connect_all_serial_port() {
        try {

            int sns = 0;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_1.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_1();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_2.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_2();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_3.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_3();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_4.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_4();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_5.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_5();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_6.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_6();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_7.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_7();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_8.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_8();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_9.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_9();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_10.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_10();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_11.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_11();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_12.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_12();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_13.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_13();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_14.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_14();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_15.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_15();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_16.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_16();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_17.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_17();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_18.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_18();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_19.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_19();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }
            sns++;

            try {
                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].trim().equals("1")) {
                    Client_20.start_server(Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim(),
                            Integer.parseInt(Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim()));
                    scan_sns_20();
                }
            } catch (Exception e) {
                error_msg = "Unable to connect with IP " + Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS].trim()
                        + " and Port " + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER].trim() + " !! Please recheck";
            }

            Thread.sleep(2000);

            Variable.progress = (int) (Variable.counter * Variable.prograssBarSteps);
            Variable.counter++;

        } catch (Exception e) {
            e.printStackTrace();
            error_msg = "Unknown error occurred !! Please recheck";
        }

        if (error_msg.trim().length() > 0) {
            new Call_Dialog().showDialog(error_msg, "", "OK", "", Constant.DIALOG_BLUE);
            disconnect_all_serial_port();
            return false;
        } else {
            File_Operation.create_modify_system_setup();
            File_Operation.read_system_setup();
            return true;
        }

    }

//    private void reset_connection_1() {
//        try {
//            Client_1.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_1.start_server(Variable.sensor_details[0][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[0][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_2() {
//        try {
//            Client_2.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_2.start_server(Variable.sensor_details[1][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[1][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_3() {
//        try {
//            Client_3.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_3.start_server(Variable.sensor_details[2][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[2][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_4() {
//        try {
//            Client_4.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_4.start_server(Variable.sensor_details[3][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[3][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_5() {
//        try {
//            Client_5.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_5.start_server(Variable.sensor_details[4][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[4][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_6() {
//        try {
//            Client_6.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_6.start_server(Variable.sensor_details[5][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[5][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_7() {
//        try {
//            Client_7.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_7.start_server(Variable.sensor_details[6][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[6][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_8() {
//        try {
//            Client_8.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_8.start_server(Variable.sensor_details[7][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[7][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_9() {
//        try {
//            Client_9.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_9.start_server(Variable.sensor_details[8][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[8][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_10() {
//        try {
//            Client_10.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_10.start_server(Variable.sensor_details[9][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[9][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_11() {
//        try {
//            Client_11.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_11.start_server(Variable.sensor_details[10][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[10][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_12() {
//        try {
//            Client_12.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_12.start_server(Variable.sensor_details[11][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[11][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_13() {
//        try {
//            Client_13.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_13.start_server(Variable.sensor_details[12][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[12][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_14() {
//        try {
//            Client_14.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_14.start_server(Variable.sensor_details[13][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[13][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_15() {
//        try {
//            Client_15.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_15.start_server(Variable.sensor_details[14][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[14][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_16() {
//        try {
//            Client_16.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_16.start_server(Variable.sensor_details[15][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[15][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_17() {
//        try {
//            Client_17.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_17.start_server(Variable.sensor_details[16][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[16][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_18() {
//        try {
//            Client_18.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_18.start_server(Variable.sensor_details[17][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[17][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_19() {
//        try {
//            Client_19.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_19.start_server(Variable.sensor_details[18][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[18][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
//
//    private void reset_connection_20() {
//        try {
//            Client_20.close_connection();
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(500);
//        } catch (Exception e) {
//        }
//        try {
//            Client_20.start_server(Variable.sensor_details[19][Constant.SENSOR_IP_ADDRESS].trim(),
//                    Integer.parseInt(Variable.sensor_details[19][Constant.SENSOR_PORT_NUMBER].trim()));
//        } catch (Exception e) {
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//    }
}
