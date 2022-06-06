import java.util.Scanner;

public class TestStatementsLoops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//        boolean confirmation = userInput.equals("y");
//        if(confirmation){
//            System.out.println("CONFIRMED!");
//        }else{
//            System.out.println("NOT CONFIRMED!");
//        }

        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
                // Fall through!
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        boolean keepGoing = true;
        int maxLoop = 10;
        int loopCount = 0;

        while(keepGoing && loopCount < maxLoop ){
            loopCount++;
            if(loopCount == 9){
                keepGoing = false;
            }
            System.out.println("Current loop is " + loopCount);
        }



        //end main statement
    }
}
