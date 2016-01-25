package module9.task2flower;

import module8.CollectionPrint;
import module8.CollectionSort;
import module9.EncodeDecode;

import java.util.*;

public class Bouquet {

    private List<Flower> flowersList;

    public Bouquet(Flower... flowers) {

        flowersList = new ArrayList<>();
        Collections.addAll(this.flowersList, flowers);
    }

    public List<Flower> getFlowersList() throws ArithmeticException {
        return this.flowersList;
    }

    public void setFlowersInBouquet(Flower... flowers){
        Collections.addAll(this.flowersList, flowers);
    }

    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(new Rose(), new Chamomile(), new Aster());

        bouquet.setFlowersInBouquet(new Tulip(), new Rosebush(5));

        StringBuilder sb = new StringBuilder();

        for (Flower flower : bouquet.getFlowersList()){
            sb.append(flower.getCurrentString());
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
