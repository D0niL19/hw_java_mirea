package pract4_1.n1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    @Override
    public String toString() {
        return "pract4_1.n1.Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Shape(){
        this.color = "Blue";
        this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

}