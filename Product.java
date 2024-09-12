public class Product {

    private int productID;
    private String productName;
    private int category;
    private double price; 
    private int quantityInStock;

       // Default constructor
       public Product() {
        // Initializes with default values
        this.productID = 0;
        this.productName = "";
        this.category = 0;
        this.price = 0.0;
        this.quantityInStock = 0;
    }

    // Full constructor
    public Product(int productID, String productName, int category, double price, int quantityInStock) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    
}