package ru.netology.domain;

public class Conditioner {
    private int minTemperature = 15;
    private int maxTemperature = 30;
    private int currentTemperature;


    public int getCurrentTemperature() {
        return currentTemperature;
    }


    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }

        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;

        }

        this.currentTemperature = currentTemperature;
    }


    public void setIncreaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
    }


    public void setDecreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;

    }


}


