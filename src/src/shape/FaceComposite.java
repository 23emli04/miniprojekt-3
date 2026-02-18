package src.shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import src.Point;

public class FaceComposite implements Shape {
    private Point center;
    List<Shape> children = new ArrayList<>();

    public FaceComposite(Point center) {
        this.center = center;

        Circle head = new Circle(center, 100);

        Circle leftEye = new Circle(
                new Point(center.getX() - 30, center.getY() - 30), 15);

        Circle rightEye = new Circle(
                new Point(center.getX() + 30, center.getY() - 30), 15);

        Rectangle nose = new Rectangle(
                new Point(center.getX(), center.getY()), 10, 20);

        Rectangle mouth = new Rectangle(
                new Point(center.getX(), center.getY() + 40), 40, 10);

        children.add(head);
        children.add(leftEye);
        children.add(rightEye);
        children.add(nose);
        children.add(mouth);
    }

    @Override
    public void draw(Graphics g) {
        for (Shape s : children) {
            s.draw(g);
        }
    }

    @Override
    public Point getPosition() {
        return center;
    }

    @Override
    public double getWidth() {
        return children.getFirst().getWidth();
    }

    @Override
    public double getHeight() {
        return children.getFirst().getHeight();
    }

    @Override
    public boolean intersects(Point point) {
        for (Shape s : children) {
            if (s.intersects(point)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void moveTo(Point point) {
        double dx = point.getX() - center.getX();
        double dy = point.getY() - center.getY();

        move(dx, dy);
    }

    @Override
    public void move(double dx, double dy) {
        for (Shape s : children) {
            s.move(dx, dy);
        }
    }

    @Override
    public void resizeTo(Point point) {
        children.getFirst().resizeTo(point);
    }

    @Override
    public Shape peel() {
        return this;
    }
}
