package java_lab.CO5;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Question8 extends JFrame implements KeyListener {

    public KeyEventHandlingDemo() {
        setTitle("Key Event Handling Demo");
        setSize(400, 200);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Register key listener
        addKeyListener(this);

        // Set the focus to the frame so that it can receive key events
        setFocusable(true);
        requestFocusInWindow();
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("Key Released: " + KeyEvent.getKeyText(keyCode));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyEventHandlingDemo frame = new KeyEventHandlingDemo();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

