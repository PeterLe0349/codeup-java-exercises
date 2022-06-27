package util;
import java.util.Scanner;

public class Input {
    final private Scanner scanner = new Scanner(System.in);

    public void main(String[] args){
    }

    public String getString(){
        System.out.print("Input: ");
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
        String input;
        int validInt = 0;
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        try {
            input = scanner.nextLine();
            validInt = Integer.valueOf(input);
            if (validInt >= min && validInt <= max) {
                return validInt;
            } else {
                System.out.println("Invalid input beyond range!");
                return getInt(min, max);
            }
        } catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Not a valid integer!");
            return getInt(min, max);
        }
    }

    public int getInt() {
        String input;
        System.out.print("Enter a number:  ");
        try {
            input = scanner.nextLine();
            return Integer.valueOf(input);
        } catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Not a valid integer!");
            return getInt();
        }
    }

    public double getDouble() {
        String input;
        System.out.print("Enter a number:  ");
        try {
            input = scanner.nextLine();
            return Double.valueOf(input);
        } catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Not a valid double number!");
            return getDouble();
        }
    }

    public double getDouble(double min, double max) {
        String input;
        double validInt = 0;
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        try {
            input = scanner.nextLine();
            validInt = Double.valueOf(input);
            if (validInt >= min && validInt <= max) {
                return validInt;
            } else {
                System.out.println("Invalid input beyond range!");
                return getDouble(min, max);
            }
        } catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Not a valid integer!");
            return getDouble(min, max);
        }
    }

    public int getBinary(){
        System.out.print("Enter a binary number: ");
        String s = scanner.nextLine();
        try{
            int bin = Integer.parseInt(s,2);
            return bin;
        }catch(Exception e){
            System.out.println(e);
            return getBinary();
        }

    }

    public int getHex(){
        System.out.print("Enter a hex number: ");
        String s = scanner.nextLine();
        try{
            int bin = Integer.parseInt(s,16);
            return bin;
        }catch(Exception e){
            System.out.println(e);
            return getHex();
        }

    }







}
