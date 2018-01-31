package Buyer;


import Shop.Item;

import java.util.ArrayList;

public class Customer {
    private ArrayList<PaymentMethod> paymentMethods;
    private String customerName;
    private double wallet;
    private ArrayList<Item> shoppingCart;
    private double sellPrice;
    private ArrayList<Item> ownedItems;


    public Customer(String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = wallet;
        this.shoppingCart = new ArrayList<>();
        this.paymentMethods = new ArrayList<>();
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



    public ArrayList<PaymentMethod> getPaymentMethod(){
        return paymentMethods;
    }

//    public ArrayList<Item> getOwnedItems(){
//        return ownedItems.get();
//    }
//    public ArrayList<Item> getOwnedItemsCount() {
//        return ownedItems.;
//    }

    public int getShoppingCartItemCount() {
        return shoppingCart.size();
    }


    public void addItemToShoppingCart(Item item){
        this.shoppingCart.add(item);
    }

    public void addItemToOwnedItems(Item item){
        this.ownedItems.add(item);
    }

    public void removeItemFromShoppingCart(Item item) {
        this.shoppingCart.remove(item);
    }


    public void clearShoppingCart() {
        this.shoppingCart.clear();
    }

    public void removeMoneyFromWallet(double amount) {
        this.wallet -= amount;
    }

    public void addMoneyToWallet(double amount) {
        this.wallet += amount;
    }

    public ArrayList<Item> getShoppingCart() {
        return shoppingCart;
    }



}