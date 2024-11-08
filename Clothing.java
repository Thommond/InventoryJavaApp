
import java.util.Random;

public class Clothing extends Product {
    private int size;
    private String material;

    public Clothing(int productID, String productName, String category, double price, int quantityInStock, int size, String material) {
        super(productID, productName, category, price, quantityInStock);
        this.size = size;
        this.material = material;
    }

    @Override
    public void removeStock(int quantity) {
        if (isReturnPolicyValid() == true) {
            super.removeStock(quantity);
        } else {
            System.out.println("Item can not be returned so it can not be removed from stock.");
        }
    }

    public boolean isReturnPolicyValid() {
        // Random return policy 25% of invalidity
        Random random = new Random();
        int randNumber = random.nextInt(4) + 1;
        return randNumber != 1; // 75% chance of valid return 
    }

    @Override
    public void displayProductInfo() {
       System.out.println("Product info for "+super.getProductName()); 
       System.out.println("Product ID: "+super.getProductID());
       System.out.println("Category: "+super.getCategory());
       System.out.println("Price: "+super.getPrice());
       System.out.println("Qty in Stock: "+super.getQuantityInStock());
       System.out.println("Size: "+this.size);
       System.out.println("Material: "+this.material);
    }

}
