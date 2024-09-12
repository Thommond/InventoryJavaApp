

public class Category {
    private int categoryID;
    private String categoryName;

    // No default; I don't want the ability to create a non-specific category
    public Category(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    // Getter and Setter for categoryID
    public int getCategoryID() {
        return this.categoryID;
    }
    
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    // Getter and Setter for categoryName
    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    } 
}