import java.util.Scanner;
import java.util.Random;

public class ConsoleAdventureGame {
    public static void main(String[] args){
        displayStartScreen();
        startMenu();

    }

    public static void displayStartScreen(){
        System.out.print("  |\\|\\\n" +
                ">/ ( )=<\n" +
                "|`'o' ==\n" +
                " \\(^) =/\n" +
                "  `< =\"               Help Garfield defeat Odie!\n" +
                "  /  ||\"\n" +
                " (   /)=\"\n" +
                "  \\ (,3=\"\n" +
                "   `++||==\n" +
                "  __||||`==.\n" +
                " (,(,___\\ \"==)  ool");
    }

    public static void startMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nStart game? [y/N] ");
        String userInput = scanner.next();
        boolean confirmation = userInput.equals("y");
        if(confirmation){
            System.out.println("Starting game!");
            startGame();
        }else{
            System.out.println("Ending game!");
        }
    }

    public static void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + ".");
        int heroHealth = 100;
        int heroAttack = makeRandom(1,20);
        int heroPotionCount = 3;
        int enemyHealth = 100;
        int enemyAttack = makeRandom(1,20);
        int enemyPotionCount = 3;
        System.out.println("Your STATS ");
        displayStats(heroHealth,heroAttack, heroPotionCount);
        enemyEncounter();
        System.out.println("Odie's STATS:");
        displayStats(enemyHealth,enemyAttack,enemyPotionCount);
        startBattle(heroHealth, heroAttack, heroPotionCount, enemyHealth, enemyAttack, enemyPotionCount);
    }

    public static void startBattle(int heroHealth, int heroAttack, int heroPotionCount, int enemyHealth, int enemyAttack, int enemyPotion){
        System.out.println("Starting battle...");
//        heroHealth--;
//        heroAttack += 10;
//        heroPotionCount++;
//        displayStats(heroHealth,heroAttack,heroPotionCount);


    }

    public static void enemyEncounter(){
        System.out.println("You encountered Odie!");
        System.out.println("          ,-----.\n" +
                "          /       \\--.\n" +
                "          |       /   \\\n" +
                "          `. \\-+-',___/\n" +
                "            \\ \\ \\ \\\n" +
                "          ,--\\/\"\"\"\\\"\".\n" +
                "    `._  /    \\    \\  \\\n" +
                "    _  `|   (  \\   o\\o|.,--.\n" +
                "     `-' \\   \\`-;---'-'(   #)\n" +
                "          `._ \\ |\\      `--/\n" +
                "\\.           \\ ||,`.      /\n" +
                " \\`..--.._    ||/   `===='.\n" +
                "  \\/     _`.__|| .-.    \\  \\\n" +
                "  |     / \\    |'|  `.   !  |\n" +
                "  \\     \\_/    \\_.')  \\  !  |\n" +
                "  ,\"\".  .        _/    \\   /\n" +
                " /      ;`--'\\  \\ \\     `-'\n" +
                " |  |`-<      \\  \\ \\\n" +
                " |  |\\  \\,---. \\  \\ \\,---.\n" +
                " |  |,---.    `.\\  \\,---. `.\n" +
                " >        `. | | \\       `.|\n" +
                "(        | |-'-' (      | |'\n" +
                " `-------'-'      `-----'-'  hjw");
    }



    public static void displayStats(int health, int attack, int potionCount){
        System.out.println("------------");
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attack);
        System.out.println("Potions: " + potionCount);
    }


    public static int makeRandom(int min, int max){
       return (int)Math.floor(Math.random()*(max-min+1)+min);
    }





//    end class
}
