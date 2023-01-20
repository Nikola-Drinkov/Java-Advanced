package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = path+"\\input.txt";
        String outputPath = path+"\\output.txt";
        List<Character> punctuation =  Arrays.asList(',','.','!','?');

        FileOutputStream outputStream = new FileOutputStream(outputPath);

        try(FileInputStream fileStream = new FileInputStream(inputPath)){
            int oneByte = fileStream.read();
            while (oneByte>=0){
                System.out.print(Integer.toBinaryString(oneByte)+" ");
                if(!punctuation.contains((char)oneByte)){
                    outputStream.write(oneByte);
                }
                oneByte = fileStream.read();
            }
        }
        catch (IOException e){
            System.out.println("empty");
        }
        outputStream.close();
    }
}
