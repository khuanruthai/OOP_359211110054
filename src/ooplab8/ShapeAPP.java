package ooplab8;

public class ShapeAPP {
    public static void main(String[] args) {
        Rectsngle rectangle = new Rectsngle(10,20);
        System.out.println("Width : "+rectangle.getWidth());
        System.out.println("Length : "+rectangle.getLength());
        System.out.println("Area : "+rectangle.getArea());

        Triangle triangle = new Triangle(20, 0, 30);
        System.out.println(triangle.getArea());



    }

} // ShapeApp