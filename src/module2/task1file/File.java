package module2.task1file;

public class File {

    private String currentString = "File";

    public static void main(String[] args) {

        Directory directory = new Directory(new TextFile(), new AudioFile(), new ImageFile());

        directory.setFilesInDir(new AudioFile(), new AudioFile(), new TextFile());

        for (File f : directory.getFilesList()){
            System.out.println(f.getCurrentString());
        }
    }

    public String getCurrentString(){
        return this.currentString;
    }
}
