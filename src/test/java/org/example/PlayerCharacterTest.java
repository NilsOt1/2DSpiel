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
        String inputUp = "w";
        // WHEN
        int actual = PlayerCharacter.move(inputUp);
        // THEN
        assertEquals(expected, actual);

    }

}