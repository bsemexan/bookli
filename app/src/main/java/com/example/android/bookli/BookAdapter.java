package com.example.android.bookli;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by beryy on 8/19/16.
*/
public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter (Activity context, ArrayList<Book> books){
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View bookItemView = convertView;

        if(bookItemView == null)
        {
            bookItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_view, parent, false);
        }

        final Book currentBook = getItem(position);

        TextView titleTextView = (TextView) bookItemView.findViewById(R.id.title_field);
        titleTextView.setText(currentBook.getTitle());

        TextView authorTextView = (TextView) bookItemView.findViewById(R.id.author_field);
        authorTextView.setText(currentBook.getAuthor());

        return bookItemView;
    }
}
