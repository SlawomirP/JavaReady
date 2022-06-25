package book;

import book.BookPostfixAppender;
import book.BookPrefixAppender;

public class BookAuthorRemaker {
    BookPrefixAppender prefixObj;
    BookPostfixAppender postfixObj;

    public BookAuthorRemaker(BookPrefixAppender prefix, BookPostfixAppender postfix) {
        this.prefixObj = prefix;
        this.postfixObj = postfix;

    }

    public String addPrefixPostfix(String prefix, String author, String postfix) {
        // na objekcie klasy book prefix appender wykorzystujemy metode tworzac prefix i autora, nastepnie do tego dodamy postfix
        String autorPlusPrefix = prefixObj.addPrefixToAuthor(prefix, author);
        String authorPlusPrefixAndPostfix = postfixObj.addPostfixToText(autorPlusPrefix, postfix);
        return authorPlusPrefixAndPostfix;
    }
}
