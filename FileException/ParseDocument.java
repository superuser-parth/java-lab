package FileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import FileException.DataLoadException;

public class ParseDocument {
    File myFile;
    public ParseDocument(File myFile){
        this.myFile = myFile;
    } 

    public void readFile() throws DataLoadException{
        try(Scanner parsedFile = new Scanner(myFile)){
            while(parsedFile.hasNextLine()){
                String data = parsedFile.nextLine();
                System.out.println(data);
            }
        }catch(IOException e){
            throw new DataLoadException("Failed to load data", e);
        }
    }

}
