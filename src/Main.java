import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Write the filename you want to search!");


        Scanner sc = new Scanner(System.in);

        System.out.println("You want to search for the file " + "" + sc.nextLine());

        readFile("c:\\temp\\text.tx");


    }

    private static void readFile(String filePath) {

        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File don't exist");
        }
    }

}
