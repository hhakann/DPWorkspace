package com.desing.pattern.observer;

public class StatisticsDisplay implements Observer,DisplayElement{
    private float maxTemp=0.0f;
    private float minTemp=0.0f;
    private float tempSum=0.0f;
    private int numReadings;
    private WeatherData weatherData;


    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum+=temp;
        numReadings++;
        if (temp>tempSum)
            maxTemp=temp;

        if (temp<tempSum)
            minTemp=temp;

        display();

    }


}
