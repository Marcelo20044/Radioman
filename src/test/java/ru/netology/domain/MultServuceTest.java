package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MultServiceTest {


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.setCurrentStation(0);
        rad.setCurrentStation(-1);
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void switchStationNext(){
        Radio rad = new Radio();

        rad.currentStation = 6;
        int expected = 7;
        int actual = rad.switchStationNext();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationNext2(){
        Radio rad = new Radio();

        rad.currentStation = 9;
        int expected = 0;
        int actual = rad.switchStationNext();
        assertEquals(expected, actual);
    }


    @Test
    public void switchStationPrev(){
        Radio rad = new Radio();

        rad.currentStation = 5;
        int expected = 4;
        int actual = rad.switchStationPrev();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationPrev2(){
        Radio rad = new Radio();

        rad.currentStation = 0;
        int expected = 9;
        int actual = rad.switchStationPrev();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume(){
        Radio rad = new Radio();

        rad.currentVolume = 5;
        int expected = 6;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2(){
        Radio rad = new Radio();

        rad.currentVolume = 10;
        int expected = 10;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume(){
        Radio rad = new Radio();

        rad.currentVolume = 5;
        int expected = 4;
        int actual = rad.lowerVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume2(){
        Radio rad = new Radio();

        rad.currentVolume = 0;
        int expected = 0;
        int actual = rad.lowerVolume();
        assertEquals(expected, actual);
    }



}