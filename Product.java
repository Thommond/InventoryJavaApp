
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
        return this.productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    // Getter and Setter for productName
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter for category
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and Setter for price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for quantityInStock
    public int getQuantityInStock() {
        return this.quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    // Stock quantity methods
    public void addStock(int quantity) {
        // Prevent adding more stock for products with excess of 200+ in stock.
        if (quantity > 0 && quantity < 100 && this.quantityInStock <= 200) {
            this.quantityInStock += quantity;
            System.out.println("Added " + quantity + " " + this.productName + "s to the stock.");
        } else if (this.quantityInStock >= 200) {
            System.out.println("Invalid entry, the maximum amount of stock has been reached.");
         } else  {
            System.out.println("Invalid entry, please try again. Added stock must be less than 100 and greater than 0.");
        }
    }

    public void removeStock(int quantity) {
        // Making sure we are preventing negative stock for products.
        if (quantity > 0 && quantity < 100 && quantity <= this.quantityInStock) {
            this.quantityInStock -= quantity;
            System.out.println("Removed " + quantity + " " + this.productName + "s from the stock.");
        } else if (quantity > this.quantityInStock) {
            System.out.println("Invalid entry, stock removed must be less than or equal to existing stock.");
        } else {
            System.out.println("Invalid entry, please try again. Failed to remove stock. Removed amount must be more than 0 and less than 100.");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product info for "+this.productID);
        System.out.println("Product ID: "+this.productID);
        System.out.println("Category: "+this.category);
        System.out.println("Price: "+this.price);
        System.out.println("Qty in Stock "+this.quantityInStock);
    }
}
