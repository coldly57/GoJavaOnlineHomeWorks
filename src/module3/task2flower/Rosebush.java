package module3.task2flower;

import java.util.ArrayList;

public class Rosebush extends Rose {

    private String currentString = "Rosebush";

    ArrayList<Rose> rosesList = new ArrayList<>();

    public Rosebush(int amountOfRoses){

        for (int i = 0; i < amountOfRoses; i++) {
            Rose rose = new Rose();
            this.rosesList.add(rose);
        }
    }

    public ArrayList<Rose> getRosesList() {

        return this.rosesList;
    }

    public void setRosesToBush(int amountOfRoses) {

        for (int i = 0; i < amountOfRoses; i++) {
            Rose rose = new Rose();
            this.rosesList.add(rose);
        }
    }

    @Override
    public String getCurrentString() {

        if (rosesList.size() > 1) {
            return this.currentString + ": " + rosesList.size() + " roses";
        }

        if (rosesList.size() == 1) {
            return this.currentString + ": " + rosesList.size() + " rose";
        }

        return this.currentString;
    }
}
