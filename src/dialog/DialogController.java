/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import tool.Constant;
import tool.Variable;

/**
 * FXML Controller class
 *
 * @author sandeepk
 */
public class DialogController implements Initializable {

    @FXML
    Label label_Message;
    @FXML
    private Button btn_cancel;
    @FXML
    private Button btn_ok;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Variable.is_dialog_confirmed = false;
        label_Message.setText(Variable.dialog_message);
        btn_ok.setText(Variable.dialog_ok_btn_text);
        btn_cancel.setText(Variable.dialog_cancel_btn_text);

        if (Variable.dialog_cancel_btn_text == null || Variable.dialog_cancel_btn_text.trim().length() == 0) {
            btn_cancel.setVisible(false);
        }

        if (Variable.dialog_ok_btn_color == Constant.DIALOG_BLUE) {
            btn_ok.setStyle("-fx-background-color: #1D38BF; -fx-border-radius: 5; -fx-background-radius: 5; -fx-text-fill: #ffffff;");
        } else if (Variable.dialog_ok_btn_color == Constant.DIALOG_BLUE) {
            btn_ok.setStyle("-fx-background-color: #FFDBDB; -fx-border-radius: 5; -fx-background-radius: 5; -fx-text-fill: #CE0000;");
        }

    }

    @FXML
    private void action_cancel(ActionEvent event) {
        Variable.is_dialog_confirmed = false;
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void action_ok(ActionEvent event) {
        Variable.is_dialog_confirmed = true;
        Button btn = (Button) event.getSource();
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
}
