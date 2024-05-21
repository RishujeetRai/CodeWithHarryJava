// Creating a thread by extending the Thread class in Java
class Thread1 extends Thread{       // extending the Thread class
    public void run(){      // overriding the run() function of Thread class
        int i=0;
        while(i<4000){
            System.out.println("Thread1 is running.");
            System.out.println("Dame da yoooo, Kirin. Dame da yo.");
            i++;
        }
    }
}
class Thread2 extends Thread{       // extending the Thread class
    public void run(){      // overriding the run() function of Thread class
        int i=0;
        while(i<4000){
            System.out.println("Thread2 is running.");
            System.out.println("Baka mittai.");
            i++;
        }
    }
}
public class _105_creating_thread_by_extending_thread_class {
    public static void main(String[] args) {
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.start();     // start() function will call the run function of this thread accordingly
        T2.start();     // start() function will call the run function of this thread accordingly
        /*
         Main difference is that when program calls start() method a new Thread is created and code inside
         run() method is executed in new Thread while if you call run() method directly no new Thread is
         created and code inside run() will execute on current Thread.
        */
        // calling the run method would've beaten the cause of multithreading
    }
}
