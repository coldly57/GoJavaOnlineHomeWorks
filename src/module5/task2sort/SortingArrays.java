package module5.task2sort;

public class SortingArrays {

    public static void main(String[] args) {

        Integer[] array = {6, 8, 13, 69, 110, 53, 576, 11, 35, -10, 43, - 50, -1};

        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = (int)ShellSort.sort(array)[i];
        }

        ShellSort.sort(array);

        for (int element : array){
            System.out.print(element + " ");
        }
    }

}
