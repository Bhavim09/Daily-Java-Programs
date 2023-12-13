import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderException {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            File file = new File("file.txt");
            fr  = new FileReader(file);
            char[] ch = new char[50];
            fr.read(ch);
        }
        catch(Exception e)
        {
            System.out.println("Inside catch block");
            e.printStackTrace();
        }
        finally
        {
            try{
                System.out.println("Inside finally");
                fr.close();
            }
            catch(IOException exception)
            {   
                exception.printStackTrace();
            }
        }
    } 
}