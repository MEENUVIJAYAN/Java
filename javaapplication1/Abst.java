
package javaapplication1;


abstract class A{
void fun(){
    System.out.println("Call me from B");
}
}

class B extends A{
}
public class Abst {
    public static void main(String[] args) {
            B o = new B();
            o.fun();
    }
    
}
