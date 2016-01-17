package module8.task3musicalinstrument;

import module8.CollectionPrint;
import module8.CollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicShop {

    private List<MusicalInstrument> instrumentsList;

    public MusicShop(MusicalInstrument... instruments){

        instrumentsList = new ArrayList<>();

        Collections.addAll(this.instrumentsList, instruments);
    }

    public List<MusicalInstrument> getInstrumentsList() {
        return this.instrumentsList;
    }

    public void setInstrumentsInShop(MusicalInstrument... instruments){
        Collections.addAll(this.instrumentsList, instruments);
    }

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(new Guitar(), new Piano(), new Trumpet());

        musicShop.setInstrumentsInShop(new Piano(), new Guitar());

        CollectionPrint.print(musicShop.getInstrumentsList());

        System.out.println("------------------------------------------------");

        CollectionSort.sortInstrumentsList(musicShop.getInstrumentsList());

        CollectionPrint.print(musicShop.getInstrumentsList());
    }
}
