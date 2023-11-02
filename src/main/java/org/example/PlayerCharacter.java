package org.example;

public class PlayerCharacter {



    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static int move(String inputUp) {
        if (inputUp == "w") {

            return 1;
        }
        return 0;
    }
}
