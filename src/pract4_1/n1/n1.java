package pract4_1.n1;

public class n1 {
    public static void main(String[] args){
        Square square = new Square("red", true, 17);

        Rectangle rectangle = new Square();
        Rectangle rectangle1 = (Rectangle) square;

        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(rectangle1.toString());
    }
}
