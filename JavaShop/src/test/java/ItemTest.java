import Shop.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Polo Shirt", 100, 50);

    }

    @Test
    public void getItem() {
        assertEquals("Polo Shirt", item.getItem());
    }

    @Test
    public void setItem() {
        item.setItem("Jeans");
        assertEquals("Jeans", item.getItem());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100.0, item.getSellPrice(), 0.1);
    }

    @Test
    public void setSellPrice(){
        item.setSellPrice(150.0);
        assertEquals(150.0, item.getSellPrice(),0.1);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50.0, item.getBuyPrice(),0.1);
    }

    @Test
    public void setBuyPrice(){
        item.setBuyPrice(75.0);
        assertEquals(75.0, item.getBuyPrice(),0.1);
    }

}


