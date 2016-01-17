package module8.task1file;

public abstract class File {

    public String getCurrentString(){
        return "File";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
