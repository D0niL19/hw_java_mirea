package pract2.Ball;

public class Ball {
    double x, y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Ball_2.pract1.Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void SetXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;

    }

}
