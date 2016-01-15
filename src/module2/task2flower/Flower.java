package module2.task2flower;

public class Flower {

    private String currentString = "Flower";

    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(new Rose(), new Chamomile(), new Aster());

        bouquet.setFlowersInBouquet(new Tulip(), new Rosebush());

        for (Flower f : bouquet.getFlowersList()){
            System.out.println(f.getCurrentString());
        }
    }

    public String getCurrentString(){
        return this.currentString;
    }
}
