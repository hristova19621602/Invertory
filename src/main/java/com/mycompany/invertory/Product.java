/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.invertory;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Acer
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        ProductTableFill();
        IdFill();
        getCat();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ProductIdTextBox = new javax.swing.JTextField();
        ProductNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ProductDelPriceTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProductQtyTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProductSalePriceTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ProductCatComboBox = new javax.swing.JComboBox<>();
        AddButton = new javax.swing.JButton();
        DelButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        NewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("СОФТУЕР СКЛАД");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" X");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ПРОДУКТИ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(345, 345, 345)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        ProductIdTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        ProductNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ПРОДУКТ");

        ProductDelPriceTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ДОСТ. ЦЕНА");

        ProductQtyTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("КОЛИЧЕСТВО");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ПРОД. ЦЕНА");

        ProductSalePriceTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("КАТЕГОРИЯ");

        ProductCatComboBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        AddButton.setBackground(new java.awt.Color(0, 102, 102));
        AddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ДОБАВИ");
        AddButton.setToolTipText("");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        DelButton.setBackground(new java.awt.Color(0, 102, 102));
        DelButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DelButton.setForeground(new java.awt.Color(255, 255, 255));
        DelButton.setText("ИЗТРИЙ");
        DelButton.setToolTipText("");
        DelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(0, 102, 102));
        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("ПРОМЕНИ");
        UpdateButton.setToolTipText("");
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
        });
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        HomeButton.setBackground(new java.awt.Color(0, 102, 102));
        HomeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("ОБРАТНО");
        HomeButton.setToolTipText("");
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
        });

        ProductTable.setBackground(new java.awt.Color(204, 255, 204));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ПРОДУКТ", "КОЛИЧЕСТВО", "ДОСТ. ЦЕНА", "ПРОД. ЦЕНА", "КАТЕГОРИЯ"
            }
        ));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ProductSalePriceTextBox)
                                .addComponent(ProductCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ProductNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductDelPriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductQtyTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
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
                                    .addComponent(ProductIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ProductNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductQtyTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(ProductDelPriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ProductSalePriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap())
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

    private void getCat(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            String Query=("SELECT * FROM invertorydb.`Category`;");
            Rs= St.executeQuery(Query);
            while (Rs.next()){
            String myCat = Rs.getString("Category_name");
            ProductCatComboBox.addItem(myCat);
            }
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public void IdFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT MAX(Product_id) as Product_id FROM invertorydb.`PRODUCTTBL`;");
            if (Rs.next()){
            int i = Rs.getInt("Product_id");
            int id = i+1;
            ProductIdTextBox.setText(String.valueOf(id));
            }else{
            ProductIdTextBox.setText("1");
            }
            Con.close();
            ProductNameTextBox.requestFocusInWindow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
     
     public void Clear() {
        ProductIdTextBox.setText("");
        ProductNameTextBox.setText("");
        ProductQtyTextBox.setText("");
        ProductDelPriceTextBox.setText("");
        ProductSalePriceTextBox.setText("");
     }
    
    public void ProductTableFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from PRODUCTTBL");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
            ProductTable.getColumnModel().getColumn( 0 ).setHeaderValue( "ID" );
            ProductTable.getColumnModel().getColumn( 1 ).setHeaderValue( "ИМЕ" );
            ProductTable.getColumnModel().getColumn( 2 ).setHeaderValue( "КОЛИЧЕСТВО" );
            ProductTable.getColumnModel().getColumn( 3 ).setHeaderValue( "ДОСТ. ЦЕНА" );
            ProductTable.getColumnModel().getColumn( 4 ).setHeaderValue( "ПРОД. ЦЕНА" );
            ProductTable.getColumnModel().getColumn( 5 ).setHeaderValue( "КАТЕГОРИЯ" );
            Con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL VALUES(?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(ProductIdTextBox.getText()));
            add.setString(2, (ProductNameTextBox.getText()));
            add.setInt(3, Integer.valueOf(ProductQtyTextBox.getText()));
            add.setDouble(4, Double.valueOf(ProductDelPriceTextBox.getText()));
            add.setDouble(5, Double.valueOf(ProductSalePriceTextBox.getText()));
            add.setString(6, ProductCatComboBox.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Продукта е добавен");
            Con.close();
            ProductTableFill();
            Clear();
            IdFill();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void DelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelButtonActionPerformed
        if (ProductIdTextBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Няма избран продукт за изтриване");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
                String Id = ProductIdTextBox.getText();
                String Qwery = "Delete from invertorydb.PRODUCTTBL where Product_id=" + Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Qwery);
                Con.close();
                ProductTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Продукта е изтрит");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelButtonActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
       int MyIndex = ProductTable.getSelectedRow();
       ProductIdTextBox.setText(model.getValueAt(MyIndex, 0).toString());
       ProductNameTextBox.setText(model.getValueAt(MyIndex, 1).toString());
       ProductQtyTextBox.setText(model.getValueAt(MyIndex, 2).toString());
       ProductDelPriceTextBox.setText(model.getValueAt(MyIndex, 3).toString());
       ProductSalePriceTextBox.setText(model.getValueAt(MyIndex, 4).toString());
       ProductCatComboBox.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if (ProductIdTextBox.getText().isEmpty()||ProductNameTextBox.getText().isEmpty()||ProductQtyTextBox.getText().isEmpty()
                ||ProductDelPriceTextBox.getText().isEmpty()|| ProductSalePriceTextBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Липсва пълна информация за продукта");
        }
        else{
            try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234"); 
               String UpdateQwery = "Update invertorydb.PRODUCTTBL set Product_name='"+ProductNameTextBox.getText()+"'"+",Product_qty="+ProductQtyTextBox.getText()+""+",Product_del_price="+ProductDelPriceTextBox.getText()+""+",Product_sale_price="+ProductSalePriceTextBox.getText()+""+",Product_category='"+ProductCatComboBox.getSelectedItem().toString()+"'"+"where Product_id="+ProductIdTextBox.getText();
               Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQwery);
                Con.close();
                ProductTableFill();
                Clear();
                IdFill();
                JOptionPane.showMessageDialog(this, "Продукта е променен");
            }catch (SQLException e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed
    }
    
    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonMouseClicked

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DelButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton NewButton;
    private javax.swing.JComboBox<String> ProductCatComboBox;
    private javax.swing.JTextField ProductDelPriceTextBox;
    private javax.swing.JTextField ProductIdTextBox;
    private javax.swing.JTextField ProductNameTextBox;
    private javax.swing.JTextField ProductQtyTextBox;
    private javax.swing.JTextField ProductSalePriceTextBox;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
