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
public class ItemScreen extends JDialog{
    private JTextField itemName_F;
    private JTextField itemCount_F;
    private JTextField itemPrice_F;
    private JLabel itemName_Lab;
    private JLabel itemCount_Lab;
    private JLabel itemPrice_Lab;
    private JButton Item_ok_BTN;
    private JButton Item_cancel_BTN;
    
    public ItemScreen(FWD_frame frame) {
        itemName_F = new JTextField(20);
        itemName_Lab = new JLabel("Item Name");
        
        itemCount_F = new JTextField(20);
        itemCount_Lab = new JLabel("Item Count");
        
        itemPrice_F = new JTextField(20);
        itemPrice_Lab = new JLabel("Item Price");
        
        Item_ok_BTN = new JButton("OK");
        Item_cancel_BTN = new JButton("Cancel");
        
        Item_ok_BTN.setActionCommand("createItemOK");
        Item_cancel_BTN.setActionCommand("createItemCancel");
        
        Item_ok_BTN.addActionListener(frame.getController());
        Item_cancel_BTN.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 2));
        
        add(itemName_Lab);
        add(itemName_F);
        add(itemCount_Lab);
        add(itemCount_F);
        add(itemPrice_Lab);
        add(itemPrice_F);
        add(Item_ok_BTN);
        add(Item_cancel_BTN);
        
        pack();
    }

    public JTextField getItemName_F() {
        return itemName_F;
    }

    public JTextField getItemCount_F() {
        return itemCount_F;
    }

    public JTextField getItemPrice_F() {
        return itemPrice_F;
    }
}
