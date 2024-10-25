import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Create text File
        try{
       /* File mahi = new File("C:\\Users\\Shiva\\java Programs\\Siva.txt");
        if (mahi.createNewFile()){
            System.out.println("File Created : "+mahi.getName());
        }else{
            System.out.println("File Already Exits");
        }*/
            //Write Txt File
            /*FileWriter mahi = new FileWriter("C:\\Users\\Shiva\\java Programs\\Siva.txt");
            mahi.write("Shiva Is Rock ");
            mahi.close();
            System.out.println("Write Completed");*/

            //Read File

           /* File mahi = new File("C:\\Users\\Shiva\\java Programs\\Siva.txt");
            Scanner sc = new Scanner(mahi);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }*/

            //Functions
            File mahi = new File("C:\\Users\\Shiva\\java Programs\\Siva.txt");
            if (mahi.exists()){
                System.out.println("File Path : "+mahi.getAbsolutePath());
                System.out.println("File Name : "+mahi.getName());
                System.out.println("File Write : "+mahi.canWrite());
                System.out.println("File Read : "+mahi.canRead());
                System.out.println("File Execute : "+mahi.canExecute());
            }else{
                System.out.println("File Not Found");
            }

        }catch(Exception e){
            System.out.println("Error Is : "+e);
        }
    }
}