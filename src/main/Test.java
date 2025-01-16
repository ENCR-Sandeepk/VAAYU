/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import comm.Client_1;
import comm.Client_MODBUS;
import tool.Constant;

/**
 *
 * @author sandeepk
 */
public class Test {

    public static void main(String[] args) {
        try {
            Client_MODBUS.start_server("192.168.10.51", 4000);
            Thread.sleep(2000);

            int count = 1;
            long curmillies = System.currentTimeMillis();
//            while ((System.currentTimeMillis() - curmillies) <= Constant.WAIT_FOR_REPLY) {

//                if ((System.currentTimeMillis() - curmillies) >= Constant.WAIT_FOR_REPLY) {
//                    break;
//                }
//                MODBUS
//                Client_MODBUS.send_command(convert_string_to_hex_cmd("30 03 00 00 00 06 C1 E9"));
//                ASCII MODE - GET DATA
            Client_MODBUS.send_command("1R1\r\n");
//                ASCII MODE - GET COMMUNICATION SETTINGS
//            Client_MODBUS.send_command("0XU\r\n");
            //                ASCII MODE - CHANGE COMMUNICATION SETTINGS (LIKE ADDRESS)
//            Client_MODBUS.send_command("0XU,A=1,M=P,T=1,C=2,I=0060,B=019200,D=8,P=N,S=1,L=00000\r\n");

            System.out.println("======================  " + count);
            count++;
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitforReply() {
        long curmillies = System.currentTimeMillis();
        while ((System.currentTimeMillis() - curmillies) >= Constant.WAIT_FOR_REPLY) {
            if ((System.currentTimeMillis() - curmillies) >= Constant.WAIT_FOR_REPLY) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
}
