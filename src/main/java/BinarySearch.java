import java.io.*;
import java.util.*;

public class BinarySearch {

    public static int search(int[] a, int x) {
        int start = 0;
        int end = a.length-1;
        int partition=0;
        while(start < end) {
            partition = start + ((end-start)/2);
            //end case, exit
            if(partition == start){
                break;
            }
            if (x < a[partition]) {
                end = partition;
            } else {
                start = partition;
            }
        }

        if(x==a[partition]){
            return partition;
        }
        if(start != end && x==a[partition+1]){
                return partition+1;

        }
            return -1;

    }




    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(search(a, b[i]) + " ");
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
