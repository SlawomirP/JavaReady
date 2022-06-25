package bookTests;

import book.BookPrefixAppender;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BookAuthorPrefixAppenderTest {

    // pierwszy test
    @Test
    public void shouldCorrectlyAppendPrefixToAuthor() {
        // given wykorzystanie klasy którą stworzymy (tej testowanej, ta ktora bedzie odpowiedzialna za dodawanie
        // prefiksów), tworzymy obiekt
        // alt enter i tworzymy sobie klase do prefiksów w folderze z Book
        BookPrefixAppender book = new BookPrefixAppender();

        // when - na book wywołujemy metodę której jeszcze nie mamy, planujemy zrobic, w parametry piszemy to co
        // planujemy
        // zminic, tutaj nasz prefix i autora do ktorego go dodamy
        // i ta metoda juz zwraca nam stringa tak ze opakowujemy to
        String authorWitchPrefix = book.addPrefixToAuthor("mr", "author");

        // then - opisujemy rezultat, przy assert that trzeba zaimportowac biblioteke asertJ
        // w maven w pom.xml trzeba dodac linijke kodu w dependency, uaktualnic maven ikonka
        // import static metode i co ma sprawdzic to bierzemy wynik ktory zwróci i to co oczekujemy co nam zwróci i
        // wstawiamy do parametrow metody
        assertThat(authorWitchPrefix).isEqualTo("mr author");

        // następnie odpalamy test ikoną start
    }

}