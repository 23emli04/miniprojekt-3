package state.concretes;

import src.Point;
import src.decorator.CrossHairDecorator;
import src.shape.Shape;
import src.ShapeContainer;
import state.ModeState;

public class Mark implements ModeState {
    @Override
    public void pointerDown(ShapeContainer context, Point point) {
            context.select(point);
        if (context.getSelected() != null) {
           context.addDecorator(context.getSelected());
        }
        context.repaint();
    }

    @Override
    public void pointerUp(ShapeContainer context, Point point) {

        //Test
    }

    @Override
    public void pointerMoved(ShapeContainer context, Point point) {

    }


}
