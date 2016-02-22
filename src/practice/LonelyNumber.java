package practice;

public class LonelyNumber {

    public static final String range = "01234";

    public static void main(String[] args) {

        int[] input = {7, 7, 7, 7, 7, 5};


        System.out.println(new LonelyNumber().find(input));
    }

    public int find(int[] input) {

        int[] sum = new int[32];

        for (int i = 0; i < input.length; i++) {
            int num = input[i];

            for (int j = 0; j < 32; j++) {
                int mask = 1 << j;
                if ((num & mask) != 0) {
                    sum[j] += 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += sum[31 - i] % 5;
        }

        return result;
    }
}
