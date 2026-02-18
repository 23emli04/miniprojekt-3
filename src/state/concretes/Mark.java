package state.concretes;

import src.Point;
import src.shape.Shape;
import src.ShapeContainer;
import src.ShapeDecorator;
import state.ModeState;

public class Mark implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
            context.select(point);
        if (context.getSelected() != null) {
            Shape markedShape = new ShapeDecorator(context.getSelected());
            context.getShapes().remove(context.getSelected());
            context.getShapes().add(markedShape);
        }
        context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }


}
