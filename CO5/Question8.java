package java_lab.CO5;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question8 extends JApplet implements KeyListener {

    private JTextArea outputTextArea;

    @Override
    public void init() {
        // Set the focus to the applet so that it can receive key events
        setFocusable(true);
        requestFocusInWindow();

        // Register key listener
        addKeyListener(this);

        // Create the text area for displaying the events
        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false);

        // Add the text area to a scroll pane to enable scrolling if needed
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        // Add the scroll pane to the applet
        add(scrollPane);
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        outputTextArea.append("Key Typed: " + keyChar + "\t");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        outputTextArea.append("Key Pressed: " + KeyEvent.getKeyText(keyCode) + "\t");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        outputTextArea.append("Key Released: " + KeyEvent.getKeyText(keyCode) + "\t");
        outputTextArea.append( "\n");
    }
}
