import java.util.Scanner;

/**
 * Created by peter on 11/3/16.
 */
public class PairWise {
    public static long maxPairwiseProduct(long[] numbers){

        int firstNumberIndex = 0;
        for(int i=0; i < numbers.length; i++){
            if(numbers[i] > numbers[firstNumberIndex]){
                firstNumberIndex = i;
            }
        }

        int secondNumberIndex = 0;
        if(firstNumberIndex == 0){
            secondNumberIndex ++;
        }
        for(int i=0; i < numbers.length; i++){
            //System.out.println("Test: " + i + " -- " + numbers[i] + " greater than " + numbers[secondNumberIndex]);
            if(numbers[i] > numbers[secondNumberIndex] && i !=firstNumberIndex){
                //System.out.println("Second number: " + secondNumberIndex);
                secondNumberIndex = i;
            }
        }

        return numbers[firstNumberIndex] * numbers[secondNumberIndex];
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
