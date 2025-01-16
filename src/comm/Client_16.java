
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
import tool.Constant;
import tool.Variable;

/**
 * This program demonstrates a simple TCP/IP socket client that reads input from
 * the user and prints echoed message from the server.
 *
 * @author Sandeep
 */
public class Client_16 {

    static Socket socket = null;
    static OutputStream output;
    static InputStream input;
    static BufferedReader reader;
    static byte[] buffer = new byte[1024];
    static String temp_rly = "";

    public static void send_command(String cmd) {
        try {
            if (Constant.DEBUG) {
                System.out.println("CMD 16 : " + cmd);
            }
            cmd = cmd + "\r\n";
            Variable.got_reply_16 = false;
            Variable.reply_16 = "";
            temp_rly = "";
            output.write(cmd.getBytes("ASCII"));
            output.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start_server(String host, int port) {
        new Thread() {
            @Override
            public void run() {
                try {
                    if (Constant.DEBUG) {
                        System.out.println("HOST 16 : " + host);
                        System.out.println("PORT 16 : " + port);
                    }
                    socket = new Socket(host, port);
                    output = socket.getOutputStream();
                    input = socket.getInputStream();

                    int len;
                    len = input.read(buffer);

                    while (((len > -1))) {
                        try {
                            temp_rly = temp_rly + new String(buffer, 0, len, "ASCII");

                            if (temp_rly.contains("\r")) {
                                Variable.reply_16 = temp_rly;
                                temp_rly = temp_rly.substring(temp_rly.indexOf("\r") + 1);
                                if (Constant.DEBUG) {
                                    System.out.println("RLY 16  = " + Variable.reply_16);
                                }
                                Variable.got_reply_16 = true;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        len = input.read(buffer);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public static void waitforReply() {
        long curmillies = System.currentTimeMillis();
        while (!Variable.got_reply_16) {
            if ((System.currentTimeMillis() - curmillies) >= Constant.WAIT_FOR_REPLY) {
                break;
            }
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }
        }
    }

    public static void close_connection() {
        try {
            socket.close();
        } catch (Exception e) {
        }
        try {
            output.close();
        } catch (Exception e) {
        }
        try {
            input.close();
        } catch (Exception e) {
        }
    }

}