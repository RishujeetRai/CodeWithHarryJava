import java.util.ArrayList;

public class _139_store_in_arrayList {
    public static void main(String[] args) {
        // creating an ArrayList to store ten students' names
        ArrayList<String> A = new ArrayList<>(10);
        // adding the students' names to the ArrayList
        A.add("Rishu");
        A.add("Aashu");
        A.add("Sonal");
        A.add("Ashutosh");
        A.add("Abhishek");
        A.add("Raja");
        A.add("Mandati");
        A.add("Crimson King");
        A.add("Kami no Chikara");
        A.add("Wryyyyyyyyy");
        // printing the students' names using a for-each loop
        System.out.println("The students are:");
        for (String s : A){
            System.out.println(s);
        }
    }
}
