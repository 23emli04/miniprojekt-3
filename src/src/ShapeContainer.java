package src;
import src.factory.ShapeFactory;
import src.factory.ShapeFactoryConcrete;
import state.ModeState;
import state.concretes.InsertCircle;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import src.shape.*;
import javax.swing.JPanel;

public class ShapeContainer extends JPanel implements Pointable {
    private ModeState modeState = new InsertCircle();
    private static final long serialVersionUID = 1L;
    private List<Shape> shapes = new LinkedList<Shape>();
    private Shape selected;
    private ShapeFactory shapeFactory;

    public ShapeContainer() {
        super();
        MouseHandler mouseHandler = new MouseHandler(this);
        shapeFactory = new ShapeFactoryConcrete();
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);
        this.setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes)
            shape.draw(g);
    }

    public void select(Point point) {
        for (Shape shape : shapes) {
            if (shape.intersects(point)) {
                selected = shape;
                return;
            }
        }
    }

    public void pointerDown(Point point) {
        modeState.pointerDown(this, point);
    }
    public void pointerUp(Point point) {
        selected = null;
    }
    public void pointerMoved(Point point, boolean pointerDown) {
        if (selected != null && pointerDown) {
           modeState.pointerMoved(this, point);
        }
    }


    //Getter & Setters
    public void setModeState(ModeState modeState) {
        this.modeState = modeState;
    }
    public Shape getSelected() {
        return selected;
    }
    public void setSelected(Shape selected) {
        this.selected = selected;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
    public void addCircle(Point point) {
        shapes.add(shapeFactory.createCircle(point));
    }
    public void addRectangle(Point point) {
        shapes.add(shapeFactory.createRectangle(point));
    }
    public void addFace(Point point) {
        shapes.add(shapeFactory.createFace(point));
    }
    public void addDecorator(Shape shape) {
        shapes.add(shapeFactory.createDecorator(shape));
    }

}

