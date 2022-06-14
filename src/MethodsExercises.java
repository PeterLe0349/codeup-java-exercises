import util.Input;

import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static Input inputter = new Input();
    public static void main(String[] args){

//        System.out.println(addNumbers(23.234, 11.11));
//        System.out.println(subNumbers(11, 4));
//        System.out.println(mulNumbers(11, 4));
//        System.out.println(mulNumbersForLoop(11, 4));
//        System.out.println(mulNumbersRecursion(11, 4, 0));
//        System.out.println(divNumbers(11, 2));
//        //infinity if divide by zero
//        System.out.println(modNumbers(11, 2));
        //NAN if mod  zero
//        System.out.println("The valid number is: "+ getInteger(1,10));
//        factorial();
//        int breakNum = factorialBreakingPoint(1);
//        System.out.println("Breaking point is: " + breakNum);
//        getInteger(1, 10);
        factorial();
//        rollDice();


    }

    public static double addNumbers(double x, double y){
        return x + y;
    }

    public static double subNumbers(double x, double y){
        return x - y;
    }

    public static double mulNumbers(double x, double y){
        return x * y;
    }

    public static double mulNumbersForLoop(double x, double y){
        double product = 0;
        for(int i = 0; i < y; i++){
            product += x;
        }
        return product;
    }

    public static double mulNumbersRecursion(double x, double y, double sum){
        double product = sum;
        if( y <= 0){
            return sum;
        }else {
            product += x;
        }
        return mulNumbersRecursion(x,y-1, product);
    }

    public static double divNumbers(double x, double y){
        return x / y;
    }

    public static double modNumbers(double x, double y){
        return x%y;
    }
//2
    public static int getInteger(int min, int max) {
        int validInt = 0;
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            validInt = scanner.nextInt();
            System.out.println(validInt);
            if (validInt >= min && validInt <= max) {
                return validInt;
            } else {
                System.out.println("Invalid input beyond range!");
                return getInteger(min, max);
            }
        } else {
            System.out.println("Invalid input type!");
            return getInteger(min, max);
        }
    }
//3 factorial
    public static void factorial(){
        boolean continueDoing = true;
        do {
            try {
                long num = getInteger(1, factorialBreakingPoint(9));
                long product = 1;
                long sum = 1;
                for (int i = 1; i <= num; i++) {
                    sum = 1;
                    System.out.print("\n" + i + "! =");
                    for (int j = 1; j <= i; j++) {
                        sum *= j;
                        System.out.print(" " + (j));
                    }
                    System.out.print(" = " + sum);
                }
                System.out.println("\nDo you want to continue? y/n?");
                continueDoing = inputter.yesNo();
            } catch (NumberFormatException e) {
                System.out.println("Too big!!: " + e);
            }

        }while(continueDoing);

    }

    public static int factorialBreakingPoint(int n){
        long longie = 0;
        int breakNum = 0;
        try {
            for(int i = 1; i <= n; i++){
                longie = 1;
//                System.out.print("\n" + i+ "! ="  );
                for(int j = 1; j <= i; j++){
                    longie *= j;
//                    System.out.print(" " + (j));
                    if(longie <= 0){
//                        System.out.println("Broke at:" + i);
                        breakNum = i;
                        return i-1;
                    }
                }
//                System.out.print(" = " + longie);
            }
            return factorialBreakingPoint(n+1);

        } catch (NumberFormatException e){
//            System.out.print("Bad " + longie);
            return -1;
        }
    }

    // 4 dice game

    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many sides for the dice.");
        int limit = getInteger(1, 2147483647);
        System.out.println("You've chosen a dice with: " + limit + " sides.");
        Random rand = new Random();
        int diceNumber  = (int)Math.floor(Math.random()*(limit-1+1)+1);
        int diceNumber2  = (int)Math.floor(Math.random()*(limit-1+1)+1);
        System.out.println("Dice 1 You rolled a: " + diceNumber);
        System.out.println("Dice 2: You rolled a: " + diceNumber2);
    }

    // 5 Game Development 101









//END OF JAVA
}
