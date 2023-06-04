package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("User_1");
        User user2 = new User("User_2");
        User user3 = new User("User_3");

        user1.sendMessage(user2, "Hello from User_1!");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, User_1!");
        user2.sendMessage(user1, "I'm User_2. Nice to meet you.");
        user2.sendMessage(user1, "I'm fine,and you?");

        user3.sendMessage(user1, "Hey! My name is User_3.");
        user3.sendMessage(user1, "Do you remember me?");
        user3.sendMessage(user1, "We went to the same school.");

        user1.sendMessage(user3, "Hey, User_3. Of course I remember you!");
        user1.sendMessage(user3, "So nice to see you again.");
        user1.sendMessage(user3, "Let's meet up. Are you free tomorrow?");

        user3.sendMessage(user1, "Yep, I'm free tomorrow. Let's go.");

        MessageDatabase.showDialog(user1, user3);
    }
}