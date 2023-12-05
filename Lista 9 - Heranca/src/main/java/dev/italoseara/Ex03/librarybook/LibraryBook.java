package dev.italoseara.Ex03.librarybook;

import dev.italoseara.Ex03.book.Book;

import java.util.Date;

public class LibraryBook extends Book {
    private boolean borrowed;
    private Date devolutionDate;

    public LibraryBook(String title, String author, int pages, int year) {
        super(title, author, pages, year);
        this.borrowed = false;
        this.devolutionDate = null;
    }

    public boolean isAvailable() {
        return !this.borrowed;
    }

    public Date getDevolutionDate() {
        return this.devolutionDate;
    }

    public void borrow() {
        if (!this.isAvailable())
            return;

        this.borrowed = true;

        // 604800000 = 7 days in milliseconds
        Date now = new Date();
        this.devolutionDate = new Date(now.getTime() + 604800000);
    }

    public void devolve() {
        this.borrowed = false;
        this.devolutionDate = null;
    }

    @Override
    public String toString() {
        return String.format("%s, %b, %s", super.toString(), this.isAvailable(), this.getDevolutionDate());
    }
}
