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
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        CategoryTableFill();
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
        CategoryIdTextBox = new javax.swing.JTextField();
        CategoryNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CategoryAddButton = new javax.swing.JButton();
        CategoryDeleteButton = new javax.swing.JButton();
        CategoryUpdateButton = new javax.swing.JButton();
        CategoryHomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
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
        jLabel5.setText("КАТЕГОРИИ");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        CategoryIdTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        CategoryNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ИМЕ");

        CategoryAddButton.setBackground(new java.awt.Color(0, 102, 102));
        CategoryAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CategoryAddButton.setForeground(new java.awt.Color(255, 255, 255));
        CategoryAddButton.setText("ДОБАВИ");
        CategoryAddButton.setToolTipText("");
        CategoryAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryAddButtonMouseClicked(evt);
            }
        });

        CategoryDeleteButton.setBackground(new java.awt.Color(0, 102, 102));
        CategoryDeleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CategoryDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        CategoryDeleteButton.setText("ИЗТРИЙ");
        CategoryDeleteButton.setToolTipText("");
        CategoryDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryDeleteButtonMouseClicked(evt);
            }
        });

        CategoryUpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        CategoryUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CategoryUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        CategoryUpdateButton.setText("ПРОМЕНИ");
        CategoryUpdateButton.setToolTipText("");
        CategoryUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryUpdateButtonMouseClicked(evt);
            }
        });

        CategoryHomeButton.setBackground(new java.awt.Color(0, 102, 102));
        CategoryHomeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CategoryHomeButton.setForeground(new java.awt.Color(255, 255, 255));
        CategoryHomeButton.setText("ОБРАТНО");
        CategoryHomeButton.setToolTipText("");
        CategoryHomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryHomeButtonMouseClicked(evt);
            }
        });

        CategoryTable.setBackground(new java.awt.Color(0, 153, 153));
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ИМЕ"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoryNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CategoryHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CategoryAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CategoryUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CategoryDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CategoryIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CategoryNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(115, 115, 115)
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CategoryHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void IdFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT MAX(Category_id) as Category_id FROM invertorydb.`Category`;");
            if (Rs.next()){
            int i = Rs.getInt("Category_id");
            int id = i+1;
            CategoryIdTextBox.setText(String.valueOf(id));
            }else{
            CategoryIdTextBox.setText("1");
            }
            Con.close();
            CategoryNameTextBox.requestFocusInWindow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
     
     public void Clear() {
        CategoryIdTextBox.setText("");
        CategoryNameTextBox.setText("");
     }
    
     public void CategoryTableFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from Category");
            CategoryTable.setModel(DbUtils.resultSetToTableModel(Rs));
            CategoryTable.getColumnModel().getColumn( 0 ).setHeaderValue( "ID" );
            CategoryTable.getColumnModel().getColumn( 1 ).setHeaderValue( "ИМЕ НА КАТЕГОРИЯ" );
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void CategoryAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryAddButtonMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            PreparedStatement add = Con.prepareStatement("insert into Category VALUES(?,?) ");
            add.setInt(1, Integer.valueOf(CategoryIdTextBox.getText()));
            add.setString(2, (CategoryNameTextBox.getText()));
           
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Категорията е добавенa");
            Con.close();
            CategoryTableFill();
            Clear();
            IdFill();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CategoryAddButtonMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void CategoryUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryUpdateButtonMouseClicked
        if (CategoryIdTextBox.getText().isEmpty()||CategoryNameTextBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Липсва пълна информация за категорията");
        }
        else{
            try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234"); 
               String UpdateQwery = "Update invertorydb.Category set Category_name='"+CategoryNameTextBox.getText()+"'"+"where Category_id="+CategoryIdTextBox.getText();
               Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQwery);
                Con.close();
                CategoryTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Категорията е променена");
            }catch (SQLException e) {
                e.printStackTrace();
        }
    }   
    }//GEN-LAST:event_CategoryUpdateButtonMouseClicked

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)CategoryTable.getModel();
       int MyIndex = CategoryTable.getSelectedRow();
       CategoryIdTextBox.setText(model.getValueAt(MyIndex, 0).toString());
       CategoryNameTextBox.setText(model.getValueAt(MyIndex, 1).toString());
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void CategoryDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryDeleteButtonMouseClicked
         if (CategoryIdTextBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Няма избрана категория за изтриване");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
                String Id = CategoryIdTextBox.getText();
                String Qwery = "Delete from invertorydb.Category where Category_id=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Qwery);
                Con.close();
                CategoryTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Категорията е изтрита");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_CategoryDeleteButtonMouseClicked

    private void CategoryHomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryHomeButtonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryHomeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CategoryAddButton;
    private javax.swing.JButton CategoryDeleteButton;
    private javax.swing.JButton CategoryHomeButton;
    private javax.swing.JTextField CategoryIdTextBox;
    private javax.swing.JTextField CategoryNameTextBox;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton CategoryUpdateButton;
    private javax.swing.JButton NewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
