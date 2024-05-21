public class _31_continue {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(i);
            if(i==3) continue;              // continue gives control to the next iteration of the loop
            // skipping everything that comes after it in the loop it was invoked in
            System.out.println("HIHI");     // continue will help the loop skip this line when it's invoked
            System.out.println("HAHA");     // continue will help the loop skip this line when it's invoked
            System.out.println("HEHE");     // continue will help the loop skip this line when it's invoked
            System.out.println("HUIHUI");   // continue will help the loop skip this line when it's invoked
            System.out.println("HEH");      // continue will help the loop skip this line when it's invoked
        }
    }
}
