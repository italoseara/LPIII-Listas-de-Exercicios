package dev.italoseara.Ex03.book;

public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d", this.title, this.author, this.pages, this.year);
    }

    public boolean isOlderThan(Book other) {
        return this.year < other.year;
    }
}
