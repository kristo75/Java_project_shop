import Buyer.Customer;
import Shop.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Item item;


    @Before
    public void before(){
        customer = new Customer("Kris Anderson", 500.0);
        item = new Item("Jeans", 100, 50 );

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
    public void getShoppingCart() {
        assertEquals("shirt",customer.getShoppingCart());
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


    @Test
    public void getOwnedItems() {
    }
}



