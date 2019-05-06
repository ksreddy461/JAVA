package designpatterns.Observer;

public interface Subject {

    void registerObeserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
