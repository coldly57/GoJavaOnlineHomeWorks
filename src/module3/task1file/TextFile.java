package module3.task1file;

public class TextFile extends File {

    private String currentString = "TextFile";

    @Override
    public String getCurrentString(){
        return this.currentString;
    }

}
