package grades;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class GroceryListApplication {
    public static ArrayList<GroceryItem> shoppingList = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("Hello user.  Would you like to create a grocery list?");
        Input input = new Input();
        boolean decision = input.yesNo();
        if(!decision){
            System.out.println("You decided to not make a shopping list.  Ending app.");
        }else {
            while(decision){
            startGroceryList();
                System.out.println("Do you want to continue adding to list?");
                decision = input.yesNo();
            }
        }
        showFinalList();

    }

    public static void startGroceryList(){
        System.out.println("Please choose category to add to: ");
        Input input = new Input();
        System.out.println("1 - Fruits & Vegetables");
        System.out.println("2 - Drinks");
        System.out.println("3 - Entree");
        System.out.println("4 - Edit item");
        System.out.println("5 - Show current list");
        int choice = input.getInt();
        switch (choice) {
            case 1 -> addToFruitAndVegetables();
            case 2 -> addToDrinks();
            case 3 -> addToEntrees();
            case 4 -> editItem();
            case 5 -> showFinalList();
        }
    }

    public static void editItem(){
        showFinalList();
        Input input = new Input();
        System.out.print("Enter item name to be edited: ");
        String item = input.getString();
        int index = -1;
        for(GroceryItem it: shoppingList){
            if(it.getName().equals(item)){
                index = 1;
                System.out.println("Found item. Editing item: ");
                System.out.println("Enter new name for item");
                String newName = input.getString();
                System.out.println("Enter new amount: ");
                int amount = input.getInt();
                it.setName(newName);
                it.setQuantity(amount);
            }
        }
        if(index == -1) {
            System.out.println("No such item.  Returning to main menu.");
        }
    }

    public static void addToFruitAndVegetables(){
        Input input = new Input();
        System.out.println("Please enter grocery item name: ");
        String name = input.getString();
        System.out.println("Please enter amount to buy: ");
        int amount = input.getInt();
        shoppingList.add(new GroceryItem("greens", name, amount));
    }

    public static void addToDrinks(){
        Input input = new Input();
        System.out.println("Please enter grocery item name: ");
        String name = input.getString();
        System.out.println("Please enter amount to buy: ");
        int amount = input.getInt();
        shoppingList.add(new GroceryItem("drinks", name, amount));
    }

    public static void addToEntrees(){
        Input input = new Input();
        System.out.println("Please enter grocery item name: ");
        String name = input.getString();
        System.out.println("Please enter amount to buy: ");
        int amount = input.getInt();
        shoppingList.add(new GroceryItem("entrees", name, amount));
    }

    public static void showFinalList(){
        System.out.println("Showing final shopping list.");
        Collections.sort(shoppingList, Comparator.comparing(GroceryItem::getName));
        System.out.println("Fruits and Vegetables category: ");
        shoppingList.forEach(item -> {
            if(item.getCategory().equals("greens")){
            System.out.printf("Item: %s, quantity: %d %n", item.getName(), item.getQuantity());
            }
        });
        System.out.println("Drinks category: ");
        shoppingList.forEach(item -> {
            if(item.getCategory().equals("drinks")){
                System.out.printf("Item: %s, quantity: %d %n", item.getName(), item.getQuantity());
            }
        });
        System.out.println("Entree category: ");
        shoppingList.forEach(item -> {
            if(item.getCategory().equals("entrees")){
                System.out.printf("Item: %s, quantity: %d %n", item.getName(), item.getQuantity());
            }
        });
    }







}
