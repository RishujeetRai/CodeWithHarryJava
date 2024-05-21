public class _48_reverse_an_array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        // Printing the original array arr1
        System.out.println("The original array is:");
        for(int element: arr1){
            System.out.print(element+" ");
        }
        System.out.println();
        // Creating a new array arr2
        int[] arr2 = new int[arr1.length];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = arr1[arr1.length-1-i];        // assigning arr1 elements to arr2 in reverse
        }
        for(int i=0; i<arr2.length; i++){           // now rewriting arr1 with those reverse values of arr2
            arr1[i] = arr2[i];
        }
        // Printing the reversed values of arr1
        System.out.println("The reversed array is:");
        for(int element: arr1){
            System.out.print(element+" ");
        }
    }
}
