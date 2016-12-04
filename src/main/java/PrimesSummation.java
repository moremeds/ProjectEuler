import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 05/06/2016.
 *
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler010
 */
public class PrimesSummation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }

        for (long num : numSet) {
            int result = 0;
            for(int index= 2; index<=num; index++){
                if(isPrime(index))
                    result+=index;
            }
            System.out.println(result);
        }

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}
