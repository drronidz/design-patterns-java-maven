package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/18/2021 12:03 AM
*/

import java.util.Arrays;
import java.util.Iterator;

public class BookStore implements BookCollection{
    protected static int MAX_BOOKS = 1000;
    protected int totalBooks;
    protected final Book[] books;

    public BookStore() {
        super();
        books = new Book[MAX_BOOKS];
    }

    public boolean addBook(String language, String title, String author, long ISBN, double price) {
        Book book = new Book(language, title, author, ISBN, price);
        if(totalBooks < (MAX_BOOKS - 1)) {
            books[totalBooks++] = book;
            return Boolean.TRUE;
        } else {
            System.out.println("BookStore is full and we can't accept any more books!");
            return Boolean.FALSE;
        }
    }

    public boolean addBook(Book book) {
        if(totalBooks < (MAX_BOOKS - 1)) {
            books[totalBooks++] = book;
            return Boolean.TRUE;
        } else {
            System.out.println("BookStore is full and we can't accept any more books!");
            return Boolean.FALSE;
        }
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
        // return Arrays.stream(books).iterator();
        // or simply use the below line to avoid writing explicit implementation of the iterator class.
        // return Arrays.stream(books).iterator();
    }
}
