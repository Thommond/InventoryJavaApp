public class Product {
    private int productID;
    private String productName;
    private String category;
    private double price; 
    private int quantityInStock;

    // Default constructor
    public Product() {
        this.productID = 0;
        this.productName = "";
        this.category = "";
        this.price = 0.0;
        this.quantityInStock = 0;
    }
    
    public Product(int productID, String productName, String category, double price, int quantityInStock) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

      // Getter and Setter for productID
      public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    // Getter and Setter for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for quantityInStock
    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    // Stock quantity methods s
    public String addStock(int quantity) {
        return "Added _ Stock of _";
    }

    public String removeStock(int quantity) {
        return "Removed _ Stock of _";
    }
}