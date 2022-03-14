package inheritance;

public class Item {
    private String name;
    private String sku;
    private int quantity;
    private double price;

    public Item(String name, String sku, int quantity, double price) {
        this.name = name;
        this.sku = sku;
        setQuantity(quantity);
        setPrice(price);
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }
}
