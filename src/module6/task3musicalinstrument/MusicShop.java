package module6.task3musicalinstrument;

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

    public static void main(String[] args) throws NoGuitarRuntimeException {

        MusicShop musicShop = new MusicShop(new Piano(), new Trumpet());

        musicShop.setInstrumentsInShop(new Piano());

        int guitarsCount = 0;

        for (MusicalInstrument m : musicShop.getInstrumentsList()){
            System.out.println(m.getCurrentString());
            if (m instanceof Guitar){
                guitarsCount++;
            }
        }

        try{
            if (guitarsCount < 1){
                throw new NoGuitarException(guitarsCount);
            }
        }
        catch (NoGuitarException e){
            System.out.println(e.getExceptionMessage());
            throw new NoGuitarRuntimeException();
        }
    }
}
