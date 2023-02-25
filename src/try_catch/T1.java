package try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T1 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\Hakan Batırhan\\Desktop\\proje1\\kodlar");
            int i = 0;
            while ((i = f.read()) != -1) {
                System.out.print((char) i);
            }
            f.close();
        } catch(FileNotFoundException e) {
            System.out.println("Most probably path is wrong or someone deleted my file");
        } catch(IOException e) {
            System.out.println("Text could not be read or the file could not be closed");
        } finally {
            System.out.println("Do not forget to close the file!");
        }
    }
 /*   Hangisi doğrudur?
    A) File silinmis ise output
    Most probably path is wrong or someone deleted my file
    Do not forget to close the file!
    B) Path doğru ve file silinmemis ise output just the text inside the file
    C) Compile Time Error verir
    D) Run Time Error verir */

}
