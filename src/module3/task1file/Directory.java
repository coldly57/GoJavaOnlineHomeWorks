package module3.task1file;

import java.util.ArrayList;

public class Directory {

    private ArrayList<File> filesList = new ArrayList<>();

    public Directory(File... files){

        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public ArrayList<File> getFilesList() {
        return this.filesList;
    }

    public void setFilesInDir(File... files){
        for (File f : files) {
            this.filesList.add(f);
        }
    }

    public static void main(String[] args) {

        Directory directory = new Directory(new TextFile(), new AudioFile(), new ImageFile());

        directory.setFilesInDir(new AudioFile(), new AudioFile(), new TextFile());

        for (File f : directory.getFilesList()){
            System.out.println(f.getCurrentString());
        }
    }

}
