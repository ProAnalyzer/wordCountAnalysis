package FileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    /*public static void main(String[] args) {
        try{
            File myObj = new File("C:\\Users\\User\\Desktop\\R.S\\Day !\\FileF1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e){
            System.out.println("An Error occurred");
            e.printStackTrace();
        }
    }*/
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\User\\Desktop\\R.S\\Day !\\newClass.java");
        try{
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch (FileNotFoundException e){
            System.out.printf("An Error occurred : %s\n",e);
            e.printStackTrace();
        }
    }
}
