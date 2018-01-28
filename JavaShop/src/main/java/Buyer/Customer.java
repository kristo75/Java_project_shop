package Buyer;


import java.util.ArrayList;

public class Customer {
    private String customerName;
    private double wallet;


    public Customer(String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = wallet;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerWallet() {
        return wallet;
    }

    public void setCustomerWallet(double customerWallet) {
        this.wallet = customerWallet;
    }


}