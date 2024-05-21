public class _41_arrays_in_java {
    public static void main(String[] args) {
        // There are three ways to declare an array in Java

        int[] arr1 = new int[5];        // declaration + memory allocation
        arr1[3] = 46;                   // initializing the 4th element of the array arr1

        int[] arr2;                     // declaration
        arr2 = new int[5];              // then memory allocation

        int[] arr3 = {1,2,3,4,5};       // declaration and initialization (size is 5 via initialization)
//        arr3 = {3,4,5,6,7};           // re-initialization is not allowed this way
        arr3[3] = 100;                  // re-initialization is allowed this way

        // be default, array elements have 0 value
        System.out.println(arr1[0]);    // arr1[0] is uninitialized, so returns 0 value
        System.out.println(arr1[1]);    // arr1[1] is uninitialized, so returns 0 value
        System.out.println(arr1[2]);    // arr1[2] is uninitialized, so returns 0 value
        System.out.println(arr1[3]);    // printing the initialized 4th element
        System.out.println(arr1[4]);    // arr1[4] is uninitialized, so returns 0 value
    }
}
