import java.util.Scanner;
import java.util.Random;

public class ConsoleAdventureGame {
    public static String heroName;

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
        heroName = userInput;
        System.out.println("Hello " + heroName + ".");
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
        displayBothStats(heroHealth, heroAttack, heroPotionCount, enemyHealth, enemyAttack, enemyPotionCount);
        System.out.print("Do you want to change stats? [y/N]");
        String statChoice = scanner.nextLine();
        if(statChoice.equals("y")){
            System.out.print("Enter new hero health: ");
            heroHealth = changeStats();
            System.out.print("Enter new hero max attack: ");
            heroAttack = changeStats();
            System.out.print("Enter new hero potion count: ");
            heroPotionCount = changeStats();
            System.out.print("Enter new enemy health: ");
            enemyHealth = changeStats();
            System.out.print("Enter new enemy max attack: ");
            enemyAttack = changeStats();
            System.out.print("Enter new enemy potion count: ");
            enemyPotionCount = changeStats();
        }
        startBattle(heroHealth, heroAttack, heroPotionCount, enemyHealth, enemyAttack, enemyPotionCount);
    }

    public static int changeStats(){
        int newStat = 0;
        newStat = getInteger(1,999);
        return newStat;
    }

    public static void startBattle(int heroHealth, int heroAttack, int heroPotionCount, int enemyHealth, int enemyAttack, int enemyPotionCount){
        System.out.println("Starting battle...");
        displayBothStats(heroHealth, heroAttack, heroPotionCount, enemyHealth, enemyAttack, enemyPotionCount);
        String choice = chooseEvent();
        do{
            if(choice.equals("run")){
                GameOver();
                break;
            } else if(choice.equals("attack")){
                int atkRandom = makeRandom(1, heroAttack);
                System.out.println("Attack Event: You attacked Enemy's health:" + enemyHealth + " with an attack of " + atkRandom + "!");
                enemyHealth -= atkRandom;
                displayBothStats(heroHealth, heroAttack, heroPotionCount, enemyHealth, enemyAttack, enemyPotionCount);
                if(enemyHealth <= 0){
                    System.out.println("Enemy health: " + enemyHealth + "! KO!!!");
                    YouWin();
                    break;
                }
                int atkEnemeyRandom = makeRandom(1, enemyAttack);
                System.out.println("Attack Event: Enemy attacked your health:" + heroHealth + " with an attack of " + atkEnemeyRandom + "!");
                heroHealth -= atkEnemeyRandom;
                if(heroHealth <= 0){
                    System.out.println("Your health: " + heroHealth + "! KO!!!");
                    GameOver();
                    break;
                }
            } else if(choice.equals("drink potion")){
                if(heroPotionCount > 0){
                    heroPotionCount--;
                    heroHealth += 20;
                    System.out.println("You drank a potion and recovered 20 health.  New HP is: " + heroHealth);
                }else{
                    System.out.println("You have no potions left!! OH NO!!");
                }
            }
            displayBothStats(heroHealth, heroAttack, heroPotionCount, enemyHealth, enemyAttack, enemyPotionCount);
            choice = chooseEvent();
        }while(!choice.equals("stop"));
    }

    public static String chooseEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to do (attack/drink potion/run)?  ");
        String choice = scanner.nextLine();
        if (choice.equals("attack") || choice.equals("drink potion") || choice.equals("run") || (choice.equals("stop") )) {
            System.out.println("You chose to: " + choice);
            return choice;
        }else {
            System.out.println("Invalid choice!");
            return chooseEvent();
        }
    }


    public static void displayBothStats(int heroHealth, int heroAttack, int heroPotionCount, int enemyHealth, int enemyAttack, int enemyPotion){
        System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "Stats", heroName, "Enemy");
        System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "------", "******", "******");
        System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "Health", heroHealth, enemyHealth);
        System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "Atk", heroAttack, enemyAttack);
        System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "Potion", heroPotionCount, enemyPotion);
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

    public static void GameOver(){
        System.out.println("You got no chicken dinner!");
        System.out.println("  ,~\n" +
                " ('v)__\n" +
                "(/ (``/\n" +
                " \\__>' hjw\n" +
                "  ^^");
    }

    public static void YouWin(){
        System.out.println("YOU WIN!  TIME FOR ICE CREAM!");
        System.out.println("                                 ,'', \n" +
                "                              .a@a. \n" +
                "                              `@@@' \n" +
                "                         .,:::::::::::,. \n" +
                "                     .,%%::::%%:::%:::%%%%,. \n" +
                "                   .%%%%%%::%%%%:%%%:::%%%%%%. \n" +
                "              .a@@@@@@@@a%%:%%%%%%%%::%%%%%%%% \n" +
                "  .%%%,.     a@;@@@;@@@;@@;;%%%%%%%%%:mm:::::::::mm,.    .,%%%, \n" +
                " %%%%%%%%,;;;@;;;@@;;@@;;;@;;;%%%%mmmmm::mm:::mm:::mmmm,%%%%%%%% \n" +
                "`%%%%%%%%%%;;;;;;@;;;;@;;;;;;;;;mmmmmm::mmmm::mmmm::mm%%%%%%%%%%' \n" +
                " `%%%%%%%%%%%%:::@::::::::::::::mmmmmmm:mmmmmmmmmmm:%%%%%%%%%%%' \n" +
                ".\\\\\\\\,\\\\\\\\,\\\\\\\\,\\\\\\\\,\\\\\\\\,\\\\\\\\,\\|/,////,////,////,/::/,////,////. \n" +
                " \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|//////////////////://////////// \n" +
                "   `\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|/////////////////://////////' \n" +
                "        `\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|/////////////////://///' \n" +
                "             `\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|///////////////////' \n" +
                "                   `\\\\\\\\\\\\\\\\\\\\\\\\|////////////' \n" +
                "                          `\\\\\\\\\\|/////'          ; \n" +
                "                            `\\\\\\|///'           .:. \n" +
                "                              \\\\|//            ::::: \n" +
                "                           .,///|\\\\\\,.         `:::' \n" +
                "                        .///////|\\\\\\\\\\\\\\.");
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





//    end class
}
