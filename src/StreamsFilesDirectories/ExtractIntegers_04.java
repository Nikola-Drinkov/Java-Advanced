package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04output.txt";
        Scanner sc = new Scanner(new FileInputStream(path));
        PrintStream writer = new PrintStream(pathOut);
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                writer.println(sc.nextInt());
            }
            sc.next();
        }
    }
}
