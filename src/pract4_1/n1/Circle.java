package pract4_1.n1;

public class Circle extends Shape{
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }
}
