class Product {
    String type;
    double price;
    Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

}
public class Demo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Phone", 699.99);
        Product p3 = new Product("Tablet", 450.00);
        Product p4 = new Product("Headphones", 199.99);
        Product p5 = new Product("Monitor", 300.75);
    }
}
