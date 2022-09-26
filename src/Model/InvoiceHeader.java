/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Menna
 */
public class InvoiceHeader {
private int num;
private String date;
private String name;
private ArrayList<InvoiceLine>lines;

 public InvoiceHeader(){
     
 }

    public InvoiceHeader(int num, String date, String name) {
        this.num = num;
        this.date = date;
        this.name = name;
    }
   
    public double getTotal(){

      double total=0.0;
        for(InvoiceLine line :getLines())
        {
            total += line.getTotalLine();
    } 
        return total;
    }
    public ArrayList<InvoiceLine> getLines() {
        if(lines == null){
            lines = new ArrayList<>();
        }
                return lines;
    }
                

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + num + ", date=" + date + ", name=" + name + '}';
    }
    
  public String getFile_CSV(){
      return num + "," + date + "," + name ;
  }

}
