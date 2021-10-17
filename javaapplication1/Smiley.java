package javaapplication1;

import java.applet.*;
import java.awt.*;

public class Smiley extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(80, 70, 150, 150);
        g.setColor(Color.black);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
}
