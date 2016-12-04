package stage2;

import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 04/12/2016.
 */
public class LongestCollatzSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {

            int num = scanner.nextInt();
            int max = 0;
            int value = 0;
            for (int j = 1; j <= num; j++) {
                //System.out.println(j);
                int step = getCollatzSteps(j);
                if (step > max) {
                    max = step;
                    value = j;
                }
            }
            System.out.println(value);

        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

    private static int getCollatzSteps(int num) {
        int steps = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            steps++;
        }

        return steps;
    }
}
