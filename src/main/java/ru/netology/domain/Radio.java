package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numberOfStations - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int switchStationNext() {

        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else currentStation = currentStation + 1;

        return currentStation;
    }

    public int switchStationPrev() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else currentStation = currentStation - 1;

        return currentStation;
    }



    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


}
