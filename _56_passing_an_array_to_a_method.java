public class _56_passing_an_array_to_a_method {
    static void changeInt(int x){   // this method does not change the value of original variable passed to it
        x = 23;
    }
    static void changeArr(int[] arr){   // taking an array as a parameter
        arr[0] = 23;    // this method however does change the value at 0th index of the array passed
        // this is because arrays are passed by reference, and not by value
    }
    public static void main(String[] args) {
        int a = 99;
        System.out.println("The value of int a before calling the changeInt method is: "+a);
        changeInt(a);
        System.out.println("The value of int a after calling the changeInt method is: "+a);
        System.out.println();
        int[] arr1 = {1,2,3,4,5,6,7};
        System.out.println("The value of arr1[0] before calling the changeArr method is: "+arr1[0]);
        changeArr(arr1);
        System.out.println("The value of arr1[0] after calling the changeArr method is: "+arr1[0]);
    }
}
