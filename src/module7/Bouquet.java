package module7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        for (Flower f : bouquet.getFlowersList()){
            System.out.println(f.getCurrentString());
        }
    }

}
