package javaSreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputS {
    public static void main(String[] args) {
        FileOutputStream output = null;
        FileInputStream inputt=null;
        try{
            inputt= new FileInputStream("exam1.txt");
            output=new FileOutputStream("exam1.txt" );
            while (true){
                int input = System.in.read();
                if (input==10){
                    break;
                }else {
                    output.write(input);
                }
            }

          byte [] date = new byte[inputt.available()];
            inputt.read(date);
            System.out.write(date);

            // copy text from one file to another
            inputt = new FileInputStream("exam1.txt");
            output = new FileOutputStream("exam2.txt");
            byte [] date2 = new byte[inputt.available()];
            inputt.read(date2);
            output.write(date2);
        }catch (IOException ex){
            System.out.println(ex);
        }
        finally {
            try{
                if (inputt!=null)
                inputt.close();
                if (output!=null)
                output.close();
            }catch (IOException ex){
                System.out.println(ex);
            }
        }
    }
}
