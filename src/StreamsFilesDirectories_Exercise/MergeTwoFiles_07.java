package StreamsFilesDirectories_Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {
        String pathFirst = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathSecond = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        List<String> first = Files.readAllLines(Path.of(pathFirst));
        List<String> second = Files.readAllLines(Path.of(pathSecond));
        PrintWriter writer = new PrintWriter("D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\07output.txt");
        for (String line : first)
            writer.println(line);
        for(String line:second)
            writer.println(line);
        writer.close();
    }
}

