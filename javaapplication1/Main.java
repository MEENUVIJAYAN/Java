

class Thread1 extends Thread {
    public void run() {
        int i;
        for(i=1;i<=5;i++) {
            System.out.println("Thread1 is running..");
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread1();
        
         
        t1.start();
        try { 
            Thread.sleep(100); 
        } 
        catch(Exception e) {}
        
    }
}
