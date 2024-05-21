import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _152_multiplication_table_into_a_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table into a file: ");
        int n = sc.nextInt();
        try {
            FileWriter FW = new FileWriter("MultiplicationTable.txt");
            for(int i=1; i<=10; i++){
                FW.write(n+"X"+i+"="+(n*i)+"\n");
            }
            FW.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
