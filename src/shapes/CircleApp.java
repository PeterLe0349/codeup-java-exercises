package shapes;
import util.Input;
import shapes.Circle;

public class CircleApp {

    private static int totalCircles = 0;

    public static void main(String[] args){
        Input inputter = new Input();
        System.out.print("Enter a radius number. ");
        totalCircles++;
        int radius = inputter.getInt();
        Circle circ = new Circle(radius);
        System.out.println(circ.getArea());
        System.out.println(circ.getCircumference());
        printTotalCircles();
        boolean choice = inputter.yesNo();
        while(choice){
            System.out.print("Enter a radius number. ");
            totalCircles++;
            radius = inputter.getInt();
            circ = new Circle(radius);
            System.out.println(circ.getArea());
            System.out.println(circ.getCircumference());
            printTotalCircles();
            System.out.println("Do you want to continue?");
            choice = inputter.yesNo();
        }

    }

    public static void printTotalCircles(){
        System.out.println("You made a total of " + totalCircles + " circles!");
    }


}
