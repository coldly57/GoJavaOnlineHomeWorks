package practice;

public class LonelyNumber {

    public static final String range = "01234";

    public static void main(String[] args) {

        int[] input = {7, 7, 7, 7, 7, 5};



        //System.out.println(new LonelyNumber().find(input));
    }

    public int find(int[] input) {

        return 0;
    }

    private int getNewNum(int i){
        StringBuilder sb = new StringBuilder("");

        while (i / 5 > 0){
            sb.append(range.charAt(i % 5));
            i /= 5;
        }

        sb.append(range.charAt(i));

        return Integer.parseInt(sb.reverse().toString());
    }
}
