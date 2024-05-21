class myThread4 extends Thread{
    public myThread4(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<20){
            System.out.println("The thread of "+this.getName());
//            System.out.println(this.getState());    // prints RUNNABLE
            i++;
        }
    }
}
public class _113_getState_in_thread {
    public static void main(String[] args) {
        myThread4 M = new myThread4("Baka Mittai");
        System.out.println(M.getState());   // prints NEW
        M.start();
        System.out.println(M.getState());   // prints RUNNABLE
        System.out.println(Thread.currentThread().getState());
        // currentThread() returns reference of currently executing thread
    }
}
