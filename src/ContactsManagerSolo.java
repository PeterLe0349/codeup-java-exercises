import util.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContactsManagerSolo {
    final static String directory = "data";
    final static String filename = "contact.txt";
    static Path dataDirectory;
    static Path dataFile;
    static Path filepath;
    static List<String> contactList;
    static HashMap<String, String> contactMap = new HashMap<>();


    public static void main(String[] args) throws IOException {
        Input input = new Input();
        checkAndCreateFileDir();
        System.out.println("Welcome to the Contact Manager APP\n");
        printMenu();
        int choice = input.getInt(1,5);
        while(choice != 5){
            switch(choice){
                case 1:
                    displayHashMapData();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            printMenu();
            choice = input.getInt();
        }
        System.out.println("Have a fantastic day!");


    }

    public static void rewriteToFile() throws IOException {
        contactList = new ArrayList<>();
        for(String i: contactMap.keySet()){
            contactList.add(i.trim() + "," +contactMap.get(i).trim());
        }
        Files.write(filepath, contactList);
    }



    public static void printMenu(){
        System.out.println("\n1. View contacts");
        System.out.println("2. Add a new contact");
        System.out.println("3. Search a contact by name");
        System.out.println("4. Delete an existing contact");
        System.out.println("5. Exit");
        System.out.print("Enter an option (1, 2, 3, 4 or 5):") ;
    }

    public static void searchContact(){
        Input input = new Input();
        System.out.print("Enter contact name to search. ");
        String name = input.getString();
        if(!contactMap.containsKey(name)){
            System.out.println("Contact name does not exist!");
        }else{
            System.out.printf("%s has contact number: %s%n", name, contactMap.get(name));
        }
    }

    public static void deleteContact() throws IOException {
        Input input = new Input();
        System.out.print("Enter contact name to delete. ");
        String name = input.getString();
        if(!contactMap.containsKey(name)){
            System.out.println("Contact name does not exist!");
        }else{
            contactMap.remove(name);
            System.out.println("Contact: " + name + " removed!");
            rewriteToFile();
        }

    }



    public static void editContact(){
        Input input = new Input();
        System.out.print("Enter contact name to search. ");
        String name = input.getString();
        if(!contactMap.containsKey(name)){
            System.out.println("Contact name does not exist!");
        }else{
            contactMap.remove(name);
            System.out.print("Enter edited contact name. ");
            String name2 = input.getString();
            System.out.print("Enter edited contact number. ");
            String num = input.getString();
            contactMap.put(name2, num);
        }

    }

    public static void addContact() throws IOException {
        Input input = new Input();
        System.out.print("Enter new contact name. ");
        String name = input.getString();
        if(contactMap.containsKey(name)){
            System.out.println("Contact name exits!");
            addContact();
        }else{
            System.out.print("Enter contact number. ");
            String num = input.getString();
            contactMap.put(name, num);
            rewriteToFile();
        }
    }

    public static void printAllLinesFromFile() throws IOException {
        List<String> contactList1 = Files.readAllLines(filepath);
        for(int i = 0; i < contactList1.size(); i += 1) {
            System.out.println((i + 1) + ": " + contactList1.get(i));
        }
    }



    public static void displayHashMapData() throws IOException {
        System.out.println("Current contact list is: ");
        System.out.println("-----------------------");
        System.out.printf("%-12s | %-12s |%n", "Name", "Phone number");
        System.out.println("-----------------------");
        for(String i: contactMap.keySet()){
            System.out.printf("%-12s | %-12s |%n", i, contactMap.get(i));
        }
    }


    public static void checkAndCreateFileDir() throws IOException {
        dataDirectory = Paths.get(directory);
        dataFile = Paths.get(directory, filename);
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        filepath = Paths.get(directory, filename);
        List<String> contactList1 = Files.readAllLines(filepath);
        for(int i = 0; i < contactList1.size(); i += 1) {
            String[] contactData = contactList1.get(i).split(",");
            contactMap.put(contactData[0].trim(), contactData[1].trim());
        }
    }






//    end class
}
