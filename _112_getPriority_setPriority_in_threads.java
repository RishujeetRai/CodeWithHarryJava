class myThread extends Thread{
    public myThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<200){
            System.out.println("The thread of "+this.getName());
            i++;
        }
    }
}
public class _112_getPriority_setPriority_in_threads {
    public static void main(String[] args) {
        myThread T1 = new myThread("Loneliness");
        myThread T2 = new myThread("Friendship");
        myThread T3 = new myThread("Compassion");
        myThread T4 = new myThread("Love");
        myThread T5 = new myThread("Insecurity");
        myThread T6 = new myThread("Dread");
        myThread T7 = new myThread("Ego");
        myThread T8 = new myThread("Hurt");
        myThread T9 = new myThread("Pain");
        myThread T10 = new myThread("LonelinessOnceAgain");
        T1.setPriority(Thread.NORM_PRIORITY);   // NORM_PRIORITY is 5 (it's also the default priority)
        T2.setPriority(Thread.MAX_PRIORITY);    // MAX_PRIORITY is 10
        T3.setPriority(Thread.NORM_PRIORITY);   // NORM_PRIORITY is 5 (it's also the default priority)
        T4.setPriority(3);
        T5.setPriority(4);
        T6.setPriority(6);
        T7.setPriority(Thread.MIN_PRIORITY);    // MIN_PRIORITY is 1
        T8.setPriority(7);
        T9.setPriority(8);
        T10.setPriority(9);
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        T5.start();
        T6.start();
        T7.start();
        T8.start();
        T9.start();
        T10.start();
        System.out.println(T1.getPriority());   // T1 has NORM_PRIORITY so getPriority() will return 5
        System.out.println(T2.getPriority());   // T2 has MAX_PRIORITY so getPriority() will return 10
        System.out.println(T3.getPriority());   // T3 has NORM_PRIORITY so getPriority() will return 5
        System.out.println(T4.getPriority());
        System.out.println(T5.getPriority());
        System.out.println(T6.getPriority());
        System.out.println(T7.getPriority());   // T7 has MIN_PRIORITY so getPriority() will return 1
        System.out.println(T8.getPriority());
        System.out.println(T9.getPriority());
        System.out.println(T10.getPriority());
    }
}
