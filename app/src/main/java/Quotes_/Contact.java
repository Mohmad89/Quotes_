package Quotes_;

import java.util.Arrays;

public class Contact {

    private String author;
    private String text;

    //Constructor

    public Contact( String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
