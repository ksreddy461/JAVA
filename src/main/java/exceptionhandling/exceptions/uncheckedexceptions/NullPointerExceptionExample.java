package exceptionhandling.exceptions.uncheckedexceptions;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        String nullString = null;
        try {
            System.out.println("First char of String is: " + nullString.charAt(0));
        } catch (NullPointerException ne) {
            System.out.println("Caught NullPointerException");
            ne.printStackTrace();
        }
    }
}