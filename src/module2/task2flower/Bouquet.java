package module2.task2flower;

import java.util.ArrayList;

public class Bouquet {

    private ArrayList<Flower> flowersList = new ArrayList<>();

    public Bouquet(Flower... flowers){

        for (Flower f : flowers) {
            this.flowersList.add(f);
        }
    }

    public ArrayList<Flower> getFlowersList() {
        return this.flowersList;
    }

    public void setFlowersInBouquet(Flower... files){
        for (Flower f : files) {
            this.flowersList.add(f);
        }
    }
}
