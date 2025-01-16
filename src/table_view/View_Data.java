/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import tool.Tool;

/**
 *
 * @author sandeepk
 */
public class View_Data {

    public static void view_data_into_table(TableView tableView, String file_data[][]) {
        try {
            boolean is_header = true;
            String header = null;
            HashMap<String, Integer> columnNameIndexMap = new HashMap<>();
            List<String> row;
            tableView.getItems().clear();
            tableView.getColumns().clear();
            if (file_data == null) {

                tableView.setPlaceholder(new Label("Corrupted File Found ..."));
            } else {

                int total_row = file_data.length;
                int total_col = file_data[0].length;

                int i = 0;

                for (int row_index = 0; row_index < total_row; row_index++) {

                    if (is_header) {
                        is_header = false;

                        for (int col_index = 0; col_index < total_col; col_index++) {
                            header = Tool.removeDoubleQuotes(file_data[row_index][col_index]);
                            if (col_index == (total_col - 1)) {
                                header = header + "                 ";
                            }

                            TableColumn<List<String>, String> column = new TableColumn<>(header);
                            columnNameIndexMap.put(header, i++); // Adding the connecting index to our map with key, name of column
                            column.setCellValueFactory(data -> {
                                String columnName = data.getTableColumn().getText();
                                int currentIndex = columnNameIndexMap.get(columnName);
                                String currentValue = data.getValue().get(currentIndex);
                                return new SimpleStringProperty(currentValue);
                            });
                            tableView.getColumns().add(column);
                        }

                    } else {

                        try {
                            row = new ArrayList<>();
                            for (int col_index = 0; col_index < total_col; col_index++) {
                                if (col_index == 0) {
                                    row.add(col_index, Tool.removeDoubleQuotes(file_data[row_index][col_index]));
                                } else {
//                                    row.add(col_index, Tool.setDecimalDigits(Tool.removeDoubleQuotes(file_data[row_index][col_index]), Integer.parseInt(Variable.decimal_places[col_index][0])));
                                }
                            }
                            tableView.getItems().add(row);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
