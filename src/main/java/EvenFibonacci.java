import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 01/06/2016.
 */
public class EvenFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }

        for (long num : numSet) {

            int results = 0;

            long index = 0;
            long fibo = getFibonacci(0);
            while (fibo < num) {
                if (fibo % 2 == 0) {
                    results += fibo;
                }
                fibo = getFibonacci(index);
                index++;
            }

            System.out.println(results);

        }
    }

    private static long getFibonacci(long index) {
        if (index < 0)
            return 0;
        if (index == 0)
            return 0;
        if (index == 1)
            return 1;
        if (index == 2)
            return 1;
        else
            return getFibonacci(index - 1) + getFibonacci(index - 2);
    }
}
