import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args){
            boolean filterinfo = false;
            boolean filtererror = false;
            boolean filterwarn = false;
        if (args.length >0 && args[0].equalsIgnoreCase("--INFO")){
            filterinfo = true;

        }
        else if (args[0].equalsIgnoreCase("--ERROR")){
            filtererror = true;

        }
        else if (args[0].equalsIgnoreCase("--WARN")){
            filterwarn = true ;
        }
        logAnalyser analyser = new logAnalyser();
        analyser.read_file("test/log.txt", filterinfo,filtererror, filterwarn);


    }

    }

