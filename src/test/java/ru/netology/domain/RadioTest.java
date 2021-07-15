package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void changeStation() {
        radio.setMaxStation(30);
        radio.setMinStation(0);
        radio.setCurrentStation(29);
        assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStationToMax() {
        radio.setCurrentStation(5);
        assertEquals(30, radio.getMaxStation());
    }

    @Test
    public void shouldChangeStationToMin() {
        radio.setCurrentStation(5);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void ShouldSetStation() {
        Radio radio = new Radio(5);
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(8);
        assertEquals(9, radio.nextStation());
    }

    @Test
    public void shouldIncreaseStationMax() {
        radio.setCurrentStation(30);
        assertEquals(0, radio.nextStation());
    }

    @Test
    public void shouldIncreaseStationAboveMax() {
        radio.setCurrentStation(31);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(2);
        assertEquals(1, radio.prevStation());
    }

    @Test
    public void shouldDecreaseStationMin() {
        radio.setCurrentStation(0);
        assertEquals(30, radio.prevStation());

    }

    @Test
    public void shouldDecreaseStationDownMin() {
        radio.setCurrentStation(-1);
        assertEquals(30, radio.prevStation());

    }

    @Test
    public void changeVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeToMax() {
        radio.setCurrentVolume(50);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldChangeVolumeToMin() {
        radio.setCurrentVolume(5);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(5);
        assertEquals(6, radio.increaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.decreaseVolume());
    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        radio.setCurrentVolume(111);
        assertEquals(100, radio.increaseVolume());

    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(4);
        assertEquals(3, radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeDownMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.decreaseVolume());
    }
}
