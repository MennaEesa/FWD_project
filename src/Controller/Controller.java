/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HeaderTableModel;
import Model.InvoiceHeader;
import Model.invoiceLine;
import View.FWD_frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Menna
 */
public class Controller implements ActionListener,ListSelectionListener {
    
    private FWD_frame frame;
    public Controller (FWD_frame frame){
        this.frame=frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println("Action: "+actionCommand);
        switch (actionCommand){
            case "Load":
                load();
                break;
            case "Save":
                save();
                break;
            case "Create New Invoce":
                createNewInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case "Create New Item":
                createNewItem();
                break;
            case "Delete Item":
                deleteItem();
                break;

        }
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = frame.getHeaderTable().getSelectedRow();
        System.out.println("your Raw "+selectedIndex);
        InvoiceHeader currentINV = frame.getInvoices().get(selectedIndex);
        frame.getInvNumL().setText(""+currentINV.getNum());
        frame.getInvDateL().setText(currentINV.getDate());
        frame.getCustNameL().setText(currentINV.getName());
        frame.getInvTotalL().setText(""+currentINV.getTotal());
        System.out.println("Controller.Controller.valueChanged()");
    }
    
    private void save() {
    }

    private void load() {
        try{
        JFileChooser fc =new JFileChooser();
       int result =  fc.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION){
           File headerFile = fc.getSelectedFile();
           Path headerPath = Paths.get(headerFile.getAbsolutePath());
         List<String> headerLines = Files.readAllLines(headerPath); 
         System.out.println("Invoice Header have been read  ");
         
         ArrayList<InvoiceHeader> invoicesArr =new ArrayList<>();
         for(String headerLine : headerLines){
          String[] headerSplits = headerLine.split(",");
          int invoiceNumb = Integer.parseInt(headerSplits[0]) ;
         String invoiceDate = headerSplits[1];
         String custName = headerSplits[2];
         
         
         InvoiceHeader invoice = new InvoiceHeader(invoiceNumb,invoiceDate,custName);
         invoicesArr.add(invoice);
         }
         
         System.out.println("Check");
         result = fc.showOpenDialog(frame);
         if (result == JFileChooser.APPROVE_OPTION){
             File lineFile = fc.getSelectedFile();
             Path linePath = Paths.get(lineFile.getAbsolutePath());
             List<String> lineLines = Files.readAllLines(linePath);
             System.out.println("Invoioce Line have been read  ");
             
         ArrayList<invoiceLine> linesArr =new ArrayList<>();
         for(String lineLine : lineLines){
          String[] lineSplits = lineLine.split(",");
          int invoiceNumb = Integer.parseInt(lineSplits[0]) ;
         String itemName = lineSplits[1];
         double  itemPrice = Double.parseDouble( lineSplits[2]);
         int count = Integer.parseInt(lineSplits[3]);
         InvoiceHeader inv =null;
         for(InvoiceHeader invoice : invoicesArr){
             if (invoice.getNum()== invoiceNumb){
                 inv = invoice;
                 break;
             }
         }
         
         invoiceLine line= new invoiceLine(invoiceNumb,itemName,itemPrice,count,inv);
         inv.getLines().add(line);
         }
         System.out.println("Check");
        }
         frame.setInvoices(invoicesArr);
         HeaderTableModel invoicesTable = new HeaderTableModel(invoicesArr);
         frame.setInvTable(invoicesTable);
         frame.getHeaderTable().setModel(invoicesTable);
         frame.getInvTable().fireTableDataChanged();
        }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private void createNewInvoice() {
   }

    private void deleteInvoice() {
   }

    private void createNewItem() {
    }

    private void deleteItem() {
   }


}
