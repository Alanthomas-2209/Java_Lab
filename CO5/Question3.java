package java_lab.CO5;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question3 extends Applet implements ActionListener {
    private TextField[] subjectFields;
    private Button calculateButton;
    private Image happyFace, sadFace;
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

        // Load the happy and sad face images
        happyFace = getImage(getDocumentBase(), "happy_face.png");
        sadFace = getImage(getDocumentBase(), "sad_face.png");
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

        // Display the happy or sad face based on the percentage
        if (percentage > 50) {
            g.drawImage(happyFace, 50, 50, this);
        } else {
            g.drawImage(sadFace, 50, 50, this);
        }
    }
}
