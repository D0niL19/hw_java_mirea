package pract6.n1_n2;

public class Tester {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0,0 ,10, 10, 2,5);
        System.out.println(rectangle.toString());
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle.toString());
        System.out.println();

        MovableCircle circle = new MovableCircle(0, 0, 7, 4, 5);
        System.out.println(circle.toString());
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle.toString());
    }
}
