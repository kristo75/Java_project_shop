package Shop;

import java.util.ArrayList;

public class Stock<I> {
    private Stock<Item> stock;
    private ArrayList<ItemName> stockCount;
    private String item;

    public Stock(ArrayList<ItemName> stockItem, double stock) {
        this.stockCount = stockItem;
        this.stockCount = new ArrayList<>();
    }


    public void addStock(String item) {
        this.item = item;
        this.stock.addStock(item);
    }

    public ArrayList<ItemName> getStockCount() {
        return this.stockCount;
    }

    public void removeStock(String itemToRemove) {
        this.removeStock(itemToRemove);
    }
}

