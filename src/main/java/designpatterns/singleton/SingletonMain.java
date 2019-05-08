package designpatterns.singleton;

public class SingletonMain {

    public static void main(String args[]){
        Singleton singleton= Singleton.createInstance();
        singleton.display();

        Singleton singleton2= Singleton.createInstance();
    }
}
