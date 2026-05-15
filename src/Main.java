import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args){
        int linecount = 0;

        
        try (BufferedReader br = new BufferedReader(new FileReader("test/log.txt"))){
            String line;
            while( (line = br.readLine()) != null){

            
                if (line.contains("INFO")){
                    System.out.println( line);
                }
            }

        }        

        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }

    }
}