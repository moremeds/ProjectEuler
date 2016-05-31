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
            int result = 0;
            for (int i = 1; i < num; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    result += i;
                }
            }
            System.out.println(result);

        }
    }
}
