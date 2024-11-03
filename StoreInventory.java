
public class StoreInventory {
    // Product instances 
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;

    public StoreInventory(Product product1, Product product2, Product product3, Product product4) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        this.product4 = product4;
    }

    public void addStockToProduct(int productID, int quantity) {
        // This ensures we are using the right product specific method.
        if (this.product1.getProductID() == productID) {
            this.product1.addStock(quantity);
        } else if (this.product2.getProductID() == productID) {
            this.product2.addStock(quantity);
        } else if (this.product3.getProductID() == productID) {
            this.product3.addStock(quantity);
        } else if (this.product4.getProductID() == productID) {
            this.product4.addStock(quantity);
        } else {
            System.out.println("Sorry it seems your item was not found. \n Double check the product ID and try again!");
        } 
    }


    public void removeStockFromProduct(int productID, int quantity) {
        // This ensures we are using the right product specific method.
        if (this.product1.getProductID() == productID) {
            this.product1.removeStock(quantity);
        } else if (this.product2.getProductID() == productID) {
            this.product2.removeStock(quantity);
        } else if (this.product3.getProductID() == productID) {
            this.product3.removeStock(quantity);
        } else if (this.product4.getProductID() == productID) {
            this.product4.removeStock(quantity);
        } else {
            System.out.println("Sorry it seems your item was not found. \n Double check the product ID and try again!");
        } 
    }

    public void generateReport() {
        // This displays all the individual product specific info 
        System.out.println("Full details and stock information of products:");
        System.out.println("_____________________________");
        this.product1.displayProductInfo();
        System.out.println("_____________________________");
        this.product2.displayProductInfo();
        System.out.println("_____________________________");
        this.product3.displayProductInfo();
        System.out.println("_____________________________");
        this.product4.displayProductInfo();
        System.out.println("_____________________________");
    
    }


}
