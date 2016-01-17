package module8.task3musicalinstrument;

public class Trumpet extends MusicalInstrument {

    @Override
    public String getCurrentString(){
        return "Trumpet";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
