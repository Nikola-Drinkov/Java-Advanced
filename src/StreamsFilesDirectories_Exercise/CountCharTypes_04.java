package StreamsFilesDirectories_Exercise;

import java.io.*;
import java.nio.file.Path;

public class CountCharTypes_04 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outPath =  "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\04output.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        PrintWriter writer = new PrintWriter(outPath);
        int vowels = 0;
        int others = 0;
        int punctuation = 0;
        String currentLine = reader.readLine();
        while (currentLine!=null){
            for(char letter:currentLine.toCharArray()){
                if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
                    vowels++;
                else if(letter=='!'||letter==','||letter=='.'||letter=='?')
                    punctuation++;
                else if(letter!=' ')
                    others++;
            }
            currentLine=reader.readLine();
        }
        writer.println("Vowels: "+vowels);
        writer.println("Other symbols: "+others);
        writer.println("Punctuation: "+punctuation);
        writer.close();
    }
}
