package ru.netology.domain;

public class Radio {
    int currentStation;
    int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0){
            return;
        }
        if (newCurrentStation > 9){
            return;
        }
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public int switchStationNext(){
        if (currentStation < 9){
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int switchStationPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
        return currentStation;
    }

    public int increaseVolume(){
        if (currentVolume < 10){
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public int lowerVolume(){
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 10){
            return;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }


}
