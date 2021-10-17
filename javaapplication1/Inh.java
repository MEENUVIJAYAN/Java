
package javaapplication1;

class Person{
String name;
int sal;

void get(String a,int b){
name = a;
sal = b;
}
void show(){
    System.out.println("Name: " + name+"\t" + "Salary: "  + sal +"\t");
}
}

class Hod extends Person{
    String dep;
    String sub;
    void get(String a,int b,String c,String d){
        super.get(a,b);
        sub =  c;
        dep = d;
    }
    void show(){
        super.show();
        System.out.println("Sub: " +sub + "\t"+  "Dept: "+dep + "\t");   
    }
}

class Professor extends Person{
    String dep;
    String sub;
    void get(String a,int b,String c,String d){
        super.get(a,b);
        sub =  c;
        dep = d;
    }
    void show(){
        super.show();
        System.out.println("Sub: " +sub + "\t"+  "Dept: "+dep + "\t");   
    }
}

public class Inh {
    public static void main(String[] args) {
        int i;
        Hod a[] = new Hod[5];
        a[0] = new Hod();
        a[0].get("Manu", 15000,"IT","DBMS");
        a[1] = new Hod();
        a[1].get("Meenu", 10000,"EC","DSD");
        a[2] = new Hod();
        a[2].get("Anu", 35000,"IT","JAVA");
        a[3] = new Hod();
        a[3].get("Silpa", 10000,"CS","PE");
        a[4] = new Hod();
        a[4].get("Appu", 25000,"EEE","CO");
        for( i =0 ;i<5;i++){
            a[i].show();
        }
        Professor b[] = new Professor[5];
        b[0] = new Professor();
        b[0].get("Silpa", 15000,"IT","DBMS");
        b[1] = new Professor();
        b[1].get("Vijayan", 10000,"EC","DSD");
        b[2] = new Professor();
        b[2].get("Deepa", 35000,"IT","JAVA");
        b[3] = new Professor();
        b[3].get("Kasthuri", 10000,"CS","PE");
        b[4] = new Professor();
        b[4].get("Sreejith", 25000,"EEE","CO");
        for( i =0 ;i<5;i++){
            b[i].show();
        }
    }
}
