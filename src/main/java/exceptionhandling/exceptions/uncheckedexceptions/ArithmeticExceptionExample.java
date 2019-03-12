package exceptionhandling.exceptions.uncheckedexceptions;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            System.out.println("Before division by Zero");
            int result = a / b;
            System.out.println("After division by Zero");
        } catch (ArithmeticException ae) {
            System.out.println("Caught Arithmetic exception");
            ae.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
