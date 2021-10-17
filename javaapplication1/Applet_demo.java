package javaapplication1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet_demo extends Applet implements ActionListener {

    TextField t1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, a, s, m, d, e;
    String tmp, msg = "";
    int a1, b;

    public void init() {
        GridLayout gb = new GridLayout(4, 4);
        setLayout(gb);
        add(t1 = new TextField(50));
        add(b1 = new Button("1"));
        add(b2 = new Button("2"));
        add(b3 = new Button("3"));
        add(a = new Button("+"));
        add(b4 = new Button("4"));
        add(b5 = new Button("5"));
        add(b6 = new Button("6"));
        add(s = new Button("-"));
        add(b7 = new Button("7"));
        add(b8 = new Button("8"));
        add(b9 = new Button("9"));
        add(m = new Button("*"));
        add(d = new Button("/"));
        add(b0 = new Button("0"));
        add(e = new Button("="));
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        a.addActionListener(this);
        s.addActionListener(this);
        m.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        String str1, str2;
        switch (str) {
            case "+":
            case "-":
            case "*":
            case "/": {
                str1 = t1.getText();
                tmp = str;
                a1 = Integer.parseInt(str1);
                msg = "";
                break;
            }
            case "=": {
                str2 = t1.getText();
                b = Integer.parseInt(str2);
                int sum = 0;
                if (tmp == "+") {
                    sum = a1 + b;
                } else if (tmp == "-") {
                    sum = a1 - b;
                } else if (tmp == "*") {
                    sum = a1 * b;
                } else if (tmp == "/") {
                    sum = a1 / b;
                }
                str1 = String.valueOf(sum);
                t1.setText("" + str1);
                msg = "";
                break;
            }
            default:
                msg += str;
                t1.setText("" + msg);
                break;
        }
    }

}
