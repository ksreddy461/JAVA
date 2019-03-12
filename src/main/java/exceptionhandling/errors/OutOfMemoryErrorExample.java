package exceptionhandling.errors;

public class OutOfMemoryErrorExample {

    public static void main(String[] args) {

        try {
            while (true) {
                int array[] = new int[1000000000];
            }
        } catch (OutOfMemoryError ofme) {
            System.out.println("Got OutOfMemoryError and StackTrace as follows \t");
            ofme.printStackTrace();
        }
    }
}
