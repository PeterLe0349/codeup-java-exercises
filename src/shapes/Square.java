package shapes;

public class Square extends Quadrilateral implements Measurable{
    public long side;


    public Square(long side){
        super(side, side);
        this.side = side;
    }



    public long getPerimeter() {
        return side*4;
    }


    public long getArea() {
        return side*side;
    }


    public void setLength(long length) {
        this.length = length;

    }

    public void setWidth(long length) {
        this.width = length;

    }
}
