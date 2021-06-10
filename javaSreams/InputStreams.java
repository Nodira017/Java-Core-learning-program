package javaSreams;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreams {
    public static void main(String[] args) {
        // simple example
        String bob = "Code is really cool";
        byte [] date = bob.getBytes();
        try {
            System.out.write(date);
            System.out.flush();
        }
        catch (IOException ex){
            System.out.println(ex);
        }

        // output examples
        FileInputStream input = null;
    try {
        // with particular size
        int[] date0 = new int[20];
        for (int i = 0; i < date.length; i++) {
            date0[i] = System.in.read();
        }
        System.out.println("input collected:");
        for (int i = 0; i < date.length; i++) {
            System.out.write(date[i]);
        }
        System.out.flush();
        System.out.println();

        // with read() and while(true)
        input = new FileInputStream("exam1.txt");
        while (true) {
            int date1 = input.read();
            if (date1 == -1) {
                System.out.println("  :end of stream"); break;
            }
            else System.out.write(date1);
        }
        System.out.flush();
        System.out.println();

        // available()

        byte [] date2 = new byte[input.available()];
        input.read(date2);
        System.out.write(date2);
        System.out.flush();
    }
    catch (IOException ex){
        System.out.println(ex);
    }
    finally {
        try{
            if (input!=null) input.close();
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
    }
}
