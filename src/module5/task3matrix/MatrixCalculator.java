package module5.task3matrix;

public class MatrixCalculator {

    public static int[][] matrixAdd(int[][] array1, int[][] array2) {

        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            System.out.println("Size of matrices must be equal!");
            return null;
        }

        int[][] resultArray = new int[array1.length][array1[0].length];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                resultArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return resultArray;
    }

    public static int[][] matrixSub(int[][] minuendArray, int[][] subtrahendArray) {

        if (minuendArray.length != subtrahendArray.length || minuendArray[0].length != subtrahendArray[0].length) {
            System.out.println("Size of matrices must be equal!");
            return null;
        }

        int[][] resultArray = new int[minuendArray.length][minuendArray[0].length];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                resultArray[i][j] = minuendArray[i][j] - subtrahendArray[i][j];
            }
        }

        return resultArray;
    }

    public static int[][] matrixMult(int[][] multiplicandArray, int[][] multiplierArray) {

        if (multiplicandArray.length != multiplierArray.length || multiplicandArray[0].length != multiplierArray[0].length) {
            System.out.println("Size of matrices must be equal!");
            return null;
        }

        int[][] resultArray = new int[multiplicandArray.length][multiplierArray[0].length];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {
                resultArray[i][j] = 0;

                for (int k = 0; k < multiplierArray.length; k++) {
                    resultArray[i][j] += multiplicandArray[i][k] * multiplierArray[k][j];
                }
            }
        }

        return resultArray;
    }

    public static int[][] matrixTranspose(int[][] array) {

        int[][] resultArray = new int[array[0].length][array.length];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[0].length; j++) {

                resultArray[i][j] = array[j][i];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5},
                {4, 6, 1, 3, 9},
                {0, 1, 7, 5, 3}
        };

        int[][] resultArray = MatrixCalculator.matrixAdd(array, array);

        if (resultArray != null) {

            for (int[] singleArray : resultArray){
                for (int cell : singleArray){
                    System.out.print(cell + " ");
                }
                System.out.println();
            }


            System.out.println("-----------------------------------------------------");

        }

        int[][] resultArray2 = MatrixCalculator.matrixSub(array, array);

        if (resultArray2 != null) {

            for (int[] singleArray : resultArray2) {
                for (int cell : singleArray) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }

            System.out.println("-----------------------------------------------------");

        }


        int[][] resultArray3 = MatrixCalculator.matrixMult(array, array);

        if (resultArray3 != null) {

            for (int[] singleArray : resultArray3) {
                for (int cell : singleArray) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }

            System.out.println("-----------------------------------------------------");

        }

        int[][] resultArray4 = MatrixCalculator.matrixTranspose(array);

        for (int[] singleArray : resultArray4) {
            for (int cell : singleArray) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

    }

}
