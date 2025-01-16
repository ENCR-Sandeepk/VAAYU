
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensors;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import tool.Constant;
import tool.Tool;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class Sns_20Controller implements Initializable {

    private static Sns_20Controller instance;

    @FXML
    private Label lbl_sensor_tag;
    @FXML
    private Label lbl_sensor_type;
    @FXML
    private Label lbl_sensor_address_vertical;
    @FXML
    private Label lbl_sensor_address_horizontal;
    @FXML
    private Label lbl_sensor_ip_address;
    @FXML
    private Label lbl_sensor_port_number;
    @FXML
    private Label lbl_sensor_wind_speed;
    @FXML
    private Label lbl_sensor_wind_direction;
    @FXML
    private Label lbl_last_reading_date_time;
    @FXML
    private Label lbl_sensor_u_value;
    @FXML
    private Label lbl_sensor_v_value;
    @FXML
    private Label lbl_sensor_w_value;
    @FXML
    private Label lbl_sensor_u_text;
    @FXML
    private Label lbl_sensor_v_text;
    @FXML
    private Label lbl_sensor_w_text;
    @FXML
    private Label lbl_sensor_wind_speed_1;
    @FXML
    private Label lbl_toggle_ws;
    @FXML
    private ImageView img_toggle_ws;
    @FXML
    private Label lbl_alarm_cutoff;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Platform.runLater(() -> {
                lbl_sensor_tag.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_TAG]);

                lbl_sensor_address_vertical.setText("---");
                lbl_sensor_address_horizontal.setText("---");

                lbl_sensor_u_text.setText("Direction U ( " + Variable.u + " ) : ");
                lbl_sensor_v_text.setText("Direction V ( " + Variable.v + " ) : ");
                lbl_sensor_w_text.setText("Direction W ( " + Variable.w + " ) : ");

                if (Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_TYPE_2D].equalsIgnoreCase("true")) {
                    lbl_sensor_type.setText("2D");
                    lbl_sensor_address_vertical.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_ADDRESS_V]);

                } else {
                    lbl_sensor_type.setText("3D");
                    lbl_sensor_address_vertical.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_ADDRESS_V]);
                    lbl_sensor_address_horizontal.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_ADDRESS_H]);
                }

                lbl_sensor_ip_address.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_IP_ADDRESS]);
                lbl_sensor_port_number.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_20][Constant.SENSOR_PORT_NUMBER]);
                try {
                    if (Variable.toggle_wind_speed) {
                        lbl_toggle_ws.setVisible(true);
                        img_toggle_ws.setVisible(true);
                        lbl_sensor_wind_speed_1.setText("");
                    } else {
                        lbl_toggle_ws.setVisible(false);
                        img_toggle_ws.setVisible(false);
                    }
                } catch (Exception e) {
                }
try {
                    lbl_alarm_cutoff.setText("" + Variable.sensor_details[Variable.sensor_details_sequence_1][Constant.SENSOR_ALARM]);
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
        }
    }

    public Sns_20Controller() {
        instance = this;
    }

    public Sns_20Controller get_Controller() {
        return instance;
    }

    public void update_sns_data(String wind_speed, String wind_direction, String u, String v, String w, String date) {
        try {
            Platform.runLater(() -> {
                lbl_sensor_wind_speed.setText("" + wind_speed + " " + Variable.wind_speed_unit);
                try {
                    if (Variable.toggle_wind_speed) {
                        float ws = Float.parseFloat(wind_speed);
                        if (Variable.wind_speed_unit.equals("m/s")) {
                            ws = ws * 3.6f;
                            lbl_sensor_wind_speed_1.setText("" + Tool.setDecimalDigitsWithoutE("" + ws, 2) + " km/hr");
                        } else {
                            ws = (ws * 5.0f) / 18.0f;
                            lbl_sensor_wind_speed_1.setText("" + Tool.setDecimalDigitsWithoutE("" + ws, 2) + " m/s");
                        }
                    } else {
                        lbl_sensor_wind_speed_1.setText("");
                    }
                } catch (Exception e) {
                }
                lbl_sensor_wind_direction.setText("" + wind_direction + "° N");
                lbl_sensor_u_value.setText("" + u + " " + Variable.wind_speed_unit);
                lbl_sensor_v_value.setText("" + v + " " + Variable.wind_speed_unit);
                lbl_sensor_w_value.setText("" + w + " " + Variable.wind_speed_unit);
                lbl_last_reading_date_time.setText(date);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
