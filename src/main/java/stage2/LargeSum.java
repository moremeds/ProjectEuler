package stage2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 04/12/2016.
 */
public class LargeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        BigInteger sum = new BigInteger("0");

        for (int i = 0; i < number; i++) {

            String digits = scanner.next();

            BigInteger value = new BigInteger(digits);

            sum = sum.add(value);

        }

        String result = sum + "";
        System.out.println(result.substring(0, 10));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
