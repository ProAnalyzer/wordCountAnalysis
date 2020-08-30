package  FileHandeling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
    /*public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\User\\Desktop\\R.S\\Day !\\FileF1.txt");
            myWriter.write("Darling, Who am I ?");
            myWriter.close();
            System.out.println("Successfully wrote to a file.");
        }
        catch (IOException e){
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\User\\Desktop\\R.S\\Day !\\newClass.java");
        try {
            PrintWriter pw = new PrintWriter(myObj);
            pw.println(007);
            pw.println("Donkey");
            pw.println("What are you want from me !");
            pw.close();

        }
        catch (IOException e){
            System.out.printf("An Error occurred : %s\n",e);
            e.printStackTrace();
        }
    }
}
