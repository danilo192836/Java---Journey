package storage;

public class produtos {
    public String name;
    public double price;
    public int quantity;
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity ) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity ) {
        this.quantity -= quantity;
    }
    public String toString() {
        return "Product Data: " + name + ", $ " + price + ",  " 
        + quantity + " units, " + "Total: " + totalValueInStock();
    }
}
