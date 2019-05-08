package designpatterns.singleton;


public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton createInstance() {

        if (singleton == null) {
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void display(){

        System.out.println("Display method");
    }
}
