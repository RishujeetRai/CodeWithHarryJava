/*
 The life cycle of a thread is as follows:
 1) New --> Instance of thread created, which is not yet started by invoking start()
 2) Runnable --> After invocation of start() and before it is selected to be run by the scheduler
 3) Running --> After thread scheduler has selected it
 4) Non-Runnable --> Thread alive but not eligible to run (goes back to 2)
 5) Terminated --> run() method has exited
*/
public class _107_life_cycle_of_a_thread {
    public static void main(String[] args) {

    }
}
