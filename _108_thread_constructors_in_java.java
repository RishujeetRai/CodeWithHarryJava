/*
 Below are some of the commonly used thread constructors in Java
 1) Thread()
 2) Thread(String name)
 3) Thread(Runnable r)
 4) Thread(Runnable r, String name)
*/
class myThread1 extends Thread{
    public myThread1(String name){   // Thread(String name) constructor
        super(name);    // sets this thread's name as name, should be first statement in the constructor
        System.out.println("The name is: "+name);
        System.out.println("Hihi");
    }
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("myThread1 is running.");
            System.out.println("Dame da yoooo, Kirin. Dame da yo.");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public myThread2(String name){   // Thread(String name) constructor
        super(name);    // sets this thread's name as name, should be first statement in the constructor
        System.out.println("The name is: "+name);
        System.out.println("Huhu");
    }
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("myThread2 is running.");
            System.out.println("Baka mittai.");
            i++;
        }
    }
}
public class _108_thread_constructors_in_java {
    public static void main(String[] args) {
        myThread1 T1 = new myThread1("LOLOLOL");
        myThread2 T2 = new myThread2("LILILIL");
//        T1.start();
//        T2.start();
        System.out.println("The id of this thread is: "+T1.getId());     // every thread gets an ID
        System.out.println("The id of this thread is: "+T2.getId());     // every thread gets an ID
        // we can access this ID using the getID() function
    }
}
