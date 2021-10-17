
package javaapplication1;

class Factorial{
    void fact(){
    int i,fact=1;
    for(i = 1;i<=5;i++){
        fact = fact*i;
    }
    System.out.println("factorial is:" + fact);
    }
}
public class Fact {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        
         obj.fact();
        
    }
}
