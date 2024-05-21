// Creating a thread by implementing the Runnable interface in Java
class ThreadRunnable1 implements Runnable{      // implementing the Runnable interface
    public void run(){      // overriding the abstract run() method of Runnable class
        int i=0;
        while(i<4000){
            System.out.println("ThreadRunnable1 is running.");
            System.out.println("Dame da yoooo, Kirin. Dame da yo.");
            i++;
        }
    }
}
class ThreadRunnable2 implements Runnable{      // implementing the Runnable interface
    public void run(){      // overriding the abstract run() method of Runnable class
        int i=0;
        while(i<4000){
            System.out.println("ThreadRunnable2 is running.");
            System.out.println("Baka mittai.");
            i++;
        }
    }
}
public class _106_creating_thread_by_implementing_runnable_interface {
    public static void main(String[] args) {
        ThreadRunnable1 bullet1 = new ThreadRunnable1();    // creating abject of our thread class
        Thread gun1 = new Thread(bullet1);  // creating object of Thread class

        ThreadRunnable2 bullet2 = new ThreadRunnable2();    // creating abject of our thread class
        Thread gun2 = new Thread(bullet2);  // creating object of Thread class

        gun1.start();   // calling the start function
        gun2.start();   // calling the start function

        /*
         If we extend thread class we get a loaded gun(bullet = run method)  whereas
         if we implement runnable interface you have to load the gun with bullet(runnable class object).
        */
    }
}
