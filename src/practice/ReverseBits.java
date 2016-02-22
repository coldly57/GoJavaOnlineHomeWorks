package practice;

public class ReverseBits {

    public static void main(String[] args) {

        System.out.println(new ReverseBits().reverse(-2147483647));

    }

    public int reverse(int input) {

        int result = 0;

        for (int i = Integer.SIZE - 1; i >= 0; i--){
            result += ((input & 1) << i);
            input >>= 1;
        }

        return result;
    }
}
