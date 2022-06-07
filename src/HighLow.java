import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static void main(String[] args){
        int guessCount = 0;
        int maxGuessCount = 10;
        int randomNumber  = makeRandom();
        System.out.println("Generated random number is: " + randomNumber);

        while(guessCount < maxGuessCount){
            System.out.println("Guess the number that is between 1 and 100");
            int guess = getInteger(1, 100);
            guessCount++;
            if(guess < randomNumber){
                System.out.println("Higher");
            }else if(guess > randomNumber){
                System.out.println("Lower");
            }else{
                System.out.println("Good guess!");
                break;
            }
            System.out.println("Guess Count: " + guessCount + "/ " + maxGuessCount);
        }





    }
//Hard coded min and max
    public static int makeRandom(){
        return (int)Math.floor(Math.random()*(100-1+1)+1);
    }


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





    //end class
}
