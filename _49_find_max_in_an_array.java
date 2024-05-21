public class _49_find_max_in_an_array {
    public static void main(String[] args) {
        int[] arr1 = {32,43,54,24,8,27,76,87,89};
        int max=0;
        for(int i: arr1){
            if(i>max) max=i;
        }
        System.out.println("The max value of the given array is: "+max);
    }
}
