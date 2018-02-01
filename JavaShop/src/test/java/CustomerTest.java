import Buyer.Customer;
import Buyer.PaymentMethod;
import Shop.Item;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Item item;
    PaymentMethod paymentMethod;


    @Before
    public void before(){
        paymentMethod = new PaymentMethod("Visa", 330);
        customer = new Customer("Kris Anderson", paymentMethod);
        item = new Item("Jeans", 100, 50 );
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(1, customer.getPaymentMethodsCount());
    }

    @Test
    public void canAddPaymentMethodToArray(){
        customer.addPaymentMethod(paymentMethod);
        assertEquals(2, customer.getPaymentMethodsCount());
    }

    @Test
    public void canGetFirstPaymentMethod(){
        customer.addPaymentMethod(paymentMethod);
        assertEquals("Visa", customer.getPaymentMethodsAtIndex(0).getType());
    }

    @Test
    public void canGetSpecificPaymentMethodByType(){
        PaymentMethod expected = customer.getPaymentMethod("Visa");
        assertEquals(expected, paymentMethod);
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
    public void getShoppingCart() {
        ArrayList<Item> expected = new ArrayList<>();
        assertEquals(expected,customer.getShoppingCart());
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

//    @Test
//    public void customersOwnedItemsStartsEmpty(){
//        assertEquals(0, customer.getOwnedItemsCount());
//    }
//
//    @Test
//    public void canAddItemToOwnedItems(){
//        customer.addItemToOwnedItems(item);
//        assertEquals(1, customer.getOwnedItems());
//    }

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
    public void canPayWithSpecificPaymentMethod(){
        customer.pay(100.0, "Visa");
        // shop sell price is 100
        // Visa starts with 330 available
        assertEquals(230, customer.getPaymentMethod("Visa").getBalance(), 0.001);
    }


//    @Test
//    public void getOwnedItems() {
//        ArrayList<Item> expected = new ArrayList<>();
//        assertEquals(expected, customer.getOwnedItems());
//    }
}



