package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int newCurrentStation;
    public int currentVolume;
    public int newCurrentVolume;
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
            newCurrentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            newCurrentStation = 0;
        }
        return newCurrentStation;
    }

    public int switchStationPrev() {
        if (currentStation > 0) {
            newCurrentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            newCurrentStation = 9;
        }
        return newCurrentStation;
    }

    public int increaseVolume(){
        if (currentVolume < 10){
            newCurrentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            newCurrentVolume = currentVolume;
        }
        return newCurrentVolume;
    }

    public int lowerVolume(){
        if (currentVolume > 0){
            newCurrentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            newCurrentVolume = currentVolume;
        }
        return newCurrentVolume;
    }


}
