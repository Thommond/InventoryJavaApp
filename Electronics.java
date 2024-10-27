public class Electronics extends Product {
    private int warrantyPeriod;
    private String brand;

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

}