package practice;

import java.util.ArrayList;
import java.util.List;

public class GnomeFood {

    public static void main(String[] args) {



        int[] gnomes = {5, 6, 7, 9, 4};
        int[] portions = {8, 5, 6, 2, 3};

        for (int i : new GnomeFood().find(gnomes, portions)){
            System.out.print(i + " ");
        }
    }

    public int[] find(int[] gnomes, int[] portions){

        int[] result = new int[gnomes.length];
        List<Integer> gnomesList = new ArrayList<>();
        List<Integer> portionsList = new ArrayList<>();

        for (int i = 0; i < gnomes.length; i++){
            gnomesList.add(gnomes[i]);
            portionsList.add(portions[i]);
        }

        for (int i = 0; i < result.length; i++){

            int neededGnome = getMaxValue(gnomes);
            int neededPortion = getMaxValue(portions);
            result[gnomesList.indexOf(neededGnome)] = portionsList.indexOf(neededPortion);
            gnomes[gnomesList.indexOf(neededGnome)] = 0;
            portions[portionsList.indexOf(neededPortion)] = 0;
        }

        return result;
    }

    private int getMaxValue(int[] array){

        int max = Integer.MIN_VALUE;

        for (int i : array){
            max = max < i ? i : max;
        }

        return max;
    }
}
