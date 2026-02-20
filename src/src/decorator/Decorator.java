package src.decorator;

import src.Point;
import src.shape.Shape;

import java.awt.*;

public abstract class Decorator implements Shape {
    private Shape decoratee;

    public Decorator(Shape decoratee){
        this.decoratee = decoratee;
    }
    @Override
    public void draw(Graphics g){
        decoratee.draw(g);
    };

    @Override
    public Point getPosition()
    {
        return decoratee.getPosition();
    }
    @Override
    public double getWidth()
    {
        return decoratee.getWidth();
    }
    @Override
    public double getHeight()
    {
        return decoratee.getHeight();
    }
    @Override
    public boolean intersects(Point point)
    {
        return decoratee.intersects(point);
    }
    @Override
    public void moveTo(Point point)
    {
        decoratee.moveTo(point);
    }
    @Override
    public void move(double dx, double dy)
    {
        decoratee.move(dx, dy);
    }
    @Override
    public void resizeTo(Point point)
    {
        decoratee.resizeTo(point);
    }
    @Override
    public Shape peel()
    {
        return decoratee;
    }
}
