package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_01 {
    public static void main(String[] args) {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = path+"\\input.txt";
        try(FileInputStream fileStream = new FileInputStream(inputPath)){
            int oneByte = fileStream.read();
            while (oneByte>=0){
                System.out.print(Integer.toBinaryString(oneByte)+" ");
                oneByte = fileStream.read();
            }
        }
        catch (IOException e){
            System.out.println("empty");
        }
    }
}
