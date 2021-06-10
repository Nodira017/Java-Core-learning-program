package Files;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        String filestr = "text.txt";
        String filestr2 = "str2.txt";
        String dirstr = "C:/Users/HP/IdeaProjects/learnJavaCore/src/dirr";
        try {
            // constructor
            File dir = new File(dirstr);
            System.out.println(dir.mkdirs());
            File file = new File(dir, filestr);
            File file2 = new File(dirstr, filestr);
            File f = new File(filestr2);

            //methods
            System.out.println(f.createNewFile());
            System.out.println("can exacute  " + file.canExecute());
            System.out.println("can read  " + file.canRead());
            System.out.println("can write  " + file.canWrite());
            System.out.println("compare f1 and f2  " + file.compareTo(file2));
            System.out.println("exist?  " + file.exists());
            System.out.println("Absolute path " + file.getAbsolutePath());
            System.out.println("get free space  " + file.getFreeSpace());
            System.out.println("get parent file" + file.getParentFile());
            System.out.println("is dir " + file.canRead());
            System.out.println("list  " + file.list());
            System.out.println("listFiles  " + file.listFiles());
            System.out.println("lenght of file  " + file.length());
            System.out.println(f.delete());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}
