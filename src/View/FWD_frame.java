/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.HeaderTableModel;
import Model.InvoiceHeader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Menna
 */
public class FWD_frame extends javax.swing.JFrame {

    /**
     * Creates new form FWD_frame
     */
    public FWD_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HeaderTable = new javax.swing.JTable();
        HeaderTable.getSelectionModel().addListSelectionListener(controller);
        InvNumL = new javax.swing.JLabel();
        InvDateL = new javax.swing.JLabel();
        CustNameL = new javax.swing.JLabel();
        InvTotalL = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LineTable = new javax.swing.JTable();
        invoicesTable = new javax.swing.JLabel();
        invItemL = new javax.swing.JLabel();
        createInvBTN = new javax.swing.JButton();
        createInvBTN.addActionListener(controller);
        deleteIvcBTN = new javax.swing.JButton();
        newItemBTN = new javax.swing.JButton();
        newItemBTN.addActionListener(controller);
        deleteItemBTN = new javax.swing.JButton();
        deleteItemBTN.addActionListener(controller);
        invDateText = new javax.swing.JTextField();
        custNameText = new javax.swing.JTextField();
        InvNumField = new javax.swing.JLabel();
        invTotalField = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        loadMenuItem.addActionListener(controller);
        saveMenuItem = new javax.swing.JMenuItem();
        saveMenuItem.addActionListener(controller);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("jButton3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(HeaderTable);

        InvNumL.setText("Invoice number");

        InvDateL.setText("Invoice Date");

        CustNameL.setText("Customer Name");

        InvTotalL.setText("Invoice Total");

        LineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(LineTable);

        invoicesTable.setText("Invoices Table");

        invItemL.setText("Invoice Items");

        createInvBTN.setText("Create New Invoce");
        createInvBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvBTNActionPerformed(evt);
            }
        });

        deleteIvcBTN.setText("Delete Invoice");
        deleteIvcBTN.addActionListener(controller);

        newItemBTN.setText("Create New Item");
        newItemBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemBTNActionPerformed(evt);
            }
        });

        deleteItemBTN.setText("Delete Item");

        invDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invDateTextActionPerformed(evt);
            }
        });

        custNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTextActionPerformed(evt);
            }
        });

        InvNumField.setText(".");

        invTotalField.setText(".");

        jMenu1.setText("File");

        loadMenuItem.setText("Load");
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save");
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoicesTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InvTotalL)
                                .addGap(42, 42, 42)
                                .addComponent(invTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invItemL))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvNumL)
                            .addComponent(InvDateL)
                            .addComponent(CustNameL))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invDateText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InvNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(custNameText)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(createInvBTN)
                .addGap(54, 54, 54)
                .addComponent(deleteIvcBTN)
                .addGap(123, 123, 123)
                .addComponent(newItemBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItemBTN)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvNumL)
                            .addComponent(invoicesTable)
                            .addComponent(InvNumField))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvDateL)
                            .addComponent(invDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustNameL)
                            .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvTotalL)
                            .addComponent(invTotalField))
                        .addGap(26, 26, 26)
                        .addComponent(invItemL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createInvBTN)
                        .addComponent(deleteIvcBTN))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteItemBTN)
                        .addComponent(newItemBTN)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newItemBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newItemBTNActionPerformed

    private void createInvBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvBTNActionPerformed

    private void invDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invDateTextActionPerformed

    private void custNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTextActionPerformed

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
            java.util.logging.Logger.getLogger(FWD_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FWD_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FWD_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FWD_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FWD_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustNameL;
    private javax.swing.JTable HeaderTable;
    private javax.swing.JLabel InvDateL;
    private javax.swing.JLabel InvNumField;
    private javax.swing.JLabel InvNumL;
    private javax.swing.JLabel InvTotalL;
    private javax.swing.JTable LineTable;
    private javax.swing.JButton createInvBTN;
    private javax.swing.JTextField custNameText;
    private javax.swing.JButton deleteItemBTN;
    private javax.swing.JButton deleteIvcBTN;
    private javax.swing.JTextField invDateText;
    private javax.swing.JLabel invItemL;
    private javax.swing.JLabel invTotalField;
    private javax.swing.JLabel invoicesTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JButton newItemBTN;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<InvoiceHeader> invoices;
    private Controller controller = new Controller(this);
    private HeaderTableModel invTable ;

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

    public JLabel getInvTotal() {
        return InvTotalL;
    }

    public void setInvTotal(JLabel InvTotal) {
        this.InvTotalL = InvTotal;
    }

    public HeaderTableModel getInvTable() {
        return invTable;
    }

    public void setInvTable(HeaderTableModel invTable) {
        this.invTable = invTable;
    }

    public void setInvoices(ArrayList<InvoiceHeader> invoices) {
        this.invoices = invoices;
    }

    public JTable getHeaderTable() {
        return HeaderTable;
    }

    public JTable getLineTable() {
        return LineTable;
    }

    public JLabel getCustNameL() {
        return CustNameL;
    }

    public JLabel getInvDateL() {
        return InvDateL;
    }

    public JLabel getInvNumL() {
        return InvNumL;
    }

    public JLabel getInvTotalL() {
        return InvTotalL;
    }

    public JButton getDeleteItemBTN() {
        return deleteItemBTN;
    }

    public JButton getDeleteIvcBTN() {
        return deleteIvcBTN;
    }

    public Controller getController() {
        return controller;
    }

  
}