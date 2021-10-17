
package javaapplication1;

class Figure{
int area1(int a,int b){
int area1 = a*b;
return area1;
}
double area2(double b,double h){
double area2 = 0.5*b*h;
return area2;
}
}
class Rectangle1 extends Figure{
    Figure a = new Figure();
    void a1(){
        System.out.println("Area of rectangle: "+a.area1(5, 5));
    }
}

class Triangle1 extends Figure{
    Figure a = new Figure();
    void a1(){
        System.out.println("Area of Triangle: "+a.area2(4, 5));
    }
}

public class Method {
    public static void main(String[] args) {
        Rectangle1 obj = new Rectangle1();
        obj.a1();
        Triangle1 obj1 = new Triangle1();
        obj1.a1();
    }
}
