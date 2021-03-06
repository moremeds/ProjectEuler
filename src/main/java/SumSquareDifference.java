import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 02/06/2016.
 */
public class SumSquareDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }

        for (long num : numSet) {
            int result = 0;

            for(int index =1; index<=num; index++){
                for(int index1=1; index1<=num; index1++){
                    if(index!=index1){
                        result = result + index1*index;
                    }
                }
            }

            System.out.println(result);
        }
    }
}
