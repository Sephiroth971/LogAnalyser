import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class logAnalyser{
    public void read_file(String filename, boolean boolfilterinfo, boolean boolfiltererror, boolean boolfilterwarn){

        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while( (line = br.readLine()) != null){

            
                if (boolfilterinfo && line.contains("INFO")){
                    System.out.println( line);
                }
                else if (boolfiltererror && line.contains("ERROR")){
                    System.out.println( line);
                }
                else if (boolfilterwarn && line.contains("WARN")){
                    System.out.println(line);
                }
            }

        }        

        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }

    }
}