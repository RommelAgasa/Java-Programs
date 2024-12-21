/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_registration;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author romme
 */
public class studentRegistration extends javax.swing.JFrame {
    
    
    
    // Connection to Database --------------------------------------------------------------
    
    private static final String username = "root";
    private static final String password = "";
        private static final String databaseConnection = "jdbc:mysql://localhost:3307/studentregistration";
    
    Connection sqlConnection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    /**
     * Creates new form studentRegistration
     */
    public studentRegistration() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbGradeLevel = new javax.swing.JComboBox<>();
        cbSection = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDatabase = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtMotherName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        dateOfAdmission = new com.toedter.calendar.JDateChooser();
        dateOfBirth = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Student Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 210, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Father Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        txtFatherName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mothers Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Date of Birth");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        cbGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Gender");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Grade Level");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        cbGradeLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGradeLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven" }));
        jPanel3.add(cbGradeLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 210, -1));

        cbSection.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        jPanel3.add(cbSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 210, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Section");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Admission Date");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        jLabel4.setText("Phone Number");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Address");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 400, 80));

        txtEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 210, -1));

        jLabel11.setText("Email Adress");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 32));

        btnDatabase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDatabase.setText("RECORDS");
        btnDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatabaseActionPerformed(evt);
            }
        });
        jPanel2.add(btnDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 32));

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 120, 32));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 440, 90));

        txtMotherName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(txtMotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 210, -1));
        txtMotherName.getAccessibleContext().setAccessibleName("txtMother");

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 120, 32));

        dateOfAdmission.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(dateOfAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 210, -1));

        dateOfBirth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 210, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1030, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // DataTable ---------------------------------------------------------------------------------------------------------
    private void btnDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatabaseActionPerformed
        Data data = new Data();
        data.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatabaseActionPerformed

    private int gradeLevel(){
        
        switch(cbGradeLevel.getSelectedIndex()){
            case 0: return 1;
            case 1: return 2;
            case 2: return 3;
            case 3: return 4;
            case 4: return 5;
            case 5: return 6;
            case 6: return 7;
        }
        
        return 0;
    }
    
    private String classSection(){
        
        switch(cbSection.getSelectedIndex()){
            case 0: return "A";
            case 1: return "B";
            case 2: return "C";
            case 3: return "D";
        }
        
        return "A";
    }
    
    
    // Add  ---------------------------------------------------------------------------------------------------------
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(txtStudentName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your complete name.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            txtStudentName.requestFocus();
            return;
        }
        
        if(txtFatherName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your complete father name.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            txtFatherName.requestFocus();
            return;
        }
        
        
        if(txtMotherName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your complete mother name.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            txtMotherName.requestFocus();
            return;
        }
        
        
        Date date;
        date = dateOfBirth.getDate();
        if(date == null){
            JOptionPane.showMessageDialog(this, "Please enter your complete birth date.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            dateOfBirth.requestFocus();
            return;
        }
        
        date = dateOfAdmission.getDate();
        if(date == null){
            JOptionPane.showMessageDialog(this, "Please enter your complete the admission date.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            dateOfAdmission.requestFocus();
            return;
        }
        
        if(txtPhoneNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your complete phone number.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            txtPhoneNumber.requestFocus();
            return;
        }
  
        if(txtEmailAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your complete email address.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            txtEmailAddress.requestFocus();
            return;
        }
        
        if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your complete address.",
                    "Student Registration Management System", JOptionPane.INFORMATION_MESSAGE);
            txtAddress.requestFocus();
            return;
        }
        
        
        
        String studentName = txtStudentName.getText();
        String fatherName = txtFatherName.getText();
        String motherName = txtMotherName.getText();
        
        Date birthDate = dateOfBirth.getDate();
        SimpleDateFormat date_format = new SimpleDateFormat("dd-MM-yyyyy");
        String dateOfBirth = date_format.format(birthDate);
        
        Date addDate = dateOfAdmission.getDate();
        String admissionDate = date_format.format(addDate);
        
        String phone = txtPhoneNumber.getText();
        String address = txtAddress.getText();
        String email = txtEmailAddress.getText();
        String gender = "Male";
        
        if(cbGender.getSelectedIndex() == 1)
            gender = "Female";
        
        int gradeLevel = gradeLevel();
        String section = classSection();
        
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConnection = DriverManager.getConnection(databaseConnection, username, password);
            String addQuery = "Insert into record(name, fatherName, motherName, dateOfBirth, gender,"
                    + "gradeLevel, class, admissionDate, phone, address, emailAddress)"
                    + " Value('"+ studentName +"', '"+ fatherName +"', '"+ motherName +"', '"+ dateOfBirth +"', "
                    + "'"+ gender +"', '"+ gradeLevel +"', '"+ section +"', '"+ admissionDate +"', "
                    + "'"+ phone +"', '"+ address+ "', '"+ email +"')";
            preparedStatement = sqlConnection.prepareStatement(addQuery);
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Record has been saved", "Student Registration Management System",
                    JOptionPane.INFORMATION_MESSAGE);
            
            btnClearActionPerformed(evt);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(studentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    // Exit ---------------------------------------------------------------------------------------------------------
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        if(JOptionPane.showConfirmDialog(this, "Confirm if you want to exit.", "Student Registration Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    // Clear ---------------------------------------------------------------------------------------------------------
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtStudentName.setText("");
        txtFatherName.setText("");
        txtMotherName.setText("");
        cbGender.setSelectedIndex(0);
        cbGradeLevel.setSelectedIndex(0);
        cbSection.setSelectedIndex(0);
        txtPhoneNumber.setText("");
        txtEmailAddress.setText("");
        txtAddress.setText("");
        dateOfBirth.setCalendar(null);
        dateOfAdmission.setCalendar(null);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDatabase;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbGradeLevel;
    private javax.swing.JComboBox<String> cbSection;
    private com.toedter.calendar.JDateChooser dateOfAdmission;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}