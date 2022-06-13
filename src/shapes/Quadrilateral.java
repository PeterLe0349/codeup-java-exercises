package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected long length, width;

    public Quadrilateral(long length, long width){
        this.length = length;
        this.width = width;
    }

    public long getLength(){
        return length;
    }

    public long getWidth(){
        return width;
    }

    public abstract void setLength(long length);
    public abstract void setWidth(long length);

}
