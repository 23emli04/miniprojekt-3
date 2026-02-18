package state.concretes;

import src.Point;
import src.ShapeContainer;
import src.shape.Rectangle;
import state.ModeState;

public class InsertRectangle implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
        context.addRectangle(point);
        context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }
}
