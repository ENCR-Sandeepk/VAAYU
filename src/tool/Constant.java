/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

/**
 *
 * @author sandeepk
 */
public class Constant {

    public static boolean DEBUG = true;
    final public static String VERSION = "Version 2.2";
    final public static String COPYRIGHT = "© 2024 Encardio-rite Electronics Pvt. Ltd. India";

    final public static String COMPANY_FOLDER = "/EncardioRite";
    final public static String ROOT_FOLDER = "/VAAYU";
    final public static String FTP_FLAG_FOLDER = "/FTP_FLAG";
    final public static String CSV_FOLDER = "/CSV";
    final public static String PDF_REPORTS_FOLDER = "/PDF_REPORTS";
    final public static String CONFIG_FOLDER = "/CONFIG";
    final public static String ALARM_LOG_FOLDER = "/ALARM_LOG";
    final public static String ARCHIVE_FOLDER = "/Archive";
    final public static String LATEST_VERSION_FILE = "/VAAYU.txt";
    final public static String CONFIG_FILE = "/config.txt";
    final public static String FTP_DETAIL_FILE = "/ftp.txt";
    final public static String FTP_FLAG_FILE = "/ftp_flag.txt";
    final public static String DOT_CSV = ".csv";
    final public static String SYSTEM_SETUP_FILE = "/system_setup.txt";
    final public static String SENSOR_SETUP_FILE = "/sensor_setup.txt";
    final public static String BUS_SETUP_FILE = "/bus_setup.txt";

    final public static String END_CHAR = "\r";
    final public static int WAIT_FOR_REPLY = 1000;

    //  Status Code
    public static final int DIALOG_BLUE = 1;
    public static final int DIALOG_RED = 2;

    final public static int SENSOR_SELECTED = 0;
    final public static int SENSOR_TYPE_2D = 1;
    final public static int SENSOR_ADDRESS_V = 2;
    final public static int SENSOR_ADDRESS_H = 3;
    final public static int SENSOR_MODEL = 4;
    final public static int SENSOR_ALARM = 5;
    final public static int SENSOR_IP_ADDRESS = 6;
    final public static int SENSOR_PORT_NUMBER = 7;
    final public static int SENSOR_TAG = 8;

    final public static int TOTAL_SENSOR = 20;

    final public static String[] SENSOR_MODEL_LIST = {"Laser"};

    final public static String INITIAL_SPACE = "          ";
    final public static int CONNECTION_RESET_COUNT = 10;

    final public static float BATTV_LIMIT = 11.0f;

}
