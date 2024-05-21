class myThread3 extends Thread{
    public myThread3(String s){     // defining a constructor for this thread
        super(s);   // setting this thread's name as s
    }
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("The thread of "+this.getName());
            i++;
        }
    }
}
public class _109_thread_priority_in_java {
    public static void main(String[] args) {
        myThread3 t1 = new myThread3("dread");
        myThread3 t2 = new myThread3("pain");
        myThread3 t3 = new myThread3("loneliness");
        myThread3 t4 = new myThread3("poison");
        myThread3 t5 = new myThread3("death");
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        // default priority of threads in Java is NORM_PRIORITY
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // still, which thread gets executed the most is highly dependent on the OS
    }
}
