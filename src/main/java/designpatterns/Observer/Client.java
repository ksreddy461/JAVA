package designpatterns.Observer;

public class Client implements Observer {

    int id;
    String name;

    Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("temparature is : " + temp + " humidity is : " + humidity + " pressure is : " + pressure);
    }

    public void display() {
        System.out.println(name);
    }
}
