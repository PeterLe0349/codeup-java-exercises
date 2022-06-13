package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
        Measurable myShape = new Rectangle(4,5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        Measurable myShape2 = new Square(5);
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape.getLength());// need to activate in measurable interface to use
        System.out.println(myShape.getWidth());// need to activate in measurable interface to use

    }
}
