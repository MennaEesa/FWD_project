/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.FWD_frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class HeaderScreen extends JDialog {
    private JTextField custName_F;
    private JTextField invDate_F;
    private JLabel custName_Lab;
    private JLabel invDate_Lab;
    private JButton Header_ok_BTN;
    private JButton Header_cancel_BTN;

    public HeaderScreen(FWD_frame frame) {
        custName_Lab = new JLabel("Customer Name:");
        custName_F = new JTextField(20);
        invDate_Lab = new JLabel("Invoice Date:");
        invDate_F = new JTextField(20);
        Header_ok_BTN = new JButton("OK");
        Header_cancel_BTN = new JButton("Cancel");
        
        Header_ok_BTN.setActionCommand("createInvOK");
        Header_cancel_BTN.setActionCommand("createInvCancel");
        
        Header_ok_BTN.addActionListener(frame.getController());
        Header_cancel_BTN.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));
        
        add(invDate_Lab);
        add(invDate_F);
        add(custName_Lab);
        add(custName_F);
        add(Header_ok_BTN);
        add(Header_cancel_BTN);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return custName_F;
    }

    public JTextField getInvDateField() {
        return invDate_F;
    }
    
}
