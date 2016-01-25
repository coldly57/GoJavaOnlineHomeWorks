package module9.task2flower;

public class Chamomile extends Flower {

    @Override
    public String getCurrentString(){

        return "Chamomile";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
