package state.concretes;

import src.shape.Circle;
import src.Point;
import src.ShapeContainer;
import state.ModeState;

public class InsertCircle implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
       context.addCircle(point);
       context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }


}
