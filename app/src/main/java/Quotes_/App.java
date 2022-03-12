package Quotes_;


public class App {

    public static void main(String[] args) {

        Parse readFile = new Parse();
        readFile.readFile();
        System.out.println(readFile.chooseQuote());

    }
}
