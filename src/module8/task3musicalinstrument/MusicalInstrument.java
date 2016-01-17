package module8.task3musicalinstrument;

public abstract class MusicalInstrument {

    public String getCurrentString(){
        return "Musical instrument";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }

}
