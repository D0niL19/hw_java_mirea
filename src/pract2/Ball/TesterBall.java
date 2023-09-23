package pract2.Ball;

public class TesterBall {
    public static void main(String[] args) {
        Ball ball = new Ball(10.1, 15.5);
        ball.move(-5.5, 1.2);
        System.out.println(ball.toString());
    }
}
