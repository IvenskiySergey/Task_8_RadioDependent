package ru.netology.statistic;

public class Radio {

    private int currentStation;
    private int volume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void nextStation() {
        int newCurrentStation = currentStation + 1;
        if (currentStation == 9) {
            setCurrentStation(0);
        }
        setCurrentStation(newCurrentStation);
    }

    public void prevStation() {
        int newCurrentStation = currentStation - 1;
        if (currentStation == 0) {
            setCurrentStation(9);
        }
        setCurrentStation(newCurrentStation);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        this.volume = newVolume;
    }

    public void upVolume() {
        int newVolume = volume + 1;
        if (volume == 10) {
            setVolume(10);
        }
        setVolume(newVolume);
    }

    public void downVolume() {
        int newVolume = volume - 1;
        if (volume == 0) {
            setVolume(0);
        }
        setVolume(newVolume);
    }

    public int getVolume() {
        return volume;
    }
}
