package module6.task3musicalinstrument;

public class Guitar extends MusicalInstrument {

    private String currentString = "Guitar";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}
