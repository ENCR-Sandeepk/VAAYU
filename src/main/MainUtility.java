/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Platform;
import javafx.scene.control.Label;
import tool.Tool;

/**
 *
 * @author Sandeep K
 */
public class MainUtility {

    public static void start_clock(Label lbl_clock) {
        try {
            new Thread() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            try {
                                Platform.runLater(() -> {
                                    lbl_clock.setText(Tool.convert_ms_into_date(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
                                });
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            try {
                                Thread.sleep(200);
                            } catch (Exception e) {
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            }.start();
        } catch (Exception e) {
        }
    }
}
