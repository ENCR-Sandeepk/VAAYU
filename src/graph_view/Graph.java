/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_view;

/**
 *
 * @author sandeepk
 */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.RectangleInsets;
import tool.Tool;

public class Graph {

    int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
    int fontSize = (int) Math.round(10.0 * screenRes / 72.0);
    Font font = new Font("Arial", Font.BOLD, fontSize);
    SimpleDateFormat dateparser = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date;

    public void display(String data[][], String selectedStartDateTime, String selectedEndDateTime) {
        JFrame f = new JFrame("Graph View");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        try {
            InputStream is = new BufferedInputStream(getClass().getResourceAsStream(
                    "/img/icon.png"));
            Image image = ImageIO.read(is);
            f.setIconImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int total_col = data[0].length;

        final JTabbedPane jtp = new JTabbedPane();

        f.add(jtp, BorderLayout.CENTER);
        JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        for (int i = 1; i < total_col; i++) {
            jtp.add("     " + data[0][i] + "     ", createPane(data, i, selectedStartDateTime, selectedEndDateTime));
        }

        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    private ChartPanel createPane(String data[][], int index, String selectedStartDateTime, String selectedEndDateTime) {
        ChartPanel chartPanel = null;
        try {

            TimeSeriesCollection dataset = new TimeSeriesCollection();
            TimeSeries timeSeries = new TimeSeries("TimeSeries");

            long start_time = Tool.get_time_into_ms(selectedStartDateTime, "yyyy/MM/dd HH:mm:ss");
            long end_time = Tool.get_time_into_ms(selectedEndDateTime, "yyyy/MM/dd HH:mm:ss");

            for (int i = 1; i < data.length; i++) {
                try {
                    if ((start_time <= Tool.get_time_into_ms(data[i][0], "\"yyyy/MM/dd HH:mm:ss\"")) && (end_time >= Tool.get_time_into_ms(data[i][0], "\"yyyy/MM/dd HH:mm:ss\""))) {
                        timeSeries.add(new Second(dateparser.parse(Tool.removeDoubleQuotes(data[i][0]))), Double.parseDouble(data[i][index]));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dataset.addSeries(timeSeries);

            JFreeChart chart = ChartFactory.createTimeSeriesChart("", "Time",
                    data[0][index], dataset, true, true, false);
            chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(900, 600));
            chart.setBackgroundPaint(Color.white);
            XYPlot plot = (XYPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.white);
            plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
            plot.setDomainCrosshairVisible(false);
            plot.setRangeCrosshairVisible(false);
            plot.setDomainGridlinePaint(Color.GREEN);
            plot.setRangeGridlinePaint(Color.GREEN);
            plot.setDomainGridlinesVisible(true);
            chart.getTitle().setFont(font);
            plot.getRangeAxis().setLabelFont(font);
            plot.getDomainAxis().setLabelFont(font);
            DateAxis axis = (DateAxis) plot.getDomainAxis();
            axis.setDateFormatOverride(new SimpleDateFormat("dd/MM/yy HH:mm"));
            axis.setVerticalTickLabels(true);
            int fontSize = (int) Math.round(8.0 * screenRes / 72.0);
            Font font2 = new Font("Arial", Font.PLAIN, fontSize);
            axis.setTickLabelFont(font2);
            // changeLable(plot);

            plot.getRangeAxis().setLabelPaint(Color.red);
            plot.getRenderer().setSeriesStroke(0, new BasicStroke(1.5f));
            plot.getRenderer().setSeriesVisibleInLegend(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return chartPanel;
    }

}
