package module10;

import java.io.IOException;

public interface ReadWriteEncodeDecode {

    void encodeAndWrite(String text, String outputFileName) throws IOException;

    void readAndDecode(String fileName) throws IOException;
}
