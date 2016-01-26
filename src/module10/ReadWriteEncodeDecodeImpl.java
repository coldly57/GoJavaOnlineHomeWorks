package module10;

import module9.EncodeDecode;

import java.io.*;

public class ReadWriteEncodeDecodeImpl implements ReadWriteEncodeDecode {

    private int encodeShift;

    public ReadWriteEncodeDecodeImpl(int encodeShift){
        this.encodeShift = encodeShift;
    }

    @Override
    public void encodeAndWrite(final String text, String outputFileName) throws IOException {

        EncodeDecode encodeDecode = new EncodeDecode(encodeShift);
        encodeDecode.encode(text);
        String encodedText = encodeDecode.getEncodedText();

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outputFileName)));

            out.writeUTF(encodedText);

            System.out.format("Text has been encoded and saved to \"%s\" successfully%n", outputFileName);
        }
        finally {
            if (out != null){
                out.close();
            }
        }

    }

    @Override
    public void readAndDecode(String fileName) throws IOException {

        DataInputStream in = null;
        StringBuilder sb = new StringBuilder();
        EncodeDecode encodeDecode = new EncodeDecode(encodeShift);

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));

            while (true){
                sb.append(in.readUTF());
            }
        }
        catch (EOFException e){
            encodeDecode.decode(sb.toString());
            String decodedText = encodeDecode.getDecodedText();
            System.out.format("Decoding has ended. Decoded text is:%n%s", decodedText);
        }
        finally {
            if (in != null){
                in.close();
            }
        }

    }
}
