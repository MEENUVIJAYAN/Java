
package javaapplication1;

class Box{
    int h,w,l;
    Box(int hi,int wi,int li){
    hi = h;
    wi = w;
    li = l;
    }
    int vol(){
    return h*w*l;
    }
}
class Boxweight extends Box{
    int we = 0;

     Boxweight(int h, int w, int l,int d) {
        super(h, w, l);
        we = d;
    }
     
}

class Shipment extends Boxweight{
    int cost = 0;

     Shipment(int h, int w, int l, int d,int c) {
        super(h, w, l, d);
        cost = c;
    }
   
}

public class Inher_Multi {
    public static void main(String[] args) {
       Shipment box1 = new Shipment(10, 20, 30, 40, 50);
       Shipment box2 = new Shipment(50, 60, 70, 80, 90);
      
        System.out.println("First Shipment:");
        System.out.println("Volume:" + box1.vol() + "Weight:" + box1.we + "Cost:" + box1.cost);
        System.out.println("Volume:" + box2.vol() + "Weight:" + box2.we + "Cost:" + box2.cost);
    }
}
