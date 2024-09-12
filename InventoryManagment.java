public class InventoryManagment {

    public static void main(String[] args) {
        // TODO: Add menu driven feature for products, categorys, and inventory. 
        // We will be using these later. 
        Category produce = new Category(1, "Produce");
        Category dairy = new Category(2, "Dairy");
        Category meats = new Category(3, "Meats");
        Category grains = new Category(4, "Grains");
        Category drinks = new Category(5, "Drinks");
        Category snacks = new Category(6, "Snacks");
        
        // Produce
        Product plum = new Product(1, "Pack of Plums", "Produce", 8.50, 10);
        Product carrot = new Product(2, "Pack of Carrots", "Produce", 3.99, 30);
        // Dairy
        Product milk = new Product(3, "Gallon of Milk", "Dairy", 2.99, 20);
        Product cheese = new Product(4, "Block of Cheddar Cheese", "Dairy", 5.49, 15);
        // Meats=
        Product chickenBreast = new Product(5, "Chicken Breast (1 lb)", "Meats", 7.99, 25);
        Product groundBeef = new Product(6, "Ground Beef (1 lb)", "Meats", 6.49, 40);
        // Grains
        Product rice = new Product(7, "Bag of Rice (5 lbs)", "Grains", 4.99, 50);
        Product oats = new Product(8, "Container of Oats (2 lbs)", "Grains", 3.79, 30);
        // Drinks 
        Product orangeJuice = new Product(9, "Gallon of Orange Juice", "Drinks", 3.29, 18);
        Product soda = new Product(10, "Can of Soda", "Drinks", 0.99, 60);
        // Snacks category
        Product chips = new Product(11, "Bag of Potato Chips", "Snacks", 2.49, 25);
        Product chocolateBar = new Product(12, "Chocolate Bar", "Snacks", 1.29, 40);

        System.out.println("A delicious "+plum.getProductName()+" and a refreshing "+orangeJuice.getProductName());
    }

    
}