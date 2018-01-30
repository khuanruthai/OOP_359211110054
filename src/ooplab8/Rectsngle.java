package ooplab8;

public class Rectsngle extends Shape{

    public Rectsngle(int width, int length) {
        super(width, length);
    }

    @Override
    public double getArea() {
        return super.getWidth()*super.getLength();
    }
}