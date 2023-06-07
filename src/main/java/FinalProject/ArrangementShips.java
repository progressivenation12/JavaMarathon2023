package FinalProject;

import java.util.Random;

public class ArrangementShips {
    static int shipSize;                               //размер корабля
    static int shipAmount;                             //количество кораблей
    static int shipRoute;                              //направдение корабля (горизонтальное или вертикальное)
    static int fieldString;                            //строка поля боя
    static int fieldColumn;                            //столбец поля боя
    static int[][] battlefield = new int[12][12];      //поле боя
    static boolean canPut;                             //разрешение ставить корабль

    public static void main(String[] args) {
        for (shipSize = 4; shipSize >= 1; shipSize--) {
            for (shipAmount = 1; shipAmount <= 5 - shipSize; shipAmount++) {
//                System.out.println("Расставляем корабль размером " + shipSize);

                do {
                    fieldString = getRandomNumber(1, 10);
                    fieldColumn = getRandomNumber(1, 10);
                    shipRoute = getRandomNumber(0, 1);

//                    switch (shipRoute) {
//                        case (0) ->
//                                System.out.printf("  Координаты корабля: %2d,%2d. Направление гризонталь.\n", fieldString, fieldColumn);
//                        case (1) ->
//                                System.out.printf("  Координаты корабля: %2d,%2d. Направление вертикаль.\n", fieldString, fieldColumn);
//                    }

                    canPut = abilityPutShip(fieldString, fieldColumn, shipRoute, shipSize);

                    if (canPut) {
                        putShip(fieldString, fieldColumn, shipRoute, shipSize);
                    }

                } while (!canPut);
            }
        }

        System.out.println();
        for (int i = 1; i < battlefield.length - 1; i++) {
            int[] ints = battlefield[i];
            for (int j = 1; j < ints.length - 1; j++) {
                int anInt = ints[j];
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    static boolean abilityPutShip(int fieldString, int fieldColumn, int shipRoute, int shipSize) {

        if (shipRoute == 0) {
            if (fieldColumn + shipSize > 11) {
                return false;
            }
        }

        if (shipRoute == 1) {
            if (fieldString + shipSize > 11) {
                return false;
            }
        }

        for (int i = 0; i < shipSize; i++) {
            if (battlefield[fieldString][fieldColumn] != 0) {
                return false;
            }

            if (shipRoute == 0) {           //направление по горизонтали
                fieldColumn += 1;
            } else if (shipRoute == 1) {    //направление по вертикали
                fieldString += 1;
            }
        }
        return true;
    }

    static void putShip(int fieldString, int fieldColumn, int shipRoute, int shipSize) {
        //занимаем поле вокруг будующего корабля
        if (shipRoute == 0) {               //направление по горизонтали
            for (int i = fieldString - 1; i <= fieldString + 1; i++) {
                for (int j = fieldColumn - 1; j <= fieldColumn + shipSize; j++) {
                    battlefield[i][j] = 5;
                }
            }
        } else if (shipRoute == 1) {        //направление по вертикали
            for (int i = fieldString - 1; i <= fieldString + shipSize; i++) {
                for (int j = fieldColumn - 1; j <= fieldColumn + 1; j++) {
                    battlefield[i][j] = 5;
                }
            }
        }
        //занимаем ячейки для корабля на поле
        for (int k = 0; k < shipSize; k++) {
            battlefield[fieldString][fieldColumn] = shipSize;
            if (shipRoute == 0) {
                fieldColumn += 1;           //направление по горизонтали
            } else if (shipRoute == 1) {
                fieldString += 1;           //направление по вертикали
            }
        }
    }

    static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}