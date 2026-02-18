package state;

import src.Point;
import src.ShapeContainer;
public interface ModeState {
  public void pointerDown(ShapeContainer context, Point point);
  public void pointerUp(ShapeContainer context, Point point);
  public void pointerMoved(ShapeContainer context,Point point);
}
