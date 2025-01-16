/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *
 * @author sandeepk
 */
public class File_Operation {

    public static boolean create_modify_system_setup() {
        try {
            FileWriter fw;

            File file = new File(Variable.storage_location + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER + Constant.SYSTEM_SETUP_FILE);

            file.createNewFile();

            fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(Variable.system_id);
            pw.println(Variable.auto_start_app);
            pw.println(Variable.file_upload_action);
            pw.println(Variable.ftp_url);
            pw.println(Variable.ftp_port);
            pw.println(Variable.ftp_user);
            pw.println(Variable.ftp_password);
            pw.println(Variable.ftp_upload_enable);

            pw.println(Variable.scan_status);
            pw.println(Variable.log_interval);
            pw.println(Variable.scan_start_time);
            pw.println(Variable.scan_from);
            pw.println(Variable.scan_to);
            pw.println(Variable.is_time_between_enable);
            pw.println(Variable.wind_speed_unit);
            pw.println(Variable.report_u_v_w_component);
            pw.println(Variable.file_size);

            pw.println(Variable.u);
            pw.println(Variable.v);
            pw.println(Variable.w);

            pw.println(Variable.flash_alarm_enabled);
            pw.println(Variable.sound_alarm_enabled);
            pw.println(Variable.control_potential_free_contact_enabled);
            pw.println(Variable.realy_ip);
            pw.println(Variable.realy_port);
            pw.println(Variable.realy_port_idle_state);
            pw.println(Variable.alarmValueAverageCount);
            pw.println(Variable.toggle_wind_speed);

            pw.flush();
            pw.close();
            fw.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean read_system_setup() {
        BufferedReader br = null;
        try {

            if (new File(Variable.storage_location + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER + Constant.SYSTEM_SETUP_FILE).exists()) {
                br = new BufferedReader(new FileReader(Variable.storage_location + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER + Constant.SYSTEM_SETUP_FILE));

                int temp = 1;
                String tempStr = "";
                while ((tempStr = br.readLine()) != null) {

                    switch (temp) {
                        case 1:
                            Variable.system_id = tempStr;
                            break;
                        case 2:
                            try {
                                Variable.auto_start_app = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 3:
                            Variable.file_upload_action = tempStr;
                            break;

                        case 4:
                            Variable.ftp_url = tempStr.trim();
                            break;
                        case 5:
                            Variable.ftp_port = tempStr.trim();
                            break;
                        case 6:
                            Variable.ftp_user = tempStr.trim();
                            break;
                        case 7:
                            Variable.ftp_password = tempStr.trim();
                            break;
                        case 8:
                            try {
                                Variable.ftp_upload_enable = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 9:
                            try {
                                Variable.scan_status = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 10:
                            Variable.log_interval = tempStr.trim();
                            break;
                        case 11:
                            Variable.scan_start_time = tempStr.trim();
                            break;
                        case 12:
                            Variable.scan_from = tempStr.trim();
                            break;
                        case 13:
                            Variable.scan_to = tempStr.trim();
                            break;
                        case 14:
                            try {
                                Variable.is_time_between_enable = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 15:
                            Variable.wind_speed_unit = tempStr.trim();
                            break;
                        case 16:
                            try {
                                Variable.report_u_v_w_component = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 17:
                            Variable.file_size = tempStr.trim();
                            break;
                        case 18:
                            Variable.u = tempStr.trim();
                            break;
                        case 19:
                            Variable.v = tempStr.trim();
                            break;
                        case 20:
                            Variable.w = tempStr.trim();
                            break;

                        case 21:
                            try {
                                Variable.flash_alarm_enabled = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 22:
                            try {
                                Variable.sound_alarm_enabled = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 23:
                            try {
                                Variable.control_potential_free_contact_enabled = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;
                        case 24:
                            Variable.realy_ip = tempStr.trim();
                            break;
                        case 25:
                            Variable.realy_port = tempStr.trim();
                            break;
                        case 26:
                            Variable.realy_port_idle_state = tempStr.trim();
                            break;
                        case 27:
                            try {
                                Variable.alarmValueAverageCount = Integer.parseInt(tempStr.trim());
                            } catch (Exception e) {
                            }
                            break;
                        case 28:
                            try {
                                Variable.toggle_wind_speed = tempStr.trim().equalsIgnoreCase("true");
                            } catch (Exception e) {
                            }
                            break;

                    }
                    temp++;
                }
                br.close();
            }
            return true;
        } catch (Exception e) {
            try {
                br.close();
            } catch (Exception ex) {
            }
            return false;
        }
    }

    public static boolean create_sensor_setup_file() {
        try {
            FileWriter fw;

            File file = new File(Variable.storage_location + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER + Constant.SENSOR_SETUP_FILE);

            file.createNewFile();

            fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);

            for (int sns = 0; sns < Constant.TOTAL_SENSOR; sns++) {
                for (int sns_param = 0; sns_param <= Constant.SENSOR_TAG; sns_param++) {
                    pw.println(Variable.sensor_details[sns][sns_param]);
                }
            }

            pw.flush();
            pw.close();
            fw.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean read_sensor_setup_file() {
        BufferedReader br = null;
        int sns = 0;
        int sns_param = 0;

        try {

            if (new File(Variable.storage_location + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER + Constant.SENSOR_SETUP_FILE).exists()) {
                br = new BufferedReader(new FileReader(Variable.storage_location + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER + Constant.SENSOR_SETUP_FILE));

                String tempStr = "";
                while ((tempStr = br.readLine()) != null) {
                    switch (sns_param) {
                        case Constant.SENSOR_SELECTED:
                            Variable.sensor_details[sns][Constant.SENSOR_SELECTED] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_TYPE_2D:
                            Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_ADDRESS_V:
                            Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_ADDRESS_H:
                            Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_H] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_MODEL:
                            Variable.sensor_details[sns][Constant.SENSOR_MODEL] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_ALARM:
                            Variable.sensor_details[sns][Constant.SENSOR_ALARM] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_IP_ADDRESS:
                            Variable.sensor_details[sns][Constant.SENSOR_IP_ADDRESS] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_PORT_NUMBER:
                            Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER] = tempStr.trim();
                            sns_param++;
                            break;
                        case Constant.SENSOR_TAG:
                            Variable.sensor_details[sns][Constant.SENSOR_TAG] = tempStr.trim();
                            sns++;
                            sns_param = Constant.SENSOR_SELECTED;
                            break;
                        default:
                            break;
                    }

                }
                br.close();
            }
            return true;
        } catch (Exception e) {
            try {
                br.close();
            } catch (Exception ex) {
            }
            return false;
        }
    }

    /**
     * The moveToArchive
     *
     * @param filepath String filepath
     */
    public static void moveToArchive(String filepath) {
        try {
            String path = Variable.storage_location + Constant.COMPANY_FOLDER + "/" + Constant.ROOT_FOLDER + "/" + Constant.CSV_FOLDER + "\\Archive";
            File file1 = new File(path);
            if (file1.exists()) {
            } else {
                file1.mkdirs();
            }
            File selectedFile = new File(filepath);
            selectedFile.renameTo(new File(path + "\\" + selectedFile.getName()));
            writeAndDeleteFile(filepath, (path + "\\" + selectedFile.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * The writeAndDeleteFile
     *
     * @param fileSrc String fileSrc
     * @param fileDest String fileDest
     */
    private static void writeAndDeleteFile(String fileSrc, String fileDest) {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            File srcFile = new File(fileSrc);
            File destFile = new File(fileDest);
            inStream = new FileInputStream(srcFile);
            outStream = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, len);
            }
            inStream.close();

            outStream.close();
            srcFile.delete();
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
            try {
                inStream.close();
            } catch (Exception e) {
            }
            try {
                outStream.close();
            } catch (Exception e) {
            }
        }
    }
}
