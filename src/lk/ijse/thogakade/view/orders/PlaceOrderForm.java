package lk.ijse.thogakade.view.orders;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.thogakade.controller.CustomerController;
import lk.ijse.thogakade.controller.ItemController;
import lk.ijse.thogakade.controller.OrderController;
import lk.ijse.thogakade.modal.Customer;
import lk.ijse.thogakade.modal.Item;
import lk.ijse.thogakade.view.customer.AddCustomerForm;
import lk.ijse.thogakade.view.items.AddNewItem;

public class PlaceOrderForm extends javax.swing.JFrame {

    public PlaceOrderForm() {
        initComponents();
        loadDate();
        loadCustomerId();
        loadItemCode();
        setOrderID();
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
        jLabel2 = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbCustomerId = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCustomerAddress = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        cmbItemID = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        lblItemDescription = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblQtyOnHand = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemOdertable = new javax.swing.JTable();
        btnAdd_Item_Rowtable = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        lblTotalCost = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btnAddCustomer = new javax.swing.JButton();
        btnAddNewItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Order Form");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Order ID    : ");

        lblOrderID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOrderID.setText("O001");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date");

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("yyyy/MM/dd");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customer ID    : ");

        cmbCustomerId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerIdItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Customer Name    : ");

        lblCustomerName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(0, 0, 255));
        lblCustomerName.setText("Sample   Name   ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Customer Address   : ");

        lblCustomerAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCustomerAddress.setForeground(new java.awt.Color(0, 0, 255));
        lblCustomerAddress.setText("Sample  Address");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Item ID    : ");

        cmbItemID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbItemIDItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Item Description   : ");

        lblItemDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItemDescription.setForeground(new java.awt.Color(0, 0, 255));
        lblItemDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblItemDescription.setText("Sample   Dis ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Unit Price  :");

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUnitPrice.setForeground(new java.awt.Color(0, 0, 255));
        lblUnitPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUnitPrice.setText("15.00");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Qty On Hand  :");

        lblQtyOnHand.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQtyOnHand.setForeground(new java.awt.Color(0, 0, 255));
        lblQtyOnHand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQtyOnHand.setText("6000");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Qty Of Order  :");

        txtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tblItemOdertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Description", "Unit Price", "QTY (Order)", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblItemOdertable);
        if (tblItemOdertable.getColumnModel().getColumnCount() > 0) {
            tblItemOdertable.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblItemOdertable.getColumnModel().getColumn(1).setPreferredWidth(8);
            tblItemOdertable.getColumnModel().getColumn(2).setPreferredWidth(3);
            tblItemOdertable.getColumnModel().getColumn(3).setPreferredWidth(3);
            tblItemOdertable.getColumnModel().getColumn(4).setPreferredWidth(3);
        }

        btnAdd_Item_Rowtable.setText("Add");
        btnAdd_Item_Rowtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_Item_RowtableActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Total  : ");

        lblTotalCost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalCost.setForeground(new java.awt.Color(255, 0, 51));
        lblTotalCost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalCost.setText("4000.00 LKR");

        jButton3.setText("Place");

        btnAddCustomer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAddCustomer.setText("+");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnAddNewItem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAddNewItem.setText("+");
        btnAddNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(507, 507, 507)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(508, 508, 508))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOrderID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(lblDate)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCustomer)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerName)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerAddress)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddNewItem)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblItemDescription)
                .addGap(59, 59, 59)
                .addComponent(jLabel14)
                .addGap(35, 35, 35)
                .addComponent(lblUnitPrice)
                .addGap(88, 88, 88)
                .addComponent(jLabel16)
                .addGap(35, 35, 35)
                .addComponent(lblQtyOnHand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd_Item_Rowtable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemove)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblDate))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblOrderID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(cmbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(lblCustomerName)
                                .addComponent(jLabel9)
                                .addComponent(lblCustomerAddress))
                            .addComponent(btnAddCustomer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(lblItemDescription)
                            .addComponent(jLabel14)
                            .addComponent(lblUnitPrice)
                            .addComponent(jLabel16)
                            .addComponent(lblQtyOnHand)
                            .addComponent(jLabel18)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddNewItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd_Item_Rowtable)
                            .addComponent(btnRemove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblTotalCost))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerIdItemStateChanged
        try {

            Customer selectedCust = new CustomerController().getCustomer(cmbCustomerId.getSelectedItem().toString());
            lblCustomerName.setText(selectedCust.getName());
            lblCustomerAddress.setText(selectedCust.getAddress());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCustomerIdItemStateChanged

    private void cmbItemIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbItemIDItemStateChanged
        try {

            Item SiItem = new ItemController().getItem(cmbItemID.getSelectedItem().toString());
            lblItemDescription.setText(SiItem.getDescription());
            lblUnitPrice.setText(String.valueOf(SiItem.getUnitPrice()));
            lblQtyOnHand.setText(String.valueOf(SiItem.getQtyOnHand()));

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmbItemIDItemStateChanged

    private void btnAdd_Item_RowtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_Item_RowtableActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) tblItemOdertable.getModel();
        int qty = 0;
        try {
            qty = Integer.parseInt(txtQty.getText());
        } catch (NumberFormatException numberFormatException) {
        }
        if (qty <= 0) {
            JOptionPane.showMessageDialog(this, "Pleace enter valid Number");
            return;
        }

        if (qty > Double.parseDouble(lblQtyOnHand.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid QTY");
            return;
        }
        double unitPrice = Double.parseDouble(lblUnitPrice.getText());
        int rowNumber = isAlradyExists(cmbItemID.getSelectedItem().toString());
        double total = unitPrice * qty;

        if (rowNumber == -1) {
            Object[] rowData = {
                cmbItemID.getSelectedItem().toString(),
                lblItemDescription.getText(),
                unitPrice,
                qty,
                total
            };
            dtm.addRow(rowData);

        } else {
            qty += (int) dtm.getValueAt(rowNumber, 3);
            total = qty * unitPrice;

            if (qty > Double.parseDouble(lblQtyOnHand.getText())) {
                JOptionPane.showMessageDialog(this, "Qty Over than exists");
                return;
            }

            tblItemOdertable.setValueAt(qty, rowNumber, 3);
            tblItemOdertable.setValueAt(total, rowNumber, 4);
        }
        calculateTotal();
        txtQty.setText("");
    }//GEN-LAST:event_btnAdd_Item_RowtableActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (tblItemOdertable.getSelectedRow() == -1) {
            return;
        }
        int selectedRow = tblItemOdertable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tblItemOdertable.getModel();
        dtm.removeRow(selectedRow);
        calculateTotal();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        new AddCustomerForm().setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnAddNewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewItemActionPerformed
            new AddNewItem().setVisible(true);
    }//GEN-LAST:event_btnAddNewItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

 /* try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddNewItem;
    private javax.swing.JButton btnAdd_Item_Rowtable;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbCustomerId;
    private javax.swing.JComboBox<String> cmbItemID;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblItemDescription;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblQtyOnHand;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTable tblItemOdertable;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void loadDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateTxT = sdf.format(date);
        lblDate.setText(dateTxT);
    }

    private void loadCustomerId() {

        try {
            for (String list : new CustomerController().getAllCustomer()) {
                cmbCustomerId.addItem(list);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadItemCode() {
        try {
            for (String list : new ItemController().getAllItemsOnlyCode()) {
                cmbItemID.addItem(list);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int isAlradyExists(String itemCode) {

        DefaultTableModel dtm = (DefaultTableModel) tblItemOdertable.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String code = (String) dtm.getValueAt(i, 0);
            if (code.equals(itemCode)) {
                return i;
            }
        }
        return -1;
    }

    private void calculateTotal() {
        DefaultTableModel dtm = (DefaultTableModel) tblItemOdertable.getModel();
        double total = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            total += (Double) dtm.getValueAt(i, 4);
        }
        lblTotalCost.setText(String.valueOf(total));
    }

    private void setOrderID() {
        try {
            lblOrderID.setText(OrderController.getOrderID());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PlaceOrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
