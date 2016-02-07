package practice;

public class Test2 {

    public static void main(String[] args) {

        int num = -16;
        System.out.println(new Test2().count(num));
    }

    public int count(int num) {

        int count = 0;

        for (int i = 1; i <= 32; i++){

            int mask = 1 << (i - 1);
            int temp = mask&num;
            if(temp != 0){
                count++;
            }
        }

        return count;
    }
}
