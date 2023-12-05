package dev.italoseara.Ex03.librarybook;

public class Example {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("The Lord of the Rings", "J. R. R. Tolkien", 1000, 1954);

        System.out.println(b1);

        b1.borrow();

        System.out.println(b1.isAvailable());
        System.out.println(b1.getDevolutionDate());
    }
}
