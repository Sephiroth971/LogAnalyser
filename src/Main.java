import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args){
            boolean filterinfo = false;
            boolean filtererror = false;
        if (args.length >0 && args[0].equalsIgnoreCase("--INFO")){
            filterinfo = true;

        }
        if (args[0].equalsIgnoreCase("--ERROR")){
            filtererror = true;

        }
        logAnalyser analyser = new logAnalyser();
        analyser.read_file("test/log.txt", filterinfo,filtererror);


    }

    }

