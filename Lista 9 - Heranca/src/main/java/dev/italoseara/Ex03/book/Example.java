package dev.italoseara.Ex03.book;

public class Example {
    public static void main(String[] args) {
        Book b1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1000, 1954);
        Book b2 = new Book("The Hobbit", "J. R. R. Tolkien", 300, 1937);

        System.out.println(b1);
        System.out.println(b2);
    }
}
