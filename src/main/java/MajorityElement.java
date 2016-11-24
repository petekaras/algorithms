import java.util.*;
import java.io.*;

public class MajorityElement {
    public static int getMajorityElement(int[] a) {


        //check for a majority element in array
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        //get highest value

        int highestValue = 0;
        int highestKey = 0;
        for(Integer key: map.keySet()){
            if(map.get(key)>highestValue){
                highestKey=key;
                highestValue = map.get(key);
            }
        }
        if(map.get(highestKey) > a.length/2) {
            return highestKey;
        }else{
            return -1;
        }

        //List<Integer> list = new ArrayList<Integer>(map.values());

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
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
