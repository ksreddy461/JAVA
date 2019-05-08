package arrays;

public class ProductArray {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};
        int arraySize = a.length;
        int product[] = new int[arraySize];
        int preProduct[] = new int[arraySize];
        int postProduct[] = new int[arraySize];

        int p = 1;
        for (int i = 0; i < arraySize; i++) {
            preProduct[i] = p;
            p *= a[i];
        }
        //reset p value
        p = 1;

        for (int i = arraySize - 1; i >= 0; i--) {
            postProduct[i] = p;
            p *= a[i];
        }

        System.out.println("Product array values are:");
        for (int i = 0; i < arraySize; i++) {
            product[i] = preProduct[i] * postProduct[i];
            System.out.print(product[i]+ " ");
        }
    }
}
