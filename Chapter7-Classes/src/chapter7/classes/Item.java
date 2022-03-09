package chapter7.classes;

public class Item {

    private String name;
    private String sku;
    private double unitPrice;
    private int quantity;

    public Item(String name, String sku, double unitPrice, int quantity) {
        this.name = name;
        this.sku = sku;
        //this.unitPrice = unitPrice;
        //this.quantity = quantity;
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    
    public double getTotalPrice(){
        return quantity * unitPrice;
    }

    public boolean setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
            return true;
        } else {
            this.unitPrice = 0;
            return false;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

}
