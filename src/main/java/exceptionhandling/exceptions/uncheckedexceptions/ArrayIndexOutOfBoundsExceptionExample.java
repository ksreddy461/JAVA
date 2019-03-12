package exceptionhandling.exceptions.uncheckedexceptions;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        try {
            int array[] = {1, 2, 3, 4, 5};
            System.out.println("Array value at 6th index is : " + array[5]);
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            aiob.printStackTrace();
        }
    }
}
