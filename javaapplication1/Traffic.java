package javaapplication1;

import java.applet.*;
import java.awt.*;

public class Traffic extends Applet implements Runnable {

    Thread t;
    int a = 0, i = 0, j = 0;

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (i = 10; i >= 0; i--) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            if (i <= 10 && i > 5) {
                a = 1;
                repaint();
            } else if (i <= 5 && i > 0) {
                a = 2;
                repaint();
            } else if (i == 0) {
                for (j = 0; j < 10; j++) {
                    a = 3;
                    repaint();
                }
                if (j == 10) {
                    run();
                }
            }
        }  
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(70, 70, 100, 250);
        if (a == 1) {
            g.setColor(Color.red);
            g.fillOval(85, 90, 65, 65);
        }
        if (a == 2) {
            g.setColor(Color.yellow);
            g.fillOval(85, 160, 65, 65);
        }

        if (a == 3) {
            g.setColor(Color.green);
            g.fillOval(85, 230, 65, 65);
        }

    }
}
