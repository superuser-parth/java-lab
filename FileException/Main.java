package FileException;
import java.io.File;

public class Main {
    public static void main(String[] args){
        File myFile = new File("testText.txt");
        ParseDocument parser = new ParseDocument(myFile);

        try{
            parser.readFile();
        }catch(DataLoadException e){
            System.err.println("Root Cause: " + e.getCause().getMessage());
        }
    }
}
