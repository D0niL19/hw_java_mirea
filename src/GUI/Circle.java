package GUI;

import java.awt.*;

class Circle extends Shape2 {
    private int radius;

    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, 2 * radius, 2 * radius);
    }

}