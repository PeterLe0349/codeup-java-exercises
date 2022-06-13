package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(long length, long width){
        super(length,width);
    }

    public void setLength(long length){
        this.length = length;
    }

    public void setWidth(long width){
        this.width = width;
    }

    public long getPerimeter(){
        return (2*length) + (2*width);
    }

    public long getArea(){
        return (length*width);
    }

//    public Rectangle(long leng, long wid){
//        length = leng;
//        width = wid;
//    }
//
//
//
//    public long getArea(){
//        return length*width;
//    }
//
//    public long getPerimeter(){
//        return (2*length)+(2*width);
//    }


}
