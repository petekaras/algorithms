import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.TreeMap;

public class KnapSack {
    public static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        //sort input
        TreeMap<Double,int[]>  mostPrecious = new TreeMap<>();
        for(int i =0; i < values.length;i++){
            Double key = new Double(new Double(values[i]) / new Double(weights[i]));
            mostPrecious.put(key,new int[]{values[i],weights[i]});
        }
        int currentLoad = 0;
        for(Double key : mostPrecious.descendingKeySet()){
           int thisItemWeight = mostPrecious.get(key)[1];
            int thisItemCost = mostPrecious.get(key)[0];

           if((currentLoad + thisItemWeight) < capacity){
               currentLoad = currentLoad + thisItemWeight;
               value = value + thisItemCost;
           }else{
               int remainingWeight = capacity - currentLoad;
               value = value + remainingWeight * key;
               return value;
           }

        }

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(getOptimalValue(capacity, values, weights)));
    }
} 