import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Food extends Product {
    private String expiryDate;

    public Food(int productID, String productName, String category, double price, int quantityInStock, String expiryDate) {
        super(productID, productName, category, price, quantityInStock);
        this.expiryDate = expiryDate;
    }

    // Getter & Setter for expiryDate
    public String getExpiryDate() {
        return this.expiryDate;
    }
    
    public void setExpiryDate(String newExpiryDate) {
        this.expiryDate = newExpiryDate;
    }
    
    @Override
    public void addStock(int quantity) {
        if (isProductNotExpired() == true) {
            super.addStock(quantity);
        } else {
            System.out.println("You can't add this food item to the stock, it is expired!!!");
        }
    }

    // Method to check if the product is expired
    private boolean isProductNotExpired() {
        try {
            LocalDate expiry = LocalDate.parse(expiryDate, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate today = LocalDate.now();
            // Returns true if today is before or on the expiry date
            return !today.isAfter(expiry); 
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid expiry date format for product: " + getProductName());
            return false;
        }
    }

}
