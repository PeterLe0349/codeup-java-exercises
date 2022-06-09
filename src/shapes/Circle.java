package shapes;
//import java.lang.Math;

public class Circle {
    private double radius = 0;


    public Circle(double radius){
        this.radius = radius;

    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return Math.PI*radius*2;
    }
}
