package day13;

import java.util.Date;

public class Message {
    private final User sender;
    private final User receiver;
    private final String text;
    private final Date data;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.data= new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\nTO: " + this.receiver + "\nON: " + this.data + "\n" + this.text + "\n";
    }
}