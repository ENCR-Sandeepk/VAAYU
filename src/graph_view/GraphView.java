/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_view;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
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

/**
 *
 * @author sandeepk
 */
public class GraphView extends javax.swing.JFrame {

    int screenRes = Toolkit.getDefaultToolkit().getScreenResolution();
    int fontSize = (int) Math.round(10.0 * screenRes / 72.0);
    Font font = new Font("Arial", Font.BOLD, fontSize);
    SimpleDateFormat dateparser = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date;
    String data[][];
    String selectedStartDateTime;
    String selectedEndDateTime;

    /**
     * Creates new form GraphView
     *
     * @param data
     * @param selectedStartDateTime
     * @param selectedEndDateTime
     */
    public GraphView(String data[][], String selectedStartDateTime, String selectedEndDateTime) {
        initComponents();

        try {
            InputStream is = new BufferedInputStream(getClass().getResourceAsStream(
                    "/img/icon.png"));
            Image image = ImageIO.read(is);
            setIconImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.data = data;
        this.selectedStartDateTime = selectedStartDateTime;
        this.selectedEndDateTime = selectedEndDateTime;

        try {
            jPanel_graph.setLayout(new BorderLayout());
            jPanel_graph.removeAll();
            jPanel_graph.repaint();
            jPanel_graph.validate();
        } catch (Exception e) {
        }

        try {
            jComboBox_parameter.removeAllItems();
            int total_col = data[0].length;

            jComboBox_parameter.addItem("Select Parameter");

            for (int i = 1; i < total_col; i++) {
                jComboBox_parameter.addItem("" + data[0][i]);
            }
        } catch (Exception e) {
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_graph = new javax.swing.JPanel();
        jComboBox_parameter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Graph View");

        jPanel_bg.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Select Parameter :");

        jPanel_graph.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_graphLayout = new javax.swing.GroupLayout(jPanel_graph);
        jPanel_graph.setLayout(jPanel_graphLayout);
        jPanel_graphLayout.setHorizontalGroup(
            jPanel_graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_graphLayout.setVerticalGroup(
            jPanel_graphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jComboBox_parameter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox_parameter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Param 1" }));
        jComboBox_parameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_parameterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_bgLayout = new javax.swing.GroupLayout(jPanel_bg);
        jPanel_bg.setLayout(jPanel_bgLayout);
        jPanel_bgLayout.setHorizontalGroup(
            jPanel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_bgLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_parameter, 0, 750, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_bgLayout.setVerticalGroup(
            jPanel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_parameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_graph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_bgLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox_parameter, jLabel1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_parameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_parameterActionPerformed
        try {
            if (jComboBox_parameter.getSelectedIndex() > 0) {
                jPanel_graph.setLayout(new BorderLayout());
                jPanel_graph.removeAll();
                jPanel_graph.repaint();
                jPanel_graph.validate();

                jPanel_graph.add(createPane(data, jComboBox_parameter.getSelectedIndex(), selectedStartDateTime, selectedEndDateTime), BorderLayout.CENTER);
                jPanel_graph.repaint();
                jPanel_graph.validate();
            } else {
                jPanel_graph.setLayout(new BorderLayout());
                jPanel_graph.removeAll();
                jPanel_graph.repaint();
                jPanel_graph.validate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jComboBox_parameterActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GraphView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GraphView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GraphView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GraphView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GraphView().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_parameter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_bg;
    private javax.swing.JPanel jPanel_graph;
    // End of variables declaration//GEN-END:variables

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
            Font font2 = new Font("Arial", Font.PLAIN, fontSize);
            axis.setTickLabelFont(font2);

            plot.getRangeAxis().setLabelPaint(Color.red);
            plot.getRenderer().setSeriesStroke(0, new BasicStroke(1.5f));
            plot.getRenderer().setSeriesVisibleInLegend(false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return chartPanel;
    }

}