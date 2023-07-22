package java_lab.CO5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Question7 extends Applet implements MouseListener, MouseMotionListener {
    private String message = "";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    // MouseMotionListener methods
    public void mouseMoved(MouseEvent e) {
        message = "Mouse Moved at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        message = "Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    // Applet lifecycle method for window closing event
    public void stop() {
        message = "Applet Stopping (Window Closing)";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }
}
