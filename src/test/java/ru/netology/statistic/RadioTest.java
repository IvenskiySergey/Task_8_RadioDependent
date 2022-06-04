package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/setTestData.csw"})
    public void setTest(int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newCurrentStation);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextStationTestData.csw"})
    public void nextStationTest(int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newCurrentStation);
        radio.nextStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStationTestData.csw"})
    public void prevStationTest(int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newCurrentStation);
        radio.prevStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/upVolumeTestData.csw"})
    public void upStation(int newVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(newVolume);
        radio.upVolume();
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/downVolumeTestData.csw"})
    public void downStation(int newVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(newVolume);
        radio.downVolume();
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

}

