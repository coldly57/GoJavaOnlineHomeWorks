package module9.task1file;

public class ImageFile extends File {

    @Override
    public String getCurrentString(){
        return "Image file";
    }

    @Override
    public String toString() {
        return getCurrentString();
    }
}
