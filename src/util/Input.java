package util;
import java.util.Scanner;

public class Input {
    final private Scanner scanner = new Scanner(System.in);

    public void main(String[] args){
    }

    public String getString(){
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public String getInput(){
//        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.print("Enter yes/no: ");
        String input = scanner.next();
        if(input.equals("yes") || input.equals("y")){
            return true;
        }
        else if(input.equals("no") || input.equals("n")){
            return false;
        }else
            return yesNo();
    }

    public int getInt(int min, int max) {
        int validInt = 0;
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        if (scanner.hasNextInt()) {
            validInt = scanner.nextInt();
//            System.out.println(validInt);
            if (validInt >= min && validInt <= max) {
                return validInt;
            } else {
                System.out.println("Invalid input beyond range!");
                return getInt(min, max);
            }
        } else {
            System.out.println("Invalid input type!");
            return getInt(min, max);
        }
    }

    public int getInt() {
        int validInt = 0;
        System.out.print("Enter a number:  ");
        if (scanner.hasNextInt()) {
            validInt = scanner.nextInt();
            return validInt;
        }
        else {
            System.out.println("Invalid input type!");
            return getInt();
        }
    }

    public double getDouble() {
        double validDoub = 0;
        System.out.print("Enter a number:  ");
        if (scanner.hasNextDouble()) {
            validDoub = scanner.nextDouble();
            return validDoub;
        }
        else {
            System.out.println("Invalid input type!");
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        double validDoub = 0;
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        if (scanner.hasNextDouble()) {
            validDoub = scanner.nextDouble();
//            System.out.println(validDoub);
            if (validDoub >= min && validDoub <= max) {
                return validDoub;
            } else {
                System.out.println("Invalid input beyond range!");
                return getDouble(min, max);
            }
        } else {
            System.out.println("Invalid input type!");
            return getDouble(min, max);
        }
    }





}
