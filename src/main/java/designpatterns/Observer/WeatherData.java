package designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers = new ArrayList<Observer>();
    float temp, humidity, pressure;

    public void registerObeserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        for (Observer ob : observers) {
            if (ob == o) {
                observers.remove(o);
            }
        }
    }

    public void displayAllObservers() {
        System.out.println("Observers List");
        for (Observer ob : observers){
            ob.display();
        }
    }

    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(temp, humidity, pressure);
        }
    }

    public void setData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
