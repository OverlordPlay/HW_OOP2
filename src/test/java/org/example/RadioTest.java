package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldGetNumber() {
        Radio number = new Radio(10);

        Assertions.assertEquals(0, number.getMinNumber());
        Assertions.assertEquals(9, number.getMaxNumber());
        Assertions.assertEquals(0, number.getCurrentNumber());
    }

    @Test
    public void shouldNextNumber() {
        Radio number = new Radio(10);

        number.setNextNumber();

        int expected = 1;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentNumber(9);
        number.setNextNumber();

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumber() {
        Radio number = new Radio(10);
        number.setCurrentNumber(9);

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberAboveMax() {
        Radio number = new Radio(10);
        number.setCurrentNumber(10);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber() {
        Radio number = new Radio(10);
        number.setCurrentNumber(5);

        number.setPrevNumber();

        int expected = 4;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberBelowMin() {
        Radio number = new Radio(10);
        number.setCurrentNumber(0);

        number.setPrevNumber();

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.setNextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setNextVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setPrevVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.setPrevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}