package module8.task2flower;

public abstract class Flower {

    public String getCurrentString(){

        return "Flower";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
