package Shop;

import Buyer.Customer;

import java.util.ArrayList;


public class Shop {


    private double till;
    public double totalSales;
    public double totalRefunds;
    private Shop shop;


    public Shop(double amount, double totalSales, double totalRefunds) {
        this.till = amount;
        this.totalSales = totalSales;
        this.totalRefunds = totalRefunds;
    }

    public double getTillValue() {
        return this.till;
    }

    public void setTillValue(double tillValue) {
        this.till = tillValue;
    }

    public void addMoneyToTill(double money) {
        this.till += money;
    }

    public void removeMoneyFromTill(double money) {
        this.till -= money;
    }

    private double calculateCartValue(Customer customer) {
        double amount = 0.0;
        ArrayList<Item> items = customer.getShoppingCart();
        for (Item item : items) {
            amount += item.getSellPrice();
        }
        return amount;
    }


    public void checkOut(Customer customer) {
        double shoppingCartPrice = calculateCartValue(customer);
        customer.removeMoneyFromWallet(shoppingCartPrice);
        this.till += shoppingCartPrice;
        customer.clearShoppingCart();
    }

    
    public void refundShoppingCart(Customer customer) {
        double shoppingCartPrice = calculateCartValue(customer);
        customer.addMoneyToWallet(shoppingCartPrice);
        this.till -= shoppingCartPrice;
        customer.clearShoppingCart();

    }

    public double salesMinusRefunds(){
        return totalSales - totalRefunds;
    }

}



