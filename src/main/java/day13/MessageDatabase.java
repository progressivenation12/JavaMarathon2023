package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static final List<Message> messages =  new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User sender, User receiver) {
        for (Message message : messages) {
            if (message.getSender() == sender && message.getReceiver() == receiver
                    || message.getSender() == receiver && message.getReceiver() == sender) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}