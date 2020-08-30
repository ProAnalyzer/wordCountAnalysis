package  FileHandeling;
import java.io.File;
import java.io.IOException;

public class  CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\User\\Desktop\\R.S\\Day !\\newClass.java");
            if (myObj.createNewFile()){
                System.out.println("File Created :"+myObj.getName());
            }
            else{
                System.out.println("File Already Exists");
            }
        }
        catch (IOException e){
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}