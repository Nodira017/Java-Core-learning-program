package javaSreams;

import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class FilterStreamss {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        CustomFilterOutputStream cfilterOut = null;
        try{
            fout = new FileOutputStream("exam1.txt");
            cfilterOut = new CustomFilterOutputStream(fout);

            for (int i = System.in.read(); i !=10 ; i=System.in.read()) {
                cfilterOut.write(i);
            }
        }
        catch (IOException ex){
            System.out.println(ex);
        }
        finally {
            try{
                if(fout!=null)
                fout.close();
            }
            catch (IOException ex){
                System.out.println(ex);
            }
        }
    }
}
