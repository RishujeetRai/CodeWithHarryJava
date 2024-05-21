public class _50_find_min_in_an_array {
    public static void main(String[] args) {
        int[] arr1 = {32,43,54,24,8,27,76,87,89};
        int min=arr1[0];        // for once, assigning minimum value as first element
        for(int i: arr1){
            if(i<min) min=i;    // after that, we compare
        }
        System.out.println("The min value of the given array is: "+min);
    }
}
