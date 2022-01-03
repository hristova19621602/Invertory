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
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        CustomerTableFill();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CustomerIdTextBox = new javax.swing.JTextField();
        CustomerNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustomerPhoneTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CustomerAddButton = new javax.swing.JButton();
        CustomerDeleteButton = new javax.swing.JButton();
        CustomerUpdateButton = new javax.swing.JButton();
        CustomerHomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        NewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("СОФТУЕР СКЛАД");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("КЛИЕНТИ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" X");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        CustomerIdTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        CustomerNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ИМЕ");

        CustomerPhoneTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ТЕЛЕФОН");

        CustomerAddButton.setBackground(new java.awt.Color(0, 102, 102));
        CustomerAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CustomerAddButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerAddButton.setText("ДОБАВИ");
        CustomerAddButton.setToolTipText("");
        CustomerAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerAddButtonMouseClicked(evt);
            }
        });
        CustomerAddButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CustomerAddButtonKeyPressed(evt);
            }
        });

        CustomerDeleteButton.setBackground(new java.awt.Color(0, 102, 102));
        CustomerDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CustomerDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerDeleteButton.setText("ИЗТРИЙ");
        CustomerDeleteButton.setToolTipText("");
        CustomerDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerDeleteButtonMouseClicked(evt);
            }
        });

        CustomerUpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        CustomerUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CustomerUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerUpdateButton.setText("ПРОМЕНИ");
        CustomerUpdateButton.setToolTipText("");
        CustomerUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerUpdateButtonMouseClicked(evt);
            }
        });

        CustomerHomeButton.setBackground(new java.awt.Color(0, 102, 102));
        CustomerHomeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CustomerHomeButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerHomeButton.setText("ОБРАТНО");
        CustomerHomeButton.setToolTipText("");
        CustomerHomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerHomeButtonMouseClicked(evt);
            }
        });

        CustomerTable.setBackground(new java.awt.Color(0, 153, 153));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ИМЕ", "ТЕЛЕФОН"
            }
        ));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CustomerIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CustomerPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CustomerAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CustomerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerPhoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(73, 73, 73)
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            Rs = St.executeQuery("SELECT MAX(Customer_id) as Customer_id FROM invertorydb.`Customer`;");
            if (Rs.next()){
            int i = Rs.getInt("Customer_id");
            int id = i+1;
            CustomerIdTextBox.setText(String.valueOf(id));
            }else{
            CustomerIdTextBox.setText("1");
            }
            Con.close();
            CustomerNameTextBox.requestFocusInWindow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
     
     public void Clear() {
        CustomerIdTextBox.setText("");
        CustomerNameTextBox.setText("");
        CustomerPhoneTextBox.setText("");
     }
    
     public void CustomerTableFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Customer");
            CustomerTable.setModel(DbUtils.resultSetToTableModel(Rs));
            CustomerTable.getColumnModel().getColumn( 0 ).setHeaderValue( "ID" );
            CustomerTable.getColumnModel().getColumn( 1 ).setHeaderValue( "ИМЕ" );
            CustomerTable.getColumnModel().getColumn( 2 ).setHeaderValue( "ТЕЛЕФОН" );
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void CustomerAddButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerAddButtonKeyPressed
      
    }//GEN-LAST:event_CustomerAddButtonKeyPressed

    private void CustomerAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerAddButtonMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            PreparedStatement add = Con.prepareStatement("insert into Customer VALUES(?,?,?)");
            add.setInt(1, Integer.valueOf(CustomerIdTextBox.getText()));
            add.setString(2, (CustomerNameTextBox.getText()));
            add.setString(3, (CustomerPhoneTextBox.getText()));
           
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Клиента е добавен");
            Con.close();
            CustomerTableFill();
            Clear();
            IdFill();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CustomerAddButtonMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
       int MyIndex = CustomerTable.getSelectedRow();
       CustomerIdTextBox.setText(model.getValueAt(MyIndex, 0).toString());
       CustomerNameTextBox.setText(model.getValueAt(MyIndex, 1).toString());
       CustomerPhoneTextBox.setText(model.getValueAt(MyIndex, 2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void CustomerUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerUpdateButtonMouseClicked
        if (CustomerIdTextBox.getText().isEmpty()||CustomerNameTextBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Липсва пълна информация за клиент");
        }
        else{
            try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234"); 
               String UpdateQwery = "Update invertorydb.Customer set Customer_name='"+CustomerNameTextBox.getText()+"'"+",Customer_phone='"+CustomerPhoneTextBox.getText()+"'"+"where Customer_id="+CustomerIdTextBox.getText();
               Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQwery);
                Con.close();
                CustomerTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Клиентa е променен");
            }catch (SQLException e) {
                e.printStackTrace();
        }
    }   
    }//GEN-LAST:event_CustomerUpdateButtonMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void CustomerDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerDeleteButtonMouseClicked
         if (CustomerIdTextBox.getText().isEmpty()||CustomerNameTextBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Няма избран клиент за изтриване");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
                String Id = CustomerIdTextBox.getText();
                String Qwery = "Delete from invertorydb.Customer where Customer_id=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Qwery);
                Con.close();
                CustomerTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Клиента е изтрит");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_CustomerDeleteButtonMouseClicked

    private void NewButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewButtonMouseClicked

        Clear();
        IdFill();
    }//GEN-LAST:event_NewButtonMouseClicked

    private void CustomerHomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerHomeButtonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerHomeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerAddButton;
    private javax.swing.JButton CustomerDeleteButton;
    private javax.swing.JButton CustomerHomeButton;
    private javax.swing.JTextField CustomerIdTextBox;
    private javax.swing.JTextField CustomerNameTextBox;
    private javax.swing.JTextField CustomerPhoneTextBox;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton CustomerUpdateButton;
    private javax.swing.JButton NewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
