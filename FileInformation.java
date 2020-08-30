package  FileHandeling;
import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File myObj = new  File ("C:\\Users\\User\\Desktop\\R.S\\Day !\\FileF1.txt");
        if(myObj.exists()){
            System.out.println("File_Name : " +myObj.getName());
            System.out.println("Path : " +myObj.getPath());
            System.out.println("Absolute_Path : " +myObj.getAbsolutePath());
            System.out.println("Free Space in file : " +myObj.getFreeSpace());
            System.out.println("Is Readable : " +myObj.canRead());
            System.out.println("Is Writable : " +myObj.canWrite());
            System.out.println("File Size in Bytes : " +myObj.length());
            System.out.println("Parent" +myObj.getParent());
            System.out.println("Is a directory : " +myObj.isDirectory());
            System.out.println("Is Executable : " +myObj.canExecute());
        }
        else{
            System.out.println("File doesn't exists");
        }
    }
}
