package StreamsFilesDirectories_Exercise;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        String path = "D:\\Java Projects\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        File[] allFiles = folder.listFiles();
        long folderSize = 0;
        if(allFiles!=null) {
            for (File file : allFiles) {
                folderSize += file.length();
            }
        }
        System.out.println("Folder size: "+folderSize);
    }
}
