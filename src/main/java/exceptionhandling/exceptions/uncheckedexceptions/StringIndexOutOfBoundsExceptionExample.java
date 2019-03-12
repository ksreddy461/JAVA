package exceptionhandling.exceptions.uncheckedexceptions;

public class StringIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        try {
            String string = "Sreedhar";
            System.out.println("String lenght is: " + string.length());
            System.out.println("String char at 8th position is: " + string.charAt(8));
        } catch (StringIndexOutOfBoundsException siob) {
            System.out.println("Caught StringIndexOutOfBoundsException");
            siob.printStackTrace();
        }
    }
}
