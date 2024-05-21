public class _42_array_operations {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        float[] arr2 = {1,2,3.0f,4,5.0f};
        int l = arr1.length;            // array.length returns the length of the array
        System.out.println("The length of the array is: "+l);

        // Displaying elements of the array (using for loop)
        System.out.println("Displaying elements of the array using for loop:");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        // Quick Quiz: Displaying elements of the array in reverse order (using for loop)
        System.out.println("Displaying elements of the array in reverse order:");
        for(int i=arr1.length-1; i>=0; i--){        // loop runs from length-1 till 0
            System.out.println(arr1[i]);
        }

        // Displaying elements of the array (using enhanced for loop or for-each loop)
        System.out.println("Displaying elements of the array using for-each loop:");
        for (int i : arr1) {            // Syntax: datatype i : arrayName
            System.out.println(i);      // i returns an element of the array for each iteration of the loop
        }
        // for each loop is used to iterate over all elements of an array
        // don't use this to take inputs for an array, because if you do i = value,
        // that would just change value of i and add nothing to the array
    }
}
