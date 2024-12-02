abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape rect = new Rectangle(8, 5);
        Shape circle = new Circle(5);
        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Area of circle: " + circle.area());
    }
}