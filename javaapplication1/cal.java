
package javaapplication1;
import java.util.Scanner;

class calculator{
void add(int a,int b){
int c = a+b;
    System.out.println("Sum:" +c);
}

void sub(int a,int b){
int c = a-b;
    System.out.println("Difference:"+c);
}

void mul(int a,int b){
int c = a*b;
    System.out.println("Product: " +c);
}
void div(int a, int b){
int c = a/b;
    System.out.println("Division:" +c);
}
}

public class cal {
    public static void main(String[] args) {
        int n = 0;
        calculator obj = new calculator();
        n = new Scanner(System.in).nextInt();
        System.out.println("Enter the number:");
        while(n!=5){
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
            switch(n){
                case 1:
                    obj.add(5, 5);
                case 2:
                    obj.sub(5, 3);
                case 3:
                    obj.mul(5, 3);
                case 4:
                    obj.div(4, 2);
                default:
                    System.out.println("Invalid selection");
            }
        }
    }
}
