package module9.task1file;

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
