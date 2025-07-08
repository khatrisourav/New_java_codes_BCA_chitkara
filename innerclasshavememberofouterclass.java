class ChatSession {
    private String chatId;
    private String userName;

    ChatSession(String chatId, String userName) {
        this.chatId = chatId;
        this.userName = userName;
    }

    class MessageFormatter {
        String format(String message) {
            return "[" + chatId + "] " + userName + ": " + message;
        }
    }

    void sendMessage(String message) {
        MessageFormatter formatter = new MessageFormatter();
        String formatted = formatter.format(message);
        System.out.println("Sending: " + formatted);
    }
}

public class innerclasshavememberofouterclass {
    public static void main(String[] args) {
        ChatSession session = new ChatSession("CHAT123", "Amit");
        session.sendMessage("Hello, how are you?");
    }
}
