package javaapplication1;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class designline extends Applet implements ActionListener{
    
    String s1,s2,s3,s;
    TextField  t1,t2,t3,t4,t5,t6,t7;
    Label l1,l2,l3,l4,l5,l6,l7;
    Button b1,b2;
    int u = 100000;
    public void init(){
        
    GridLayout gb = new GridLayout(7,2);
    setLayout(gb);
    setBackground(Color.CYAN);
    add(l1 = new Label("Name"));
    add( t1 = new TextField(60));
    add(l2 = new Label("Age"));
    add(t2 = new TextField(60));
    add(l3 = new Label("IFSC"));
    add(t3 = new TextField(60));
    add(l4 = new Label("Address"));
    add(t4 = new TextField(50));
     add(t5 = new TextField(50));
      add(t6 = new TextField(50));
      add(b1 = new Button("Withdraw"));
      add(b2 = new Button("Deposit"));
      add(l5 = new Label("Balance Amount"));
      add(t7 = new TextField(50));
      b1.addActionListener(this);
      b2.addActionListener(this);
      
    }
    @Override
    public void actionPerformed(ActionEvent e){
    s = e.getActionCommand();
    s1 = t5.getText();
    s2 = t6.getText();
    
        System.out.println(s1);
        System.out.println(s2);
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        
        
        if(s.equals("Withdraw")){  
        
        u -= a;
        t7.setText(String.valueOf(u));
        }
        if(s.equals("Deposit")){
        u += b;
        t7.setText(String.valueOf(u));
        }
    }
    
}