package pract2.Circle;

import java.util.Arrays;

public class Tester {
    Circle[] circles;
    int size;

    public Tester(Circle[] circles, int size) {
        this.circles = circles;
        this.size = size;
    }

    @Override
    public String toString() {
        return "pract1.pract4_1.n1.Circle.Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", size=" + size +
                '}';
    }
}
