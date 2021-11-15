package org.gb.records;

import org.gb.common.IBook;

import java.util.Date;

public record BookAsRecord(String title, AuthorAsRecord author) implements IBook {
    public static String staticFunction() {
        return "I am a static function!";
    }

    public String instanceMethod() {
        return "I am an instance method!";
    }

    public BookAsRecord {
        if (author.lastName().equals("Shakespeare")) {
            System.out.println(title + " - it's a classic!");
        }
    }

    @Override
    public Date publicationDate() {
        return new Date();
    }
}
