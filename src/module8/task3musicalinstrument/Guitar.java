package module8.task3musicalinstrument;

public class Guitar extends MusicalInstrument {

    @Override
    public String getCurrentString(){
        return "Guitar";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
