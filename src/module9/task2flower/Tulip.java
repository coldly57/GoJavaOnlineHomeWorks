package module9.task2flower;

public class Tulip extends Flower {

    @Override
    public String getCurrentString(){

        return "Tulip";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
