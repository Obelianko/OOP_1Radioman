package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 30;
    private int minStation = 0;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio() {
    }

    public int getMaxStation() {

        return maxStation;
    }

    public void setMaxStation(int maxStation) {

        this.maxStation = maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
        return currentStation;
    }
}




