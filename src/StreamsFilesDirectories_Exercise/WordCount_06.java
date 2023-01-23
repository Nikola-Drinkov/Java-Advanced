package StreamsFilesDirectories_Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {

        String wordsPath = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        List<String> lines = Files.readAllLines(Path.of(wordsPath));
        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for(String line: lines){
            String[] words = line.split(" ");
            for(String word:words){
                wordsMap.put(word,0);
            }
        }

        String textPath = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> linesText = Files.readAllLines(Path.of(textPath));
        for(String line:linesText){
            String[] wordsText = line.split(" ");
            for(String word:wordsText){
                if(wordsMap.containsKey(word)){
                    wordsMap.put(word,wordsMap.get(word)+1);
                }
            }
        }
        PrintWriter writer = new PrintWriter("D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\06output.txt");
        wordsMap.entrySet().stream().sorted((e1, e2)->e2.getValue().compareTo(e1.getValue())).forEach(entry -> writer.println(entry.getKey()+" - "+entry.getValue()));
        writer.close();
    }
}
