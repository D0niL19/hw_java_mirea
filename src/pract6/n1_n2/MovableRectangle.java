package pract6.n1_n2;

public class MovableRectangle implements Movable{

    MovablePoint topLeft, bottomRight;

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        MovablePoint topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        MovablePoint bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }
}
