/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Result extends javax.swing.JInternalFrame {

    String comboBox1text;
    String comboBox2text;
    String comboBox3text;
    public Result() {
        initComponents();
        cb1();
    }

     public void cb1(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/result" ,"root" , "root");
        PreparedStatement statement = connect.prepareStatement("select distinct CourseName from student");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            jC1.addItem(resultSet.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jC1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jC3 = new javax.swing.JComboBox<>();
        jC2 = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Format1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Semister");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Format");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Course Name");

        jDateChooser1.setDateFormatString("MM dd yyyy");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Roll No");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Print Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Month And Year OF Examination");

        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Date");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Result Print");

        jC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC3ActionPerformed(evt);
            }
        });

        jC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Format2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(197, 197, 197))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(20, 20, 20)
                                .addComponent(jRadioButton2)
                                .addGap(69, 69, 69))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1))
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int itemCount = jC3.getItemCount();
        for(int i=0;i<itemCount;i++){
            jC3.removeItemAt(0);
        }
        //fill second combo box
        comboBox2text = String.valueOf(jC2.getSelectedItem());
        if (!comboBox2text.isEmpty() || comboBox2text != null) {
            // get data from DataBase with Distinct

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
                //String sql =;
                PreparedStatement ps = con.prepareStatement("select Roll_no from student WHERE Semister = '" + comboBox2text + "'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    jC3.addItem(rs.getString("Roll_no"));
                    // jC2.addItem(BItems)
                }
            } catch(Exception e) {
                System.out.println("Error:"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jC2ActionPerformed

    private void jC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String cname=jC1.getSelectedItem().toString();
            String sem=jC2.getSelectedItem().toString();
            String roll=jC3.getSelectedItem().toString();
            String month1=txt2.getText();
            DateFormat ab=new SimpleDateFormat("dd MMMMM 2018");
            String date=ab.format(jDateChooser1.getDate());
            if(jRadioButton1.isSelected())
            {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
                JasperDesign jd=JRXmlLoader.load(new File("").getAbsolutePath()+"/src/reports/report1.jrxml");
                JRDesignQuery newQuery=new JRDesignQuery();
                String sql="select * from result where Roll_no="+roll+" And CourseName='"+cname+"'AND  Semister='"+sem+"'order by SubCode";
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                PreparedStatement ps=conn.prepareStatement("select * from result where roll_no="+roll+" And CourseName='"+cname+"' AND Semister='"+sem+"' ");
                ResultSet rs=ps.executeQuery();
                HashMap para1=new HashMap();
                String array[]=new String[20];
                int a=0,b=0,c=0;
                while(rs.next()){
                    String name=rs.getString("StudentName");  
                    array[a]=rs.getString("TotalGrade");
                    array[b]=rs.getString("ExternalGrade");
                    array[c]=rs.getString("InternalGrade");
                    para1.put("name",name);
                    para1.put("coursename",cname);
                    para1.put("examination_number",roll);
                    para1.put("monthofexamination",month1);
                    para1.put("sem",sem);
                    para1.put("Date",date);                   
                    a++;
                    b++;
                    c++;
                }
                if(Arrays.stream(array).anyMatch("F"::equals)){
                    para1.put("remark", "Unsuccessful");
                }else{
                   para1.put("remark", "Successful");
                }
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,para1,conn);
                JasperViewer jv=new JasperViewer(jp,false);
                jv.setVisible(true);
            }
            else if(jRadioButton2.isSelected())
            {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
                JasperDesign jd=JRXmlLoader.load(new File("").getAbsolutePath()+"/src/reports/report2.jrxml");
                JRDesignQuery newQuery=new JRDesignQuery();
                String sql="select * from result where Roll_no="+roll+" And CourseName='"+cname+"'AND  Semister='"+sem+"' order by SubCode";
                newQuery.setText(sql);
                jd.setQuery(newQuery);
                PreparedStatement ps=conn.prepareStatement("select * from result where roll_no="+roll+" And CourseName='"+cname+"' AND Semister='"+sem+"' ");
                ResultSet rs=ps.executeQuery();
                HashMap para1=new HashMap();
                String array[]=new String[20];
                int a=0,b=0,c=0;
                while(rs.next()){
                    String name=rs.getString("StudentName");    
                    array[a]=rs.getString("TotalGrade");
                    array[b]=rs.getString("ExternalGrade");
                    array[c]=rs.getString("InternalGrade");
                    para1.put("name",name);
                    para1.put("coursename",cname);
                    para1.put("examination_number",roll);
                    para1.put("monthofexamination",month1);
                    para1.put("sem",sem);
                    para1.put("Date",date); 
                    a++;
                    b++;
                    c++;
                }
                if(Arrays.stream(array).anyMatch("F"::equals)){
                    para1.put("remark", "Unsuccessful");
                }else{
                   para1.put("remark", "Successful");
                }
                JasperReport jr = JasperCompileManager.compileReport(jd);
                JasperPrint jp = JasperFillManager.fillReport(jr,para1,conn);
                JasperViewer jv=new JasperViewer(jp,false);
                jv.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please select format");
            }

        }catch (JRException ex) {
            Logger.getLogger(abc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(abc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(abc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txt2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC1ActionPerformed
        // TODO add your handling code here:
        int itemCount = jC2.getItemCount();
        for(int i=0;i<itemCount;i++){
            jC2.removeItemAt(0);
        }
        //fill second combo box
        comboBox1text = String.valueOf(jC1.getSelectedItem());
        if (!comboBox1text.isEmpty() || comboBox1text != null) {
            // get data from DataBase with Distinct

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","root");
                //String sql =;
                PreparedStatement ps = con.prepareStatement("select semister1,semister2,semister3,semister4,semister5,semister6 from semister WHERE CourseName = '" + comboBox1text + "'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    jC2.addItem(rs.getString("semister1"));
                    jC2.addItem(rs.getString("semister2"));
                    jC2.addItem(rs.getString("semister3"));
                    jC2.addItem(rs.getString("semister4"));
                    jC2.addItem(rs.getString("semister5"));
                    jC2.addItem(rs.getString("semister6"));
                    // jC2.addItem(BItems)
                }
            } catch(Exception e) {
                System.out.println("Error:"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jC1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jC1;
    private javax.swing.JComboBox<String> jC2;
    private javax.swing.JComboBox<String> jC3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
