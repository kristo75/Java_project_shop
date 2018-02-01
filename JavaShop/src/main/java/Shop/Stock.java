package Shop;

public class Stock<I> {
    private Stock<Item> stock;
    private Item stockCount;
    private String item;

    public Stock(Item stockItem, double stock) {
        this.stockCount = stockItem;
    }


    public void addStock(String item) {
        this.item = item;
        this.stock.addStock(item);
    }



    public int getStockItemCount() {
        return this.getStockItemCount();
    }
}

