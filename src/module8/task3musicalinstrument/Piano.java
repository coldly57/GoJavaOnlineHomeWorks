package module8.task3musicalinstrument;

public class Piano extends MusicalInstrument {

    @Override
    public String getCurrentString() {
        return "Piano";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
