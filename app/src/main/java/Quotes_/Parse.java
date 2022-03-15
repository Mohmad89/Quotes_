package Quotes_;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Parse {

    private Contact [] contactArray;

    public void readFile ()  {
        Scanner scanner = new Scanner(getFileAsIOStream("Recentquotes.json"));
        scanner.hasNextLine();
        String jasonFormat = "";
        while (scanner.hasNext()){
            jasonFormat += scanner.nextLine();
        }
        scanner.close();

        Gson gson = new Gson();
        contactArray = gson.fromJson(jasonFormat, Contact[].class);



    }
    public boolean apiChooseQuote () throws IOException {

        // get json data
        URL url = new URL ("https://favqs.com/api/qotd");

        //making a connection to the API
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        //specify the method for the connection
        connection.setRequestMethod("GET");

        // Read the response from the API
        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String APIData = bufferedReader.readLine();

        // parse data into java object
        Gson gson = new Gson();
        QuoteData quoteData = gson.fromJson(APIData, QuoteData.class);
        System.out.println(quoteData);

        // save the response from API to a file
        File quoteFile = new File ("./data.json") ;
        try (FileWriter quoteFileWriter = new FileWriter(quoteFile)) {
            gson.toJson(quoteData, quoteFileWriter);
            }

        if (quoteData != null){
            return true;
        }else {
            return false;
        }
        }


    public Contact fileChooseQuote() {

        Random random = new Random();
        int low = 0;
        int high = contactArray.length;
        int result = random.nextInt(high-low) + low;
        return contactArray[result];
    }

    // Read File That Found Inside Resource Folder
    public InputStream getFileAsIOStream(final String fileName)
    {
        InputStream ioStream = this.getClass().getClassLoader().getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }
}
