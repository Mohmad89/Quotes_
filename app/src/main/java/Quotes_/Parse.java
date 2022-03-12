package Quotes_;
import Quotes_.Contact;
import com.google.gson.Gson;

import java.io.InputStream;
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

    public Contact chooseQuote () {
        Random random = new Random();
        int low = 0;
        int high = contactArray.length;
        int result = random.nextInt(high-low) + low;
        return contactArray[result];
    }

    // Read File That Found Inside Resource Folder
    private InputStream getFileAsIOStream(final String fileName)
    {
        InputStream ioStream = this.getClass().getClassLoader().getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }
}
