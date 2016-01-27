package courseproject;

public class MatrixConstructor {
    private double[][] matrix = null;
    private double[] array = null;

    public void setValueToMatrix(int numberOfVariables, int row, int index, double value){
        if (this.matrix == null){
            this.matrix = new double[numberOfVariables][numberOfVariables];
        }
        this.matrix[row][index] = value;
    }

    public void setValueToArray(int numberOfVariables, int index, double value){
        if (this.array == null){
            this.array = new double[numberOfVariables];
        }
        this.array[index] = value;
    }

    public double[][] getMatrix() {
        return this.matrix;
    }

    public double[] getArray() {
        return array;
    }
}
