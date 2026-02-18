package state.concretes;

import src.Point;
import src.shape.Shape;
import src.ShapeContainer;
import state.ModeState;

public class Unmark implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
        context.select(point);
        if (context.getSelected() != null) {
            Shape unmarkedShape = context.getSelected().peel();
            context.getShapes().remove(context.getSelected());
            context.getShapes().add(unmarkedShape);
            context.repaint();
        }
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }


}
