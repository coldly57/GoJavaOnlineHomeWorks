package practice;

public class BitsPalindrome {

    public static void main(String[] args) {

        int n = 5;

        System.out.println(new BitsPalindrome().isPalindrome(n));
    }

    public boolean isPalindrome(int input){
        StringBuilder numBuilder = new StringBuilder(Integer.toBinaryString(input));

        int length = numBuilder.length();

        for (int i = 0; i < 32 - length; i++){
            numBuilder.insert(0, 0);
        }

        String num = numBuilder.toString();
        String numReverse = numBuilder.reverse().toString();

        return num.equals(numReverse);
    }
}

