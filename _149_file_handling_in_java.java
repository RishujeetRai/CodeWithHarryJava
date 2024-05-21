import java.io.File;    // methods used: createNewFile(), delete(), getName(), close()
import java.io.FileNotFoundException;
import java.io.FileWriter;      // methods used: write(), close()
import java.io.IOException;
import java.util.Scanner;       // methods used: hasNextLine(), nextLine(), close()

public class _149_file_handling_in_java {
    public static void main(String[] args) {
        // Code to create a new file
        File myFile = new File("file1.txt");    // creates object of File class
        try {
            myFile.createNewFile();     // creating a file using that object
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("file1.txt");  // creating object of FileWriter class
            // and passing that object the file in which we want to write into
            fileWriter.write("This is our first file from this java course\nOkay now bye"); // write() method
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file
//        File myFile = new File("file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){    // runs till the file has another line
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Deleting a file
//        File myFile = new File("file1.txt");
        if(myFile.delete()){    // delete() method of the File class
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
