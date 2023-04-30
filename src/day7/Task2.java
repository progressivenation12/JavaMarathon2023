package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(93);
        Player player2 = new Player(95);
        Player player3 = new Player(91);

        Player.info();

        Player player4 = new Player(93);
        Player player5 = new Player(100);

        Player.info();

        Player player6 = new Player(90);

        Player.info();

        for (int i = 0; i < 100; i++) {
            player1.run();
            player2.run();
            player3.run();
            player4.run();
            player5.run();
            player6.run();
        }

        Player.info();
    }
}