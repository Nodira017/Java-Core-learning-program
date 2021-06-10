package javaSreams;

import java.io.*;

public class BufferedStreamss {

    public static void main(String[] args) {
        BufferedInputStream bin=null;
        BufferedOutputStream bout=null;
        try{
            bin=new BufferedInputStream(new FileInputStream("exam1.txt"));
            byte [] date = new byte[bin.available()];
            bin.read(date);
            bin.close();
            bout = new BufferedOutputStream(new FileOutputStream("exam1.txt"));
            for (int i = 0; i < date.length ; i++) {
                if (date[i]>48&&date[i]<57){
                    bout.write(date[i]);
                }
                else bout.write('?');
            }
//             for (int i=bin.read(); i!=-1; i=bin.read()){
//                 bout.write(i);
//             }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
        finally {
            try{ if (bin!=null) bin.close();
                if (bout!= null) bout.close();
            }
                catch (IOException ex){
                    System.out.println(ex);
                }
        }
    }
}
