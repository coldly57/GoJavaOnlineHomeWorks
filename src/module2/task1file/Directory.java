package module2.task1file;

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
}
