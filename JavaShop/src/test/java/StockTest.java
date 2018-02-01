import Shop.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    Shop shop;
    Stock<ItemName> stock;
    private Item item;


    @Before
    public void before() {
        Stock<ItemName> stock = new Stock<>(item, 4);
    }


    @Test
    public void customersStockStartsEmpty(){
        assertEquals(0, stock.getStockItemCount());
    }
}
//
//
//    @Test
//    public void canAddStockToShop() {
//        stock.addStock("Jeans");
//        assertEquals(1, stock.getStockCount());
//    }
//
//
//    @Test
//    public void canRemoveStockFromShop() {
//        stock.addStock("JEANS");
//        assertEquals(1, stock.getStockCount());
//        stock.removeStock("JEANS");
//        assertEquals(0, stock.getStockCount());
//    }
//}
