package src.factory;

import src.Point;
import src.decorator.CrossHairDecorator;
import src.decorator.HighlightDecorator;
import src.shape.Circle;
import src.shape.FaceComposite;
import src.shape.Rectangle;
import src.shape.Shape;

public class ShapeFactoryConcrete implements ShapeFactory {

    @Override
    public Shape createCircle(Point point) {
        return new Circle(point, Math.random() * 50.0);
    }

    @Override
    public Shape createRectangle(Point point) {
        return new Rectangle(point, Math.random() * 50.0, Math.random() * 50.0);
    }

    @Override
    public Shape createFace(Point point) {
        return new FaceComposite(point);
    }

    @Override
    public Shape createCrossHairDecorator(Shape shape) {
        return new CrossHairDecorator(shape);
    }

    @Override
    public Shape createHighlightDecorator(Shape shape) {
        return new HighlightDecorator(shape);
    }

}
