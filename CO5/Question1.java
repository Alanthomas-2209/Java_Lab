package java_lab.CO5;

import java.awt.*;
import java.applet.*;
public class Question1 extends Applet{
    public void paint(Graphics g){
        g.drawString("Applet Programming ",10,10);
        g.setColor(Color.blue);
        g.drawOval(100,100,200,100);
        g.drawLine(10,50,300,50);
        g.drawRect(400,60,200,100);
    }
}
