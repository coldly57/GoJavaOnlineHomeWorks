package module5.task2sort;

public class ShellSort {

    public static void sort(Comparable[] array){

        int N = array.length;
        int h = 1;

        while (h < N/3){
            h = 3 * h + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h){
                    exchange(array, j, j - h);
                }
            }
            h = h / 3;
        }
    }
    private static boolean less(Comparable a, Comparable b){

        return a.compareTo(b) < 0;
    }

    private static void exchange(Comparable[] array, int i, int j){

        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
