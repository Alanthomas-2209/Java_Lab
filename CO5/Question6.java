package java_lab.CO5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question6 extends JFrame implements ActionListener {
    private Choice shapeChoice;
    private ShapePanel shapePanel;

    public ShapeDrawingApp() {
        setTitle("Shape Drawing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Create the Choice component and add shape options
        shapeChoice = new Choice();
        shapeChoice.add("Rectangle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.addActionListener(this);

        // Create the panel to draw the shapes
        shapePanel = new ShapePanel();

        // Add components to the frame
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(shapeChoice, BorderLayout.NORTH);
        contentPane.add(shapePanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Repaint the shape panel when the user selects a shape
        shapePanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapeDrawingApp app = new ShapeDrawingApp();
            app.setVisible(true);
        });
    }

    // Custom JPanel to draw the selected shape
    private class ShapePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Get the selected shape from the Choice component
            String selectedShape = shapeChoice.getSelectedItem();

            // Draw the corresponding shape based on user's choice
            if ("Rectangle".equals(selectedShape)) {
                g.setColor(Color.RED);
                g.fillRect(50, 50, 200, 100);
            } else if ("Triangle".equals(selectedShape)) {
                int[] xPoints = {50, 250, 150};
                int[] yPoints = {200, 200, 50};
                g.setColor(Color.GREEN);
                g.fillPolygon(xPoints, yPoints, 3);
            } else if ("Square".equals(selectedShape)) {
                g.setColor(Color.BLUE);
                g.fillRect(100, 100, 150, 150);
            } else if ("Circle".equals(selectedShape)) {
                g.setColor(Color.ORANGE);
                g.fillOval(100, 100, 200, 200);
            }
        }
    }
}

