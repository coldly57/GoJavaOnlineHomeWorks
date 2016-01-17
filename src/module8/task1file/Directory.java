package module8.task1file;

import module8.CollectionPrint;
import module8.CollectionSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Directory {

    private List<File> filesList;

    public Directory(File... files){

        filesList = new ArrayList<>();
        Collections.addAll(this.filesList, files);
    }

    public List<File> getFilesList() {
        return this.filesList;
    }

    public void setFilesInDir(File... files){

        Collections.addAll(this.filesList, files);
    }

    public static void main(String[] args) {

        Directory directory = new Directory(new TextFile(), new AudioFile(), new ImageFile());

        directory.setFilesInDir(new AudioFile(), new AudioFile(), new TextFile());

        CollectionPrint.print(directory.getFilesList());

        System.out.println("------------------------------------------------");

        CollectionSort.sortFilesList(directory.getFilesList());

        CollectionPrint.print(directory.getFilesList());
    }

}
