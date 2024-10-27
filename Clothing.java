
import java.util.Random;

public class Clothing extends Product {
    private int size;
    private String material;

    @Override
    public void removeStock(int quantity) {
        if (isReturnPolicyValid() == true) {
            super.removeStock(quantity);
        } else {
            System.out.println("Item can not be returned so it can not be removed from stock.");
        }
    }

    public boolean isReturnPolicyValid() {
        // I decieded to do something different
        Random random = new Random();
        int randNumber = random.nextInt(4) + 1;
        return randNumber != 1; // 75% chance of valid return 
    }
}
