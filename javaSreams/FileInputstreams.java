package javaSreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputstreams {
    public static void main(String[] args) {
        FileInputStream input = null;
        // ways read of file
        try{
            input = new FileInputStream("exam1.txt");
             //first way
            for (int i = input.read(); i !=-1 ; i=input.read()) {
                System.out.write(i);
            }
            System.out.write(10);
            System.out.flush();
            input = new FileInputStream("exam1.txt");
            //second way
            int date = input.read();
            while (date!=-1){
                System.out.write(date);
                date=input.read();
            }
            System.out.write(10);
            System.out.flush();
            input = new FileInputStream("exam1.txt");
            //third way
             byte [] date1 = new byte[input.available()];
             input.read(date1);
            System.out.write(date1);
            System.out.flush();
        }catch (IOException ex){
            System.out.println(ex);
        }
        finally {
            try{
                input.close();
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }
}
