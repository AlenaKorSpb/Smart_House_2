package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor


class ConditionerTest {
//    @Test
//    public void setCurrentTemperature(){
//        Conditioner conditioner= new Conditioner();
//        conditioner.setCurrentTemperature(20);
//        int actual =  conditioner.getCurrentTemperature();
//        int expect = 22;
//        assertEquals(expect,actual);
//    }




    @Test
    public void shouldIncreaseSetCurrentTemperatureHigherMax() {

        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(31);
        conditioner.setIncreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setDecreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 19;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentTemperatureHigherMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(31);
        conditioner.setDecreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 29;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentTemperatureLowMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(14);
        conditioner.setDecreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 15;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseSetCurrentTemperatureWithinMinMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.setIncreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        int expected = 21;
        assertEquals(expected, actual);
    }
}

