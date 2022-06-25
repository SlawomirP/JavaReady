package computer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldComputerTest {

    @Test
    public void testDependencyInversion () {
        final OldComputer oldComputer = new OldComputer(new WiredKeyboard(), new AsusMonitor());

        oldComputer.start();
    }

    @Test
    public void testDependencyInversion2 () { // dajemy inne parametry, samo zaimplementuje interfejsy
        final OldComputer oldComputer = new OldComputer(new WirelessKeyboard(), new AsusMonitor());

        oldComputer.start();
    }

}