package module9.task2flower;

import java.util.ArrayList;
import java.util.List;

public class Rosebush extends Rose {

    private List<Rose> rosesList;

    public Rosebush(int amountOfRoses){

        rosesList = new ArrayList<>();

        for (int i = 0; i < amountOfRoses; i++) {
            Rose rose = new Rose();
            this.rosesList.add(rose);
        }
    }

    public List<Rose> getRosesList() {

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

        String currentString = "Rosebush";

        return currentString + " with amount of roses: " + rosesList.size();
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
