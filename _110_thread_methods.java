// Creating a thread by extending the Thread class in Java
class Thread4 extends Thread{       // extending the Thread class
    public void run(){      // overriding the run() function of Thread class
        int i=0;
        while(i<400){
            System.out.println("Thread1 is running.");
            System.out.println("Dame da yoooo, Kirin. Dame da yo.");
            i++;
        }
    }
}
class Thread5 extends Thread{       // extending the Thread class
    public void run(){      // overriding the run() function of Thread class
        int i=0;
        while(i<400){
            System.out.println("Thread2 is running.");
            System.out.println("Baka mittai.");
            i++;
            try{    // we put this method in a try-catch block
                Thread5.sleep(50);     // the thread sleeps for 50ms
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            // what happens here is this thread will sleep for 50ms everytime this while loop runs
            // so, 50ms*400, this thread will take 20,000ms or 20 seconds to finish running
            // we could put this sleep() method outside the while loop for this thread to only sleep once
        }
    }
}
public class _110_thread_methods {
    public static void main(String[] args) {
        Thread4 T1 = new Thread4();
        Thread5 T2 = new Thread5();
        T1.start();
        try{    // we put this method also in a try-catch block
            T1.join();  // because of join() method, any other thread will only run after this thread ends
        } catch (Exception e){
            System.out.println(e);
        }
        T2.start();
    }
}
