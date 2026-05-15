import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class logAnalyser{
    public void read_file(String filename, boolean boolfilterinfo, boolean boolfiltererror){

        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while( (line = br.readLine()) != null){

            
                if (boolfilterinfo && line.contains("INFO")){
                    System.out.println( line);
                }
                if (boolfiltererror && line.contains("ERROR")){
                    System.out.println( line);
                }
            }

        }        

        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }

    }
}