package src;

import state.concretes.*;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ShapeApp extends JFrame {
    private static final long serialVersionUID = 1L;
    private ShapeContainer shapeContainer = new ShapeContainer();

    public ShapeApp() {
        createMenue();
        this.add(shapeContainer);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }

    public void createMenue() {
        JMenu menu = new JMenu("Modes");
        createMenuItem(menu, "Insert circle", e -> shapeContainer.setModeState(new InsertCircle()));
        createMenuItem(menu, "Insert rectangle", e -> shapeContainer.setModeState(new InsertRectangle()));
        createMenuItem(menu, "Insert face", e -> shapeContainer.setModeState(new InsertFace()));
        createMenuItem(menu, "Move", e -> shapeContainer.setModeState(new Move()));
        createMenuItem(menu, "Delete", e -> shapeContainer.setModeState(new Delete()));
        createMenuItem(menu, "Mark", e -> shapeContainer.setModeState(new Mark()));
        createMenuItem(menu, "Unmark", e -> shapeContainer.setModeState(new Unmark()));
        createMenuItem(menu, "Resize", e -> shapeContainer.setModeState(new Resize()));
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private void createMenuItem(JMenu menu, String label, ActionListener listener) {
        JMenuItem menuItem = new JMenuItem(label);
        menuItem.addActionListener(listener);
        menu.add(menuItem);
    }

    public static void main(String args[]) {
        new ShapeApp(); // obs egentligen SwingUtilities ...
    }
}
