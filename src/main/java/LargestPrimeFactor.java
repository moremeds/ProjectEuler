import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 01/06/2016.
 *
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler003
 *
 * Successful
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }

        for (long num : numSet) {
            System.out.println(largestPrimeFactor(num));
        }

    }

    public static long largestPrimeFactor(long n) {
        int d = 2;
        while (d <= n / d) {
            if (n % d == 0)
                n /= d;
            else
                d += 1;
        }
        return n;
    }

}
