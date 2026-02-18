package state.concretes;

import src.Point;
import src.shape.Shape;
import src.ShapeContainer;
import src.decorator.ShapeDecorator;
import state.ModeState;

public class Mark implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
            context.select(point);
        if (context.getSelected() != null) {
            context.setMarkedShape();
            context.removeShape(context.getSelected());
            context.addShape(context.getMarkedShape());
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
