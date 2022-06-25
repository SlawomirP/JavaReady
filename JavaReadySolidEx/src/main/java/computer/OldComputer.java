package computer;

public class OldComputer {
    private final Keyboard keyboard; // tutaj wskazujemu ogólny interfejs np keyboard
    // musi implementowac go oczywiscie wiredkeyboard
    private final Monitor monitor;

    public OldComputer (Keyboard keyboard, Monitor monitor) { // do konstruktora dodajemy parametry z naszych interfejsow
        // dzięki temu będzie to uniwersalne a nie ukierunkowane na konkretne obiekty
        this.keyboard = keyboard; // deklarujemy juz konkretna klawiature
        this.monitor = monitor; // tu konkretny monitor
    }

    public void start () {
        // start computer
        System.out.println("started");
    }
}
