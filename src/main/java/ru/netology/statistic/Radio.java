package ru.netology.statistic;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int volume;

    public Radio(int nuberStation) {
        if (nuberStation < maxStation + 1) {
            return;
        }
        maxStation = minStation + nuberStation - 1;
    }

    public Radio() {

    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void nextStation() {
        int newCurrentStation = currentStation + 1;
        if (currentStation == maxStation) {
            setCurrentStation(0);
        }
        setCurrentStation(newCurrentStation);
    }

    public void prevStation() {
        int newCurrentStation = currentStation - 1;
        if (currentStation == minStation) {
            setCurrentStation(maxStation);
        }
        setCurrentStation(newCurrentStation);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        this.volume = newVolume;
    }

    public void upVolume() {
        int newVolume = volume + 1;
        if (volume == 100) {
            setVolume(100);
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
