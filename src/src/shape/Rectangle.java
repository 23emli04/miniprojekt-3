package src.shape;

import src.Point;
import java.awt.*;


public class Rectangle implements Shape {

    private Point center;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height){
        this.center = new Point(x,y);
        this.width = width;
        this.height = height;

    }

    public Rectangle(Point point, double width, double height){
        this(point.getX(),point.getY(),width,height);
    }

    @Override
    public void draw(Graphics g) {
        int left = (int)(center.getX() - width / 2);
        int top  = (int)(center.getY() - height / 2);

        g.drawRect(left, top, (int)width, (int)height);
    }

    @Override
    public Point getPosition() {
        return center;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public boolean intersects(Point point) {
        double dx = Math.abs(point.getX() - center.getX());
        double dy = Math.abs(point.getY() - center.getY());

        return dx <= width / 2 && dy <= height / 2;
    }

    @Override
    public void moveTo(Point point) {
        center.moveTo(point);
    }
    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    @Override
    public void resizeTo(Point point) {
        double dx = Math.abs(point.getX() - center.getX());
        double dy = Math.abs(point.getY() - center.getY());

        this.width = 2 * dx;
        this.height = 2 * dy;
    }

    @Override
    public Shape peel() {
        return this;
    }
}
