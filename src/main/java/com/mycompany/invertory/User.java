/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.invertory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        UserTableFill();
         IdFill();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UserIdTextBox = new javax.swing.JTextField();
        UserNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UserPassTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserAddButton = new javax.swing.JButton();
        UserDeleteButton = new javax.swing.JButton();
        UserUpdateButton = new javax.swing.JButton();
        UserHomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        UserPhoneTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UserIdRoleTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setFocusable(false);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("СОФТУЕР СКЛАД");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ПОТРЕБИТЕЛИ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" X");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        UserIdTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        UserNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ИМЕ");

        UserPassTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ПАРОЛА");

        UserAddButton.setBackground(new java.awt.Color(0, 102, 102));
        UserAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UserAddButton.setForeground(new java.awt.Color(255, 255, 255));
        UserAddButton.setText("ДОБАВИ");
        UserAddButton.setToolTipText("");
        UserAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserAddButtonMouseClicked(evt);
            }
        });
        UserAddButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserAddButtonKeyPressed(evt);
            }
        });

        UserDeleteButton.setBackground(new java.awt.Color(0, 102, 102));
        UserDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UserDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        UserDeleteButton.setText("ИЗТРИЙ");
        UserDeleteButton.setToolTipText("");
        UserDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserDeleteButtonMouseClicked(evt);
            }
        });

        UserUpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        UserUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UserUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UserUpdateButton.setText("ПРОМЕНИ");
        UserUpdateButton.setToolTipText("");
        UserUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserUpdateButtonMouseClicked(evt);
            }
        });

        UserHomeButton.setBackground(new java.awt.Color(0, 102, 102));
        UserHomeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UserHomeButton.setForeground(new java.awt.Color(255, 255, 255));
        UserHomeButton.setText("ОБРАТНО");
        UserHomeButton.setToolTipText("");
        UserHomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserHomeButtonMouseClicked(evt);
            }
        });

        UserTable.setBackground(new java.awt.Color(0, 153, 153));
        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ИМЕ", "ПАРОЛА", "ТЕЛЕФОН", "ID ВИД ПОТРЕБИТЕЛ"
            }
        ));
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UserTable);
        if (UserTable.getColumnModel().getColumnCount() > 0) {
            UserTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        UserPhoneTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ТЕЛЕФОН");

        UserIdRoleTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID ВИД ПОТРЕБИТЕЛ");

        NewButton.setBackground(new java.awt.Color(0, 102, 102));
        NewButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NewButton.setForeground(new java.awt.Color(255, 255, 255));
        NewButton.setText("НОВ");
        NewButton.setToolTipText("");
        NewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserIdRoleTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(UserPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserPassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UserHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(UserAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UserUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(UserDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserPassTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserIdRoleTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void IdFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT MAX(User_id) as User_id FROM invertorydb.`User`;");
            if (Rs.next()){
            int i = Rs.getInt("User_id");
            int id = i+1;
            UserIdTextBox.setText(String.valueOf(id));
            }else{
            UserIdTextBox.setText("1");
            }
            Con.close();
            UserNameTextBox.requestFocusInWindow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
     
     public void Clear() {
        UserIdTextBox.setText("");
        UserNameTextBox.setText("");
        UserPassTextBox.setText("");
        UserPhoneTextBox.setText("");
        UserIdRoleTextBox.setText("");
     }
    
    public void UserTableFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from User");
            UserTable.setModel(DbUtils.resultSetToTableModel(Rs));
            UserTable.getColumnModel().getColumn( 0 ).setHeaderValue( "ID" );
            UserTable.getColumnModel().getColumn( 1 ).setHeaderValue( "ИМЕ" );
            UserTable.getColumnModel().getColumn( 2 ).setHeaderValue( "ПАРОЛА" );
            UserTable.getColumnModel().getColumn( 1 ).setHeaderValue( "ТЕЛЕФОН" );
            UserTable.getColumnModel().getColumn( 2 ).setHeaderValue( "ID ВИД ПОТРЕБИТЕЛ" );
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void UserAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserAddButtonMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            PreparedStatement add = Con.prepareStatement("insert into User VALUES(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(UserIdTextBox.getText()));
            add.setString(2, (UserNameTextBox.getText()));
            add.setString(3, (UserPassTextBox.getText()));
            add.setString(4, (UserPhoneTextBox.getText()));
            add.setString(5, (UserIdRoleTextBox.getText()));

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Потребителя е добавен");
            Con.close();
            UserTableFill();
            Clear();
            IdFill();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_UserAddButtonMouseClicked

    private void UserAddButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserAddButtonKeyPressed

    }//GEN-LAST:event_UserAddButtonKeyPressed

    private void UserDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserDeleteButtonMouseClicked
        if (UserIdTextBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Няма избран потребител за изтриване");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
                String Id = UserIdTextBox.getText();
                String Qwery = "Delete from invertorydb.User where User_id=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Qwery);
                Con.close();
                UserTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Потребителя е изтрит");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UserDeleteButtonMouseClicked

    private void UserUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserUpdateButtonMouseClicked
        if (UserIdTextBox.getText().isEmpty()||UserNameTextBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Липсва пълна информация за потребител");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
                String UpdateQwery = "Update invertorydb.User set User_name='"+UserNameTextBox.getText()+"'"+",User_pass='"+UserPassTextBox.getText()+"'"+",User_phone='"+UserPhoneTextBox.getText()+"'"+",User_role_id='"+UserIdRoleTextBox.getText()+"'"+"where User_id="+UserIdTextBox.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQwery);
                Con.close();
                UserTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Потребителя е променен");
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UserUpdateButtonMouseClicked

    private void UserHomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserHomeButtonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserHomeButtonMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)UserTable.getModel();
        int MyIndex = UserTable.getSelectedRow();
        UserIdTextBox.setText(model.getValueAt(MyIndex, 0).toString());
        UserNameTextBox.setText(model.getValueAt(MyIndex, 1).toString());
        UserPassTextBox.setText(model.getValueAt(MyIndex, 2).toString());
        UserPhoneTextBox.setText(model.getValueAt(MyIndex, 3).toString());
        UserIdRoleTextBox.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_UserTableMouseClicked

    private void NewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewButtonMouseClicked

        Clear();
        IdFill();
    }//GEN-LAST:event_NewButtonMouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewButton;
    private javax.swing.JButton UserAddButton;
    private javax.swing.JButton UserDeleteButton;
    private javax.swing.JButton UserHomeButton;
    private javax.swing.JTextField UserIdRoleTextBox;
    private javax.swing.JTextField UserIdTextBox;
    private javax.swing.JTextField UserNameTextBox;
    private javax.swing.JTextField UserPassTextBox;
    private javax.swing.JTextField UserPhoneTextBox;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton UserUpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
