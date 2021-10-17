
package javaapplication1;


class Shape1{
    void Draw(){
        System.out.println("Shape Drawed");
}
    void Erase(){
        System.out.println("Shaped Erased");
    }
}
class circle extends Shape1{
    void circle(){
        System.out.println("Circle");
    Shape1 obj = new Shape1();
    obj.Draw();
    obj.Erase();
    }
}
class triangle extends Shape1{
void triangle(){
    System.out.println("Triangle");
    Shape1 obj = new Shape1();
    obj.Draw();
    obj.Erase();
    }
}

class square extends Shape1{
void square(){
    System.out.println("Square");
    Shape1 obj = new Shape1();
    obj.Draw();
    obj.Erase();
    }
}

public class Inher {
    public static void main(String[] args) {
        circle o1 = new circle();
        triangle o2 = new triangle();
        square o3 = new square();
        o1.circle();
        o2.triangle();
        o3.square();
    }
}
