package practice;

public class AddNumberBase36 {

    public static final int SCALE = 36;

    public static void main(String[] args) {

        System.out.println(new AddNumberBase36().add("zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5", "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N"));
    }

    public String add(String a, String b) {

        String range = "0123456789abcdefghijklmnopqrstuvwxyz";

        String aReverse = new StringBuilder(a.toLowerCase()).reverse().toString();
        String bReverse = new StringBuilder(b.toLowerCase()).reverse().toString();

        int n = aReverse.length();
        int m = bReverse.length();

        if (n > m){
            bReverse = buildString(bReverse, n, m);
        }
        else if (m > n){
            aReverse = buildString(aReverse, m, n);
        }

        StringBuilder sb = new StringBuilder("");

        int additionalNumber = 0;

        for (int i = 0; i < (n > m ? n : m); i++) {
            int sum = range.indexOf(aReverse.substring(i, i + 1)) + range.indexOf(bReverse.substring(i, i + 1)) + additionalNumber;
            sb.append(range.charAt(sum % SCALE));
            if (sum / SCALE > 0){
                additionalNumber = sum / SCALE;
                if ((n > m ? n : m) - i == 1){
                    sb.append(range.charAt(additionalNumber));
                }
            }
            else {
                additionalNumber = 0;
            }
        }
        return sb.reverse().toString();
    }
    private String buildString(String a, int higher, int lower){

        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < higher - lower; i++){
            sb.append(0);
        }

        return sb.toString();
    }
}
