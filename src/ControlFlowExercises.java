import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //while loop
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

        //do while
//        int startCount = 0;
//
//        do {
//            System.out.println(startCount);
//            startCount += 2;
//
//        }while(startCount <= 100);

//        int startCount = 100;
//
//        do {
//            System.out.println(startCount);
//            startCount -= 5;
//
//        }while(startCount >= -10);
        //SQUARE the Number
//        long startCount = 2; //doesn't work if it INT, goes beyond limit
//        do {
//            System.out.println(startCount*startCount);
////            int b = startCount;
//            startCount = startCount * startCount;
//        }while(startCount < 1000000);
//        int a = 4;
//        int b = a;
//        a = 6;
//        System.out.println(b);

        //FOR LOOP
//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }

//        for(int i = 0; i <= 100; i += 2){
//            System.out.print(i + " ");
//        }

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.print(i + " ");
//        }

//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i*i);
//        }

//        FizzBuzz
//        System.out.println(5%2);
//        for(int i = 1; i<= 100; i++){
//            if(i%15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i%5 == 0){
//                System.out.println("Fizz");
//            } else if(i%3 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        long a = 233;
//        long b = 1;
//        long c = 23485345;
//        System.out.println(String.valueOf(a).length());
//        System.out.println(String.valueOf(b).length());
//        System.out.println(String.valueOf(c).length());
//        myMethod(2);

        //PRINT OUT TIMES TABLE
//        boolean keepGoing = true;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int input = scanner.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "number", "squared", "cubed");
//            System.out.format("%-10s|" + "%-10s|" + "%-10s%n", "------", "------", "------");
//            for(int i = 1; i <= input; i++){
//                System.out.format("%-10d|" + "%-10d|" + "%-10d%n", i, i*i, i*i*i);
//            }
//            System.out.println("Do you want to continue? [y/N]");
//            String choice = scanner.next();
//            if(!choice.equals("y")){
//                keepGoing = false;
//            }
//        }while(keepGoing);

//        System.out.println("1" + spaceBuffer(5) + "1");
//        System.out.println("1" + "22222" + "1");
//        System.out.format("|%-10d|%n", b);
//        System.out.format("|%-10d|", a);


        //4 CONVERT GRADE NUMBERS TO LETTERS
        boolean keepGoing = true;
        do {
            System.out.print("Enter a number between 0 to 100: ");
            int grade = scanner.nextInt();
            if(grade > 99){
                System.out.println("A+");
            } else if(grade > 90){
                System.out.println("A");
            } else if(grade >= 88){
                System.out.println("A-");
            } else if(grade == 87){
                System.out.println("B+");
            } else if(grade > 81){
                System.out.println("B");
            } else if(grade >= 80){
                System.out.println("B-");
            } else if(grade >= 67){
                System.out.println("C");
            } else if(grade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Do you want to continue? [y/N]");
            String choice = scanner.next();
            if(!choice.equals("y")){
                keepGoing = false;
            }
        }while(keepGoing);


















    }

//    static String spaceBuffer(int n){
//        String spacey = "";
//        for(int i = 0; i < n; i++){
//            String spa = " ";
//            String spa2 = spacey;
//            spacey = spa + spa2;
//        }
//        return spacey;
//    }


//    static void myMethod(int n){
//        System.out.println("My method " + n);
//    }
//       STOP    end main statement
}
