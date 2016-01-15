package module3.task3musicalinstrument;

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

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(new Guitar(), new Piano(), new Trumpet());

        musicShop.setInstrumentsInShop(new Piano(), new Guitar());

        for (MusicalInstrument m : musicShop.getInstrumentsList()){
            System.out.println(m.getCurrentString());
        }
    }
}
