package StreamsFilesDirectories_Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers_05 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        PrintWriter writer = new PrintWriter("D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\outputLineNumbers.txt");
        int lineN = 1;
        for(String line:lines){
            writer.println(lineN+". "+line);
            lineN++;
        }
        writer.close();
    }
}
