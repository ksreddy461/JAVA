package arrays;

public class KadanesAlgorithm {

    public static void main(String args[]) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (maxSum < sum) {
                maxSum = sum;
            }

            if (maxSum < a[i]) {
                maxSum = sum = a[i];
            }
        }

        System.out.print("Larget max sub array sum is: " + maxSum);
    }
}
