/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

/**
 *
 * @author sandeepk
 */
public class Call_Dialog {

    public void show_progress_bar(String message) {
        try {
            Variable.progress_bar_msg = message;
            Parent root = FXMLLoader.load(getClass().getResource("/dialog/ProgressBar.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Progress");
            Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDialogWithoutThread(String message, String icon, String ok_btn_text, String cancel_btn_text, int color) {

        try {
            Variable.dialog_ok_btn_color = color;
            Variable.dialog_ok_btn_text = ok_btn_text;
            Variable.dialog_cancel_btn_text = cancel_btn_text;
            Variable.dialog_message = message;
            Parent root = FXMLLoader.load(getClass().getResource("/dialog/Dialog.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Message");
            Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));

            stage.setOnCloseRequest((WindowEvent t) -> {
                t.consume();
            });

            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showDialog(String message, String icon, String ok_btn_text, String cancel_btn_text, int color) {

        try {
            // Ensure this runs on the JavaFX Application Thread
            Platform.runLater(() -> {
                try {
                    Variable.dialog_ok_btn_color = color;
                    Variable.dialog_ok_btn_text = ok_btn_text;
                    Variable.dialog_cancel_btn_text = cancel_btn_text;
                    Variable.dialog_message = message;
                    Parent root = FXMLLoader.load(getClass().getResource("/dialog/Dialog.fxml"));
                    Stage stage = new Stage();
                    stage.setTitle("Message");
                    Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
                    stage.getIcons().add(image);
                    stage.initStyle(StageStyle.TRANSPARENT);
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setScene(new Scene(root));

                    stage.setOnCloseRequest((WindowEvent t) -> {
                        t.consume();
                    });

                    stage.showAndWait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showSelectConfigFilePathDialog() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/dialog/SelectConfigFilePath.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Path");
            Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAlarmDialogDialog() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/dialog/AlarmLog.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Alarm Log");
            Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show_Time_Picker_HH_MM(String heading, TextField ft) {
        try {
            Variable.tf = ft;
            Parent root = FXMLLoader.load(getClass().getResource("/dialog/Time_Picker_HH_MM.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Time");
            Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show_ScanSettings() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/dialog/ScanSettings.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Scan Settings");
            Image image = new Image(getClass().getResourceAsStream("/img/icon.png"));
            stage.getIcons().add(image);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
