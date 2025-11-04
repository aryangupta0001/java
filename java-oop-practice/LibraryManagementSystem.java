/*
🎯 Java OOP Task

Create a Library Management System (Step-1 version)

👉 Just implement these:

Classes

Book (id, title, author)

Member (id, name)

Library

ArrayList<Book> books

ArrayList<Member> members

Methods
Method	Function
addBook()	Add a book to library
addMember()	Add new member
listBooks()	Print all books
listMembers()	Print all members

📌 No issuing/returning book yet. We'll add that tomorrow.

*/

import java.util.ArrayList;

class Book {
    int id;
    String title;
    String author;

    Boolean isIssued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

class Member {
    int id;
    String name;

    ArrayList<Book> issuedBooks = new ArrayList<>();

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void addMember(Member member) {
        members.add(member);
    }

    void listBooks() {
        for (Book book : books) {
            System.out.println(book.id + "\t" + book.title + "\t" + book.author);
        }
    }

    void listMember() {
        for (Member member : members) {
            System.out.println(member.id + "\t" + member.name);
        }
    }

    void issueBook(Book b, Member m) throws BookNotAvailableException {

        if (b.isIssued)
            // System.out.println(b.title + "is already Issued !");
            throw new BookNotAvailableException(b.title + " is already Issued !");

        else {
            m.issuedBooks.add(b);
            b.isIssued = true;
            System.out.println(b.title + " issued to " + m.name);
        }
    }

    void returnBoook(Book b, Member m) {
        if (!b.isIssued)
            System.out.println("Book is not issued to anyone");

        else if (m.issuedBooks.remove(b)) {
            b.isIssued = false;
            System.out.println(b.title + "Returned by " + m.name);
        }

        else
            System.out.println("Cannot return ! Book was not issued to " + m.name);

    }
}

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book(1, "Let us C", "abc");
        Book b2 = new Book(2, "All in One Physics", "def");

        library.addBook(b1);
        library.addBook(b2);

        Member m1 = new Member(1, "Arvind");
        Member m2 = new Member(2, "Tarun");

        library.addMember(m1);
        library.addMember(m2);

        try {
            library.issueBook(b1, m1);
        } catch (BookNotAvailableException e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            library.issueBook(b1, m2);
        } catch (BookNotAvailableException e) {
            System.out.println("Error : " + e.getMessage());
        }

        library.returnBoook(b2, m2);
        library.returnBoook(b1, m2);
        library.returnBoook(b1, m1);

        library.listBooks();
        library.listMember();
    }
}