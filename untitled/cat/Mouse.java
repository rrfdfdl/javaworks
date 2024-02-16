package cat;

import java.util.Random;

public class Mouse {
    Random mouseSpeedRand = new Random();
    int mousespeed = mouseSpeedRand.nextInt(60) + 1;
}
