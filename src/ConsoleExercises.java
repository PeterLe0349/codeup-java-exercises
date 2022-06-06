import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");


//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        System.out.println("You entered --> " + num + " <--");
        //error if not number input
//        System.out.print("Enter three words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.format("The three words are %s %s %s %n", word1, word2, word3);
        //waits for 3 words if only 2 or less | 4 words or more are omitted
//        System.out.println("First word is " + word1);
//        System.out.println("Second word is " + word2);
//        System.out.println("Third word is " + word3);
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("The sentence is: " + sentence);
        //words are not all captured if it is next()
        //use nextline to capture entire sentence

        //Calculate perimeter and area of Codeup classroom
//        System.out.print("Enter width of classroom: ");
//        String width = scanner.next();
//        System.out.print("Enter length of classroom: ");
//        String length = scanner.next();
//        System.out.println("The area of the classroom is " + width + " * " + length + "= " + (Integer.parseInt(width)* Integer.parseInt(length) ));
//        System.out.println("The perimeter of the classroom is " + width + width + length + length + "= " + ((Integer.parseInt(width) + Integer.parseInt(length))*2 ));

        //User delimiter with \n
        System.out.print("Enter width and length of classroom: ");
        float widthLength = scanner.nextFloat();
        float widthLength2 = scanner.nextFloat();
        //with \n delimiter have to enter to read next input
        //default of delimiter with space
//        Scanner second = new Scanner(widthLength).useDelimiter("\n");
        System.out.println("Entered input is: " + widthLength + " | " + widthLength2 );
        System.out.println("Calculated area: " + widthLength + " * " + widthLength2 + " = " + widthLength*widthLength2);
        System.out.println("Calculated perimeter: " + widthLength*2 +  " * " + widthLength2*2 + " = " + (widthLength+widthLength2)*2);









    }
}
