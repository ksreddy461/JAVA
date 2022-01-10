package stack;

import java.util.HashMap;
import java.util.Stack;

public class MaxAreaInBinaryMatrix {

    public static Stack<Integer> s = new Stack<>();

    public static int[] NSRIndex(int[] a) {
        int n = a.length;
        int[] nsr = new int[n];
        s.clear();
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                nsr[i] = n;//store last building + 1
            } else {
                if (a[i] > a[s.peek()]) {
                    nsr[i] = s.peek();
                } else {
                    while (!s.isEmpty() && a[i] <= a[s.peek()]) {
                        s.pop();
                    }
                    if (s.isEmpty()) {
                        nsr[i] = n;
                    } else {
                        nsr[i] = s.peek();
                    }
                }
            }
            s.push(i);
        }
        return nsr;
    }

    public static int[] NSLIndex(int[] a) {
        int n = a.length;
        int[] nsl = new int[n];
        s.clear();
        for (int i = 0; i < n; i++) {
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                if (a[i] > a[s.peek()]) {
                    nsl[i] = s.peek();
                } else {
                    while (!s.isEmpty() && a[i] <= a[s.peek()]) {
                        s.pop();
                    }
                    if (s.isEmpty()) {
                        nsl[i] = -1;
                    } else {
                        nsl[i] = s.peek();
                    }
                }
            }
            s.push(i);
        }
        return nsl;
    }

    public static int MAH(int[] arr, HashMap<String, Integer> info) {
        int n = arr.length;

        int[] nsr = NSRIndex(arr);
        int[] nsl = NSLIndex(arr);

        int[] width = new int[n];
        for (int i = 0; i < n; i++) {
            width[i] = nsr[i] - nsl[i] - 1;
        }

        int[] area = new int[n];
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            area[i] = width[i] * arr[i];
            if (maxArea < area[i]) {
                maxArea = area[i];
                info.put("start", nsl[i] + 1);
                info.put("end", nsr[i] - 1);
                info.put("rows", arr[i]);
            }
        }

        System.out.println("Max Area of given histogram is: " + maxArea);
        return maxArea;
    }

    public static void main(String[] args) {

         /*int[][] M = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        int[][] M = {{0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}};*/

        int[][] M = {{0, 1, 1},
                {1, 1, 1},
                {0, 1, 1}};
        int rows = M.length;
        int cols = M[0].length;

        int[] histogram = new int[cols];
        for (int i = 0; i < cols; i++) {
            histogram[i] = M[0][i];
        }

        int maxStart = 0, maxEnd = 0, maxRows = 0, endRow = 0;
        HashMap<String, Integer> info = new HashMap<>();
        int maxArea = MAH(histogram, info);

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (M[i][j] > 0) {
                    histogram[j] += M[i][j];
                } else {
                    histogram[j] = 0;
                }
            }
            info.clear();
            int area = MAH(histogram, info);
            if (area > maxArea) {
                maxArea = area;
                maxStart = info.get("start");
                maxEnd = info.get("end");
                maxRows = info.get("rows");
                endRow = i;
            }
        }
        System.out.println("Max Area is: " + maxArea);
        System.out.print("startRow,endRow,startCol & endCol, ");
        int startRow = endRow - maxRows + 1;
        System.out.print(startRow + " ");
        System.out.print(endRow + " ");
        System.out.print(maxStart + " ");
        System.out.print(maxEnd);

        System.out.println("Matrix is: ");
        for (int i = startRow; i <= endRow; i++) {
            for (int j = maxStart; j <= maxEnd; j++) {
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
