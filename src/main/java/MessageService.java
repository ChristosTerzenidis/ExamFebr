public class MessageService {
    private final Network network;

    public MessageService(Network network) {
        this.network = network;
    }

    public boolean SendMessage() {
        return this.network.sendMessage("ip", "msg");
    }
}
