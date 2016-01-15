package module5.task2sort;

public class SortingArrays {

    public static void main(String[] args) {

        Integer[] array = {6, 8, 13, 69, 110, 53, 576, 11, 35, -10, 43, - 50, -1};

        ShellSort.sort(array);

        for (int element : array){
            System.out.print(element + " ");
        }
    }

}
