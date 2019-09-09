package com.desing.pattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers =new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);


    }

    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0)
            observers.remove(i);

    }

    public void notifyObservers() {
        for (int i=0;i<observers.size();i++)
        {
            Observer observer=observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){

        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        measurementsChanged();
    }


    private void measurementsChanged(){

        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
