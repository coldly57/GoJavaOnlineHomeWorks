package practice;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

        };

        for (int i : print(matrix)){
            System.out.print(i + " ");
        }
    }

    public static int[] print(int[][] input) {

        int[] res = new int[input.length * input[0].length];


        /*int h = input.length;
        int w = input[0].length;

        int top = 0;
        int left = 0;
        int right = w - 1;
        int bottom = h - 1;

        int[] res = new int[input.length * input[0].length];

        int[] row = input[top];
        int count = 0;

        for (int i = left; i <= right; i++){
            res[count] = row[i];
            count++;
        }*/


        return res;
    }
}
