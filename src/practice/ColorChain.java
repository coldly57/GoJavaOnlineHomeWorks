package practice;

import java.util.HashMap;
import java.util.Map;

public class ColorChain {

    Map<Integer, Integer> values = new HashMap<>();
    {
        values.put(0, 0);
        values.put(1, 1);
        values.put(2, 2);
        values.put(3, 4);
        values.put(-1, 0);
        values.put(-2, 0);
        values.put(-3, 0);
    }

    public int count(int N){

        if (values.containsKey(N)){
            return values.get(N);
        }

        int whiteFirst = count(N - 1);
        int yellowFirst = count(N - 2);
        int redFirst = count(N - 3);

        int result = whiteFirst + yellowFirst + redFirst;
        values.put(N, result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ColorChain().count(1000));
    }
}
