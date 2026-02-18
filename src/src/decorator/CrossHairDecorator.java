package src.decorator;

import src.Point;
import src.shape.Shape;

import java.awt.Graphics;


public class CrossHairDecorator extends Decorator{

    public CrossHairDecorator(Shape decoratee) {
        super(decoratee);
    }

    @Override
    public void draw(Graphics g){
        Point position = super.getPosition();

        int cx = (int)(position.getX() + 0.5);
        int cy = (int)(position.getY() + 0.5);
        int halfW = (int)(getWidth() / 2.0 + 0.5);
        int halfH = (int)(getHeight() / 2.0 + 0.5);

        g.drawLine(cx - halfW, cy, cx + halfW, cy);
        g.drawLine(cx, cy - halfH, cx, cy + halfH);
    }
}
