package arrays.sorting;

public class SelectionSort {

    public static void main(String args[]) {

        int a[] = {6, 5, 4, 2, 3, 8, 7};
        System.out.println(" Array elements before Selection Sort :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }

        }

        System.out.println("\n Array elements after Selection Sort :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
