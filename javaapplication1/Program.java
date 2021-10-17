package javaapplication1;

/*class Program {
    public static void main(String[] args) {
        int n = 1234;
        int r = 0;
        while(n!=0){
        r = (r*10) + n%10;
        n = n/10;
        }
        System.out.println(r);
    }
}*/
class Program1 {

    String n;
    int t;
    int q;
    int c;

    void Student(String n) {
        n = n;
        t = 0;
        q = 0;
        c = 0;
    }
     void getName(String s,int co){
        System.out.println(s);
         System.out.println(co);

    }
    int totalScore(){
        
    return t;
    }
 void avg(){
    q = t/c;
      System.out.println(q);
    }
    
}
class Program{
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.Student("Meenu");
        obj.c = 5;
        int a[] = {1,2,3,4,5};
        for(int i = 0;i<obj.c;i++){
        obj.totalScore(a[i]);
        }
        
    }
}
