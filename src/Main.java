import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();

    }

    private  static void  readFile(){
        File file = new File("exeption.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException i){
            System.out.println("Exeption was thrown FileNotFoundException ");
        }

    }
}