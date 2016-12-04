import java.util.Scanner;

/**
 * ProjectEuler
 * <p>
 * Created by chenxili on 23/11/2016.
 *
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler011
 */
public class LargestProductInGrid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }



    }
}
