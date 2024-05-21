import java.util.HashSet;

public class _141_store_in_set {
    public static void main(String[] args) {
//        Set<Integer> S = new Set<>();     // Error: Set is abstract, cannot be instantiated
        HashSet<Integer> H = new HashSet<>();   // HashSet is also a set
        // entering values into the set and trying to enter a few repeating values too
        H.add(33);
        H.add(34);
        H.add(35);
        H.add(36);
        H.add(36);
        H.add(36);
        // printing the elements of the set
        for(Integer i : H){
            System.out.println(i);  // no elements repeated
        }
    }
}
