import java.util.ArrayList;
import java.util.List;

public class StoreInventoryList {
    private List<Product> products;

    // Constructor
    public StoreInventoryList() {
        this.products = new ArrayList<>();
        // Optionally add predefined products
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("The product was added successfully.");
    }

    // Remove a product by ID
    public void removeProduct(String productID) {
        Product product = findProductByID(productID);
        if (product != null) {
            products.remove(product);
            System.out.println("The product was removed successfully.");
        } else {
            System.out.println("The product with ID " + productID + " has not been found.");
        }
    }

    // Find a product by ID
    private Product findProductByID(String productID) {
        for (Product product : products) {
            if (product.getProductID().equals(productID)) {
                return product;
            }
        }
        return null;
    }

    // Add stock to a product
    public void addStockToProduct(String productID, int quantity) {
        Product product = findProductByID(productID);
        if (product != null) {
            product.addStock(quantity);
            System.out.println("The stock has added successfully.");
        } else {
            System.out.println("Sorry, the product with ID " + productID + " has not been found.");
        }
    }

    // Remove stock from a product
    public void removeStockFromProduct(String productID, int quantity) {
        Product product = findProductByID(productID);
        if (product != null) {
            product.removeStock(quantity);
            System.out.println("The stock has been removed successfully.");
        } else {
            System.out.println("Sorry, product with ID " + productID + " has not been found.");
        }
    }

    // Display all products
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            for (Product product : products) {
                product.displayProductInfo();
                System.out.println("--------------------------------");
            }
        }
    }

    // Generate a detailed inventory report
    public void generateReport() {
        System.out.println("Full Inventory Report:");
        displayAllProducts();
    }
}