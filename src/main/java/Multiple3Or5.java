import java.util.*;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 31/05/2016.
 */
public class Multiple3Or5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }

        for (long num : numSet) {
            long result;
            num = num - 1;

            double num_3 = Math.floor(num / 3);
            long sum_3 = (long) (3 * ((num_3 + 1) * num_3) / 2);

            System.out.println(sum_3);

            double num_5 = Math.floor(num / 5);
            long sum_5 = (long) (5 * (num_5 + 1) * num_5 / 2);
            System.out.println(sum_5);

            double num_15 = Math.floor(num / 15);
            long sum_15 = (long) (15 * (num_15 + 1) * num_15 / 2);
            System.out.println(sum_15);

            result = sum_3 + sum_5 - sum_15;

            System.out.println(result);

        }
    }
}
