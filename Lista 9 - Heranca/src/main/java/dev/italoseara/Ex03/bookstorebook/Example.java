package dev.italoseara.Ex03.bookstorebook;

public class Example {
    public static void main(String[] args) {
        BookStoreBook b1 = new BookStoreBook("The Lord of the Rings", "J. R. R. Tolkien", 1000, 1954, 10, 20);

        System.out.println(b1);
        System.out.println(b1.getPrice());
        System.out.println(b1.getStock());
        System.out.println(b1.isAvailable());
        b1.sell(5);

        System.out.println(b1);
    }
}
