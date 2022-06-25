package bookTests;

import book.BookAuthorRemaker;
import book.BookPostfixAppender;
import book.BookPrefixAppender;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BookAuthorRemakerTest {

    @Test

    public void shouldAddPrefixAndPostfixToAuthor (){
        //given
        // klasa bedzie wykorzystywała pre i post fixa dlatego dajemy to tez w givena
        BookPrefixAppender prefix = new BookPrefixAppender();
        BookPostfixAppender postfix = new BookPostfixAppender();
        // i objekt testowanej klasy
        BookAuthorRemaker object = new BookAuthorRemaker(prefix,postfix);

        // when
        String result = object.addPrefixPostfix("mr", "java", "ready");

        // than
        assertThat(result).isEqualTo("mr java ready");
    }

}