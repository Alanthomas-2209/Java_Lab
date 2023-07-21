package java_lab.CO5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Question4 extends Applet implements MouseListener {
    private Color doorColor;

    @Override
    public void init() {
        // Set initial color of the door to blue
        doorColor = Color.BLUE;
        // Add mouse listener to the applet
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        // Draw the house
        g.setColor(Color.LIGHT_GRAY); // Set house color to light gray
        g.fillRect(50, 100, 200, 150); // Main body of the house
        g.setColor(Color.RED); // Set roof color to red
        g.fillPolygon(new int[]{50, 150, 250}, new int[]{100, 50, 100}, 3); // Roof
        g.setColor(doorColor); // Set door color
        g.fillRect(120, 170, 60, 80); // Door
        g.setColor(Color.BLACK); // Set window color to black
        g.fillRect(70, 120, 50, 50); // Left window
        g.fillRect(180, 120, 50, 50); // Right window
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Change the door color from blue to red on mouse click
        if (doorColor == Color.BLUE) {
            doorColor = Color.RED;
        } else {
            doorColor = Color.BLUE;
        }
        // Repaint the applet to reflect the color change
        repaint();
    }

    // Other MouseListener methods (not used in this example)
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}

