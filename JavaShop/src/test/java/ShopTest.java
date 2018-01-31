import Shop.Shop;
import Shop.Item;
import Buyer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Item item;
    private Item item2;
    public Customer customer;
    public Customer customer2;


    @Before
    public void before() {
        shop = new Shop(500.0, 200, 100);
        customer = new Customer("Jack", 300.0);
        customer2 = new Customer("John", 200);
        item = new Item("Shirt", 50.0, 25.0);
        item2 = new Item("Jeans", 60.0, 20.0);

    }

    @Test
    public void getTillValue() {
        assertEquals(500.0, shop.getTillValue(), 0.1);
    }

    @Test
    public void setTillValue() {
        shop.setTillValue(450.0);
        assertEquals(450.0, shop.getTillValue(), 0.1);
    }

    @Test
    public void canAddMoneyToTill() {
        shop.addMoneyToTill(500.0);
        assertEquals(1000, shop.getTillValue(), 0.01);

    }

    @Test
    public void canRemoveMoneyFromTill(){
        shop.removeMoneyFromTill(50);
        assertEquals(450, shop.getTillValue(), 0.01);
    }

    @Test
    public void canCheckOut() {
        customer.addItemToShoppingCart(item);
        shop.checkOut(customer);
        assertEquals(250.0, customer.getCustomerWallet(), 0.01);
        assertEquals(550.0, shop.getTillValue(), 0.01);
        assertEquals(0, customer.getShoppingCartItemCount());

    }

    @Test
    public void canRefundShoppingCart() {
        customer.addItemToShoppingCart(item);
        shop.refundShoppingCart(customer);
        assertEquals(350.0, customer.getCustomerWallet(), 0.01);
        assertEquals(450.0, shop.getTillValue(), 0.01);
        assertEquals(0, customer.getShoppingCartItemCount());

    }

    @Test
    public void getTotalSales() {
        customer.addItemToShoppingCart(item);
        customer2.addItemToShoppingCart(item2);
//        customer.removeItemFromShoppingCart(item);
        shop.checkOut(customer);
        shop.checkOut(customer2);
        assertEquals(610.0, shop.getTillValue(), 0.01);
    }

    @Test
    public void getTotalRefunds() {
        customer.removeItemFromShoppingCart(item);
        customer2.removeItemFromShoppingCart(item2);
        shop.checkOut(customer);
        assertEquals(500.0, shop.getTillValue(), 0.01);
    }

    @Test
    public void salesMinusRefunds() {
        customer.addItemToShoppingCart(item);
        customer2.addItemToShoppingCart(item2);
        customer.removeItemFromShoppingCart(item);
        shop.checkOut(customer);
        assertEquals(500, shop.getTillValue(), 0.01);
    }
}













//    @Test
//    public void refundCheckOut() {
//    }

