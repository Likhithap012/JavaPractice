// Abstract class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    // Encapsulation: Getters and Setters
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setProductId(int id) { this.productId = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }

    public void displayFinalPrice() {
        double tax = 0;
        if (this instanceof Taxable) {
            tax = ((Taxable) this).getTaxDetails(); // now using getTaxDetails
        }
        double discount = calculateDiscount();
        double finalPrice = price + tax - discount;

        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("----------------------");
    }
}

// Updated interface
interface Taxable {
    double calculateTax();     // Calculates tax
    double getTaxDetails();    // Returns the tax amount (can be same as calculateTax)
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public double getTaxDetails() {
        return calculateTax();
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public double getTaxDetails() {
        return calculateTax();
    }
}

// Groceries class
class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Mobile", 10000);
        Product p2 = new Clothing(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Wheat", 800);

        p1.displayFinalPrice();
        p2.displayFinalPrice();
        p3.displayFinalPrice();
    }
}
