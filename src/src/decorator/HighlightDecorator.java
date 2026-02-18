package src.decorator;

import java.awt.Graphics;

import src.Point;
import src.shape.Shape;

public class HighlightDecorator extends Decorator {

    public HighlightDecorator(Shape decoratee){
      super(decoratee);
    }

  @Override
  public void draw(Graphics g)
    {
    super.draw(g);
      Point position = super.getPosition();
      int x = (int)(position.getX() - getWidth()/2.0 + 0.5);
      int y = (int)(position.getY() - getHeight()/2.0 + 0.5);
      g.fillOval(x, y, (int)(getWidth()+0.5), (int)(getHeight()+0.5));
    }
  }
