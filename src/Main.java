import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args){
            boolean filterinfo = false;
            boolean filtererror = false;
            boolean filterwarn = false;
        for (String arg : args){
            switch (arg.toUpperCase()){
                case "--INFO":
                    filterinfo = true;
                    break;
                case "--ERROR":
                    filtererror = true;
                    break;
                case "--WARN":
                    filterwarn = true;
                    break;

            }
        }
        logAnalyser analyser = new logAnalyser();
        analyser.read_file("test/log.txt", filterinfo,filtererror, filterwarn);


    }

    }

