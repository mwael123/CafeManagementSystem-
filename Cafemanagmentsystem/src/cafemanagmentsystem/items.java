package cafemanagmentsystem;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.* ;

public class items extends javax.swing.JFrame {

    /**
     * Creates new form items
     */
    public items() {
        initComponents();
        ShowProduct();
    }
   ResultSet Rs=null, Rs1 = null ;
   Connection con= null;
   Statement st=null, st1 = null ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PrNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Filtercb = new javax.swing.JComboBox<>();
        PrCatCb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        deletebill = new javax.swing.JButton();
        addbill = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductList = new javax.swing.JTable();
        editbill1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Ageo Personal Use Med", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        PrNameTb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        PrNameTb.setForeground(new java.awt.Color(255, 0, 102));
        PrNameTb.setToolTipText("");
        PrNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrNameTbActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Ageo Personal Use Med", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Items Managment");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ageo Personal Use Med", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ageo Personal Use Med", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");

        PriceTb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 0, 102));
        PriceTb.setToolTipText("");
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Ageo Personal Use Med", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Items List");

        Filtercb.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        Filtercb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage  ", "Snacks" }));
        Filtercb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltercbItemStateChanged(evt);
            }
        });
        Filtercb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltercbActionPerformed(evt);
            }
        });

        PrCatCb.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        PrCatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage  ", "Snacks" }));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ageo Personal Use Med", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Filter");

        RefreshBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(255, 0, 0));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        deletebill.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        deletebill.setForeground(new java.awt.Color(255, 0, 0));
        deletebill.setText("Delete ");
        deletebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebillActionPerformed(evt);
            }
        });

        addbill.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        addbill.setForeground(new java.awt.Color(255, 0, 0));
        addbill.setText("Add");
        addbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbillActionPerformed(evt);
            }
        });

        ProductList.setBackground(new java.awt.Color(242, 242, 242));
        ProductList.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        ProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        ProductList.setRowHeight(29);
        ProductList.setShowGrid(false);
        ProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductList);

        editbill1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        editbill1.setForeground(new java.awt.Color(255, 0, 0));
        editbill1.setText("Edit");
        editbill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbill1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(addbill, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editbill1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259)
                .addComponent(deletebill, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Filtercb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RefreshBtn)))
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(206, 206, 206)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceTb))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Filtercb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editbill1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebill, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int Prnum ;
    private void CountProd()
    {
        try {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select max(PNum)from ProductTbl");
        rs.next();
        Prnum = Rs1.getInt(1)+1;
        
        }catch (Exception e) {
             
        }
    }
    private void ShowProduct()
    {
        try {
           con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]","root","Ahmed1234@.");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from ProductTbl");
           ProductList.setModel(Dbutils.ResultSetToTableModel((result) Rs));
        }catch (Exception e) {
        }
        
    }
    private void FilterProduct()
    {
        try {
           Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Ahmed1234@.");
           st = con.createStatement() ;
           Rs = st.executeQuery("select * from ProductTbl where category ='"+Filtercb.getSelectedItem().toString()+"'");
           ProductList.setModel(Dbutils.ResultSetToTableModel((result) Rs));

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }
    private void PrNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrNameTbActionPerformed

    }//GEN-LAST:event_PrNameTbActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed

    }//GEN-LAST:event_PriceTbActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
     if (PrNameTb.getText().isEmpty() || PriceTb.getText().isEmpty() || PrCatCb.getSelectedIndex() == -1)
    {
        JOptionPane.showMessageDialog(this, "missing information !!! try again ");
    }  else { try {
    CountProd();
    Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Ahmed1234@.");
    PreparedStatement Pst = con.prepareStatement("update ProductTbl set PName=?,category=?,price=?,where PNum=?");
    Pst.setInt(4, key );
    Pst.setString(1,PrNameTb.getText());
    Pst.setString(2, PrCatCb.getSelectedItem().toString());
    Pst.setInt(3, Integer.valueOf(PriceTb.getText()));
    int row = Pst.executeUpdate();
    JOptionPane.showMessageDialog(this, "item updated successfully !!! ");
    con.close();
    ShowProduct ();
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }  
    }//GEN-LAST:event_RefreshBtnActionPerformed
    }
    
    private void deletebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebillActionPerformed
        // TODO add your handling code here:
      if (PrNameTb.getText().isEmpty() || PriceTb.getText().isEmpty() || PrCatCb.getSelectedIndex() == -1)
    {
        JOptionPane.showMessageDialog(this, "missing information !!! try again ");
    }  else { try {
        CountProd();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Ahmed1234@.");
        PreparedStatement Pst = con.prepareStatement("delete from ProductTbl where PNum = ?");
        Pst.setInt(1, key);
        int row = Pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "item deleted successfully ");
        con.close();
        ShowProduct ();
    }   catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
    }                                   
    }//GEN-LAST:event_deletebillActionPerformed
    }
    private void addbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbillActionPerformed
    if (PrNameTb.getText().isEmpty() || PriceTb.getText().isEmpty() || PrCatCb.getSelectedIndex() == -1)
    { 
        JOptionPane.showMessageDialog(this, "missing information !!! try again ");
    }else { try {
        CountProd();
        Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Ahmed1234@.");
        PreparedStatement Pst = con.prepareStatement("insert into ProductTbl values (?,?,?,?)");
        Pst.setInt(1, Prnum);
        Pst.setString(2,PrNameTb.getText());
        Pst.setString(3, PrCatCb.getSelectedItem().toString());
        Pst.setInt(4, Integer.valueOf(PriceTb.getText()));
        int row = Pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "item added successfully ");
        con.close(); 
        ShowProduct ();
      } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, ex);
        }                                      
    }//GEN-LAST:event_addbillActionPerformed
}
    private void FiltercbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltercbItemStateChanged
    FilterProduct ();  
    }//GEN-LAST:event_FiltercbItemStateChanged
    int key =0;
    private void ProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductListMouseClicked
        // TODO add your handling code here:
         DefaultTableModel Model = (DefaultTableModel) ProductList.getModel();
        int MyIndex = ProductList.getSelectedRow();
        key = Integer.valueOf(Model.getValueAt(MyIndex,0).toString());
        PrNameTb.setText(Model.getValueAt(MyIndex, 1).toString());
        PriceTb.setText(Model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ProductListMouseClicked

    private void FiltercbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltercbActionPerformed
    FilterProduct ();  
    }//GEN-LAST:event_FiltercbActionPerformed

    private void editbill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editbill1ActionPerformed

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
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new items().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Filtercb;
    private javax.swing.JComboBox<String> PrCatCb;
    private javax.swing.JTextField PrNameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTable ProductList;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton addbill;
    private javax.swing.JButton deletebill;
    private javax.swing.JButton editbill1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
