/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Menna
 */
public class invoiceLine {
    private String item;
    private int count;
    private double price;
    private InvoiceHeader inv;

    public invoiceLine(String name, int count, double price, InvoiceHeader inv,int number) {
        this.item = name;
        this.count = count;
        this.price = price;
        this.inv = inv;
    }


    public double getTotalLine(){
        return count*price;
    }

    public String getName() {
        return item;
    }

    public void setName(String name) {
        this.item = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    @Override
    public String toString() {
        return "invoiceLine{" + "name=" + inv.getNum()+item + ", count=" + count + ", price=" + price + '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
 public String getFile_CSV(){
      return inv.getNum() + "," + item + "," + price + "," + count ;
  }
}

