package practice;

public class Test3 {

    public static void main(String[] args) {
        System.out.println(new Test3().average(10, -20));
    }

    public int average(int a, int b) {

        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        if (a < 0 || b < 0){

            return (a + b) / 2;
        }
        return (a + b) >>> 1;
    }
}
