package StreamsFilesDirectories;

import java.io.*;

public class CopyBytes_03 {
    public static void main(String[] args) {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = path+"\\input.txt";
        String outputPath = path+"\\03output.txt";

        try(InputStream inputStream = new FileInputStream(inputPath);
            OutputStream outputStream = new FileOutputStream(outputPath)){
            int readByte = inputStream.read();
            while (readByte>=0){
                if(readByte ==' ' || readByte =='\n'){
                    outputStream.write(readByte);
                }
                else{
                    String number = String.valueOf(readByte);
                    for (int i = 0; i <number.length() ; i++) {
                        outputStream.write(number.charAt(i));
                    }
                }
                readByte = inputStream.read();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
