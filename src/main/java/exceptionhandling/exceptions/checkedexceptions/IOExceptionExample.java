package exceptionhandling.exceptions.checkedexceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {

    private final static String filePath = "C:\\Users\\skodadala\\Desktop\\tmp.txt";

    public static void main(String[] args) {

        BufferedReader br = null;
        String curline;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((curline = br.readLine()) != null) {
                System.out.println(curline);
            }
        } catch (IOException e) {
            System.out.println("IOException is: " + e);
            e.printStackTrace();
            throw new NullPointerException();
        } finally {
            System.out.println("Finally Block");
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
