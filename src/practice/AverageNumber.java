package practice;

public class AverageNumber {

    public static void main(String[] args) {
        System.out.println(new AverageNumber().average(-2147483648, -2));
    }

    public int average(int a, int b) {

        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        if (a < 0 || b < 0){
            long sum = (long)a + b;
            return (int) (sum / 2);
        }

        return (a + b) >>> 1;
    }
}
