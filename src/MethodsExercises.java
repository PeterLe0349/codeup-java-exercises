import java.util.Scanner;

public class MethodsExercises {
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
        System.out.println("The valid number is: "+ getInteger(1,10));


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

    public static int getInteger(int min, int max){
       int validInt = 0;
       System.out.print("Enter a number between "+  min + " and " + max + ": ");
        Scanner scanner = new Scanner(System.in);
           int numInput = scanner.nextInt();
             validInt = numInput;
            scanner.close();


           System.out.println("The number entered is: " + validInt);
           if(validInt >= min && validInt <= max) {
               return validInt;
           }
           return getInteger(min,max);
       }


}
