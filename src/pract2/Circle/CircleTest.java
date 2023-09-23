package pract2.Circle;

public class CircleTest {
    public static void main(String[] args)
    {
        Point point = new Point(2.4f, 1.7f);
        Circle circle1 = new Circle(point, 5);
        Circle circle2 = new Circle(point, 6);

        Circle[] circles = new Circle[]{circle1, circle2};

        Tester tester = new Tester(circles, circles.length);

        System.out.println(tester.toString());
    }
}
