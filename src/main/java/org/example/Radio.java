package org.example;

public class Radio {


    private int maxNumber = 9;
    private int minNumber = 0;
    private int currentNumber = minNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int size) {
        maxNumber = minNumber + size - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {

        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setNextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else currentNumber = minNumber;
    }

    public void setPrevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else currentNumber = maxNumber;
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