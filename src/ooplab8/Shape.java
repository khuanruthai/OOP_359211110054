package ooplab8;
//abstract class

public class Shape {
    private int width;
    private int lengt;

    public abstract int getArea();

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLengt() {
        return lengt;
    }

    public void setLengt(int lengt) {
        this.lengt = lengt;
    }

}//Shape
