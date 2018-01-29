import Shop.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;


    @Before
    public void before() {
        till = new Till(500.0);


    }

    @Test
    public void getTillValue(){
        assertEquals(500.0, till.getTillValue(), 0.1);
    }

    @Test
    public void setTillValue(){
        till.setTillValue(450.0);
        assertEquals(450.0, till.getTillValue(), 0.1);
    }
}
