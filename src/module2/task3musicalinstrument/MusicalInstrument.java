package module2.task3musicalinstrument;

public class MusicalInstrument {

    private String currentString = "Musical instrument";

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(new Guitar(), new Piano(), new Trumpet());

        musicShop.setInstrumentsInShop(new Piano(), new Guitar());

        for (MusicalInstrument m : musicShop.getInstrumentsList()){
            System.out.println(m.getCurrentString());
        }
    }

    public String getCurrentString(){
        return this.currentString;
    }
}
