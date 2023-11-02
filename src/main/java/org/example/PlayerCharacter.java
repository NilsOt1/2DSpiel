package org.example;

import java.util.Objects;

public class PlayerCharacter {

    static int y = 0;
    static int x = 0;

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static int move(String input) {
        if (input == "w") {
            return y++;
        } else if (input == "s") {
            return y--;
        } else if (input == "d") {
            return x++;
        } else if (input == "a") {
            return x--;
        }
        return 0;
    }
}
