package module8.task1file;

public class AudioFile extends File {

    @Override
    public String getCurrentString(){
        return "AudioFile";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
