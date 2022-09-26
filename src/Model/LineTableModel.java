/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Menna
 */
public class LineTableModel extends AbstractTableModel {
    
    private ArrayList<InvoiceLine> lineTabl;
        private String[] columns={"numb","Item name", "Item Count", "Item Price","Total"};

    public LineTableModel(ArrayList<InvoiceLine> lineTabl) {
        this.lineTabl = lineTabl;
    }

    public ArrayList<InvoiceLine> getLineTabl() {
        return lineTabl;
    }


    @Override
    public int getRowCount() {
      return lineTabl.size(); 
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine line= lineTabl.get(rowIndex);
        
        switch(columnIndex){
        case 0: return line.getInv().getNum();
        case 1: return line.getItem();
        case 2: return line.getPrice();
        case 3: return line.getCount();
        case 4: return line.getTotalLine();
        default: return "wrong answer"; 
        }
    }
    
}
