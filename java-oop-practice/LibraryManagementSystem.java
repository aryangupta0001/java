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

class Book{
    int id;
    String title;
    String author;

    Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

class Member{
    int id;
    String name;

    Member(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Library{
    ArrayList <Book> books = new ArrayList<>();
    ArrayList <Member> members = new ArrayList<>();

    void addBook(Book book){
        books.add(book);
    }

    void addMember(Member member){
        members.add(member);
    }

    void listBooks(){
        for(Book book : books){
            System.out.println(book.id + "\t" + book.title + "\t" + book.author);
        }
    }

    void listMember(){
        for(Member member : members){
            System.out.println(member.id + "\t" + member.name);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library  = new Library();

        library.addBook(new Book(1, "Let us C", "abc"));
        library.addBook(new Book(2, "All in One Physics" ,"def"));

        library.addMember(new Member(1, "Arvind"));
        library.addMember(new Member(2, "Tarun"));

        library.listBooks();
        library.listMember();
    }
}