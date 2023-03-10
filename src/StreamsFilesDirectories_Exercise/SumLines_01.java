package StreamsFilesDirectories_Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        for(String line:lines){
            int sum = 0;
            for(char letter:line.toCharArray()){
                sum+=(int)letter;
            }
            System.out.println(sum);
        }
    }
}
