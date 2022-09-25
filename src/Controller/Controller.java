/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HeaderTableModel;
import Model.InvoiceHeader;
import Model.LineTableModel;
import Model.invoiceLine;
import View.FWD_frame;
import View.HeaderScreen;
import View.ItemScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Menna
 */
public class Controller implements ActionListener,ListSelectionListener {
    
    private FWD_frame frame;
    private HeaderScreen headerScreen;
    private ItemScreen itemScreen;
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
            case "createInvCancel":
                createInvCancel();
                break;
            case "createInvOK":
                createInvOK();
                break;
            case "createItemCancel":
                createItemCancel();
                break;
            case "createItemOK":
                createItemOK();
                break; 
                

        }
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = frame.getHeaderTable().getSelectedRow();
        if(selectedIndex != -1){
        System.out.println("your Raw "+selectedIndex);
        InvoiceHeader currentINV = frame.getInvoices().get(selectedIndex);
        frame.getInvNumL().setText(""+currentINV.getNum());
        frame.getInvDateL().setText(currentINV.getDate());
        frame.getCustNameL().setText(currentINV.getName());
        frame.getInvTotalL().setText(""+currentINV.getTotal());
        LineTableModel linesTable = new LineTableModel (currentINV.getLines());
        frame.getLineTable().setModel(linesTable);
        linesTable.fireTableDataChanged();
        }
    }
    
    private void save() {
        ArrayList<InvoiceHeader> headers = frame.getInvoices();
        String header = "";
        String items = "";
        for(InvoiceHeader invoice : headers){
            String InvCSV = invoice.getFile_CSV();
            header += InvCSV;
            header += "\n";
            
            for(invoiceLine line : invoice.getLines()){
                String lineCSV =line.getFile_CSV();
                items += lineCSV ;
                items += "\n";
            }
        }
        
            try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                
                FileWriter headerfw = new FileWriter(headerFile);
                headerfw.write(header);
                headerfw.flush();
                headerfw.close();
                
                result = fc.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    FileWriter linefw = new FileWriter(lineFile);
                    linefw.write(items);
                    linefw.flush();
                    linefw.close();
                }
            }
        } catch (Exception ex) {

        }
        
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
             try{ 
          String[] headerSplits = headerLine.split(",");
          int invoiceNumb = Integer.parseInt(headerSplits[0]) ;
         String invoiceDate = headerSplits[1];
         String custName = headerSplits[2];
         
         
         InvoiceHeader invoice = new InvoiceHeader(invoiceNumb,invoiceDate,custName);
         invoicesArr.add(invoice);
             } catch (Exception ex){
                 ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error in Line format ","Error",JOptionPane.ERROR_MESSAGE);

             }
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
             try{
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
         
         invoiceLine line= new invoiceLine(itemName, count, itemPrice, inv, count);
         inv.getLines().add(line);
         }catch (Exception ex){
                 ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error in Line format ","Error",JOptionPane.ERROR_MESSAGE);

             }
         }     
         System.out.println("Check");
        }
         frame.setInvoices(invoicesArr);
         HeaderTableModel invoicesTable = new HeaderTableModel(invoicesArr);
         frame.setInvTable(invoicesTable);
         frame.getHeaderTable().setModel(invoicesTable);
         frame.getInvTable().fireTableDataChanged();
        }
        }
        catch (IOException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(frame, "cannot read file","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void createNewInvoice() {
        headerScreen =new HeaderScreen(frame);
        headerScreen.setVisible(true);
        
   }

    private void deleteInvoice() {
       int selRow = frame.getHeaderTable().getSelectedRow();
       if(selRow != -1){
           frame.getInvoices().remove(selRow);
           frame.getInvTable().fireTableDataChanged();
       }
   }

    private void createNewItem() {
        itemScreen = new ItemScreen(frame);
        itemScreen.setVisible(true);
        
        
    }

    private void deleteItem() {
        int selRow = frame.getLineTable().getSelectedRow();
        
       if( selRow != -1){
           LineTableModel lineTable = (LineTableModel)frame.getLineTable().getModel();
           lineTable.getLineTabl().remove(selRow);
           lineTable.fireTableDataChanged();
           frame.getInvTable().fireTableDataChanged();
        
       }
   }

    private void createInvCancel() {
        headerScreen.setVisible(false);
        headerScreen.dispose();
        headerScreen = null;
    }

    private void createInvOK() {
        String date = headerScreen.getInvDateField().getText();
        String Customer = headerScreen.getCustNameField().getText();
        int numb =frame.getNextInvNumb();
        try {
            String [] dateSplits = date.split("-");
            if (dateSplits.length<3 ){
               JOptionPane.showMessageDialog(frame, "wronge date format ", "Error",JOptionPane.ERROR_MESSAGE);
            } 
            
            else{
            int day = Integer.parseInt(dateSplits[0]);
            int month = Integer.parseInt(dateSplits[1]);
            int year = Integer.parseInt(dateSplits[2]);
            
            if(day > 31 || month > 12){
              JOptionPane.showMessageDialog(frame, "wronge date format ", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
            InvoiceHeader header = new InvoiceHeader(numb, date, Customer);
            frame.getInvoices().add(header);
            frame.getInvTable().fireTableDataChanged();
            headerScreen.setVisible(false);
            headerScreen.dispose();
            headerScreen = null;
            }
         }
            
        } 
        catch(Exception ex){
            JOptionPane.showMessageDialog(frame, "wronge date format ", "Error",JOptionPane.ERROR_MESSAGE);
    
        }
    
    }

    private void createItemCancel() {
        itemScreen.setVisible(false);
        itemScreen.dispose();
        itemScreen = null;
        
    }

    private void createItemOK() {
        String itemName = itemScreen.getItemName_F().getText();
        String countStr = itemScreen.getItemCount_F().getText();
        String priceStr =itemScreen.getItemPrice_F().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selectedInvoice = frame.getHeaderTable().getSelectedRow();
        if(selectedInvoice != -1){
        InvoiceHeader invoice =frame.getInvoices().get(selectedInvoice);
        invoiceLine line = new invoiceLine(itemName, count, price, invoice, count);
        invoice.getLines().add(line);
        LineTableModel lineTableModel = (LineTableModel) frame.getLineTable().getModel();
        lineTableModel.fireTableDataChanged();
        frame.getInvTable().fireTableDataChanged();
        
        }
        
        itemScreen.setVisible(false);
        itemScreen.dispose();
        itemScreen = null;
    }


}
