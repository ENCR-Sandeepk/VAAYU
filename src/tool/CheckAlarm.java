/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import main.HomeController;

/**
 *
 * @author Sandeep K
 */
public class CheckAlarm {

    public static void check(int sns, String windSpeed) {
        try {
            if (windSpeed != null && !windSpeed.contains("NaN")) {
                if (Variable.windSpeedAvgCompleted[sns]) {

                    if (Float.parseFloat(Variable.sensor_details[sns][Constant.SENSOR_ALARM]) <= doAveraging(sns)) {
                        Variable.isAlarm[sns] = true;
                        setAlarm(Tool.get_date_time_stamp("yyyy/MM/dd HH:mm:ss") + ", Sensor Tag : " + Variable.sensor_details[sns][Constant.SENSOR_TAG]
                                + ",  Alarm Limit : " + Variable.sensor_details[sns][Constant.SENSOR_ALARM]
                                + ", Sensor Value : " + Tool.setDecimalDigits("" + Float.parseFloat(windSpeed), 2) + "\r\n");
                    } else {
                        Variable.isAlarm[sns] = false;
                    }

                    boolean noAlarm = true;
                    for (int i = 0; i < 20; i++) {
                        if (Variable.isAlarm[i]) {
                            noAlarm = false;
                            break;
                        }
                    }
                    
                    Variable.is_alarm = !noAlarm;

                    Variable.windSpeedAvgValue[sns][Variable.windSpeedAvgValue_index[sns]] = Float.parseFloat(windSpeed);
                    Variable.windSpeedAvgValue_index[sns]++;
                    if (Variable.windSpeedAvgValue_index[sns] >= Variable.alarmValueAverageCount) {
                        Variable.windSpeedAvgValue_index[sns] = 0;
                    }
                } else {
                    Variable.windSpeedAvgValue[sns][Variable.windSpeedAvgValue_index[sns]] = Float.parseFloat(windSpeed);
                    Variable.windSpeedAvgValue_index[sns]++;
                    if (Variable.windSpeedAvgValue_index[sns] >= Variable.alarmValueAverageCount) {
                        Variable.windSpeedAvgValue_index[sns] = 0;
                        Variable.windSpeedAvgCompleted[sns] = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void setAlarm(String alarm) {

        try {
            Variable.alarm_counter++;
            Variable.alarm_log = Variable.alarm_log + alarm;

            HomeController.get_Controller().update_alarm("" + Variable.alarm_counter + " Alarm Detected !!");

            if (Variable.flash_alarm_enabled) {
                start_blinking();
            }

            if (Variable.sound_alarm_enabled) {
                AlarmPlayer.playAlarm();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start_blinking() {
        if (!Variable.alarm_blinking) {
            try {
                Variable.alarm_blinking = true;
                new Thread() {
                    @Override
                    public void run() {

                        boolean blink_toggle = false;

                        while (Variable.alarm_blinking) {
                            try {
                                blink_toggle = !blink_toggle;
                                if (blink_toggle) {
                                    HomeController.get_Controller().update_style("-fx-background-color: #FFFFFF; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #DC4F4F;");
                                } else {
                                    HomeController.get_Controller().update_style("-fx-background-color: #FFFFFF; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #000000;");
                                }
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                        }

                    }
                }.start();

            } catch (Exception e) {
            }
        }
    }

    private static float doAveraging(int sns) {
        float avg = 0.0f;
        try {
            for (int i = 0; i < Variable.alarmValueAverageCount; i++) {
                avg = avg + Variable.windSpeedAvgValue[sns][i];
            }
            avg = avg / Variable.alarmValueAverageCount;

            if (!Variable.wind_speed_unit.equals("m/s")) {
                avg = avg * 3.6f;
            }

        } catch (Exception e) {
        }
        return avg;
    }

}
