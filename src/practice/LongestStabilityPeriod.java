package practice;

import java.util.ArrayList;
import java.util.List;

public class LongestStabilityPeriod {

    public static void main(String[] args) {

        int[] array = {901, 901, 901};

        System.out.println(new LongestStabilityPeriod().count(array));
    }


    public int count(int[] gdp){

        if (gdp.length == 1){
            return 1;
        }

        //List<Integer> countList = new ArrayList<>();
        int count = 2;

        for (int i = 2; i < gdp.length - 1; i += 2){
            int sum1 = gdp[0] + gdp[1];
            int sum2 = gdp[i] + gdp[i + 1];
            if (Math.abs(sum1 - sum2) <= 1){
                count += 2;
            }
            //else{
            //    countList.add(count);
            //    count = 2;
            //}
        }

        //countList.add(count);

        //return getMaxValue(countList);

        return count;
    }

    private int getMaxValue(List<Integer> list){

        int max = Integer.MIN_VALUE;

        for (int i : list){
            max = max < i ? i : max;
        }

        return max;
    }
}
