package state.concretes;

import src.Point;
import src.ShapeContainer;
import state.ModeState;

public class Move implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
        context.select(point);
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {
        context.getSelected().moveTo(point);
    }


}
