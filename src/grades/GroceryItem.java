package grades;

public class GroceryItem {
    private  String name;
    private  int quantity;
    private final String category;

    public GroceryItem(String category, String name, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int amount){
        this.quantity = amount;
    }
}
