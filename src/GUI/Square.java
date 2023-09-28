package GUI;

import java.awt.*;

class Square extends Shape2 {
    private final int sideLength;

    public Square(Color color, Point position, int sideLength) {
        super(color, position);
        this.sideLength = sideLength;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x - sideLength / 2, position.y - sideLength / 2, sideLength, sideLength);
    }
}