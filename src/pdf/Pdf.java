package pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import tool.Constant;
import tool.Tool;
import tool.Variable;
import com.itextpdf.text.Font;

/**
 *
 *
 * @author Sandeep
 */
public class Pdf {

    final public static Font FONT_MAIN_HEADING = new Font(Font.FontFamily.UNDEFINED, 14, Font.BOLD | Font.UNDERLINE);
    final public static Font FONT_SUB_HEADING = new Font(Font.FontFamily.UNDEFINED, 9, Font.BOLD);
    final public static Font FONT_CELL_FIELDS = new Font(Font.FontFamily.UNDEFINED, 9);

    public static void createPDF() {

        try {

            String dateTime = Tool.convert_ms_into_date(System.currentTimeMillis(), "yyyyMMdd_HHmmss");
            String pdfReportFileName = Tool.backslashReplace(Variable.storage_location) + Constant.COMPANY_FOLDER + Constant.ROOT_FOLDER + Constant.PDF_REPORTS_FOLDER + "/" + Variable.system_id + "_" + dateTime + ".pdf";

            Document iText_Create_Table = new Document(PageSize.A4, 0, 0, 20, 10);
            PdfPCell table_cell;

            PdfWriter.getInstance(iText_Create_Table, new FileOutputStream(new File(pdfReportFileName)));
            iText_Create_Table.open();
            PdfPTable my_first_table1 = new PdfPTable(2);

            table_cell = new PdfPCell(new Phrase("LASER DISTANCE SYSTEM REPORT ON " + dateTime, FONT_MAIN_HEADING));

            table_cell.setColspan(2);
            table_cell.setBorder(0);
            table_cell.setFixedHeight(30);
            /* Specify Cell height using setFixedHeight Method */

            table_cell.setVerticalAlignment(Element.ALIGN_CENTER);
            /* Bottom align */

            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            /* Bottom align */

            my_first_table1.addCell(table_cell);

            //***************************************************************************************************************************
            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SCAN STATUS", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.scan_status, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SYSTEM ID", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.system_id, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "AUTO START APP", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.auto_start_app, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "STORAGE LOCATION", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.storage_location, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "FILE UPLOAD ACTION", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.file_upload_action, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SAMPLES AVERAGE", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.wind_speed_unit, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "FTP UPLOAD ENABLE", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.ftp_upload_enable, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "FTP URL", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.ftp_url, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "FTP PORT", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.ftp_port, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "FTP USER", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.ftp_user, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "FTP PASSWORD", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.ftp_password, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SCAN START TIME", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.scan_start_time, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SCAN INTERVAL", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.log_interval, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SCAN TIME BETWEEN ENABLE", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.is_time_between_enable, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SCAN TIME FROM", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.scan_from, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SCAN TIME TO", FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.scan_to, FONT_CELL_FIELDS));
            table_cell.setFixedHeight(18);
            table_cell.setBorder(0);
            table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
            my_first_table1.addCell(table_cell);

            int bus = 0;
            for (int sns = 0; sns < Constant.TOTAL_SENSOR - 1; sns++) {
//                if (Variable.sensor_details[sns][Constant.SENSOR_SELECTED].equals("1")) {

                table_cell = new PdfPCell(new Phrase("", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(10);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase("", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(10);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SENSOR - " + (sns + 1), FONT_SUB_HEADING));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase("", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "BUS (Serial Port)", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                bus = (((sns) / 7) + 1);

                table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + "" + bus + " ", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SENSOR ADDRESS", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.sensor_details[sns][Constant.SENSOR_TYPE_2D], FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SENSOR MODEL", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.sensor_details[sns][Constant.SENSOR_ADDRESS_V], FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(Constant.INITIAL_SPACE + "SENSOR TAG", FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);

                table_cell = new PdfPCell(new Phrase(":" + Constant.INITIAL_SPACE + Variable.sensor_details[sns][Constant.SENSOR_PORT_NUMBER], FONT_CELL_FIELDS));
                table_cell.setFixedHeight(18);
                table_cell.setBorder(0);
                table_cell.setVerticalAlignment(Element.ALIGN_LEFT);
                my_first_table1.addCell(table_cell);
//                }
            }

            //***************************************************************************************************************************
            iText_Create_Table.add(my_first_table1);
            iText_Create_Table.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
