package dev.italoseara.Ex03.bookstorebook;

import dev.italoseara.Ex03.book.Book;

public class BookStoreBook extends Book {
    private int price;
    private int stock;

    public BookStoreBook(String title, String author, int pages, int year, int price, int stock) {
        super(title, author, pages, year);
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public void sell(int quantity) {
        if (!this.isAvailable())
            return;

        this.stock -= quantity;
    }

    public void sell() {
        this.sell(1);
    }

    public void restock(int qantity) {
        this.stock += qantity;
    }

    public void restock() {
        this.restock(1);
    }

    public boolean isAvailable() {
        return this.stock > 0;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d", super.toString(), this.price, this.stock);
    }
}
