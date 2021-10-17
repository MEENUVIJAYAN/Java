
package javaapplication1;

class Overload{
int area_rect(int a,int b){
    int area1 = a*b;
    return area1;
}
double area_cir(double r){
    double area2 = Math.PI*r*r;
    return area2;
}
int area_sq(int a){
int area3 = a*a;
return area3;
}
}
public class Area_met {
    public static void main(String[] args) {
        Overload obj = new Overload();
        System.out.println("Area of circle: "+  obj.area_cir(3));
        System.out.println("Area of rectangle: "+ obj.area_rect(5, 5));
        System.out.println("Area of square: " + obj.area_sq(5));
        
    }
}
