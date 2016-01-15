package module3.task2flower;

import java.util.ArrayList;

public class Bouquet {

    private ArrayList<Flower> flowersList = new ArrayList<>();

    public Bouquet(Flower... flowers) {

        for (Flower f : flowers) {
            this.flowersList.add(f);
        }
    }

    public ArrayList<Flower> getFlowersList() throws ArithmeticException {
        return this.flowersList;
    }

    public void setFlowersInBouquet(Flower... flowers){
        for (Flower f : flowers) {
            this.flowersList.add(f);
        }
    }

    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(new Rose(), new Chamomile(), new Aster());

        bouquet.setFlowersInBouquet(new Tulip(), new Rosebush(5));

        for (Flower f : bouquet.getFlowersList()){
            System.out.println(f.getCurrentString());
        }
    }

}
