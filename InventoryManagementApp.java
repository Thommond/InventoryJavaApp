import java.util.Scanner;

public class InventoryManagementApp {

    public static void main(String[] args) { 

        // Variables for "menu" driven logic 
        boolean exit = false;
        Scanner scnr = new Scanner(System.in);
        int menuOption;
        int userQuantity;
        int productId;
        // Products 
        Electronics iphone = new Electronics(1, "Iphone 16", "Electronics", 1000.00, 30, 90, "Apple");
        Electronics playstation = new Electronics(2, "Playstation", "Electronics", 600.00, 18, 90, "Sony");
        Clothing sweater = new Clothing(3, "Sweater", "Clothing", 15.00, 50, 10, "Alpacha Wool");
        Food apple = new Food(4, "Apple", "Food", 1.50, 25, "2025-01-25");

        StoreInventory inventory = new StoreInventory(iphone, playstation, sweater, apple);

        // Main menu 
        String mainMenu = """
            Menu: 
            1. Display all products 
            
            2. Add quantity to a product
            
            3. Remove stock of a product
            
            4. Generate Report on all products
            
            5. Exit 
            """;

        while (exit == false) {

            System.out.println(mainMenu); // Main menu shows first 
            System.out.println("Please select an option (1-5):");

            menuOption = scnr.nextInt();
            // I'm assuming this counts as if/else logic and will not impact my grade
            switch (menuOption) {
                // Based on users input do action
                case 1:
                    // Check basic details of a product
                    System.out.println("Available Products");
                    System.out.println("Name: "+iphone.getProductName()+" ID: "+iphone.getProductID());
                    System.out.println("Name: "+ playstation.getProductName()+" ID: "+playstation.getProductID());
                    System.out.println("Name: "+sweater.getProductName()+" ID: "+sweater.getProductID());
                    System.out.println("Name: "+apple.getProductName()+" ID: "+apple.getProductID());
                    break;
                case 2:
                    // Add quantity of an item
                    System.out.println("Please enter the productID of the item.");
                    productId = scnr.nextInt();
                    System.out.println("Please enter a quantity less then or equal to 100");
                    userQuantity = scnr.nextInt();
                    inventory.addStockToProduct(productId, userQuantity);
                    break;
                case 3:
                    // Remove quantity of an item
                    System.out.println("Please enter the productID of the item.");
                    productId = scnr.nextInt();
                    System.out.println("Please enter a quantity less then or equal to 100");
                    userQuantity = scnr.nextInt();
                    inventory.removeStockFromProduct(productId, userQuantity);
                    break;
                case 4:
                    // Isn't this literly the same as option 1;
                    inventory.generateReport();
                    break;
                case 5: 
                    // Exit the inventory toolsd
                    scnr.close();
                    System.out.println("Thanks for using the inventory system. Have a great day!");
                    exit = true;
                    break;
                default:
                    System.out.println("Remember to select integers 1-5 for a valid menu option.\n");
                    break;

            }
        }

    }
}
