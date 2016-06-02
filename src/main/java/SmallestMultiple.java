import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 02/06/2016.
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }

        for (long num : numSet) {
            long result = 1;
            for (int index = 2; index <= num; index++) {
                if(num==1){
                    System.out.println(num);
                    break;
                }
                if (isPrime(index)) {
                    long temp = 1;
                    while (temp <= num) {
                        temp *= index;
                    }
                    temp/=index;
                    result *= temp;
                }
            }
            System.out.println(result);
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
