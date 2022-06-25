package bookTests;

import book.BookPostfixAppender;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BookAuthorPostfixAppenderTest {


    @Test
    public void shouldCorrectlyAppendPostfixToAuthor() {
        // given
        BookPostfixAppender book = new BookPostfixAppender();

        // when
        String result = book.addPostfixToText("master", "jr");

        // then
        assertThat(result).isEqualTo("master jr");


    }

}