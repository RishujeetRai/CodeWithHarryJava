public class _43_multidimensional_arrays {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];     // declaring a multidimensional array with 2 rows and 3 columns
        // 2 X 3 = 6 elements
        arr1[0][0] = 101;
        arr1[0][1] = 102;
        arr1[0][2] = 103;
//        arr1[0][3] = 104;     // invalid since there is no fourth column in this 2x3 multidimensional array
        arr1[1][0] = 201;
        arr1[1][1] = 202;
        arr1[1][2] = 203;
//        arr1[2][1] = 301;     // invalid since there is no third row in this 2x3 multidimensional array

        int len1 = arr1.length;         // returns length of first dimension of the multidimensional array
        System.out.println("The length of first dimension of the multidimensional array arr1 is: "+len1);
        int len2 = arr1[0].length;     // returns length of second dimension of the multidimensional array
        // could also use any other positive value under arr1.length at place of 0
        System.out.println("The length of second dimension of the multidimensional array arr1 is: "+len2);

//        below line of code would've worked if arr1 had a third dimension
//        int len3 = arr1[0][0].length;     // returns length of third dimension of the multidimensional array
//        System.out.println("The length of third dimension of the multidimensional array arr1 is: "+len1);

        // Printing a multidimensional array using for loop
        System.out.println("Printing the elements of the multidimensional array using for loop:");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");   // printing all elements of a dimension separated by a space
            }
            System.out.println();       // adding a linebreak after printing all elements of a dimension
        }

        // Printing a multidimensional array using for-each loop
        System.out.println("Printing the elements of the multidimensional array using for-each loop:");
        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");    // printing all elements of a dimension separated by a space
            }
            System.out.println();       // adding a linebreak after printing all elements of a dimension
        }
    }
}
