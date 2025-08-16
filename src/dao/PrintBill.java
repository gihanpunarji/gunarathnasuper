package dao;

import java.util.List;

public class PrintBill {
    private List<String> itemName;
    private double qty;
    private double weladapalaMila;
    private double apeMila;
    private double amount;
    private double subTotal;
    private double total;
    private double payment;
    private int itemCount;
    private double creditAmount;

    public PrintBill() {
    }

    public List<String> getItemName() {
        return itemName;
    }

    public void setItemName(List<String> itemName) {
        this.itemName = itemName;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getWeladapalaMila() {
        return weladapalaMila;
    }

    public void setWeladapalaMila(double weladapalaMila) {
        this.weladapalaMila = weladapalaMila;
    }

    public double getApeMila() {
        return apeMila;
    }

    public void setApeMila(double apeMila) {
        this.apeMila = apeMila;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }
    
    
}
