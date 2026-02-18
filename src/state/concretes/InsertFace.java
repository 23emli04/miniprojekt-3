package state.concretes;

import src.Point;
import src.ShapeContainer;
import src.shape.Circle;
import src.shape.FaceComposite;
import src.shape.Rectangle;
import state.ModeState;

public class InsertFace implements ModeState {

    @Override
    public void pointerDown(ShapeContainer context, Point point) {
        context.addShape(new FaceComposite(point));
        context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }
}
