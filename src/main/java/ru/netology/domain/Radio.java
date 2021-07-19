package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int quantityStation = 30;
    private int minStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
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
        if (currentStation > quantityStation - 1) {
            return;
        }
        if (currentStation < 0) {
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
        if (currentStation == quantityStation - 1) {
            currentStation = 0;
        } else {
            this. currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation == 0) {
            currentStation = quantityStation - 1;
        } else {
            this. currentStation = currentStation - 1;
        }
        return currentStation;
    }
}




