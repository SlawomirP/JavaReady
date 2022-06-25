package information;

import java.util.List;

public class EmailSender implements Informable, ViewCount {
    @Override
    public void sendMessage(List<String> messages) {

    }

    @Override
    public int getSeenCount() {
        return 0;
    }
}
