package state.concretes;

import src.Point;
import src.ShapeContainer;
import src.shape.Rectangle;
import state.ModeState;

public class InsertRectangle implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
        context.addShape(new Rectangle(point, Math.random() * 50.0, Math.random() * 50.0));
        context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }
}
