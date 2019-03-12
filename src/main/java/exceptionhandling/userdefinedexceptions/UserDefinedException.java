package exceptionhandling.userdefinedexceptions;

public class UserDefinedException extends Exception {

    UserDefinedException() {

    }

    UserDefinedException(String exception) {
        super(exception);
    }

    private static int accountNumbers[] = {1, 2, 3, 4, 5};
    private static String names[] = {"a", "b", "c", "d", "e"};
    private static double balances[] = {1000.00, 2000.00, 3000.50, 4000.10, 5000.30};

    public static void main(String[] args) {

        for (int row = 0; row < accountNumbers.length; row++) {
            System.out.println("Name: " + names[row] + "\t AccountNumber:" + accountNumbers[row]
                    + "\t Balance: " + balances[row]);
            try {
                if (balances[row] < 3000) {
                    throw new UserDefinedException("Balance is less than 3000");
                }
            } catch (UserDefinedException ude) {
                System.out.println("Caught UserDefinedException");
                ude.printStackTrace();
            }
        }
    }
}
