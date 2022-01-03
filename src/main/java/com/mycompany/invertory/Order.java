/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.invertory;

import java.awt.Component;
import java.awt.print.PrinterException;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.h2.util.New;

/**
 *
 * @author Acer
 */
public class Order extends javax.swing.JFrame {

    private MessageFormat header;
   // public String role;

    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        ProductTableFill();
        CustomerTableFill();
        GetToday();
        IdFill();
       // role ="operator";
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TotalTextBox = new javax.swing.JTextField();
        ProductNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustomerNameTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProductQtyTextBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProductSalePriceTextBox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        OrderAddButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        DateTextBox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ProductCatTextBox = new javax.swing.JTextField();
        OrdertIdTextBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InvoiceTextArea = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        DelTotalTextBox = new javax.swing.JTextField();
        ProductDelPriceTextBox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

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
        jLabel9.setText("ФАКТУРИ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(395, 395, 395)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ДАТА");

        TotalTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        ProductNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ПРОДУКТ");

        CustomerNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("КЛИЕНТ");

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

        OrderAddButton.setBackground(new java.awt.Color(0, 102, 102));
        OrderAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OrderAddButton.setForeground(new java.awt.Color(255, 255, 255));
        OrderAddButton.setText("ЗАПИШИ");
        OrderAddButton.setToolTipText("");
        OrderAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderAddButtonMouseClicked(evt);
            }
        });
        OrderAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderAddButtonActionPerformed(evt);
            }
        });

        PrintButton.setBackground(new java.awt.Color(0, 102, 102));
        PrintButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PrintButton.setForeground(new java.awt.Color(255, 255, 255));
        PrintButton.setText("ПРИНТИРАЙ");
        PrintButton.setToolTipText("");
        PrintButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintButtonMouseClicked(evt);
            }
        });
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
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

        CustomerTable.setBackground(new java.awt.Color(204, 255, 204));
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
        jScrollPane2.setViewportView(CustomerTable);

        OrderTable.setBackground(new java.awt.Color(204, 255, 204));
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ДАТА", "КЛИЕНТ", "ПРОДУКТ", "КАТЕГОРИЯ", "КОЛИЧЕСТВО", "ДОСТ. ЦЕНА", "ПРОД. ЦЕНА"
            }
        ));
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(OrderTable);

        DateTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ОРДЕР ID");

        ProductCatTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        OrdertIdTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Продажна сума");

        InvoiceTextArea.setColumns(20);
        InvoiceTextArea.setRows(5);
        jScrollPane4.setViewportView(InvoiceTextArea);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Доставна сума");

        DelTotalTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        ProductDelPriceTextBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ДОСТ.ЦЕНА");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OrdertIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CustomerNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(49, 49, 49)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductCatTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ProductQtyTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ProductDelPriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ProductSalePriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PrintButton)
                            .addComponent(OrderAddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DelTotalTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TotalTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductSalePriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductDelPriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ProductQtyTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(OrdertIdTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustomerNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProductCatTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrderAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DelTotalTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(TotalTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     
    
     public void IdFill() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT MAX(Order_id) as Order_id FROM invertorydb.`order`;");
            if (Rs.next()){
            int i = Rs.getInt("Order_id");
            int id = i+1;
            OrdertIdTextBox.setText(String.valueOf(id));
            
            }else{
            OrdertIdTextBox.setText("1");
            }
            Con.close();
            ProductQtyTextBox.requestFocusInWindow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
      
      private void GetToday(){
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDateTime now = LocalDateTime.now();
          DateTextBox.setText(dtf.format(now));
      }
    
      public void ClearTextBox() {
              //CustomerNameTextBox.setText("");
              ProductNameTextBox.setText("");
              ProductCatTextBox.setText("");
              ProductQtyTextBox.setText("");
              ProductSalePriceTextBox.setText("");
              ProductDelPriceTextBox.setText("");
    }
      
       public void updateQty() {
           int newQty = oldQty - Integer.valueOf(ProductQtyTextBox.getText());
           if(newQty<1)
           {
              JOptionPane.showMessageDialog(this, "Изчерпана наличност"); 
           }
              else{
              try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234"); 
               String UpdateQwery = "Update invertorydb.`PRODUCTTBL` set Product_qty= "+newQty+""+" where Product_id="+productId;
               Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQwery);
                Con.close();
                ProductTableFill();
            }catch (SQLException e) {
                e.printStackTrace();
            }
            }       
           
    }
      
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    int i=1;
    double saleTot, saleTotal, delTot;
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
              if(flag==0 || OrdertIdTextBox.getText().isEmpty() ||CustomerNameTextBox.getText().isEmpty() || ProductQtyTextBox.getText().isEmpty())
              {
                   JOptionPane.showMessageDialog(this, "Моля попълнете коректно");
              }
              else{
        saleTot = Integer.valueOf(ProductQtyTextBox.getText())*Double.valueOf(ProductSalePriceTextBox.getText());
        delTot = Integer.valueOf(ProductQtyTextBox.getText())*Double.valueOf(ProductDelPriceTextBox.getText());
              Vector v = new Vector();
              v.add(i);
              v.add(DateTextBox.getText());
              v.add(CustomerNameTextBox.getText());
              v.add(ProductNameTextBox.getText());
              v.add(ProductCatTextBox.getText());
              v.add(ProductQtyTextBox.getText());
              v.add(ProductDelPriceTextBox.getText());
              v.add(ProductSalePriceTextBox.getText());
              v.add(saleTot);
              DefaultTableModel model = (DefaultTableModel)OrderTable.getModel();
              model.addRow(v);
              saleTotal=saleTot+saleTotal;
              delTotal=delTot+delTotal;
              String s=Double.toString(saleTotal);
              String d=Double.toString(delTotal);
              
//              DecimalFormat df = new DecimalFormat("#.##");
//              df.setRoundingMode(RoundingMode.HALF_UP);
//              String s = df.format(Double.toString(saleTotal));
//              String dd = df.format(d);
               // DecimalFormat currencyFormat = new DecimalFormat("0.00");
                //double s=currencyFormat.format(Double.toString(saleTotal));

              TotalTextBox.setText(s); 
              
              DelTotalTextBox.setText(d);
              updateQty();
              
              if (i==1)
              {
                 InvoiceTextArea.setAlignmentX(TOP_ALIGNMENT);
                 InvoiceTextArea.setText("          ФАКТУРА: " + OrdertIdTextBox.getText()+"  Дата: "+ DateTextBox.getText()+"\nКлиент: "+CustomerNameTextBox.getText()+"\n\n"+"Ном.     Продукт     Категория    Кол.     Цена      Сума\n"+i+"           "+
                 ProductNameTextBox.getText()+"        "+ProductCatTextBox.getText()+"         "+ProductQtyTextBox.getText()+"           "+ProductSalePriceTextBox.getText()+"        "+saleTot+"\n");
              }else
              {
                  InvoiceTextArea.setText(InvoiceTextArea.getText()+i+"           "+ProductNameTextBox.getText()+"        "+ProductCatTextBox.getText()+"         "+ProductQtyTextBox.getText()+"           "+ProductSalePriceTextBox.getText()+"        "+saleTot+"\n");
              }
              i++;
              ClearTextBox();
                      }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void OrderAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderAddButtonActionPerformed

    }//GEN-LAST:event_OrderAddButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed

    }//GEN-LAST:event_PrintButtonActionPerformed

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeButtonMouseClicked
int flag = 0, oldQty, productId;
double delTotal;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int MyIndex = ProductTable.getSelectedRow();
        oldQty = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        if(oldQty<1){
            JOptionPane.showMessageDialog(this, "Изчерпана наличност"); 
        }
        else
        {
        productId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        ProductNameTextBox.setText(model.getValueAt(MyIndex, 1).toString());
        ProductDelPriceTextBox.setText(model.getValueAt(MyIndex, 3).toString());
        ProductSalePriceTextBox.setText(model.getValueAt(MyIndex, 4).toString());
        ProductCatTextBox.setText(model.getValueAt(MyIndex, 5).toString());
        flag=1;
        ProductQtyTextBox.requestFocusInWindow();
        }
    }//GEN-LAST:event_ProductTableMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
        int MyIndex = CustomerTable.getSelectedRow();
        //CustomerIdTextBox.setText(model.getValueAt(MyIndex, 0).toString());
        CustomerNameTextBox.setText(model.getValueAt(MyIndex, 1).toString());
        ProductQtyTextBox.requestFocusInWindow();
        //CustomerPhoneTextBox.setText(model.getValueAt(MyIndex, 2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderTableMouseClicked

    private void OrderAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderAddButtonMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InvertoryDB", "kangaro", "1234");
            PreparedStatement add = Con.prepareStatement("INSERT into invertorydb.`order` VALUES(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(OrdertIdTextBox.getText()));
            add.setString(2, (DateTextBox.getText()));
            add.setString(3, (CustomerNameTextBox.getText()));
            add.setDouble(4, Double.valueOf(DelTotalTextBox.getText()));
            add.setDouble(5, Double.valueOf(TotalTextBox.getText()));
            add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Фактурата е записана");
            Con.close();
            IdFill();
            InvoiceTextArea.setText("");
            CustomerNameTextBox.setText("");
            DelTotalTextBox.setText("");
            TotalTextBox.setText("");
            ((DefaultTableModel)OrderTable.getModel()).setNumRows(0);
            i=1;
            ProductQtyTextBox.requestFocusInWindow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_OrderAddButtonMouseClicked

    private void PrintButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintButtonMouseClicked
       
        try {
            if(InvoiceTextArea.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Няма фактура за печат");
            }else
            {
            InvoiceTextArea.print();
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_PrintButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField CustomerNameTextBox;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JTextField DateTextBox;
    private javax.swing.JTextField DelTotalTextBox;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextArea InvoiceTextArea;
    private javax.swing.JButton OrderAddButton;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTextField OrdertIdTextBox;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTextField ProductCatTextBox;
    private javax.swing.JTextField ProductDelPriceTextBox;
    private javax.swing.JTextField ProductNameTextBox;
    private javax.swing.JTextField ProductQtyTextBox;
    private javax.swing.JTextField ProductSalePriceTextBox;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTextField TotalTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
