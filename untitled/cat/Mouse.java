package cat;

import java.util.Random;

public class Mouse {
    Random mouseSpeedRand = new Random();
    int mouseSpeed;

    public Mouse()
    {
        this.mouseSpeed = mouseSpeedRand.nextInt(80) + 1;
    }
    public int getMouseSpeed() {
        return mouseSpeed;
    }

    public void setMouseSpeed(int mouseSpeed) {
        this.mouseSpeed = mouseSpeed;
    }

    public Random getMouseSpeedRand() {
        return mouseSpeedRand;
    }

    public void setMouseSpeedRand(Random mouseSpeedRand) {
        this.mouseSpeedRand = mouseSpeedRand;
    }
}

