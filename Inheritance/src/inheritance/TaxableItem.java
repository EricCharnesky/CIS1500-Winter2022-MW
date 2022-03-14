package inheritance;

public class TaxableItem extends Item { // base class / derived class - parent class / child class - super class / sub class

    private double taxRate;

    public TaxableItem(String name, String sku, int quantity, double price, double taxRate) {
        super(name, sku, quantity, price); // calls the super class constructor - MUST do this first
        this.taxRate = taxRate;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() * (1 + taxRate);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        if (taxRate > 0 && taxRate < 1) {
            this.taxRate = taxRate;
        } else if (taxRate >= 1) {
            this.taxRate = taxRate / 100;
        } else {
            this.taxRate = 0;
        }
    }
}
