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
public class TestCode {

    public static void main(String[] args) {
        String tmp = "0R1,Dn=000D,Dm=035D,Dx=180D,Sn=000.0M,Sm=000.1M,Sx=000.6M";
        String tmp_arr[] = tmp.split(",");

        String direction = tmp_arr[2].substring(3, tmp_arr[2].length() - 1);
        String speed = tmp_arr[5].substring(3, tmp_arr[5].length() - 1);

        System.out.println(speed);
        System.out.println(direction);
    }

}
