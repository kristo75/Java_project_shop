package Buyer;


import Shop.Item;

import java.util.ArrayList;

public class Customer {
    private ArrayList<PaymentMethod> paymentMethods;
    private String customerName;
    private PaymentMethod wallet;
    private ArrayList<Item> shoppingCart;
    private double sellPrice;
    private ArrayList<Item> ownedItems;


    public Customer(String customerName, PaymentMethod paymentMethod){
        this.customerName = customerName;
        this.shoppingCart = new ArrayList<>();
        this.paymentMethods = new ArrayList<>();
        paymentMethods.add(paymentMethod);

    }

    public int getPaymentMethodsCount() {
        return this.paymentMethods.size();
    }

    public void addPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethods.add(paymentMethod);
    }

    public PaymentMethod getPaymentMethodsAtIndex(int index){
        return this.paymentMethods.get(index);
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }





//    public ArrayList<Item> getOwnedItems(){
//        return ownedItems;
//    }
//    public ArrayList<Item> getOwnedItemsCount() {
//        return ownedItems.size;
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



    public ArrayList<Item> getShoppingCart() {
        return shoppingCart;
    }


//    public void makePayment(double shoppingCartPrice, PaymentMethod paymentMethod) {
//        getP
//    }

    public PaymentMethod getPaymentMethod(String paymentMethodType) {
        for (PaymentMethod paymentMethod: paymentMethods){
            if (paymentMethod.getType().equals(paymentMethodType)){
                return paymentMethod;
            }
        }
        return null;
    }

    public void pay(double price, String paymentMethodType) {
        PaymentMethod paymentMethod = getPaymentMethod(paymentMethodType);
        if (paymentMethod.getBalance() >= price){
            paymentMethod.debit(price);
        }


    }
}