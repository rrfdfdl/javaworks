package cat;

import java.util.Random;

public class Kitty {
    public static void kitty(String[] args) {
        Random weightrand = new Random();
        int weight = weightrand.nextInt(100) + 1;

        Random speedrand = new Random();
        int speed = speedrand.nextInt(50) + 1;

        int capturedmice = 0;
    }
}
