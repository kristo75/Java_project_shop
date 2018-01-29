import Buyer.Customer;
import Shop.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Item item;
    private double wallet;


    @Before
    public void before(){
        customer = new Customer("Kris Anderson", 500.0);

    }

    @Test
    public void getCustomerName() {
        assertEquals("Kris Anderson", customer.getCustomerName());
    }

    @Test
    public void setCustomerName() {
        customer.setCustomerName("Simon Brown");
        assertEquals("Simon Brown", customer.getCustomerName());
    }

    @Test
    public void getCustomerWallet(){
        assertEquals(500.0, customer.getCustomerWallet(), 0.1);
    }

    @Test
    public void setCustomerWallet(){
        customer.setCustomerWallet(450.0);
        assertEquals(450.0, customer.getCustomerWallet(), 0.1);
    }

    @Test
    public void customersShoppingCartStartsEmpty(){
        assertEquals(0, customer.getShoppingCartItemCount());
    }

    @Test
    public void canAddItemToShoppingCart(){
        customer.addItemToShoppingCart(item);
        assertEquals(1, customer.getShoppingCartItemCount());
    }

    @Test
    public void canRemoveItemFromShoppingCart(){
        customer.addItemToShoppingCart(item);
        assertEquals(1, customer.getShoppingCartItemCount());
        customer.removeItemFromShoppingCart(item);
        assertEquals(0, customer.getShoppingCartItemCount());
    }


    @Test
    public void getShoppingCartItemCount() {
        customer.addItemToShoppingCart(item);
        assertEquals(1, customer.getShoppingCartItemCount());
    }


//    @Test
//    public void buyItem() {
//        double itemPrice = item.getSellPrice();
//        this.wallet -= itemPrice;
//    }
//
//    @Test
//    public void canReturnItem(){
//        customer.addItemToShoppingCart(item);
//        customer.buyItem(item);
//        assertEquals(300, customer.getCustomerWallet(),0.1);
//        customer.removeItemFromShoppingCart(item);
//        customer.refundItem(item);
//        assertEquals(300, customer.getCustomerWallet(),0.1);
//    }
}



