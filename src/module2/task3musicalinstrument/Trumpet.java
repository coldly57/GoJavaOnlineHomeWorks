package module2.task3musicalinstrument;

public class Trumpet extends MusicalInstrument {

    private String currentString = "Trumpet";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }
}
