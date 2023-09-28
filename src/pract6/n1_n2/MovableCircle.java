package pract6.n1_n2;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        MovablePoint point = new MovablePoint(x, y, xSpeed, ySpeed);
        this.center = point;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }
}
