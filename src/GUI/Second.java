package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Second {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawRandomShapes(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void drawRandomShapes(Graphics g) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(800);
            int y = random.nextInt(600);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                Circle circle = new Circle(color, new Point(x, y), radius);
                circle.draw(g);
            } else {
                int sideLength = random.nextInt(50) + 10;
                Square square = new Square(color, new Point(x, y), sideLength);
                square.draw(g);
            }
        }
    }
}
