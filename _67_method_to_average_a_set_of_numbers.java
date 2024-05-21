public class _67_method_to_average_a_set_of_numbers {
    static float average(int ...arr){
        int sum = 0;
        float len = 0;
        for(int element: arr){
            sum = sum + element;
            len++;
        }
        return sum/len;
    }

    public static void main(String[] args) {
        System.out.println("The average of 1, 2, 3, 4 and 5 is: "+average(1,2,3,4,5));
        System.out.println("The average of 3, 5, 7 and 11 is: "+average(3,5,7,11));
    }
}
