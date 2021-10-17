package javaapplication1;

class Shape {

    void area() {
        System.out.println("Area of the shape");
    }
}

class Rectangle extends Shape {

    int l, b;
    int area1;

    void area1(int l, int b) {
        Shape s = new Shape();
        s.area();
        area1 = l * b;
        System.out.println("Area of Rectangle : " + area1);
    }
}

class Circle extends Shape {

    double r;
    double area2;

    void area2(int r) {
        Shape s = new Shape();
        s.area();
        area2 = Math.PI * r * r;
        System.out.println("Area of Circle : " + area2);
    }
}

class Square extends Shape {

    int a;
    int area3;

    void area3(int a) {
        Shape s = new Shape();
        s.area();
        area3 = a * a;
        System.out.println("area of Square: " + area3);
    }
}

public class Area_cal {

    public static void main(String[] args) {

        Rectangle a = new Rectangle();
        a.area1(2, 3);
        Circle b = new Circle();
        b.area2(5);
        Square c = new Square();
        c.area3(4);

    }
}
