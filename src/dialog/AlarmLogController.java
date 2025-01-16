/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import tool.Constant;
import tool.Tool;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class AlarmLogController implements Initializable {

    @FXML
    private Button btn_ok;
    @FXML
    private Label label_Message1;
    @FXML
    private TextArea ta_log;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ta_log.setText(Variable.alarm_log);

        try {
            File dir = new File(Tool.backslashReplace(Variable.storage_location) + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.ALARM_LOG_FOLDER);
            if (!dir.exists()) {
                dir.mkdir();
            }
            save_alarm_log(Tool.backslashReplace(Variable.storage_location) + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.ALARM_LOG_FOLDER + "/" + "Alarm_Log_" + Variable.system_id + "_" + new SimpleDateFormat("yyMMdd_HHmm").format(new java.util.Date()) + ".txt", Variable.alarm_log);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Variable.alarm_log = "";
    }

    @FXML
    private void action_ok(ActionEvent event) {
        Variable.is_dialog_confirmed = true;
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

    private void save_alarm_log(String file_path, String data) {

        File file;
        FileWriter fr = null;
        BufferedWriter br = null;
        PrintWriter pr = null;
        try {
            file = new File(file_path);

            if (!file.exists()) {
                file.createNewFile();
            }

            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            pr = new PrintWriter(br);
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
}
