package module6.task1file;

import java.util.ArrayList;

public class Directory {

    private ArrayList<File> filesList = new ArrayList<>();

    public Directory(File... files){

        for (int i = 0; i < files.length + 1; i++) {
            try {
                this.filesList.add(files[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index '" + i + "' doesn't exist in array 'files'!");
            }
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

    public static void main(String[] args) throws EmptyDirectoryRuntimeException {

        Directory directory = new Directory();

        //directory.setFilesInDir(new AudioFile(), new AudioFile(), new TextFile());

        try{
            if (directory.getFilesList().size() == 0){
                throw new EmptyDirectoryException();
            }
        }
        catch (EmptyDirectoryException e){
            System.out.println(e.getExceptionMessage());
            throw new EmptyDirectoryRuntimeException();
        }

        for (File f : directory.getFilesList()){
            System.out.println(f.getCurrentString());
        }
    }

}
