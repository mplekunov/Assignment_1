/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Mikhail Plekunov
 */

public class Quote {
    private String author;
    private String quote;

    public Quote(String author, String quote) {
        this.quote = quote;
        this.author = author;
    }


    public String getFormattedQuote() {
        return new String(author + " says, \"" + quote + '\"');
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
