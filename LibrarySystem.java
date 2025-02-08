package com.example;

class Book {
    protected String title;
    protected String author;
    protected String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String ISBN, String genre) {
        super(title, author, ISBN);
        this.genre = genre;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Fiction Book: Title: \"" + title + "\", Author: " + author + ", Genre: " + genre);
    }
}

class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String ISBN, String subject) {
        super(title, author, ISBN);
        this.subject = subject;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Non-Fiction Book: Title: \"" + title + "\", Author: " + author + ", Subject: " + subject);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Hobbit", "J.R.R. Tolkien", "123456789", "Fantasy");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari", "987654321", "History");

        fiction.displayBookInfo();
        nonFiction.displayBookInfo();
    }
}