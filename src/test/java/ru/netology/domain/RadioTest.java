package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldChangeStationToMax() {
        radio.setCurrentStation(5);
        radio.setMaxStation(29);
        assertEquals(29, radio.getMaxStation());
    }

    @Test
    public void shouldChangeStationToMin() {
        radio.setCurrentStation(5);
        radio.setMinStation(0);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void ShouldSetStationQuantity() {

        Radio radio = new Radio(50);
        {
            radio.setCurrentStation(- 1);
            assertEquals(0, radio.getCurrentStation());

            radio.setCurrentStation(51);
            assertEquals(0, radio.getCurrentStation());

        }
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(8);
        assertEquals(9, radio.nextStation());
    }

    @Test
    public void shouldIncreaseStationMax() {
        radio.setCurrentStation(29);
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
        assertEquals(29, radio.prevStation());

    }

    @Test
    public void shouldDecreaseStationDownMin() {
        radio.setCurrentStation(-1);
        assertEquals(29, radio.prevStation());

    }

    @Test
    public void changeVolume() {
        radio.setMaxVolume(100);
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
