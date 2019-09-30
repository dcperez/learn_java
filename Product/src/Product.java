
public class Product {

    private String name;
    private double price;

    public Product() {
        name = "Rubber Duck";
        price = 3.00;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    public void priceIncrease(double incPrice) {
        price += incPrice;
    }

    public void priceReduction(double decPrice) {
        price -= decPrice;
    }

    public String toString() {
        return "Product: " + name + "\n" + "Price: " + price;
    }
}
