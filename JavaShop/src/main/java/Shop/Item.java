package Shop;

public class Item {
    private String item;
    private double sellPrice;
    private double buyPrice;

    public Item(String item, double sellPrice, double buyPrice) {
        this.item = item;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }



}
