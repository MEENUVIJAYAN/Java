package javaapplication1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener {

    TextField t1;
    Button b1, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    String msg = "", tmp;
    int a, b;

    public void init() {
        GridLayout gb = new GridLayout(4, 4);
        setLayout(gb);
        setBackground(Color.BLACK);
        add(t1 = new TextField(45));
        add(b1 = new Button("1"));
        add(b5 = new Button("2"));
        add(b6 = new Button("3"));
        add(b13 = new Button("+"));
        add(b7 = new Button("4"));
        add(b8 = new Button("5"));
        add(b9 = new Button("6"));
        add(b14 = new Button("-"));
        add(b10 = new Button("7"));
        add(b11 = new Button("8"));
        add(b12 = new Button("9"));
        add(b15 = new Button("*"));
        add(b18 = new Button("/"));
        add(b17 = new Button("0"));
        add(b16 = new Button("="));
        b1.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        switch (str) {
            case "+":
            case "-":
            case "*":
            case "/": {
                String str1 = t1.getText();
                tmp = str;
                a = Integer.parseInt(str1);
                msg = "";
                break;
            }
            case "=": {
                String str2 = t1.getText();
                b = Integer.parseInt(str2);
                int sum = 0;
                if (tmp == "+") {
                    sum = a + b;
                } else if (tmp == "-") {
                    sum = a - b;
                } else if (tmp == "*") {
                    sum = a * b;
                } else if (tmp == "/") {
                    sum = a / b;
                }
                String str1 = String.valueOf(sum);
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
