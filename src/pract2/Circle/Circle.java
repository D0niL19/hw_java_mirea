package pract2.Circle;

public class Circle {
    Point point;
    int radius;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Circle(Point point) {
        this.point = point;
    }

    public void SetPoint(double x, double y){
        this.point = new Point(x, y);
    }

    public double Area(){
        return 3.14 * radius * radius;
    }

    public double Length(){
        return 2 * 3.14 * radius;
    }

}
