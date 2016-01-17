package module8.task1file;

public class ImageFile extends File {

    @Override
    public String getCurrentString(){
        return "ImageFile";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
