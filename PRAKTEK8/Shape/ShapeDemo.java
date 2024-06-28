package PRAKTEK8.Shape;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle(2.5, "blue", false);
        System.out.println(shape1);
        System.out.println("Area: " + ((Circle) shape1).getArea());
        System.out.println("Perimeter: " + ((Circle) shape1).getPerimeter());
        System.out.println("\n");

        Shape shape2 = new Rectangle(3.0, 4.5, "green", true);
        System.out.println(shape2);
        System.out.println("Area: " + ((Rectangle) shape2).getArea());
        System.out.println("Perimeter: " + ((Rectangle) shape2).getPerimeter());
        System.out.println("\n");

        Shape shape3 = new Square(5.0, "yellow", false);
        System.out.println(shape3);
        System.out.println("Area: " + ((Square) shape3).getArea());
        System.out.println("Perimeter: " + ((Square) shape3).getPerimeter());
        System.out.println("\n");
    }
}