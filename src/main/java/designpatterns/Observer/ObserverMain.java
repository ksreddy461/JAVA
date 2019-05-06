package designpatterns.Observer;

public class ObserverMain {

    public static void main(String args[]){
        WeatherData weather = new WeatherData();

        Client c1 = new Client(1,"Chennai");
        Client c2 = new Client(2,"Delhi");
        Client c3 = new Client(3,"Hyderabd");

        weather.registerObeserver(c1);
        weather.registerObeserver(c2);
        weather.registerObeserver(c3);
        weather.setData((float)35.3,(float)89.4,(float)23.8);
        weather.displayAllObservers();

        weather.removeObserver(c2);
        weather.displayAllObservers();
    }
}
