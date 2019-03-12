package exceptionhandling.exceptions.checkedexceptions;

public class ClassNotFoundExceptionExample {

    private static final String CLASS_TO_LOAD = "main.java.utils";

    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + "found Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Got Exception");
            e.printStackTrace();
        }
    }
}
