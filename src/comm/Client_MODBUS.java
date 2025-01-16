/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comm;

/**
 *
 * @author sandeepk
 */
import java.net.*;
import java.io.*;

/**
 * This program demonstrates a simple TCP/IP socket client that reads input from
 * the user and prints echoed message from the server.
 *
 * @author Sandeep
 */
public class Client_MODBUS {

    static String temp_reply;
    static String reply;
    static Socket socket = null;
    static OutputStream output;
    static InputStream input;

    public static void send_command(String msg) {
        try {
            reply = "";
            byte[] send = new byte[msg.length()];
            int j = 0;
            while (j < msg.length()) {
                char tempChar = msg.charAt(j);
                send[j] = (byte) tempChar;
                j++;
            }
            output.flush();
            output.write(send);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void start_server(String host, int port) {

        new Thread() {
            @Override
            public void run() {
                try {
                    int bufferSize = 4096;
                    byte[] buffer = new byte[bufferSize];
                    int len = -1;

                    socket = new Socket(host, port);
                    output = socket.getOutputStream();
                    input = socket.getInputStream();

                    len = input.read(buffer);

                    while (((len > -1))) {
                        try {
                            temp_reply = "";
                            for (int i = 0; i < len; i++) {
                                temp_reply = temp_reply + ((char) (buffer[i]));
                            }
                            reply = reply + temp_reply;
                            System.out.println("==" + reply);
                            len = input.read(buffer);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void close_connection() {
        try {
            socket.close();
        } catch (Exception e) {
        }
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
}
