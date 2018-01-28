import Buyer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;


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



    }



