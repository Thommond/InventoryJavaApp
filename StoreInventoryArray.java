public class StoreInventoryArray {
    private final Product[] products;
    private int productCount;

    // Constructor
    public StoreInventoryArray(int capacity) {
        this.products = new Product[capacity];
        this.productCount = 0;
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        if (this.productCount < products.length) {
            this.products[this.productCount] = product;
            this.productCount++;
            System.out.println("Your product has been added successfully.");
        } else {
            System.out.println("Sorry, The inventory is full.");
        }
    }

    // Remove a product by ID
    public void removeProduct(String productID) {
        int index = findProductIndexByID(productID);
        if (index != -1) {
            for (int i = index; i < this.productCount - 1; i++) {
                this.products[i] = this.products[i + 1];
            }
            this.products[this.productCount - 1] = null;
            this.productCount--;
            System.out.println("The product has been removed successfully.");
        } else {
            System.out.println("The Product with ID " + productID + " has not been found.");
        }
    }

    // Find product index by ID
    private int findProductIndexByID(String productID) {
        for (int i = 0; i < this.productCount; i++) {
            if (this.products[i].getProductID().equals(productID)) {
                return i;
            }
        }
        return -1;
    }

    // Add stock to a product
    public void addStockToProduct(String productID, int quantity) {
        int index = findProductIndexByID(productID);
        if (index != -1) {
            this.products[index].addStock(quantity);
            System.out.println("Stock added successfully.");
        } else {
            System.out.println("Error: Product with ID " + productID + " not found.");
        }
    }

    // Remove stock from a product
    public void removeStockFromProduct(String productID, int quantity) {
        int index = findProductIndexByID(productID);
        if (index != -1) {
            this.products[index].removeStock(quantity);
            System.out.println("The stock has been removed successfully.");
        } else {
            System.out.println("The Product with ID " + productID + " not found. ");
        }
    }

    // Display all products
    public void displayAllProducts() {
        if (this.productCount == 0) {
            System.out.println("The inventory is empty.");
        } else {
            for (int i = 0; i < this.productCount; i++) {
                this.products[i].displayProductInfo();
                System.out.println("--------------------------------");
            }
        }
    }

    // Generate a detailed inventory report
    public void generateReport() {
        System.out.println("Full inventory Report:");
        displayAllProducts();
    }

    public Product[] getProducts() {
        return products;
    }
}