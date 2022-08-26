import java.io.*;
import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       /* System.out.println("Write the filename you want to search!");
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to search for the file " + "" + sc.nextLine());*/

       // readFile("c:\\temp\\text.txt");

        writeFile("c:\\temp\\text2.txt");


    }

    private static void writeFile(String filePath) {

        try  (FileWriter fileWriter = new FileWriter(filePath)) {

            fileWriter.write("Dagens nyheter: En kanot välte i sjön Gautan nedanför Tärnaby Fjällhotell" +
                    " vid 11-tiden under fredagen. Två personer från San Francisco, som är på besök i Tärnaby" +
                    " för att delta vid ett bröllop under helgen, hamnade i vattnet.");
        } catch (IOException e) {
            System.out.println("Blev inget");
            throw new RuntimeException(e);

        }
    }

    private static void readFile(String filePath) {

        File file = new File(filePath);


        Scanner scanner = null;
        try {
        //    FileReader fileReader = new FileReader(file);

            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File don't exist");
            throw new RuntimeException(e);

        } finally {
            if(scanner != null);
            scanner.close();
        }
    }

}
