package java_lab.CO5;

import java.awt.*;
import java.awt.event.*;

public class Question7 extends Frame implements MouseListener, WindowListener {

    public EventHandlingDemo() {
        // Set up the frame properties
        setTitle("Event Handling Demo");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Register mouse listener and window listener
        addMouseListener(this);
        addWindowListener(this);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered the Frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited the Frame");
    }

    // WindowListener methods
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        System.exit(0); // Terminate the application when the window is closing
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        EventHandlingDemo frame = new EventHandlingDemo();
        frame.setVisible(true);
    }
}

