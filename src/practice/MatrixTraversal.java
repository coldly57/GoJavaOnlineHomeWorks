package practice;

public class MatrixTraversal {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i : new MatrixTraversal().print(matrix)) {
            System.out.print(i + " ");
        }
    }

    public int[] print(int[][] input) {

        int[] res = new int[input.length * input[0].length];

        int top = 0;
        int right = input[0].length - 1;
        int left = 0;
        int bottom = input.length - 1;

        int count = 0;

        while(count != res.length){

            for (int i = left; i <= right; i++){
                res[count] = input[top][i];
                count++;
                if (count == res.length){
                    return res;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++){
                res[count] = input[i][right];
                count++;
                if (count == res.length){
                    return res;
                }
            }
            right--;

            for (int i = right; i >= left; i--){
                res[count] = input[bottom][i];
                count++;
                if (count == res.length){
                    return res;
                }
            }
            bottom--;

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
