public class _52_sorted_or_not {
    public static void main(String[] args) {
//        Cases
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr1 = {5,4,3,2,1};
//        int[] arr1 = {5,6,6,7,7};
//        int[] arr1 = {5,5,6,7,7};
//        int[] arr1 = {5,5,6,7,8};
//        int[] arr1 = {5,5,4,4,3};
//        int[] arr1 = {5,5,4,3,3};
        int[] arr1 = {32,43,54,24,8,27,76,87,89};

        int sort = 0;                           // creating a sort marker
        for(int i=0; i<arr1.length-2; i++){     // runs till 3 less than length of the array
            if(arr1[i]==arr1[i+1]) continue;    // in case of equality: ignore
            if(arr1[i]<arr1[i+1]){              // otherwise check if ascending
                sort = 1;                       // if ascending, sort=1
                // then check if next pair is also ascending or not
                if(arr1[i+1]==arr1[i+2]) continue;          // in case of equality: ignore
                if(arr1[i+1]<arr1[i+2]){
                    sort = 1;                   // if next pair is also ascending, sort stays 1
                }
                else{
                    sort = 0; break;            // else sort=0 and come out of for loop
                }
            }
            else if(arr1[i]>arr1[i+1]){         // if not ascending, then check for descending
                sort = 2;                       // if descending, sort=2
                // then check if next pair is also descending or not
                if(arr1[i+1]==arr1[i+2]) continue;          // in case of equality: ignore
                if(arr1[i+1]>arr1[i+2]){
                    sort = 2;                   // if next pair is also descending, sort stays 2
                }
                else{
                    sort = 0; break;            // else sort=0 and come out of for loop
                }
            }
        }
        if(sort==1) System.out.println("Sorted in ascending order.");
        else if(sort==2) System.out.println("Sorted in descending order.");
        else System.out.println("Not sorted in any order.");
    }
}
