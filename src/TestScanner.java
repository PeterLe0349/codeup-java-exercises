import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an input:");
        String input = scanner.nextLine();
        while(!input.equals("stop")){
            System.out.printf("The input is: %s%n", input);
            String[] str = input.split(" ");
            System.out.printf("The array has %d tokens.%n", str.length );
            System.out.print("Enter an input:");
            input = scanner.nextLine();
        }
    }
}
