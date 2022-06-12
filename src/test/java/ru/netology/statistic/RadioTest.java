package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = {"/setTestData.csw"})
    public void setTest(int newCurrentStation, int expected) {
        radio.setCurrentStation(newCurrentStation);

        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/nextStationTestData.csw"})
    public void nextStationTest(int newCurrentStation, int expected) {
        radio.setCurrentStation(newCurrentStation);
        radio.nextStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevStationTestData.csw"})
    public void prevStationTest(int newCurrentStation, int expected) {
        radio.setCurrentStation(newCurrentStation);
        radio.prevStation();

        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/upVolumeTestData.csw"})
    public void upStation(int newVolume, int expected) {
        radio.setVolume(newVolume);
        radio.upVolume();

        assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/downVolumeTestData.csw"})
    public void downStation(int newVolume, int expected) {
        radio.setVolume(newVolume);
        radio.downVolume();

        assertEquals(expected, radio.getVolume());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/setNStationTestData.csw"})
    public void setNStation(int numberStation, int newCurrentStation, int expected1, int expected2, int expected3) {
        Radio radio1 = new Radio(numberStation);
        radio1.setCurrentStation(newCurrentStation);

        Assertions.assertEquals(expected1, radio1.getMinStation());
        Assertions.assertEquals(expected2, radio1.getMaxStation());
        Assertions.assertEquals(expected3, radio1.getCurrentStation());
    }
    @ParameterizedTest
    @CsvFileSource(resources = {"/nextNStationTestData.csw"})
    public void nextNStation(int numberStation, int newCurrentStation, int expected1, int expected2, int expected3) {
        Radio radio1 = new Radio(numberStation);
        radio1.setCurrentStation(newCurrentStation);
        radio1.nextStation();

        Assertions.assertEquals(expected1, radio1.getMinStation());
        Assertions.assertEquals(expected2, radio1.getMaxStation());
        Assertions.assertEquals(expected3, radio1.getCurrentStation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/prevNStationTestData.csw"})
    public void prevNStation(int numberStation, int newCurrentStation, int expected1, int expected2, int expected3) {
        Radio radio1 = new Radio(numberStation);
        radio1.setCurrentStation(newCurrentStation);
        radio1.prevStation();

        Assertions.assertEquals(expected1, radio1.getMinStation());
        Assertions.assertEquals(expected2, radio1.getMaxStation());
        Assertions.assertEquals(expected3, radio1.getCurrentStation());
    }

}

