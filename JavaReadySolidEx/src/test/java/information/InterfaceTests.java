package information;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InterfaceTests {

    @Test
    public void myTest () {

        // tworzymy zmienna testowanego intefejsu
        Informable informable;

        // tworzymy zmienne z klas ktore implementuja ten interfejs
        EmailSender emailSender = new EmailSender();
        GaduGaduSender gaduGaduSender = new GaduGaduSender();

        // zgodnie z zasada L
        informable = emailSender;
        // wywołanie metod ktore implamentuje emailsender z interface
        informable.sendMessage(Arrays.asList("Czesc"));

        // test przechodzi i teraz mozna podstawic obiekt z drugiej klasy
        informable = gaduGaduSender;
        informable.sendMessage(Arrays.asList("Czesc"));

        // dla drugiego interfejsu tylko klasa EmailSender
        ViewCount viewCount;

        viewCount = emailSender;
        viewCount.getSeenCount();


    }

}