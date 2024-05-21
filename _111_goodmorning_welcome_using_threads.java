class goodMorning extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            System.out.println("Good Morning");
            i++;
        }
    }
}
class welcome extends Thread{
    public void run(){
        int i=0;
        while(i<200){
            try{
                welcome.sleep(200);     // this thread sleeps for 200ms every time this loop is iterated
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Welcome");
            i++;
        }
    }
}
public class _111_goodmorning_welcome_using_threads {
    public static void main(String[] args) {
        goodMorning G = new goodMorning();
        welcome W = new welcome();
        G.start();
        W.start();
    }
}
