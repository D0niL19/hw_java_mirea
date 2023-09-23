package pract3.n2;

import java.util.Arrays;
import java.util.Comparator;

public class Tester {
    int size;
    Circle[] circles;

    public Tester(int size, Circle[] circles) {
        this.size = size;
        this.circles = circles;
    }

    public Circle smallest(){
        Circle circle = circles[0];
        for (int i = 0; i < size; i++){
            if (circle.getRadius() > circles[i].getRadius()){
                circle = circles[i];
            }
        }
        return circle;
    }

    public Circle biggest(){
        Circle circle = circles[0];
        for (int i = 0; i < size; i++){
            if (circle.getRadius() < circles[i].getRadius()){
                circle = circles[i];
            }
        }
        return circle;
    }

    public void Sort(){
        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return o1.getRadius() - o2.getRadius();
            }
        });
    }

    @Override
    public String toString() {
        return "Tester{" +
                "size=" + size +
                ", circles=" + Arrays.toString(circles) +
                '}';
    }
}
