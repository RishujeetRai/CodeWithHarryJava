// IMPROVE IT. WITHOUT DELETING FROM AN ARRAY. (HINT1: book[i]==null, HINT2: if book[i]==null continue)
import java.util.Scanner;
class library{
    int size = 3;
    String[] book = new String[size];
    int numOfBooks = 0;
    public void addBooks(){
        if(numOfBooks>size-1){
            System.out.println("Library full.");
            return;
        }
        if(numOfBooks<0){
            numOfBooks=0;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        book[numOfBooks] = sc.nextLine();
        numOfBooks++;
    }
    public void showBooks(){
        if(numOfBooks==0){
            System.out.println("Library empty.");
            return;
        }
        System.out.println("The available books are:");
        for(int i=0; i<numOfBooks; i++){
            System.out.println((i+1)+". "+book[i]);
        }
    }
    public void takeBooks(){
        showBooks();
        System.out.print("Enter the index of the book you want to take: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n-1)>numOfBooks || n<=0){
            System.out.println("Invalid index.");
            return;
        }
        System.out.println(book[n-1]+" taken.");
        book[n-1] = "Book taken.";
    }
}
public class _91_online_library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        library lib = new library();
        boolean b = true;
        do{
            System.out.println("Choose from the below menu-");
            System.out.println("Press 1 to see available books");
            System.out.println("Press 2 to add a book");
            System.out.println("Press 3 to take a book");
            System.out.println("Press 4 to exit");
            int n = sc.nextInt();
            switch (n) {
                case 1 -> lib.showBooks();
                case 2 -> lib.addBooks();
                case 3 -> lib.takeBooks();
                case 4 -> {
                    System.out.println("Thank you for visiting.");
                    b = false;
                }
                default -> System.out.println("Invalid choice entered. Try again.");
            }
        }while(b);
    }
}
