import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 01/06/2016.
 *
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler004
 */
public class LargestPalindromeProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextInt();
        List<Long> numSet = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            numSet.add(scanner.nextLong());
        }


        int upper = 100;

        TreeSet<Integer> resultSet = new TreeSet<>();
        for (long num : numSet) {

            for(int lower = 999; upper<=lower; lower--){
                for(int lower1 = 999; upper<=lower1; lower1--){

                    int results = lower * lower1;

                    if(results<=num && checkPalindrome(results)){
                       resultSet.add(results);

                    }
                }
            }
            System.out.println(resultSet.descendingIterator().next());
        }
    }

    public static boolean checkPalindrome(long num) {
        String numStr = String.valueOf(num);
        String reverse = "";

        int length = numStr.length()-1;
        char[] chars = numStr.toCharArray();
        for (int index = length; index >= 0; index--)
            reverse += chars[index];

        return reverse.equals(numStr);
    }
}
