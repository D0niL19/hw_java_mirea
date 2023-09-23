package pract3.n2;

public class CircleMain {
    public static void main(String[] args){
        Circle circle1 = new Circle(2.4, 3.5, 5);
        Circle circle2 = new Circle(2.1, 3.6, 7);
        Circle circle3 = new Circle(2.5, 3.2, 8);

        Circle[] circles = new Circle[]{circle3, circle2, circle1};

        Tester tester = new Tester(circles.length, circles);

        System.out.println(tester.smallest().toString());
        System.out.println(tester.biggest().toString());
        System.out.println(tester.toString());
        tester.Sort();
        System.out.println(tester.toString());
    }
}
