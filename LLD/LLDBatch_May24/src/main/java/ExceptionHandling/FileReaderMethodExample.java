package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderMethodExample {
    public static void main(String[] args) {
        try{
            readFile("example.txt");
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException: " + e.getMessage());
        }


    }

    private static void readFile(String fileName) throws FileNotFoundException{
        FileReader fileReader = new FileReader(fileName);

    }
}
