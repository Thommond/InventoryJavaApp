public class Electronics extends Product {
    private int warrantyPeriod;
    private String brand;

    // Constructor 
    public Electronics(int productID, String productName, String category, double price, int quantityInStock, int warrantyPeriod, String brand) {
        super(productID, productName, category, price, quantityInStock);
        this.warrantyPeriod = warrantyPeriod;
        this.brand = brand;
    }
    

    // Getters 
    public int getWarrentyPeriod() {
        return this.warrantyPeriod;
    }

    public String getBrand() {
        return this.brand;
    }

    // Setters 
    public void setWarrantyPeriod(int newWarrantyPeriod) {
        this.warrantyPeriod = newWarrantyPeriod;
    }

    public void setBranding(String newBrand) {
        this.brand = newBrand;
    }
    
    // Overriden addStock() method
    @Override
    public void addStock(int quantity) {
        if (this.warrantyPeriod > 0) {
            super.addStock(quantity);
        } else {
            System.out.println("The product cannot be added as the warranty has expired.");
        }
    }

    @Override
    public void displayProductInfo() {
       System.out.println("Product info for "+super.getProductName()); 
       System.out.println("Product ID: "+super.getProductID());
       System.out.println("Category: "+super.getCategory());
       System.out.println("Price: "+super.getPrice());
       System.out.println("Qty in Stock: "+super.getQuantityInStock());
       System.out.println("Warranty Period: "+this.warrantyPeriod);
       System.out.println("Brand: "+this.brand);
    }


}