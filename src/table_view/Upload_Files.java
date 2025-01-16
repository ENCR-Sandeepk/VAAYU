/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_view;

import javafx.scene.control.CheckBox;

/**
 *
 * @author sandeepk
 */
public class Upload_Files {

    String file_name;
    CheckBox select;

    public Upload_Files(String file_name, CheckBox select) {
        this.file_name = file_name;
        this.select = select;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public CheckBox getSelect() {
        return select;
    }

    public void setSelect(CheckBox select) {
        this.select = select;
    }

}
