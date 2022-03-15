package Quotes_;

public class Quote {

    private String author;
    private String body;

    public Quote(String author, String body) {
        this.author = author;
        this.body = body;
    }

    public String getAuthor () {
        return author;
    }

    public String getBody () {
        return body;
    }



    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
