package java_lab.CO5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question3 extends Applet implements ActionListener {
    private TextField[] subjectFields;
    private Button calculateButton;
    private double percentage;

    public void init() {
        // Set up the applet layout
        setLayout(new FlowLayout());

        // Create input fields for 5 subjects
        subjectFields = new TextField[5];
        for (int i = 0; i < 5; i++) {
            subjectFields[i] = new TextField(5);
            add(new Label("Subject " + (i + 1) + ":"));
            add(subjectFields[i]);
        }

        // Create the calculate button
        calculateButton = new Button("Calculate Percentage");
        calculateButton.addActionListener(this);
        add(calculateButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Calculate the total marks
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += Integer.parseInt(subjectFields[i].getText());
        }

        // Calculate the percentage
        percentage = (totalMarks / 5.0);

        // Repaint the applet to display the happy/sad face
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Display the percentage
        g.drawString("Percentage: " + percentage + "%", 20, 120);

        // Calculate the center coordinates for drawing the faces
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Set the size of the face
        int faceSize = 100;

        // Calculate the top-left coordinates for drawing the face at the center
        int x = centerX - faceSize / 2;
        int y = centerY - faceSize / 2;

        // Display the happy or sad face based on the percentage
        if (percentage > 50) {
            drawHappyFace(g, x, y, faceSize);
        } else {
            drawSadFace(g, x, y, faceSize);
        }
    }

    private void drawHappyFace(Graphics g, int x, int y, int size) {
        // Draw the happy face using simple shapes
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, size, size);
        g.setColor(Color.BLACK);
        g.fillOval(x + size / 4, y + size / 2, size / 10, size / 10);
        g.fillOval(x + 3 * size / 4 - size / 10, y + size / 2, size / 10, size / 10);
        g.drawArc(x + size / 4, y + 3 * size / 5, size / 2, size / 4, 0, -180);
    }

    private void drawSadFace(Graphics g, int x, int y, int size) {
        // Draw the sad face using simple shapes
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, size, size);
        g.setColor(Color.BLACK);
        g.fillOval(x + size / 4, y + size / 2, size / 10, size / 10);
        g.fillOval(x + 3 * size / 4 - size / 10, y + size / 2, size / 10, size / 10);
        g.drawArc(x + size / 4, y + 2 * size / 5, size / 2, size / 4, 0, 180);
    }
}



//// Display the happy or sad face based on the percentage
//        if (percentage > 50) {
//                drawHappyFace(g);
//                } else {
//                drawSadFace(g);
//                }
//                }
//
//private void drawHappyFace(Graphics g) {
//        // Draw the happy face using simple shapes
//        g.setColor(Color.YELLOW);
//        g.fillOval(100, 100, 100, 100);
//        g.setColor(Color.BLACK);
//        g.fillOval(130, 140, 10, 10);
//        g.fillOval(160, 140, 10, 10);
//        g.drawArc(130, 160, 40, 20, 0, -180);
//        }
//
//private void drawSadFace(Graphics g) {
//        // Draw the sad face using simple shapes
//        g.setColor(Color.YELLOW);
//        g.fillOval(100, 100, 100, 100);
//        g.setColor(Color.BLACK);
//        g.fillOval(130, 140, 10, 10);
//        g.fillOval(160, 140, 10, 10);
//        g.drawArc(130, 160, 40, 20, 0, 180);
//        }
//        }