public class _45_present_or_not_in_an_array {
    public static void main(String[] args) {
        int [] arr1 = {2, 4, 6, 8, 10};
        int mark = 0, check = 6;
        for(int element: arr1){
            if(check==element){
                mark=1; break;
            }
        }
        if(mark==1) System.out.println("Element is present in the array.");
        else System.out.println("Element is not present in the array.");
    }
}
