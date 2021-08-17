package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 11:57 PM
*/


import java.util.Iterator;

public class BookIterator implements Iterator<Book> {

    protected Book[] books;
    protected int currentBook = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return (currentBook < books.length &&  books[currentBook] != null);
    }

    @Override
    public Book next() {
        return books[currentBook++];
    }
}
