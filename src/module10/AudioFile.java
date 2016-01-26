package module10;

public class AudioFile extends File {

    @Override
    public String getCurrentString(){
        return "Audio file";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
