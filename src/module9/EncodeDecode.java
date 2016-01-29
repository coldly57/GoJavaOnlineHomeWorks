package module9;

public class EncodeDecode {
    private String encodedText;
    private String decodedText;
    private String capitalLettersAlphabet;
    private String smallLettersAlphabet;
    private int encodeShift = 0;

    public EncodeDecode(int encodeShift){

        capitalLettersAlphabet = makeAlphabet(65, 90);
        smallLettersAlphabet = makeAlphabet(97, 122);
        this.encodeShift = encodeShift;
    }

    public String getEncodedText(){

        return this.encodedText;
    }

    public String getDecodedText(){

        return this.decodedText;
    }

    public void encode(String text){
        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++){
            if (textArray[i] == 32){
                continue;
            }
            if (textArray[i] >= 65 && textArray[i] <= 90){

                textArray[i] = capitalLettersAlphabet.charAt((capitalLettersAlphabet.indexOf(textArray[i]) + encodeShift + 26) % 26);
            }
            else if (textArray[i] >= 97 && textArray[i] <= 122){

                textArray[i] = smallLettersAlphabet.charAt((smallLettersAlphabet.indexOf(textArray[i]) + encodeShift + 26) % 26);
            }
        }

        this.encodedText = new String(textArray);
    }

    public void decode(String text){
        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i++){
            if (textArray[i] >= 65 && textArray[i] <= 90){

                textArray[i] = capitalLettersAlphabet.charAt((capitalLettersAlphabet.indexOf(textArray[i]) - encodeShift + 26) % 26);
            }
            else if (textArray[i] >= 97 && textArray[i] <= 122){

                textArray[i] = smallLettersAlphabet.charAt((smallLettersAlphabet.indexOf(textArray[i]) - encodeShift + 26) % 26);
            }
        }

        this.decodedText = new String(textArray);
    }

    private String makeAlphabet(int fromIndex, int toIndex){

        char[] alphabetArray = new char[toIndex - fromIndex + 1];

        for (int i = 0; i < alphabetArray.length; i++){
            alphabetArray[i] = (char) fromIndex;
            fromIndex++;
        }

        return new String(alphabetArray);
    }
}
