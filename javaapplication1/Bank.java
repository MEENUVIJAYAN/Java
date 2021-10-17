package javaapplication1;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bank extends Applet implements ActionListener {

    TextField t1, t2, t3, t4, t5, t6, t7, t8;
    Label l1, l2, l3, l4, l5, l6, l7;
    Button b1, b2;
    String s, s1, s2;
    int u = 100000;

    @Override
    public void init() {
        GridLayout gb = new GridLayout(8, 2);
        setLayout(gb);
        setBackground(Color.MAGENTA);
        add(l1 = new Label("Name"));
        add(t1 = new TextField(50));
        add(l2 = new Label("Age"));
        add(t2 = new TextField(50));
        add(l3 = new Label("Branch Name"));
        add(t5 = new TextField(50));
        add(l4 = new Label("IFSC"));
        add(t3 = new TextField(50));
        add(l5 = new Label("Account Number"));
        add(t4 = new TextField(50));
        add(t6 = new TextField("0",50));
        add(b1 = new Button("Withdraw"));
        add(t7 = new TextField("0",50));
        add(b2 = new Button("Deposit"));
        add(l7 = new Label("Balance Amount"));
        add(t8 = new TextField(50));
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        s = ae.getActionCommand();
        s1 = t6.getText();
        s2 = t7.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
     
        
        
        
        if (s.equals("Withdraw")) {
            System.out.println("Withrdaw amount" + a);
            u-=a;

            t8.setText(String.valueOf(u));
            
        }
        if (s.equals("Deposit")) {
            System.out.println("Deposit amount" + b);
            u+=b;

            t8.setText(String.valueOf(u));
            
        }
    }
}


