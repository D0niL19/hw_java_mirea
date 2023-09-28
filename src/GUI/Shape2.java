package GUI;

import java.awt.*;

abstract class Shape2 {
    protected Color color;
    protected Point position;

    public Shape2(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    abstract void draw(Graphics g);
}
