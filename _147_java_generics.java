import java.util.ArrayList;

public class _147_java_generics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();  // we didn't mention what type of data this ArrayList we store
        arrayList.add("BRING ME HIS HEAD");     // a string
        arrayList.add(33);      // an int type data
        arrayList.add(3.14);    // a double type data
        System.out.println(arrayList);      // will print the arrayList with all its elements whatever their type

        // but
//        String s1 = arrayList.get(0);   // this gives error because a string is not returned by the arrayList
//        int i1 = arrayList.get(1);      // this gives error because an int is not returned by the arrayList
//        double d1 = arrayList.get(2);   // this gives error because a double is not returned by the arrayList
        // the arrayList.get(index) returns an object type since we hadn't declared what type of data it'd store

        Object S1 = arrayList.get(0);   // these could work
        Object I1 = arrayList.get(1);   // these could work
        Object D1 = arrayList.get(2);   // these could work
        System.out.println(S1);
        System.out.println(I1);
        System.out.println(D1);
        // these could work, and so would typecasting, but hear me out

        // what if you had to make an ArrayList only consisting integers?
        // what if you had to make an ArrayList only consisting strings?
        // what if you had to make an ArrayList only consisting doubles?
        // switch to br-

        // in case we have to make an ArrayList which will store value of a single datatype
        // we can mention that datatype between <> while creating the ArrayList
        // example:
        ArrayList<Integer> arrayList1 = new ArrayList<>();  // an ArrayList that will store only integer values
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
//        arrayList1.add(4.5);    // this will give error since this ArrayList can only store integers
        System.out.println(arrayList1); // printing the ArrayList
        // we can mention Integer in the first <> or the second <> or both <> as well, it'd make no difference

        // but why did we write Integer instead of writing int
        // int is a primitive datatype and Integer is a generic datatype
        // and type argument, what we pass between <>, can never be of primitive datatype, so
//        ArrayList<int> arrayList2 = new ArrayList<>();  // would've thrown an error
    }
}
