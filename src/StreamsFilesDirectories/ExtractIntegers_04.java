package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        Scanner sc = new Scanner(new FileInputStream(path));
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }
            sc.next();
        }
    }
}
