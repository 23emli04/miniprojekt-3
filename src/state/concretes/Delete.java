package state.concretes;

import src.ShapeContainer;
import src.Point;
import state.ModeState;

public class Delete implements ModeState {

    @Override
    public void pointerDown(ShapeContainer context, Point point) {
        context.select(point);
        if (context.getSelected() != null)
            context.removeShape(context.getSelected());
        context.setSelected(null);
        context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }


}
