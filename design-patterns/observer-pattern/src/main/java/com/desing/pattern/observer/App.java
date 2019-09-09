package com.desing.pattern.observer;


/*
Defines a one-to-many dependency between objects so that when one object changes state,
        all its dependents are notified and updated automatically.
*/
public class App {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);

        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.04f);
        weatherData.setMeasurements(90,70,29.04f);
        weatherData.setMeasurements(78,90,29.04f);


    }
}
