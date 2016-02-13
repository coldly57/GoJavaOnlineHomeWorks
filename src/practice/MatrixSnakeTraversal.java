package practice;

public class MatrixSnakeTraversal {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11}
        };

        for (int value : new MatrixSnakeTraversal().print(matrix)){
            System.out.print(value + " ");
        }
    }

    public int[] print(int[][] input) {

        int[] res = new int[input.length * input[0].length];

        int top = 0;
        int bottom = input.length - 1;
        int left = 0;

        int count = 0;

        while (count != res.length) {

            for (int i = top; i <= bottom; i++){
                res[count] = input[i][left];
                count++;
                if (count == res.length){
                    return res;
                }
            }
            left++;

            for (int i = bottom; i >= top; i--){
                res[count] = input[i][left];
                count++;
                if (count == res.length){
                    return res;
                }
            }
            left++;
        }

        return res;
    }
}
