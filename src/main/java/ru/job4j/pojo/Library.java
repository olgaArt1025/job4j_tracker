package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("The Master and Margarita", 203);
        Book secondBook = new Book("Dead souls", 145);
        Book thirdBook = new Book("Clean code", 0);
        Book fourthBook = new Book("War and peace", 569);
        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getCount());
        }
        System.out.println("Replace books with index 0 and 3.");
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (Book b : books) {
            System.out.println(b.getName() + " - " + b.getCount());
        }
        System.out.println("Books named \"Clean code\".");
        for (Book b : books) {
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " - " + b.getCount());
            }
        }
    }
}
