import java.util.Scanner;

/**
 * Created by peter on 11/3/16.
 */
public class PairWiseSlow {

    public static long maxPairwiseProduct(long[] numbers){
        long maxResult = 0;
        for(int i=0; i < numbers.length; i++){
            for(int j=0; j < numbers.length; j++){
                if(i != j){
                    long calc = numbers[i] * numbers[j];
                    if(calc > maxResult){
                        maxResult = calc;
                    }
                }
            }
        }
        return maxResult;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrayLength = Integer.parseInt(s.nextLine());
        long[] numbers = new long[arrayLength];
        String[] nums = s.nextLine().split(" ");
        for(int i=0; i<nums.length;i++){
            numbers[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(maxPairwiseProduct(numbers));
    }
}
