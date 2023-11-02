package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerCharacterTest {

    @Test
    void getX_whenStarted_thenReturnZero(){
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getX();
        // THEN
        assertEquals(expected, actual);

    }
    @Test
    void getY_whenStarted_thenReturnZero(){
        // GIVEN
        int expected = 0;
        // WHEN
        int actual = PlayerCharacter.getY();
        // THEN
        assertEquals(expected, actual);
    }


    @Test
    void move_whenInputW_thenYPlus1(){
        // GIVEN
        int expected = 1;
        String input = "w";
        // WHEN
        int actual = PlayerCharacter.move(input);
        // THEN
        assertEquals(expected, actual);

    }

    @Test
    void move_whenInputS_thenYMinus1(){
        // GIVEN
        int expected = -1;
        String input = "s";
        // WHEN
        int actual = PlayerCharacter.move(input);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_whenInputD_thenXPlus1(){
        // GIVEN
        int expected = 1;
        String input = "d";
        // WHEN
        int actual = PlayerCharacter.move(input);
        // THEN
        assertEquals(expected, actual);
    }
}