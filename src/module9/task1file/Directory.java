package module9.task1file;

import module9.EncodeDecode;

import java.util.*;

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

        StringBuilder sb = new StringBuilder();

        for (File file : directory.getFilesList()){
            sb.append(file.getCurrentString());
            sb.append(" ");
        }

        String text = sb.toString();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter encode shift from -26 to 26:");

        int encodeShift = 0;
        try {
            encodeShift = sc.nextInt();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("You should enter a number");
        }
        while (encodeShift < -26 || encodeShift > 26){
            System.out.println("You have entered incorrect encode shift. Please repeat (must be from -26 to 26):");
            encodeShift = sc.nextInt();
        }

        EncodeDecode encodeDecode = new EncodeDecode(encodeShift);

        encodeDecode.encode(text);

        String encodedText = encodeDecode.getEncodedText();

        System.out.println(encodedText);

        encodeDecode.decode(encodedText);

        String decodedText = encodeDecode.getDecodedText();

        System.out.println(decodedText);

        System.out.println("Decoding works well? " + decodedText.equals(text));

    }

}
