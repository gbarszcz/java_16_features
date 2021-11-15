package org.gb;

import org.gb.classes.Author;
import org.gb.classes.Book;
import org.gb.patternmatching.PatternMatching;
import org.gb.records.AuthorAsRecord;
import org.gb.records.BookAsRecord;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Guns of Navarona", new Author("Alistair", "MacLean")),
                new Book("The Looking Glass War", new Author("John", "Le Carre")),
                new Book("Hamlet", new Author("William", "Shakespeare"))
        );
        books.forEach(System.out::println);

        List<BookAsRecord> booksAsRecords = Arrays.asList(
                new BookAsRecord("Guns of Navarona", new AuthorAsRecord("Alistair", "MacLean")),
                new BookAsRecord("The Looking Glass War", new AuthorAsRecord("John", "Le Carre")),
                new BookAsRecord("Hamlet", new AuthorAsRecord("William", "Shakespeare"))
        );
        booksAsRecords.forEach(System.out::println);

        BookAsRecord someBook = booksAsRecords.get(0);
        System.out.println(someBook.publicationDate());
        System.out.println(BookAsRecord.staticFunction());
        System.out.println(someBook.instanceMethod());

        Object s = "some String";
        Object sb = new StringBuilder("some StringBuilder");
        PatternMatching.oldWay(s);
        PatternMatching.newWay(sb);
    }
}
