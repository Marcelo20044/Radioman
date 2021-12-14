package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class MultServiceTest {


    @Test
    public void setCurrentStation5() {
        Radio rad = new Radio(16);

        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation10() {
        Radio rad = new Radio(16);

        rad.setCurrentStation(16);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStation1() {
        Radio rad = new Radio(16);

        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationNext(){
        Radio rad = new Radio(16);

        rad.setCurrentStation(10);
        int expected = 11;
        int actual = rad.switchStationNext();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationNext2(){
        Radio rad = new Radio(16);

        rad.setCurrentStation(15);
        int expected = 0;
        int actual = rad.switchStationNext();
        assertEquals(expected, actual);
    }



    @Test
    public void switchStationPrev(){
        Radio rad = new Radio(16);

        rad.setCurrentStation(0);
        int expected = 15;
        int actual = rad.switchStationPrev();
        assertEquals(expected, actual);
    }

    @Test
    public void switchStationPrev2(){
        Radio rad = new Radio(16);

        rad.setCurrentStation(1);
        int expected = 0;
        int actual = rad.switchStationPrev();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume(){
        Radio rad = new Radio(16);

        rad.setCurrentVolume(5);
        int expected = 6;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2(){
        Radio rad = new Radio(16);

        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume(){
        Radio rad = new Radio(161);

        rad.setCurrentVolume(5);
        int expected = 4;
        int actual = rad.lowerVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume2(){
        Radio rad = new Radio(16);

        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.lowerVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume5() {
        Radio rad = new Radio(16);

        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume11() {
        Radio rad = new Radio(16);

        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolume1() {
        Radio rad = new Radio(16);

        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }



}