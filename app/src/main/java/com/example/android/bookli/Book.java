package com.example.android.bookli;

/**
 * Created by beryy on 8/19/16.
 */
public class Book {

    public final String author;

    public final String title;

    public Book(String BookAuthor, String BookTitle){
        author = BookAuthor;
        title = BookTitle;
    }

    public String getAuthor() {

        return author;
    }

    public String getTitle() {
        return title;
    }
}



