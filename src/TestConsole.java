import java.util.Scanner;

public class TestConsole {
    public static void main(String[] args){
//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
        String greeting = "Salutations";
        String name = "codeup\n";
        System.out.printf("%s,%n %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered --> \"" + userInput + "\" <--");


    }
}
