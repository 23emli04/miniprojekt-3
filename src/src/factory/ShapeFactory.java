package src.factory;

import src.Point;
import src.shape.Shape;

public interface ShapeFactory {
    public Shape createCircle(Point point);
    public Shape createRectangle(Point point);
    public Shape createFace(Point point);

    Shape createDecorator(Shape shape);
}
