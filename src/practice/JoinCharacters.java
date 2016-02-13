package practice;

public class JoinCharacters {

    public static void main(String[] args) {

        char[] array = {'1', '2', '3', '1', '5'};

        System.out.println(new JoinCharacters().join(array));
    }

    public int join(char[] input) {

        String s = new String(input);

        return Integer.parseInt(s);
    }
}
