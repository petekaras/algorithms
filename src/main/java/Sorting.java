import java.io.*;
import java.util.*;

public class Sorting {
    private static Random random = new Random();

    public static int[] partition3(int[] a, int l, int r) {
        int x = a[l];
        int leftIndex  = l;
        //first partition
        for (int i = leftIndex + 1; i <= r; i++) {
            if (a[i] < x) {
                leftIndex++;
                int t = a[i];
                //swap
                a[i] = a[leftIndex];
                a[leftIndex] = t;
            }
        }
        int t = a[l];
        a[l] = a[leftIndex];
        a[leftIndex] = t;


        //middle partition
        int rightIndex = leftIndex;
        for (int j = rightIndex + 1; j <= r; j++) {
            if (a[j] == x) {
                rightIndex++;
                int k = a[j];
                //swap
                a[j] = a[rightIndex];
                a[rightIndex] = k;
            }
        }


        return new int[] {leftIndex, rightIndex};

    }

    public static int partition2(int[] a, int l, int r) {
        int x = a[l];
        int leftIndex  = l;

        for (int i = leftIndex + 1; i <= r; i++) {
            if (a[i] <= x) {
                leftIndex++;
                int t = a[i];
                //swap
                a[i] = a[leftIndex];
                a[leftIndex] = t;
            }
        }
        int t = a[l];
        a[l] = a[leftIndex];
        a[leftIndex] = t;
        return leftIndex;
    }

    public static void randomizedQuickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int randomIndex = random.nextInt(right - left + 1) + left;
        int t = a[left];
        a[left] = a[randomIndex];
        a[randomIndex] = t;
        //use partition3
        int[] m = partition3(a, left, right);
        randomizedQuickSort(a, left, m[0] - 1);
        randomizedQuickSort(a, m[1]+1, right);
    }

    public static void main(String[] args) {
        FastScanner scanner =  new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        randomizedQuickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
