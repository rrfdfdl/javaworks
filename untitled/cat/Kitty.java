package cat;

import java.util.Random;

public class Kitty {

    private String name;
    private int weight;
    private int speed;
    Random kittyRand = new Random();
    private int capturedmice;

    public Kitty(String name) {
        this.name = name;
        this.weight = kittyRand.nextInt(100) + 1;
        this.speed = kittyRand.nextInt(100) + 1;
        this.capturedmice = 0;
    }

    public String getName(){
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapturedmice() {
        return capturedmice;
    }

    public void setCapturedmice(int capturedmice) {
        this.capturedmice = capturedmice;
    }
}


