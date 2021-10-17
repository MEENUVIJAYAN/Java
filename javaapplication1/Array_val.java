
package javaapplication1;

import java.util.Scanner;

class Stack{
    int s[] = new int[10];
    int top = -1;
    void push(int x){
    if(top == 9){
        System.out.println("Overflow");
    }
    else{
        top = top+1;
        s[top] = x;
        System.out.println("Element inserted: "+x);
    }
    }
    void pop(){
    if(top == -1){
        System.out.println("Underflow");
    }
    else {
    int a = top;
    top = top-1;
        System.out.println("Element deleted: "+ a);
    }
    }
    void peek(){
    if(top == -1){
        System.out.println("Underflow");
    }
    else{
        System.out.println("Element at top is:" +s[top]);
    }
    }
    void display(){
    if(top == -1){
        System.out.println("Underflow");
    }
    else{
        System.out.println("Elements are:");
    for(int i = top;i>=0;i--){
        System.out.println(s[i]);
    }
    }
    }
}






public class Array_val {
    public static void main(String[] args) {
        int b = 0;
         Stack t = new Stack();
         while(b>=0){
             System.out.println("1.Push\n 2.Pop\n 3.Peek\n 4.Display\n");
             b = new Scanner(System.in).nextInt();
             if(b==1){
                 System.out.println("Enter the element:");
                int n = new Scanner(System.in).nextInt();
                 t.push(n);
             }
             else if(b == 2){
             t.pop();
             }
             else if(b ==3){
             t.peek();
             }
             else if(b==4){
             t.display();
             }
             else{
                 System.out.println("Invalid selection");
             }
         }
    }
   
}


/*String s[] = {"Manu","Meenu","Muth","Appu","Anu"};
        
        
          int m[] = new int[5];
         m[1] = 1;
         m[2] = 2;
         m[3] = 3;
         m[4] = 4;
         m[0] = 5;
         System.out.println("Name: " + "Marks ");
                 
         System.out.println(s[0] +" " + m[0]);
         System.out.println(s[1] +" " + m[1]);
         System.out.println(s[2] +" " + m[2]);
         System.out.println(s[3] +" " + m[3]);
         System.out.println(s[4] +" " + m[4]);*/