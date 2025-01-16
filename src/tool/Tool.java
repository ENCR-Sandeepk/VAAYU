/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.CharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javafx.scene.control.ComboBox;
import org.apache.commons.io.FileDeleteStrategy;

/**
 *
 * @author sandeepk
 */
public class Tool {

    public static boolean checkConfigFile() {
        try {
            String configFilePath = backslashReplace(System.getProperty("user.home"));
            configFilePath = configFilePath + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FILE;
            File fis = new File(configFilePath);
            return fis.exists();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void createConfigFile(String file, String data) {
        FileWriter fw;
        try {
            File file1 = new File(file);

            file1.createNewFile();
            fw = new FileWriter(file1);
            PrintWriter pw = new PrintWriter(fw);
            // Write to file for the first row
            pw.println(data);
            // Flush the output to the file
            pw.flush();
            // Close the Print Writer
            pw.close();
            // Close the File Writer
            fw.close();

        } catch (IOException e) {
            new Call_Dialog().showDialog("Exception in createConfigFile !!", "", "OK", "", Constant.DIALOG_BLUE);
        }
    }

    public static void append_data_into_file(String file, String data) {
        FileWriter fw;
        try {
            File file1 = new File(file);
            if (!file1.exists()) {
                file1.createNewFile();
            }

            fw = new FileWriter(file1, true);
            PrintWriter pw = new PrintWriter(fw, true);
            // Write to file for the first row
            pw.println(data);
            // Flush the output to the file
            pw.flush();
            // Close the Print Writer
            pw.close();
            // Close the File Writer
            fw.close();

        } catch (IOException e) {
            new Call_Dialog().showDialog("Exception in createConfigFile !!", "", "OK", "", Constant.DIALOG_BLUE);
        }
    }

    public static void readConfigFile() {
        String configFilePath = backslashReplace(System.getProperty("user.home"));
        configFilePath = configFilePath + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FILE;
        try {
            BufferedReader br = new BufferedReader(new FileReader(configFilePath));

            int temp = 1;
            String tempStr = "";

            while ((tempStr = br.readLine()) != null) {

                switch (temp) {
                    case 1:
                        Variable.storage_location = tempStr.trim();
                        break;
                }
                temp++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            new Call_Dialog().showDialog("Exception in readConfigFile !!", "", "OK", "", Constant.DIALOG_BLUE);
        }
    }

    public static boolean create_data_folder(String path) {
        try {

            File dir = new File(path + Constant.COMPANY_FOLDER);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(path + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(path + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CSV_FOLDER + Constant.ARCHIVE_FOLDER);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(path + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CSV_FOLDER);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(path + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.CONFIG_FOLDER);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            dir = new File(path + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.PDF_REPORTS_FOLDER);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void createFile(String path, String data, boolean isCreateNewFile) {

        FileWriter fw;
        String fileName = path;

        try {
            File file1 = new File(fileName);

            if (isCreateNewFile) {

                file1.createNewFile();
                fw = new FileWriter(file1);
                PrintWriter pw = new PrintWriter(fw);
                pw.print(data);
                pw.flush();
                pw.close();
                fw.close();

            } else if (!file1.exists()) {
                file1.createNewFile();
                fw = new FileWriter(file1);
                PrintWriter pw = new PrintWriter(fw);
                pw.print(data);
                pw.flush();
                pw.close();
                fw.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            new Call_Dialog().showDialog("Exception in createFile !!", "", "OK", "", Constant.DIALOG_BLUE);
        }
    }

    public static boolean validateFTP_URL_AND_Password(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 48 && c <= 57) || ((c >= 65 && c <= 90)) || ((c >= 97 && c <= 122))) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static String backslashReplace(String myStr) {
        final StringBuilder result = new StringBuilder();
        final StringCharacterIterator iterator = new StringCharacterIterator(myStr);
        char character = iterator.current();
        while (character != CharacterIterator.DONE) {
            if (character == '\\') {
                result.append("/");
            } else {
                result.append(character);
            }
            character = iterator.next();
        }
        return result.toString();
    }

    public static String removeDoubleQuotes(String text) {
        if ((text != null) && text.length() > 0) {
            if ((text.charAt(0) == '"') && (text.charAt(text.length() - 1) == '"')) {
                text = text.substring(1, text.length() - 1).trim();
            }
            return text;
        }
        return text;
    }

    public static String convertDateTimeFormat(String inputDateTime, String inputFormat, String outputFormat) {
        try {
            DateFormat inputDateFormat = new SimpleDateFormat(inputFormat);
            Date date = inputDateFormat.parse(inputDateTime);
            return new SimpleDateFormat(outputFormat).format(date);
        } catch (Exception e) {
            e.printStackTrace();
            new Call_Dialog().showDialog("Exception in convertDateTimeFormat !!", "", "OK", "", Constant.DIALOG_BLUE);
            return "";

        }
    }

    public static long get_time_into_ms(String time, String format) {
        try {
            return new SimpleDateFormat(format).parse(time).getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String pad(String number, int digit) {
        while (number.length() < digit) {
            number = "0" + number;
        }
        return number;
    }

    public static String[] searchAllFileAndAddIntoCombobox(ComboBox comboBox, String path, String extension, boolean addExtension, boolean addFirstOption, String firstOptionValue, boolean addIntoCombobox) {
        String fileList = "";
        try {

            String temp;
            File[] files = finder(path, extension);

            if (addIntoCombobox) {
                comboBox.getItems().clear();
            }
            if (addIntoCombobox && addFirstOption) {
                comboBox.getItems().add(firstOptionValue);
            }

            for (int i = 0; i < files.length; i++) {
                temp = files[i].getName();

                fileList = fileList + temp + "\n";
                if (addIntoCombobox) {
                    if (addExtension) {
                        comboBox.getItems().add(temp);
                    } else {
                        comboBox.getItems().add(temp.substring(0, temp.length() - 4));
                    }
                }

            }

            try {
                comboBox.getSelectionModel().select(0);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
            new Call_Dialog().showDialog("Exception in searchAllFileAndAddIntoCombobox !!", "", "OK", "", Constant.DIALOG_BLUE);
        }
        return fileList.split("\n");
    }

    public static String[] searchAllFile(String path, String extension) {
        String fileList = "";
        try {

            String temp;
            File[] files = finder(path, extension);

            for (File file : files) {
                temp = file.getName();
                fileList = fileList + temp + "\n";
            }

        } catch (Exception e) {
            e.printStackTrace();
            new Call_Dialog().showDialog("Exception in searchAllFileAndAddIntoCombobox !!", "", "OK", "", Constant.DIALOG_BLUE);
        }
        return fileList.split("\n");
    }

    public static File[] finder(String dirName, final String extension) {

        File dir = new File(dirName);
        return dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String filename) {
                return filename.endsWith(extension);
            }
        });
    }

    public static String[] searchAllFolderInDirectory(String folderPath, ComboBox comboBox, boolean addIntoCombobox, boolean addFirstOption, String firstOptionValue) {
        String dirList = "";
        File folder = new File(folderPath);
        if (folder.isDirectory()) {
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isDirectory()) {

                    dirList = dirList + file.getName() + "\n";
                }
            }
        }
        if (addIntoCombobox) {
            try {
                String loggerList[] = dirList.split("\n");
                comboBox.getItems().clear();

                if (addFirstOption) {
                    comboBox.getItems().add(firstOptionValue);
                }

                for (String loggerList1 : loggerList) {
                    try {
                        if (loggerList1 != null && loggerList1.trim().length() > 0) {
                            comboBox.getItems().add(loggerList1);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        new Call_Dialog().showDialog("Exception in searchAllFilesInDirectory !!", "", "OK", "", Constant.DIALOG_BLUE);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                new Call_Dialog().showDialog("Exception in searchAllFilesInDirectory !!", "", "OK", "", Constant.DIALOG_BLUE);
            }
        }

        return dirList.split("\n");
    }

    public static boolean validateName(String name) {

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if ((c >= '0' && c <= '9') || ((c >= 'A' && c <= 'Z')) || ((c >= 'a' && c <= 'z')) || (c == '-') || (c == '_')) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean validateDuplicateFolder(String floder) {
        File dir = new File(floder);
        boolean exists = dir.exists();
        return (!exists);
    }

    public static boolean validateDuplicateFile(String file) {
        File dir = new File(file);
        boolean exists = dir.exists();
        return (!exists);
    }

    public static String[] searchAllFolderInDirectory(String folderPath) {
        String dirList = "";
        File folder = new File(folderPath);
        if (folder.isDirectory()) {
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isDirectory()) {
                    dirList = dirList + file.getName() + "\n";
                }
            }
        }

        return dirList.split("\n");
    }

    public static String[] serachAllFilesInADirectory(String path, String extension) {
        String fileList = "";
        try {
            String temp;
            File[] files = finder(path, extension);
            for (File file : files) {
                temp = file.getName();
                fileList = fileList + temp + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileList.split("\n");
    }

    public static String[] serachAllFilesInADirectory(String path, String extension, String file_name_contains) {
        String fileList = "";

        String temp;
        File[] files = finder(path, extension);
        for (File file : files) {
            temp = file.getName();
            if (temp.substring(0, file_name_contains.length()).equalsIgnoreCase(file_name_contains)) {
                fileList = fileList + temp + "\n";
            }
        }

        return fileList.split("\n");
    }

    public static int HHHMMSSTosecond(String time) {
        int hour;
        int min;
        int sec;

        String temp = time;
        String tempTime = "";
        tempTime = temp.substring(0, temp.indexOf(":"));
        hour = Integer.parseInt(tempTime);
        temp = temp.substring(temp.indexOf(":") + 1, temp.length());
        tempTime = temp.substring(0, temp.indexOf(":"));
        min = Integer.parseInt(tempTime);
        tempTime = temp.substring(temp.indexOf(":") + 1, temp.length());
        sec = Integer.parseInt(tempTime);
        sec = hour * 60 * 60 + (min * 60 + sec);
        return sec;
    }

    public static String getCurrentTime(String foramt) {
//        "dd/MM/yyyy HH:mm:ss"
        return new SimpleDateFormat(foramt).format(new Date());
    }

    public static String setDecimalDigits(String paraValue_para1, int decimalPlaces) {
        try {
            Float paraValue = Float.parseFloat(paraValue_para1);
            if (0.0000f == paraValue) // xxxx.xxxx
            {
                paraValue_para1 = String.format(Locale.US, "%1." + decimalPlaces + "f", paraValue);
            } else if ((0.0001f <= paraValue) && (paraValue <= 10000.0f)) // xxxx.xxxx
            {
                paraValue_para1 = String.format(Locale.US, "%1." + decimalPlaces + "f", paraValue);
            } else if ((-0.0001f >= paraValue) && (paraValue >= -10000.0f)) // xxxx.xxxx
            {
                paraValue_para1 = String.format(Locale.US, "%1." + decimalPlaces + "f", paraValue);
            } else {
                paraValue_para1 = String.format(Locale.US, "%1." + decimalPlaces + "E", paraValue);
            }
        } catch (NumberFormatException e) {
        }
        return paraValue_para1;
    }

    public static String setDecimalDigitsWithoutE(String paraValue_para1, int decimalPlaces) {
        try {
            Float paraValue = Float.parseFloat(paraValue_para1);
            paraValue_para1 = String.format(Locale.US, "%." + decimalPlaces + "f", paraValue);

        } catch (NumberFormatException e) {
            decimalPlaces = 2;
            e.printStackTrace();
        }
        return paraValue_para1;
    }

    public static String intDecimalToHexString(int decimalNumber, int decimaldigit) {
        String hex = "";
        String temp2 = "";
        int temp1;
//        char a = '„';
//        decimalNumber = a;
        if (decimalNumber > 255) {  // to convert 2 byte char into one byte 
            decimalNumber = decimalNumber - 65280;
        }
        if (decimalNumber < 0) {
            decimalNumber = decimalNumber + 256;
        }
        while (decimalNumber > 0) {
            temp1 = decimalNumber % 16;
            temp2 = "" + temp1;
            decimalNumber = decimalNumber / 16;
            switch (temp1) {
                case 10:
                    temp2 = "A";
                    break;
                case 11:
                    temp2 = "B";
                    break;
                case 12:
                    temp2 = "C";
                    break;
                case 13:
                    temp2 = "D";
                    break;
                case 14:
                    temp2 = "E";
                    break;
                case 15:
                    temp2 = "F";
                    break;
            }
            hex = temp2 + hex;
        }
        while (hex.length() < decimaldigit) {
            hex = "0" + hex;
        }
        return hex;
    }

    public static String convert_string_to_hex_cmd(String cmd) {

        String dataPacket = "";
        try {
            for (int i = 0; i < cmd.length();) {
                int temp = Integer.parseInt(cmd.substring(i, i + 2), 16);
                i = i + 3;
                dataPacket = dataPacket + (char) temp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataPacket;
    }

    public static boolean validate_reply(String address, String reply) {

        try {
            reply = reply.replace(" ", "");
            if (reply.trim().startsWith("AA" + address)) {

                String data = reply.substring(2, (reply.trim().length() - 2)).trim();
                String check_sum = reply.substring((reply.trim().length() - 2));

                return (Tool.makeChecksum(data).equals(check_sum));

            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public static String makeChecksum(String data) {
        if (data == null || data.equals("")) {
            return "";
        }

        data = data.replace(" ", "").trim();

        int total = 0;
        int len = data.length();
        int num = 0;

        while (num < len) {
            String s = data.substring(num, num + 2);

            total = total + Integer.parseInt(s, 16);
            num = num + 2;

        }
        /**
         * with 256 The largest of these is 255 , i.e., 16 Into the system FF
         */

        int mod = total % 256;

        String check_sum = Integer.toHexString(mod);
        len = check_sum.length();
        //  If the length of the check bit is not enough, make up 0, This is a two-digit check 
        if (len < 2) {
            check_sum = "0" + check_sum;
        }
        return check_sum.toUpperCase();
    }

    public static String get_sensor_value(String data) {

        if (data.startsWith("AA")) {
            try {
                return "" + Integer.parseInt(data.substring(12, 20), 16);
            } catch (NumberFormatException e) {
                return "";
            }
        } else {
            return "";
        }

    }

    public static String convert_ms_into_date(long ms, String format) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(ms);
            return new SimpleDateFormat(format).format(calendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void append_records(String file_path, String header, String data) {

        File file;
        FileWriter fr = null;
        BufferedWriter br = null;
        PrintWriter pr = null;

        boolean new_file = false;
        try {

            if (!new File(file_path).exists()) {
                new File(file_path).createNewFile();
                new_file = true;
            }

            file = new File(file_path);
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            pr = new PrintWriter(br);

            if (new_file) {
                pr.println(header);
            }

            pr.println(data);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pr.close();
                br.close();
                fr.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void save_records(String file_path, String header, String data) {
        File file;
        FileWriter fr = null;
        BufferedWriter br = null;
        PrintWriter pr = null;
        boolean is_new_fie_created = false;
        try {
            file = new File(file_path);
            if (!file.exists()) {
                file.createNewFile();
                is_new_fie_created = true;
            }
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            pr = new PrintWriter(br);
            if (is_new_fie_created) {
                pr.println(header);
            }
            pr.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pr.close();
                br.close();
                fr.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static long convert_date_time_into_ms(String time_stamp, String date_time_format) {

        try {
            // default date time format yyyy/MM/dd HH:mm:ss
            return new SimpleDateFormat(date_time_format).parse(time_stamp).getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String get_date_time_stamp(String date_time_format) {
        try {
            // default date time format yyyy/MM/dd HH:mm:ss
            return new SimpleDateFormat(date_time_format).format(new java.util.Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void delete_file(String file) {
        try {
            FileDeleteStrategy.FORCE.delete(new File(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String extract_wind_speed_and_direction(String data) {
        try {
            //0R1,Dn=000D,Dm=045D,Dx=000D,Sn=000.0M,Sm=000.3M,Sx=000.0M            

            String tmp_arr[] = data.split(",");
            String direction = tmp_arr[2].substring(3, tmp_arr[2].length() - 1);
            String speed = tmp_arr[5].substring(3, tmp_arr[5].length() - 1);
            if (!Variable.wind_speed_unit.equals("m/s")) {
                speed = "" + Float.parseFloat(speed.trim()) * 3.6f;
            }

            return Tool.setDecimalDigitsWithoutE(speed, 2) + "," + direction;
        } catch (Exception e) {
            return "";
        }
    }

    public static String calculate_u_v_and_direction(String vertical_sensor_data) {

        float wind_direction_avg_1;
        float wind_speed_avg_1;

        double u;
        double v;

        double total_wind_speed;

        try {
            wind_speed_avg_1 = Float.parseFloat(vertical_sensor_data.split(",")[0]);
            wind_direction_avg_1 = Float.parseFloat(vertical_sensor_data.split(",")[1]);

            if (wind_direction_avg_1 <= 90) {
                u = wind_speed_avg_1 * (Math.cos(90 - wind_direction_avg_1));
                v = wind_speed_avg_1 * (Math.sin(90 - wind_direction_avg_1));
            } else if (wind_direction_avg_1 <= 180) {
                u = wind_speed_avg_1 * (Math.cos(wind_direction_avg_1 - 90));
                v = wind_speed_avg_1 * (Math.sin(wind_direction_avg_1 - 90));
            } else if (wind_direction_avg_1 <= 270) {
                u = wind_speed_avg_1 * (Math.cos(270 - wind_direction_avg_1));
                v = wind_speed_avg_1 * (Math.sin(270 - wind_direction_avg_1));
            } else {
                u = wind_speed_avg_1 * (Math.cos(wind_direction_avg_1 - 270));
                v = wind_speed_avg_1 * (Math.sin(wind_direction_avg_1 - 270));
            }

            total_wind_speed = Math.sqrt((Math.pow(u, 2)) + (Math.pow(v, 2)));

            if (Variable.report_u_v_w_component) {
                return Tool.setDecimalDigits("" + total_wind_speed, 2)
                        + "," + Tool.setDecimalDigits("" + u, 2)
                        + "," + Tool.setDecimalDigits("" + v, 2)
                        + "," + Tool.setDecimalDigits("" + wind_direction_avg_1, 1);
            } else {
                return Tool.setDecimalDigits("" + total_wind_speed, 2)
                        + "," + Tool.setDecimalDigits("" + wind_direction_avg_1, 1);
            }

        } catch (Exception e) {
            if (Variable.report_u_v_w_component) {
                return "NaN,NaN,NaN,NaN";
            } else {
                return "NaN,NaN";
            }
        }
    }

    public static String calculate_u_v_w_and_direction(String vertical_sensor_data, String horizontal_sensor_data) {

        float wind_direction_avg_1;
        float wind_direction_avg_2;

        float wind_speed_avg_1;
        float wind_speed_avg_2;

        double u;
        double v;
        double w;

        double total_wind_speed;

        try {
            wind_speed_avg_1 = Float.parseFloat(vertical_sensor_data.split(",")[0]);
            wind_direction_avg_1 = Float.parseFloat(vertical_sensor_data.split(",")[1]);

            wind_speed_avg_2 = Float.parseFloat(horizontal_sensor_data.split(",")[0]);
            wind_direction_avg_2 = Float.parseFloat(horizontal_sensor_data.split(",")[1]);

            if (wind_direction_avg_1 <= 90) {
                u = wind_speed_avg_1 * (Math.cos(90 - wind_direction_avg_1));
                v = wind_speed_avg_1 * (Math.sin(90 - wind_direction_avg_1));
            } else if (wind_direction_avg_1 <= 180) {
                u = wind_speed_avg_1 * (Math.cos(wind_direction_avg_1 - 90));
                v = wind_speed_avg_1 * (Math.sin(wind_direction_avg_1 - 90));
            } else if (wind_direction_avg_1 <= 270) {
                u = wind_speed_avg_1 * (Math.cos(270 - wind_direction_avg_1));
                v = wind_speed_avg_1 * (Math.sin(270 - wind_direction_avg_1));
            } else {
                u = wind_speed_avg_1 * (Math.cos(wind_direction_avg_1 - 270));
                v = wind_speed_avg_1 * (Math.sin(wind_direction_avg_1 - 270));
            }

            if (wind_direction_avg_2 <= 90) {
                w = wind_speed_avg_2 * (Math.sin(wind_direction_avg_2));
            } else if (wind_direction_avg_2 <= 180) {
                w = wind_speed_avg_2 * (Math.sin(180 - wind_direction_avg_2));
            } else if (wind_direction_avg_2 <= 270) {
                w = wind_speed_avg_2 * (Math.sin(wind_direction_avg_2 - 180));
            } else {
                w = wind_speed_avg_2 * (Math.sin(360 - wind_direction_avg_2));
            }

            total_wind_speed = Math.sqrt((Math.pow(u, 2)) + (Math.pow(v, 2)) + (Math.pow(w, 2)));

            if (Variable.report_u_v_w_component) {
                return Tool.setDecimalDigits("" + total_wind_speed, 2)
                        + "," + Tool.setDecimalDigits("" + u, 2)
                        + "," + Tool.setDecimalDigits("" + v, 2)
                        + "," + Tool.setDecimalDigits("" + w, 2)
                        + "," + Tool.setDecimalDigits("" + wind_direction_avg_1, 1);
            } else {
                return Tool.setDecimalDigits("" + total_wind_speed, 2)
                        + "," + Tool.setDecimalDigits("" + wind_direction_avg_1, 1);
            }

        } catch (Exception e) {
            if (Variable.report_u_v_w_component) {
                return "NaN,NaN,NaN,NaN,NaN";
            } else {
                return "NaN,NaN";
            }
        }
    }

    public static String get_file_name() {
        try {
            if (Variable.file_size.equalsIgnoreCase("1 Record per File")) {
                return Tool.convert_ms_into_date(Variable.scan_time_in_ms, "yyyyMMdd_HHmmss");
            } else if (Variable.file_size.equalsIgnoreCase("5 Minute Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("10 Minute Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (10 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("15 Minute Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (15 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("20 Minute Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (20 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("30 Minute Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (30 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("1 Hour Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (60 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("2 Hour Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (120 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("3 Hour Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (180 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("4 Hour Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (240 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("6 Hour Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (360 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("12 Hour Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (720 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else if (Variable.file_size.equalsIgnoreCase("1 Day Record per File")) {
                if (System.currentTimeMillis() > (Variable.last_file_time_stamp_in_ms + (1440 * 60 * 1000))) {
                    Variable.last_file_time_stamp_in_ms = (Variable.last_file_time_stamp_in_ms + (5 * 60 * 1000));
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                } else {
                    return Tool.convert_ms_into_date(Variable.last_file_time_stamp_in_ms, "yyyyMMdd_HHmmss");
                }
            } else {
                return Tool.convert_ms_into_date(Variable.scan_time_in_ms, "yyyyMMdd_HHmmss");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Tool.convert_ms_into_date(Variable.scan_time_in_ms, "yyyyMMdd_HHmmss");
        }
    }
}
