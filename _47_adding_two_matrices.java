import java.util.Scanner;
public class _47_adding_two_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        // Assigning values to first matrix
        System.out.println("Enter elements for the first 2x3 matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        // Assigning values to second matrix
        System.out.println("Enter elements for the second 2x3 matrix:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        // Adding both matrices
        int[][] arrSum = new int[2][3];     // the sum matrix has the same dimensions as the other matrices
        for(int i=0; i<2; i++){             // for rows
            for(int j=0; j<3; j++){         // for columns
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        // Printing the elements of the sum matrix
        System.out.println("The elements of the sum matrix are as follows:");
        for(int[] i: arrSum){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
