package practice;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        System.out.println(new FirstUniqueCharacter().find("Google"));
    }

    public Character find(String s){

        String lowerCaseS = s.toLowerCase();

        for (int i = 0; i < lowerCaseS.length(); i++){
            if (lowerCaseS.lastIndexOf(lowerCaseS.charAt(i)) == lowerCaseS.indexOf(lowerCaseS.charAt(i))){
                return s.charAt(i);
            }
        }

        return null;
    }
}
