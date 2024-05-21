public class _53_reverse_array_using_swapping {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int[] arr1 = {1,2,3,4,5,6};     // works for any number of elements, even or odd
        int n = arr1.length/2;          // to get floor half of the number of elements in the array
        for(int i=0; i<n; i++){         // runs till halfway through to the array
            // logic for swapping
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = temp;
        }
        // Printing the reversed array
        for(int i: arr1){
            System.out.print(i+" ");
        }
    }
}
