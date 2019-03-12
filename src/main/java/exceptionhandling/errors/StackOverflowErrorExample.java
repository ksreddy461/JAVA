package exceptionhandling.errors;

public class StackOverflowErrorExample {

    public static void main(String[] args) {

        try {
            main(null);
        } catch (StackOverflowError soe) {
            System.out.println("Got StackOverflowError and stackTrace as follows \t");
            soe.printStackTrace();
        }
    }
}
