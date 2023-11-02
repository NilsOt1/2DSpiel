package org.example;

import java.util.Objects;

public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String input) {
        if (Objects.equals(input, "w")) {
            y++;
        } else if (Objects.equals(input, "s")) {
            y--;
        } else if (Objects.equals(input, "d")) {
            x++;
        } else if (Objects.equals(input, "a")) {
            x--;
        }
    }
}
