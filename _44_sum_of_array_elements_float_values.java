public class _44_sum_of_array_elements_float_values {
    public static void main(String[] args) {
        float[] arr1 = {2.2f, 3.2f, 4.2f, 4.5f, 5.4f};
        float sum = 0;
        for(float element : arr1){
            sum = sum + element;
        }
        System.out.println("The sum is: "+sum);
    }
}
