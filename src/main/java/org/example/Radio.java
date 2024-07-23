package org.example;

public class Radio {


    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {

        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setNextNumber() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        } else currentNumber = 0;
    }

    public void setPrevNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        } else currentNumber = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 0;
    }

    public void setPrevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}