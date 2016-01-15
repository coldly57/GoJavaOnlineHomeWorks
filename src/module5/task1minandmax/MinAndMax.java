package module5.task1minandmax;

public class MinAndMax {

    public static int getMinValue(int[] arrayOfInts){

        int min = Integer.MAX_VALUE;

        for (int element : arrayOfInts){
            min = element < min ? element : min;
        }

        return min;
    }

    public static int getMaxValue(int[] arrayOfInts){

        int max = Integer.MIN_VALUE;

        for (int element : arrayOfInts){
            max = element > max ? element : max;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] array = {6, 8, 13, 69, 110, 53, 576, 11, 35, -10, 43, - 50, -1};

        System.out.println(MinAndMax.getMinValue(array));
        System.out.println(MinAndMax.getMaxValue(array));

    }

}
