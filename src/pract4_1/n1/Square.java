package pract4_1.n1;

public class Square extends Rectangle {
    protected double side;
    public Square() {
        super();
        this.side = 5;
        setWidth(side);
        setLength(side);
    }

    public Square(double side){
        super();
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
