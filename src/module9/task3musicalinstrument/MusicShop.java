package module9.task3musicalinstrument;

import module8.CollectionPrint;
import module8.CollectionSort;
import module9.EncodeDecode;

import java.util.*;

public class MusicShop {

    private List<MusicalInstrument> instrumentsList;

    public MusicShop(MusicalInstrument... instruments){

        instrumentsList = new ArrayList<>();

        Collections.addAll(this.instrumentsList, instruments);
    }

    public List<MusicalInstrument> getInstrumentsList() {
        return this.instrumentsList;
    }

    public void setInstrumentsInShop(MusicalInstrument... instruments){
        Collections.addAll(this.instrumentsList, instruments);
    }

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(new Guitar(), new Piano(), new Trumpet());

        musicShop.setInstrumentsInShop(new Piano(), new Guitar());

        StringBuilder sb = new StringBuilder();

        for (MusicalInstrument musicalInstrument : musicShop.getInstrumentsList()){
            sb.append(musicalInstrument.getCurrentString());
            sb.append(" ");
        }

        String text = sb.toString();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter encode shift from -26 to 26:");

        int encodeShift = 0;
        try {
            encodeShift = sc.nextInt();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("You should enter a number");
        }
        while (encodeShift < -26 || encodeShift > 26){
            System.out.println("You have entered incorrect encode shift. Please repeat (must be from -26 to 26):");
            encodeShift = sc.nextInt();
        }

        EncodeDecode encodeDecode = new EncodeDecode(encodeShift);

        encodeDecode.encode(text);

        String encodedText = encodeDecode.getEncodedText();

        System.out.println(encodedText);

        encodeDecode.decode(encodedText);

        String decodedText = encodeDecode.getDecodedText();

        System.out.println(decodedText);

        System.out.println("Decoding works well? " + decodedText.equals(text));
    }
}
