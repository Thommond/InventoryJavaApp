
public class StoreInventory {
    // Product instances 
    private Electronics product1;
    private Electronics product2;
    private Clothing product3;
    private Food product4;

    public StoreInventory(Electronics product1, Electronics product2, Clothing product3, Food product4) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        this.product4 = product4;
    }

    public void addStockToProduct(int productID, int quantity) {

        if (this.product1.getProductID() == productID) {
            this.product1.addStock(quantity);
        } else if (this.product2.getProductID() == productID) {
            this.product2.addStock(quantity);
        } else if (this.product3.getProductID() == productID) {
            this.product3.addStock(quantity);
        } else if (this.product3.getProductID() == productID) {
            this.product4.addStock(quantity);
        } else {
            System.out.println("Sorry it seems your item was not found. Try again!");
        } 
    }


    public void removeStockFromProduct(int productID, int quantity) {

        if (this.product1.getProductID() == productID) {
            this.product1.addStock(quantity);
        } else if (this.product2.getProductID() == productID) {
            this.product2.addStock(quantity);
        } else if (this.product3.getProductID() == productID) {
            this.product3.addStock(quantity);
        } else if (this.product3.getProductID() == productID) {
            this.product4.addStock(quantity);
        } else {
            System.out.println("Sorry it seems your item was not found. Try again!");
        } 
    }

    public void generateReport() {
        // This displays all the products info
        System.out.println("_____________________________");
        this.product1.displayProductInfo();
        System.out.println("_____________________________");
        this.product2.displayProductInfo();
        System.out.println("_____________________________");
        this.product3.displayProductInfo();
        System.out.println("_____________________________");
        this.product4.displayProductInfo();
        System.out.println("_____________________________");
       
        /* She wants one that accounts for "Whats in stock" so 
         * only display "Products" which are in stock.
         */
    }


}
