package Quotes_;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {

    public static void main(String[] args) throws IOException {
        // 1) read json file and convert it to java object
//        Parse readFile = new Parse();
//        readFile.readFile();
//        System.out.println(readFile.fileChooseQuote());

        // 2) read json api and convert it to java object and store it inside json file
        Parse APIRead = new Parse();
        APIRead.apiChooseQuote();



    }
}
