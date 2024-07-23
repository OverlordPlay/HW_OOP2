package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void wouldNextNumber() {
        Radio number = new Radio();

        number.setNextNumber();

        int expected = 1;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldNextNumberAboveMax() {
        Radio number = new Radio();
        number.setCurrentNumber(9);
        number.setNextNumber();

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldCurrentNumber() {
        Radio number = new Radio();
        number.setCurrentNumber(9);

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldCurrentNumberAboveMax() {
        Radio number = new Radio();
        number.setCurrentNumber(10);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldPrevNumber() {
        Radio number = new Radio();
        number.setCurrentNumber(5);

        number.setPrevNumber();

        int expected = 4;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldPrevNumberBelowMin() {
        Radio number = new Radio();
        number.setCurrentNumber(0);

        number.setPrevNumber();

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldNextVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.setNextVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldNextVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setNextVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldPrevVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setPrevVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldPrevVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.setPrevVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wouldCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}