package exceptionhandling.exceptions.uncheckedexceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("sreedhar");
        } catch (NumberFormatException ne) {
            System.out.println("Caught NumberFormat exception");
            ne.printStackTrace();
        }
    }
}
