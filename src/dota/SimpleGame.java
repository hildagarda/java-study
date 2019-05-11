package dota;

import java.util.Random;

public class SimpleGame {

    public static void main(String[] args) {
        String heros[] = new String[]{
                "axe", "io", "doom", "tide", "slark", "storm", "naix", "sven", "mk", "sf"
        };
        String player1 = heros [getRandomNumber(10)] ;
        String player2 = heros [getRandomNumber(10)] ;
        System.out.print("герои доступные для ввода: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(heros[i]);
            if (i != 9) {
                System.out.print(", ");
            }

        }
        System.out.println();
        System.out.println("игрок1 получает героя:"+player1);
        System.out.println("игрок2 получает героя:"+player2);
    }


    /* Return random number from 0 to bound */
    private static int getRandomNumber(int bound) {
        Random r = new Random();
        return r.nextInt(bound);
    }



}

