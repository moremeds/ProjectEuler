import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 23/11/2016.
 * <p>
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler008
 */
public class LargestProductInSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();

            int max = 0;

            int[] series = new int[n];
            int i = 0;
            for (char c : num.toCharArray()) {
                series[i] = (int) c;
                i++;
            }
            

        }
    }
}
