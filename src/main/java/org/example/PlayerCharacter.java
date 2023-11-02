package org.example;

public class PlayerCharacter {



    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static int move(String input) {
        if (input == "w") {

            return 1;
        } else if (input == "s") {
            return -1;
        } else if (input == "d") {
            return 1;
        }
        return 0;
    }
}
