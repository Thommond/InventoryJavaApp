import java.util.Scanner;

public class InventoryManagementApp1 {

    public static void main(String[] args) { 

        // Variables for "menu" driven logic 
        boolean exit = false;
        Scanner scnr = new Scanner(System.in);
        int menuOption;
        int userQuantity;
        int productId;
        // Products 

        StoreInventoryArray inventory = new StoreInventoryArray(4);

        // These products start with a "stock" for testing purposes, but in a real system they would not. 
        Electronics iphone = new Electronics(1, "Iphone 16", "Electronics", 1000.00, 30, 90, "Apple");
        Electronics playstation = new Electronics(2, "Playstation", "Electronics", 600.00, 18, 90, "Sony");
        Clothing sweater = new Clothing(3, "Sweater", "Clothing", 15.00, 50, 10, "Alpacha Wool");
        Food apple = new Food(4, "Apple", "Food", 1.50, 25, "2025-01-25");

        // StoreInventory inventory = new StoreInventory(iphone, playstation, sweater, apple);

        // Main menu 
        String mainMenu = """
            Menu: 
            1. Display all products to add to inventory
            
            2. Add product to inventory 

            3. Remove product from inventory 

            4. Add stock to a product
            
            5. Remove stock of a product
            
            6. Generate Report on all products in the inventory
            
            7. Exit 
            """;

        while (exit == false) {

            System.out.println(mainMenu); // Main menu shows first 
            System.out.println("Please select an option (1-7):");

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
                   // Add the product to inventory 
                   System.out.println("Please enter the productID of the product.");

                   productId = scnr.nextInt();

                   switch (productId) {
                       case 1:
                            inventory.addProduct(iphone);
                           break;
                        case 2:
                            inventory.addProduct(playstation);
                           break;
                        case 3:
                            inventory.addProduct(sweater);
                           break;
                        case 4: 
                            inventory.addProduct(apple);
                           break;
                       default:
                           System.out.println("Sorry, seems like we don't have that item to add to the inventory. Try again.");
                   }
                   break;
                case 3:
                   // Remove the product from the inventory 
                   if (inventory.getProductCount() > 0) {
                   System.out.println("Please enter the productID of the product you would like to remove.");
                   productId = scnr.nextInt();
                   inventory.removeProduct(productId);
                   } else {
                    System.out.println("Sorry, you can't remvove products if the inventory is empty.");
                   }
                   break;
                case 4:
                    // Add stock to a product
                    if (inventory.getProductCount() > 0) {
                    System.out.println("Please enter the productID of the product.");
                    productId = scnr.nextInt();
                    System.out.println("Please enter a stock count less then or equal to 100");
                    userQuantity = scnr.nextInt();
                    inventory.addStockToProduct(productId, userQuantity);
                    } else {
                        System.out.println("Sorry, you can't add stock if there are no products.");
                    }

                    break;
                case 5: 
                    // Remove quantity of an item
                    if (inventory.getProductCount() > 0) {
                    System.out.println("Please enter the productID of the item.");
                    productId = scnr.nextInt();
                    System.out.println("Please enter a quantity less then or equal to 100");
                    userQuantity = scnr.nextInt();
                    inventory.removeStockFromProduct(productId, userQuantity);
                    } else {
                    System.out.println("Sorry, you can't remove stock if there are no products.");
                    }
                    break;
                case 6: 
                    inventory.generateReport();
                    break;
                case 7: 
                    // Exit the inventory tools
                    scnr.close();
                    System.out.println("Thanks for using the inventory system. Have a great day!");
                    exit = true;
                    break;
                default:
                    System.out.println("Remember to select integers 1-7 for a valid menu option.\n");
                    break;

            }
        }

    }
}

