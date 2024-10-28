
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
        // She wants us to use a common inteface to display all the 
        // details of specific products. 

        /*The generateReport() method in the StoreInventory
        class demonstrates polymorphism by handling
        different product types through a common interface. */
    }


}
