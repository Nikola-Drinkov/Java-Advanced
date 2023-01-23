package StreamsFilesDirectories_Exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals_03 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        File file = new File("D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\03output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        List<String> lines = Files.readAllLines(Path.of(path));
        for(String line:lines){
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();
    }
}
