package Shop;

import java.util.ArrayList;

public class Till {

    private double amount;


    public Till(double amount) {
        this.amount = amount;

    }

    public double getTillValue() {
        return this.amount;
    }

    public void setTillValue(double tillValue) {
        this.amount = tillValue;
    }
}
