package module10;

public abstract class File {

    public String getCurrentString(){
        return "File";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
