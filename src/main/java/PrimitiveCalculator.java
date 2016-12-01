import java.util.*;

public class PrimitiveCalculator {

    interface Operation {
        int operate(int a);
    }

    static Operation[] operations = new Operation[]{
            a-> {return (a%3==0) ? a/3: 0; } ,
            a-> {return (a%2==0) ? a/2: 0;},
            a-> {return a-1;}
    };

    List<Integer> opCount = new ArrayList<Integer>();

    public List<Integer> optimal_sequence(int n){
        opCount.add(0);
        for(int i=1;i<=n;i++) {
            int best = minimumOperations(i);
            opCount.add(i, best + 1);
        }

       // System.out.println(opCount.toString());

        List<Integer> backList = getSequence(opCount);
        Collections.reverse(backList);
        //backList.add(n);
       // System.out.println(backList.toString());
        return backList;
    }

    public List<Integer> getSequence(List<Integer> opCount){
        List<Integer> backList = new ArrayList<>();
        //1
        int totalOperations = opCount.get(opCount.size()-1);
        backList.add(opCount.size()-1);
        int operations = totalOperations-1;

        if(operations < 1){
            if(!(operations <0)) {
                backList.add(1);
            }
            return backList;
        }

        int number = opCount.indexOf(operations);
        backList.add(number);
       // while((number -1)>0 || number%3 == 0 || number%2 == 0) {
         while(operations > 1){
            operations = operations -1;
            number = opCount.indexOf(operations);
            backList.add(number);
        }
        backList.add(1);
        return backList;

    }

    public  int minimumOperations(int n) {
        int best = 999999999;

        for(Operation operation: operations) {
            int answer = operation.operate(n);

            if (n==1) {
                best = -1;
            }else if(n==2 || n==3){
                best =0;
            } else if ((answer) != 0 && opCount.get(answer) < best) {
                best = opCount.get(answer);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PrimitiveCalculator pc = new PrimitiveCalculator();
        List<Integer> sequence = pc.optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}
