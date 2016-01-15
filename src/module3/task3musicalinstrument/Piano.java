package module3.task3musicalinstrument;

public class Piano extends MusicalInstrument {

    private String currentString = "Piano";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}
