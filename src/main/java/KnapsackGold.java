import java.util.*;

public class KnapsackGold {
    public static int optimalWeight(int totalWeight, int[] items) {
        int[][] value = new int[items.length+1][totalWeight];

        for(int i=1;i< items.length+1;i++){
            for(int w=1;w<totalWeight;w++){
                value[i][w]=value[i-1][w];
                if(items[i-1]<=w){
                    int valselectingItem = items[i-1] + value[i-1][w - items[i-1]];
                    int valueWithoutSelecting = value[i-1][w];
                    value[i][w] =  Math.max(valselectingItem,valueWithoutSelecting);
                }
            }
        }

        System.out.println(Arrays.deepToString(value));
        return value[items.length][totalWeight-1];
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w));
    }
}
