package day07;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0) {
            return;
        }

        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int playersOnField = 6 - countPlayers;
            String freePlace = "";

            switch (playersOnField) {
                case 1 -> freePlace = " свободное место.";
                case 2, 3, 4, 5, 6 -> freePlace = " свободных места.";
            }

            System.out.println("Команды неполные. На поле еще есть " + playersOnField + freePlace);
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}