import Buyer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Kris Anderson");
    }

    @Test
    public void getCustomerName(){
        assertEquals("Kris Anderson", customer.getCustomerName());
    }
}
