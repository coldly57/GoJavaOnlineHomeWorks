package practice;

public class CountBits {

    public static void main(String[] args) {

        int num = -2147483647;
        System.out.println(new CountBits().count(num));
    }

    public int count(int num) {

        int count = 0;

        for (int i = 1; i <= 32; i++){

            int mask = 1 << (i - 1);
            int temp = mask & num;
            if(temp == mask){
                count++;
            }
        }

        return count;
    }
}
