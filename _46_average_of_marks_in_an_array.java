public class _46_average_of_marks_in_an_array {
    public static void main(String[] args) {
        int[] marks = {84, 88, 89, 92, 99};
        float sum = 0;
        for(int element: marks){
            sum = sum + element;
        }
        System.out.println("The average of marks present in the array is: " + (sum / marks.length));
    }
}
