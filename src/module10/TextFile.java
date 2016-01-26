package module10;

public class TextFile extends File {

    @Override
    public String getCurrentString(){
        return "Text file";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }

}
