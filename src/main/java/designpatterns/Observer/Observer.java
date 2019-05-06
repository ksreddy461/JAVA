package designpatterns.Observer;

public interface Observer {

    void update(float temp, float humidity, float pressure);
    void display();
}
