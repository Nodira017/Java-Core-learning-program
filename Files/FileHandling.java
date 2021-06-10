package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
    public static void withFileReaderAndFileWritter(FileWriter fwriter, FileReader freader){
        try{
            fwriter = new FileWriter("exam1.txt",true);
            fwriter.write("Hello");
            fwriter.close();
            freader=new FileReader("exam1.txt");
            for (int i = freader.read(); i !=-1 ; i=freader.read()) {
                System.out.write(i);
            }
            System.out.flush();
            freader.close();
        }
        catch (IOException ex){
            System.out.println(ex);
        }
    }
    public static void main(String[] args) {
        //to handling files buffered reader is more efficiently
        FileReader freader = null;
        FileWriter fwriter = null;
        BufferedReader bfr=null;
        BufferedWriter bfw = null;
        List<String> list = new ArrayList();
        try{
             bfr = new BufferedReader(new FileReader("exam1.txt"));
            String line = null;

            while ((line=bfr.readLine())!=null){
                list.add(line);
            }

            bfr.close();
            bfw = new BufferedWriter(new FileWriter("exam2.txt"));
            for (String str:list
                 ) {
                bfw.write(str);
            }
            bfw.flush();
            bfw.close();

            withFileReaderAndFileWritter(fwriter,freader);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
        finally {
            try{
                if (bfr!=null) bfr.close();
                if (bfw!=null) bfw.close();
                if (freader!=null) freader.close();
                if (fwriter!=null) fwriter.close();
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }
}
