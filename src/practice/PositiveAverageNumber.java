package practice;

public class PositiveAverageNumber {

    public static void main(String[] args) {

        System.out.println(new PositiveAverageNumber().average(4, 7));
    }

    public int average(int a, int b){

        return (a + b) >>> 1;
    }
}
