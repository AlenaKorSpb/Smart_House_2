package ru.netology.domain;

import lombok.Data;

public class Conditioner {
    private int minTemperature = 15;
    private int maxTemperature = 30;
    private int currentTemperature = 22;//(minTemperature +maxTemperature)/2;
    private boolean on;

    public Conditioner() {
    }

    public Conditioner(int minTemperature, int maxTemperature, int currentTemperature, boolean on) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.currentTemperature = currentTemperature;
        this.on = on;
    }


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


