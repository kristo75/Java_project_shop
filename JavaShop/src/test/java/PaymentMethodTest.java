import Buyer.PaymentMethod;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentMethodTest {

    PaymentMethod paymentMethod;

    @Before
    public void before(){
        paymentMethod = new PaymentMethod("Visa", 300);

    }


    @Test
    public void canCreatePaymentMethod(){
        assertEquals("Visa", paymentMethod.getType());
    }

    @Test
    public void canCheckAccountBalance(){
        assertEquals(300, paymentMethod.getBalance(), 0.01);
    }

    @Test
    public void canDeductAccountBalance(){
        paymentMethod.debit(50);
        assertEquals(250, paymentMethod.getBalance(),0.01);
    }

    @Test
    public void canCreditAccountBalance(){
        paymentMethod.credit(50);
        assertEquals(350, paymentMethod.getBalance(), 0.01);
    }

    @Test
    public void canNotDeductMoreThanBalance(){
        paymentMethod.debit(350.0);
        assertEquals(300, paymentMethod.getBalance(), 0.01);
    }


}
