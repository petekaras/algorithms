import java.util.*;

public class Inversions {

    public static long getNumberOfInversions(int[] a, int[] b, int left, int right) {
        long numberOfInversions = 0;
        int ave = (left + right) / 2;
        if(right<=left+1) {
            getNumberOfInversions(a, b, left, ave);
            getNumberOfInversions(a, b, ave, right);
        }
        int rightIndex = (ave+1);
        int leftIndex = left;
        int newInsertionPoint = left;
        for(int i =0;i<=(right-left);i++){
            if(leftIndex>ave){
                //copy right part into results
                for(int j=rightIndex;j<=right;j++){
                    b[newInsertionPoint] = a[rightIndex];
                    rightIndex++;
                    newInsertionPoint++;
                }
                break;
            }
            if(rightIndex>right){
                for(int j=leftIndex;j<=ave;j++){
                    b[newInsertionPoint] = a[leftIndex];
                    leftIndex++;
                    newInsertionPoint++;
                }
                break;
            }

            if(a[leftIndex]<=a[rightIndex]){
                b[newInsertionPoint] = a[leftIndex];
                leftIndex++;
            }else{
                b[newInsertionPoint] = a[rightIndex];
                rightIndex++;
                numberOfInversions++;
            }
            newInsertionPoint++;
        }

        return numberOfInversions;
    }

    public static void mergeSort(int[] a, int[] b, int left, int right) {
        int ave = (left + right) / 2;
        if(right<=left+1) {
            mergeSort(a, b, left, ave);
            mergeSort(a, b, ave, right);
        }
        int rightIndex = (ave+1);
        int leftIndex = left;
        int newInsertionPoint = left;
        for(int i =0;i<=(right-left);i++){
            //System.out.println("conmpare:  " + a[leftIndex] + " " + a[rightIndex]);
            if(leftIndex>ave){
                //copy right part into results
                for(int j=rightIndex;j<=right;j++){
                    b[newInsertionPoint] = a[rightIndex];
                    rightIndex++;
                    newInsertionPoint++;
                }
                break;
            }
            if(rightIndex>right){
                for(int j=leftIndex;j<=ave;j++){
                    b[newInsertionPoint] = a[leftIndex];
                    leftIndex++;
                    newInsertionPoint++;
                }
                break;
            }

            if(a[leftIndex]<=a[rightIndex]){
                b[newInsertionPoint] = a[leftIndex];
                leftIndex++;
            }else{
                b[newInsertionPoint] = a[rightIndex];
                rightIndex++;
            }
            newInsertionPoint++;
            System.out.println(Arrays.toString(b));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        System.out.println(getNumberOfInversions(a, b, 0, a.length-1)*2);
    }
}
