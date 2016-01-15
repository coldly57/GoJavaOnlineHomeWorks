package module2.task3musicalinstrument;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<MusicalInstrument> instrumentsList = new ArrayList<>();

    public MusicShop(MusicalInstrument... instruments){

        for (MusicalInstrument m : instruments) {
            this.instrumentsList.add(m);
        }
    }

    public ArrayList<MusicalInstrument> getInstrumentsList() {
        return this.instrumentsList;
    }

    public void setInstrumentsInShop(MusicalInstrument... instruments){
        for (MusicalInstrument m : instruments) {
            this.instrumentsList.add(m);
        }
    }
}
