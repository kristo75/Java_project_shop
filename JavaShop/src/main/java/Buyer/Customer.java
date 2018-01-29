package Buyer;


import Shop.Item;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private double wallet;
    private ArrayList<Item> shoppingCart;


    public Customer(String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = wallet;
        this.shoppingCart = new ArrayList<Item>();
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


    public int getShoppingCartItemCount() {
        return shoppingCart.size();
    }

    public void addItemToShoppingCart(Item item){
        this.shoppingCart.add(item);
    }

    public void removeItemFromShoppingCart(Item item) {
        this.shoppingCart.remove(item);
    }

    public void buyItem(Item item) {
        double itemPrice = item.getSellPrice();
        this.wallet -=itemPrice;
    }

    public void refundItem(Item item) {
        double itemPrice = item.getSellPrice();
        this.wallet += itemPrice;
    }



}